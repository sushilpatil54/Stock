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
public class SearchResponse {

	private String totalReturned;
	private String totalResults;
	private String totalPages;
	private String limit;
	private String page;
	private List<SearchStockResponse> data ;
	/**
	 * @return the totalReturned
	 */
	@JsonProperty("total_returned")
	public String getTotalReturned() {
		return totalReturned;
	}
	/**
	 * @param totalReturned the totalReturned to set
	 */
	public void setTotalReturned(String totalReturned) {
		this.totalReturned = totalReturned;
	}
	/**
	 * @return the totalResults
	 */
	@JsonProperty("total_results")
	public String getTotalResults() {
		return totalResults;
	}
	/**
	 * @param totalResults the totalResults to set
	 */
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	/**
	 * @return the totalPages
	 */
	@JsonProperty("total_pages")
	public String getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return the limit
	 */
	public String getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(String limit) {
		this.limit = limit;
	}
	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}
	/**
	 * @return the data
	 */
	public List<SearchStockResponse> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<SearchStockResponse> data) {
		this.data = data;
	}
}
