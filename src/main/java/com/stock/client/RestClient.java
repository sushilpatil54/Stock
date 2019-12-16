/**
 * 
 */
package com.stock.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Mindtree Ltd
 * 
 * The class <RestClient>, Execute the external API and return response.
 */
public class RestClient {

	/** Log the details */
	private static final Logger LOGGER = LoggerFactory.getLogger(RestClient.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	/**
	 * Execute the Rest API and return response.
	 * 
	 * @param URL
	 * @param method
	 * @return
	 */
	public Object execute(String URL, String method, Class<?> className) {

		Object response = null;
		HttpURLConnection conn = null;
		try {
			LOGGER.debug("URL: {}", URL);
			URL url = new URL(URL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(method);
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() == 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
				response = objectMapper.readValue(br.toString(), Class.forName(className.getCanonicalName()));
			}
		} catch (IOException | ClassNotFoundException e) {
			LOGGER.error("Exception : {}", e.getMessage());
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response;
	}
}