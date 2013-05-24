package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.CreditCardToken;
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

public class FundingInstrument  {

	/**
	 * Credit Card information.
	 */
	private CreditCard creditCard;
	
	/**
	 * Credit Card information.
	 */
	private CreditCardToken creditCardToken;
	
	/**
	 * Default Constructor
	 */
	public FundingInstrument() {
	}


	/**
	 * Setter for creditCard
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	/**
	 * Getter for creditCard
	 */
	public CreditCard getCreditCard() {
		return this.creditCard;
	}


	/**
	 * Setter for creditCardToken
	 */
	public void setCreditCardToken(CreditCardToken creditCardToken) {
		this.creditCardToken = creditCardToken;
	}
	
	/**
	 * Getter for creditCardToken
	 */
	public CreditCardToken getCreditCardToken() {
		return this.creditCardToken;
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