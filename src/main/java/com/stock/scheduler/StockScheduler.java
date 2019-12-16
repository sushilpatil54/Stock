/**
 * 
 */
package com.stock.scheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.stock.api.response.SearchResponse;
import com.stock.api.response.StockDetailResponse;
import com.stock.api.response.StockResponse;
import com.stock.cache.StockCache;
import com.stock.client.RestClient;
import com.stock.client.StockClientManager;
import com.stock.config.ApplicationConfig;
import com.stock.dto.Stock;

/**
 * @author Mindtree Ltd
 * 
 *         The Class <StockScheduler>, Refresh the stock details as specified in
 *         cron
 */
@Configuration
@EnableScheduling
public class StockScheduler {

	@Autowired
	private StockClientManager stockClientManager;

	@Autowired
	RestClient restClient;

	@Autowired
	StockCache stockCache;

	/**
	 * Refresh the stock details as specified in cron (Every day).
	 */
	@Scheduled(cron = "0 0 0 ? * *")
	public void refreshStock() {

		/** Search for all the stocks */
		SearchResponse searchResponse = (SearchResponse) restClient.execute(stockClientManager.getStockSearchURL(),
				"GET", SearchResponse.class);
		if (null != searchResponse && null != searchResponse.getData() && !searchResponse.getData().isEmpty()) {
			StringJoiner symbols = new StringJoiner(",");
			searchResponse.getData().forEach(stock -> symbols.add(stock.getSymbol()));
			/** Get the all the stocks details */
			StockResponse stockResponse = (StockResponse) restClient
					.execute(stockClientManager.getStockDetailsURL(symbols.toString()), "GET", StockResponse.class);
			if (null != stockResponse && null != stockResponse.getData() && !stockResponse.getData().isEmpty()) {
				Map<String, Map<String, Stock>> stockExchangeMap = new HashMap<>();
				stockResponse.getData().forEach(stock -> this.add(stockExchangeMap, stock));
				/** Clear the cache */
				stockCache.clear();
				/** Load the cache */
				stockCache.add(stockExchangeMap);
			}
		}
	}

	/**
	 * Add the stock to the Map, which will add to cache.
	 * 
	 * @param stockExchangeMap
	 * @param stockResponse
	 */
	private void add(Map<String, Map<String, Stock>> stockExchangeMap, StockDetailResponse stockResponse) {

		Map<String, Stock> stockMap = null;
		Stock stock = this.getStock(stockResponse);
		if (!stockExchangeMap.containsKey(stock.getStockExchange())) {
			stockMap = new HashMap<>();
		} else {
			stockMap = stockExchangeMap.get(stock.getStockExchange());
		}
		stockMap.put(stock.getSymbol(), stock);
		stockExchangeMap.put(stock.getStockExchange(), stockMap);
	}

	/**
	 * Get the Stock object from the response
	 * 
	 * @param stockResponse
	 * @return
	 */
	private Stock getStock(StockDetailResponse stockResponse) {
		Stock stock = new Stock();
		stock.setStockExchange(stockResponse.getStockExchangeShort());
		stock.setSymbol(stockResponse.getSymbol());
		stock.setCloseYesterday(stockResponse.getCloseYesterday());
		stock.setCurrency(stockResponse.getCurrency());
		stock.setGmtOffset(stockResponse.getGmtOffset());
		stock.setLastTradeTime(stockResponse.getLastTradeTime());
		stock.setMarketCap(stockResponse.getMarketCap());
		stock.setName(stockResponse.getName());
		stock.setPrice(stockResponse.getPrice());
		stock.setTimezone(stockResponse.getTimezone());
		stock.setTimezoneName(stockResponse.getTimezoneName());
		stock.setVolume(stockResponse.getVolume());
		return stock;
	}
}
