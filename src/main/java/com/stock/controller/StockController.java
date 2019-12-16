package com.stock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.dto.Stock;
import com.stock.dto.StockRequestDto;
import com.stock.service.StockService;

/**
 * @author Mindtree Ltd
 * 
 * The Class <StockController>, APIs to retrieve the details of the stock.
 */
@Controller
@Path("/")
public class StockController {

	/** Log the details */
	private static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);

	@Autowired
	StockService stockService;

	@Autowired
	private ObjectMapper objectMapper;
	
	/**
	 * Get the stock prices of the given stock symbol.
	 * 
	 * @param symbol
	 */
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{symbol}")
	public String getStockDetails(@PathParam("symbol") String symbol, 
			@RequestParam(name = "stock_exchange", required=false) String stockExchange) {

		LOGGER.debug("getStockDetails by symbol : Start");
		String response = null;
		try {
			Stock stock = stockService.getStockDetails(stockExchange, symbol);
			Map<String, Stock> map = new HashMap<>();
			if(null != stock) {
				map.put(stockExchange, stock);
			}
			response = objectMapper.writeValueAsString(map);
			LOGGER.debug("getStockDetails by symbol : End");
		} catch (JsonProcessingException e) {
			LOGGER.error("Exception : {}", e.getMessage());
		}
		return response;
	}

	/**
	 * Get all the stock prices of the given stock symbol.
	 * 
	 * @param symbol
	 */
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public String getStockDetails() {

		LOGGER.debug("getStockDetails : Start");
		String response = null;
		try {
			List<Stock> list = stockService.getStockDetails();
			response = objectMapper.writeValueAsString(list);
			LOGGER.debug("getStockDetails : End");
		} catch (JsonProcessingException e) {
			LOGGER.error("Exception : {}", e.getMessage());
		}
		return response;
	}
}