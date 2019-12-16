/**
 * 
 */
package com.stock.api.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mindtree Ltd
 *
 */
public class StockResponse {

	private String symbolsRequested;
	private String symbolsReturned;
	private List<StockDetailResponse> data;
	/**
	 * @return the symbolsRequested
	 */
	@JsonProperty("symbols_requested")
	public String getSymbolsRequested() {
		return symbolsRequested;
	}
	/**
	 * @param symbolsRequested the symbolsRequested to set
	 */
	public void setSymbolsRequested(String symbolsRequested) {
		this.symbolsRequested = symbolsRequested;
	}
	/**
	 * @return the symbolsReturned
	 */
	@JsonProperty("symbols_returned")
	public String getSymbolsReturned() {
		return symbolsReturned;
	}
	/**
	 * @param symbolsReturned the symbolsReturned to set
	 */
	public void setSymbolsReturned(String symbolsReturned) {
		this.symbolsReturned = symbolsReturned;
	}
	/**
	 * @return the data
	 */
	public List<StockDetailResponse> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<StockDetailResponse> data) {
		this.data = data;
	}
	
}
