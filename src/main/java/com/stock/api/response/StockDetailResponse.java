/**
 * 
 */
package com.stock.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mindtree Ltd
 *
 */
public class StockDetailResponse {

	private String symbol;
	private String name;
	private String price;
	private String currency;
	private String priceOpen;
	private String dayHigh;
	private String daylow;
	private String yearHigh;
	private String yearLow;
	private String dayChange;
	private String changePct;
	private String closeYesterday;
	private String marketCap;
	private String volume;
	private String volumeAvg;
	private String shares;
	private String stockExchangeLong;
	private String stockExchangeShort;
	private String timezone;
	private String timezoneName;
	private String gmtOffset;
	private String lastTradeTime;
	private String pe;
	private String eps;
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
	 * @return the priceOpen
	 */
	@JsonProperty("price_open")
	public String getPriceOpen() {
		return priceOpen;
	}
	/**
	 * @param priceOpen the priceOpen to set
	 */
	public void setPriceOpen(String priceOpen) {
		this.priceOpen = priceOpen;
	}
	/**
	 * @return the dayHigh
	 */
	@JsonProperty("day_high")
	public String getDayHigh() {
		return dayHigh;
	}
	/**
	 * @param dayHigh the dayHigh to set
	 */
	public void setDayHigh(String dayHigh) {
		this.dayHigh = dayHigh;
	}
	/**
	 * @return the daylow
	 */
	@JsonProperty("day_low")
	public String getDaylow() {
		return daylow;
	}
	/**
	 * @param daylow the daylow to set
	 */
	public void setDaylow(String daylow) {
		this.daylow = daylow;
	}
	/**
	 * @return the yearHigh
	 */
	@JsonProperty("52_week_high")
	public String getYearHigh() {
		return yearHigh;
	}
	/**
	 * @param yearHigh the yearHigh to set
	 */
	public void setYearHigh(String yearHigh) {
		this.yearHigh = yearHigh;
	}
	/**
	 * @return the yearLow
	 */
	@JsonProperty("52_week_low")
	public String getYearLow() {
		return yearLow;
	}
	/**
	 * @param yearLow the yearLow to set
	 */
	public void setYearLow(String yearLow) {
		this.yearLow = yearLow;
	}
	/**
	 * @return the dayChange
	 */
	@JsonProperty("day_change")
	public String getDayChange() {
		return dayChange;
	}
	/**
	 * @param dayChange the dayChange to set
	 */
	public void setDayChange(String dayChange) {
		this.dayChange = dayChange;
	}
	/**
	 * @return the changePct
	 */
	@JsonProperty("change_pct")
	public String getChangePct() {
		return changePct;
	}
	/**
	 * @param changePct the changePct to set
	 */
	public void setChangePct(String changePct) {
		this.changePct = changePct;
	}
	/**
	 * @return the closeYesterday
	 */
	@JsonProperty("close_yesterday")
	public String getCloseYesterday() {
		return closeYesterday;
	}
	/**
	 * @param closeYesterday the closeYesterday to set
	 */
	public void setCloseYesterday(String closeYesterday) {
		this.closeYesterday = closeYesterday;
	}
	/**
	 * @return the marketCap
	 */
	@JsonProperty("market_cap")
	public String getMarketCap() {
		return marketCap;
	}
	/**
	 * @param marketCap the marketCap to set
	 */
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}
	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}
	/**
	 * @return the volumeAvg
	 */
	@JsonProperty("volume_avg")
	public String getVolumeAvg() {
		return volumeAvg;
	}
	/**
	 * @param volumeAvg the volumeAvg to set
	 */
	public void setVolumeAvg(String volumeAvg) {
		this.volumeAvg = volumeAvg;
	}
	/**
	 * @return the shares
	 */
	public String getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(String shares) {
		this.shares = shares;
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
	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the timezoneName
	 */
	@JsonProperty("timezone_name")
	public String getTimezoneName() {
		return timezoneName;
	}
	/**
	 * @param timezoneName the timezoneName to set
	 */
	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}
	/**
	 * @return the gmtOffset
	 */
	@JsonProperty("gmt_offset")
	public String getGmtOffset() {
		return gmtOffset;
	}
	/**
	 * @param gmtOffset the gmtOffset to set
	 */
	public void setGmtOffset(String gmtOffset) {
		this.gmtOffset = gmtOffset;
	}
	/**
	 * @return the lastTradeTime
	 */
	@JsonProperty("last_trade_time")
	public String getLastTradeTime() {
		return lastTradeTime;
	}
	/**
	 * @param lastTradeTime the lastTradeTime to set
	 */
	public void setLastTradeTime(String lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}
	/**
	 * @return the pe
	 */
	public String getPe() {
		return pe;
	}
	/**
	 * @param pe the pe to set
	 */
	public void setPe(String pe) {
		this.pe = pe;
	}
	/**
	 * @return the eps
	 */
	public String getEps() {
		return eps;
	}
	/**
	 * @param eps the eps to set
	 */
	public void setEps(String eps) {
		this.eps = eps;
	}
}