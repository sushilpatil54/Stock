/**
 * 
 */
package com.stock.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.stock.dto.Stock;

/**
 * @author Mindtree Ltd
 * 
 * The class <StockCacheImpl>, Store the Stocks in the cache. 
 */
@Component
public class StockCacheImpl implements StockCache {

	/** Store the stocks */
	private Map<String, Map<String, Stock>> cache = Collections.synchronizedMap(new HashMap<String, Map<String, Stock>>());

	/**
	 * Add the stock in to cache.
	 */
	@Override
	public void add(Map<String, Map<String, Stock>> stocks) {
		cache = stocks;
	}

	/**
	 * Get the Stocks of the stock exchange from cache.
	 */
	@Override
	public Map<String, Stock> get(String stockExchange) {
		return cache.get(stockExchange);
	}

	/**
	 * Get the Stock of the symbol of stock exchange from cache.
	 */
	@Override
	public Stock get(String stockExchange, String symbol) {
		Stock stock = null;
		if(null != cache.get(stockExchange) && cache.get(stockExchange).isEmpty()) {
			stock = cache.get(stockExchange).get(symbol);
		}
		return stock;
	}
	
	/**
	 * Clear the cache.
	 */
	@Override
	public void clear() {
		cache.clear();
	}
}