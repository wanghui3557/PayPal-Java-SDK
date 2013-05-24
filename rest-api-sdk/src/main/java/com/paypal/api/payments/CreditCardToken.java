package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import java.util.Map;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class CreditCardToken  {

	/**
	 * ID of a previously saved Credit Card resource using /vault/credit-card API.
	 */
	private String creditCardId;
	
	/**
	 * The unique identifier of the payer used when saving this credit card using /vault/credit-card API.
	 */
	private String payerId;
	
	/**
	 * Last 4 digits of the card number from the saved card.
	 */
	private String last4;
	
	/**
	 * Type of the Card (eg. visa, mastercard, etc.) from the saved card. Please note that the values are always in lowercase and not meant to be used directly for display.
	 */
	private String type;
	
	/**
	 * card expiry month from the saved card with value 1 - 12
	 */
	private int expireMonth;
	
	/**
	 * 4 digit card expiry year from the saved card
	 */
	private int expireYear;
	
	/**
	 * Default Constructor
	 */
	public CreditCardToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CreditCardToken(String creditCardId) {
		this.creditCardId = creditCardId;
	}
	

	/**
	 * Setter for creditCardId
	 */
	public void setCreditCardId(String creditCardId) {
		this.creditCardId = creditCardId;
	}
	
	/**
	 * Getter for creditCardId
	 */
	public String getCreditCardId() {
		return this.creditCardId;
	}


	/**
	 * Setter for payerId
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
	}


	/**
	 * Setter for last4
	 */
	public void setLast4(String last4) {
		this.last4 = last4;
	}
	
	/**
	 * Getter for last4
	 */
	public String getLast4() {
		return this.last4;
	}


	/**
	 * Setter for type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Getter for type
	 */
	public String getType() {
		return this.type;
	}


	/**
	 * Setter for expireMonth
	 */
	public void setExpireMonth(int expireMonth) {
		this.expireMonth = expireMonth;
	}
	
	/**
	 * Getter for expireMonth
	 */
	public int getExpireMonth() {
		return this.expireMonth;
	}


	/**
	 * Setter for expireYear
	 */
	public void setExpireYear(int expireYear) {
		this.expireYear = expireYear;
	}
	
	/**
	 * Getter for expireYear
	 */
	public int getExpireYear() {
		return this.expireYear;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 * 
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}