package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payee;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.RelatedResources;
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

public class Transaction  {

	/**
	 * Amount being collected.
	 */
	private Amount amount;
	
	/**
	 * Recepient of the funds in this transaction.
	 */
	private Payee payee;
	
	/**
	 * Description of what is being paid for.
	 */
	private String description;
	
	/**
	 * List of items being paid for.
	 */
	private ItemList itemList;
	
	/**
	 * List of financial transactions (Sale, Authorization, Capture, Refund) related to the payment.
	 */
	private List<RelatedResources> relatedResources;
	
	/**
	 * Additional transactions for complex payment (Parallel and Chained) scenarios.
	 */
	private List<Transaction> transactions;
	
	/**
	 * Default Constructor
	 */
	public Transaction() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Transaction(Amount amount) {
		this.amount = amount;
	}
	

	/**
	 * Setter for amount
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	
	/**
	 * Getter for amount
	 */
	public Amount getAmount() {
		return this.amount;
	}


	/**
	 * Setter for payee
	 */
	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	
	/**
	 * Getter for payee
	 */
	public Payee getPayee() {
		return this.payee;
	}


	/**
	 * Setter for description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Getter for description
	 */
	public String getDescription() {
		return this.description;
	}


	/**
	 * Setter for itemList
	 */
	public void setItemList(ItemList itemList) {
		this.itemList = itemList;
	}
	
	/**
	 * Getter for itemList
	 */
	public ItemList getItemList() {
		return this.itemList;
	}


	/**
	 * Setter for relatedResources
	 */
	public void setRelatedResources(List<RelatedResources> relatedResources) {
		this.relatedResources = relatedResources;
	}
	
	/**
	 * Getter for relatedResources
	 */
	public List<RelatedResources> getRelatedResources() {
		return this.relatedResources;
	}


	/**
	 * Setter for transactions
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	/**
	 * Getter for transactions
	 */
	public List<Transaction> getTransactions() {
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