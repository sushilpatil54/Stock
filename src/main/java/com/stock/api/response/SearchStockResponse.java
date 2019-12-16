/**
 * 
 */
package com.stock.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mindtree Ltd
 *
 */
public class SearchStockResponse {

	private String symbol;
	private String name;
	private String currency;
	private String price;
	private String stockExchangeLong;
	private String stockExchangeShort;
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the stockExchangeLong
	 */
	@JsonProperty("stock_exchange_long")
	public String getStockExchangeLong() {
		return stockExchangeLong;
	}
	/**
	 * @param stockExchangeLong the stockExchangeLong to set
	 */
	public void setStockExchangeLong(String stockExchangeLong) {
		this.stockExchangeLong = stockExchangeLong;
	}
	/**
	 * @return the stockExchangeShort
	 */
	@JsonProperty("stock_exchange_short")
	public String getStockExchangeShort() {
		return stockExchangeShort;
	}
	/**
	 * @param stockExchangeShort the stockExchangeShort to set
	 */
	public void setStockExchangeShort(String stockExchangeShort) {
		this.stockExchangeShort = stockExchangeShort;
	}
	
}
