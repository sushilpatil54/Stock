/**
 * 
 */
package com.stock.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.config.ApplicationConfig;
import com.stock.dto.StockRequestDto;

/**
 * @author Mindtree Ltd
 * 
 * The class <StockClientManager>, is a client for the Stock APIs
 */
@Component
public class StockClientManager {

	@Autowired
	private ApplicationConfig applicationConfig;
	
	/**
	 * Get the Stock API URL.
	 * 
	 * @param symbol
	 * @return
	 */
	public String getStockSearchURL() {
		
		StringBuilder URL = getStockURL();
		URL.append(applicationConfig.getStockSearchURL());
		return URL.toString().replace("<token>", applicationConfig.getStockAPIToken());
	}
	
	/**
	 * Get the Stock API URL.
	 * 
	 * @param symbol
	 * @return
	 */
	public String getStockDetailsURL(String symbol) {
		StringBuilder URL = getStockURL();
		URL.append(applicationConfig.getStockDetailsURL());
		return URL.toString().replace("<symbol>", symbol)
				.replace("<token>", applicationConfig.getStockAPIToken());
	}

	/**
	 * Get the Stock API.
	 * @return
	 */
	private StringBuilder getStockURL() {
		return new StringBuilder(applicationConfig.getStockURL());
	}
}