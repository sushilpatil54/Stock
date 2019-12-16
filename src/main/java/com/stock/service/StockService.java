/**
 * 
 */
package com.stock.service;

import java.util.List;

import com.stock.dto.Stock;

/**
 * @author Mindtree Ltd
 *
 * The Interface <StockService>, retrieve the details of
 *         the stock from external API.
 */
public interface StockService {

	/**
	 * Get the symbol's stock details.
	 * 
	 * @param stockExchange
	 * @param symbol
	 * @return
	 */
	Stock getStockDetails(String stockExchange, String symbol);
	
	/**
	 * Get all the stock details.
	 * 
	 * @return
	 */
	List<Stock> getStockDetails();
}
