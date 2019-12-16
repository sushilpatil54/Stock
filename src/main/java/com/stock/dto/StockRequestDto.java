/**
 * 
 */
package com.stock.dto;

/**
 * @author Mindtree Ltd
 *
 */
public class StockRequestDto {

	private String search;
	private String stockExchange;
	private String searchBy;
	/**
	 * @return the search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 * @param search the search to set
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	/**
	 * @return the stockExchange
	 */
	public String getStockExchange() {
		return stockExchange;
	}
	/**
	 * @param stockExchange the stockExchange to set
	 */
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	/**
	 * @return the searchBy
	 */
	public String getSearchBy() {
		return searchBy;
	}
	/**
	 * @param searchBy the searchBy to set
	 */
	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}
}