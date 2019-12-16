/**
 * 
 */
package com.stock.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.stock.dto.StockRequestDto;

/**
 * @author Mindtree Ltd
 *
 *         The class <ApplicationConfig> will load the application
 *         configurations.
 */
@Configurable
@Component
@PropertySource("classpath:application.properties")
public class ApplicationConfig implements WebMvcConfigurer {

	@Value("${stock.api.token}")
	private String stockAPIToken;
	
	@Value("${stock.url}")
	private String stockURL;
	
	@Value("${stock.url.search}")
	private String stockSearchURL;
	
	@Value("${stock.url.stock}")
	private String stockDetailsURL;
	
	@Value("${default.stock.exchange}")
	private String deafultStockExchange;

	@Value("${default.stock.supported}")
	private String defaultStockSupported;

	@Value("${stock.api.parameter.searchby}")
	private String searchBy;
	
	ApplicationConfig() {
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	/**
	 * @return the stockURL
	 */
	public String getStockURL() {
		return stockURL;
	}

	/**
	 * @return the stockAPIToken
	 */
	public String getStockAPIToken() {
		return stockAPIToken;
	}

	/**
	 * @return the deafultStockExchange
	 */
	public String getDeafultStockExchange() {
		return deafultStockExchange;
	}

	/**
	 * @return the defaultStockSupported
	 */
	public String getDefaultStockSupported() {
		return defaultStockSupported;
	}

	/**
	 * @return the stockSearchURL
	 */
	public String getStockSearchURL() {
		return stockSearchURL;
	}

	/**
	 * @return the stockDetailsURL
	 */
	public String getStockDetailsURL() {
		return stockDetailsURL;
	}

	/**
	 * @return the searchBy
	 */
	public String getSearchBy() {
		return searchBy;
	}
}