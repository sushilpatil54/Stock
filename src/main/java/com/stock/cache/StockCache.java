/**
 * 
 */
package com.stock.cache;

import java.util.Map;

import com.stock.dto.Stock;

/**
 * @author Mindtree Ltd
 *
 * The interface <StockCache>, Store the Stocks in the cache.
 */
public interface StockCache {

	/**
	 * Add the stock in to cache.
	 * 
	 * @param stocks
	 */
	void add(Map<String, Map<String, Stock>> stocks);
	
	/**
	 * Get the Stocks of the stock exchange from cache.
	 * 
	 * @param stockExchange
	 * @return
	 */
	Map<String, Stock> get(String stockExchange);
	
	/**
	 * Get the Stock of the symbol of stock exchange from cache.
	 * 
	 * @param stockExchange
	 * @param symbol
	 * @return
	 */
	Stock get(String stockExchange, String symbol);
	
	/**
	 * Clear the cache.
	 */
	void clear();
}
