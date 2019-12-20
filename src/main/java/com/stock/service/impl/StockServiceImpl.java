/**
 * 
 */
package com.stock.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.cache.StockCache;
import com.stock.client.RestClient;
import com.stock.client.StockClientManager;
import com.stock.config.ApplicationConfig;
import com.stock.dto.Stock;
import com.stock.dto.StockRequestDto;
import com.stock.service.StockService;

/**
 * @author Mindtree Ltd 
 * 
 * The Class <StockServiceImpl>, retrieve the details of
 *         the stock from external API.
 */
@Service
public class StockServiceImpl implements StockService {

	/** Log the details */
	private static final Logger LOGGER = LoggerFactory.getLogger(StockServiceImpl.class);

	@Autowired
	private ApplicationConfig applicationConfig;
	
	@Autowired
	StockCache stockCache;

	/**
	 * Get the symbol's stock details.
	 */
	public Stock getStockDetails(String stockExchange, String symbol) {

		LOGGER.debug("getStockDetails by symbol : Start");
		if (null == stockExchange || stockExchange.isEmpty()) {
			stockExchange = applicationConfig.getDeafultStockExchange();
		}
		Stock stock = stockCache.get(stockExchange, symbol);
		LOGGER.debug("getStockDetails by symbol : End");
		return stock;
	}

	/**
	 * Get all the stock details.
	 */
	public List<Stock> getStockDetails() {

		List<Stock> stocks = new ArrayList<>();
		LOGGER.debug("getStockDetails : Start");
		Map<String, Stock> map = stockCache.get(applicationConfig.getDeafultStockExchange());
		if(null != map) {
			map.forEach((symbol, stock) -> {
				if(applicationConfig.getDefaultStockSupported().contains(symbol)) {
					stocks.add(stock);
				}
			});
		}
		LOGGER.debug("getStockDetails : End");
		return stocks;
	}

}
