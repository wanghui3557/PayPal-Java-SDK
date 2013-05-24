package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Payment;
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

public class PaymentHistory  {

	/**
	 * A list of Payment resources
	 */
	private List<Payment> payments;
	
	/**
	 * Number of items returned in each range of results. Note that the last results range could have fewer items than the requested number of items.
	 */
	private int count;
	
	/**
	 * Identifier of the next element to get the next range of results.
	 */
	private String nextId;
	
	/**
	 * Default Constructor
	 */
	public PaymentHistory() {
	}


	/**
	 * Setter for payments
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	
	/**
	 * Getter for payments
	 */
	public List<Payment> getPayments() {
		return this.payments;
	}


	/**
	 * Setter for count
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * Getter for count
	 */
	public int getCount() {
		return this.count;
	}


	/**
	 * Setter for nextId
	 */
	public void setNextId(String nextId) {
		this.nextId = nextId;
	}
	
	/**
	 * Getter for nextId
	 */
	public String getNextId() {
		return this.nextId;
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