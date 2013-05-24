package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Transactions;
import java.util.List;
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

public class PaymentExecution  {

	/**
	 * PayPal assigned Payer ID returned in the approval return url.
	 */
	private String payerId;
	
	/**
	 * If the amount needs to be updated after obtaining the PayPal Payer info (eg. shipping address), it can be updated using this element.
	 */
	private List<Transactions> transactions;
	
	/**
	 * Default Constructor
	 */
	public PaymentExecution() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PaymentExecution(String payerId) {
		this.payerId = payerId;
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
	 * Setter for transactions
	 */
	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	
	/**
	 * Getter for transactions
	 */
	public List<Transactions> getTransactions() {
		return this.transactions;
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