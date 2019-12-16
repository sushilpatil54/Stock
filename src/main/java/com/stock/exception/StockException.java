/**
 * 
 */
package com.stock.exception;

/**
 * @author Mindtree Ltd
 *
 */
public class StockException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public StockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public StockException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public StockException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public StockException(Throwable cause) {
		super(cause);
	}
}