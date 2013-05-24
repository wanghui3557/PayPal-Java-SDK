package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.FundingInstrument;
import java.util.List;
import com.paypal.api.payments.PayerInfo;
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

public class Payer  {

	/**
	 * Payment method being used - PayPal Wallet payment or Direct Credit card.
	 */
	private String paymentMethod;
	
	/**
	 * List of funding instruments from where the funds of the current payment come from. Typically a credit card.
	 */
	private List<FundingInstrument> fundingInstruments;
	
	/**
	 * Information related to the Payer. In case of PayPal Wallet payment, this information will be filled in by PayPal after the user approves the payment using their PayPal Wallet. 
	 */
	private PayerInfo payerInfo;
	
	/**
	 * Default Constructor
	 */
	public Payer() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Payer(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	

	/**
	 * Setter for paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	/**
	 * Getter for paymentMethod
	 */
	public String getPaymentMethod() {
		return this.paymentMethod;
	}


	/**
	 * Setter for fundingInstruments
	 */
	public void setFundingInstruments(List<FundingInstrument> fundingInstruments) {
		this.fundingInstruments = fundingInstruments;
	}
	
	/**
	 * Getter for fundingInstruments
	 */
	public List<FundingInstrument> getFundingInstruments() {
		return this.fundingInstruments;
	}


	/**
	 * Setter for payerInfo
	 */
	public void setPayerInfo(PayerInfo payerInfo) {
		this.payerInfo = payerInfo;
	}
	
	/**
	 * Getter for payerInfo
	 */
	public PayerInfo getPayerInfo() {
		return this.payerInfo;
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