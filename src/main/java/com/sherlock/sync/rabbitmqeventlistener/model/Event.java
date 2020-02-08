package com.sherlock.sync.rabbitmqeventlistener.model;

import java.util.List;

public class Event {

	private String orderId;
	private List<Product> products;
	private Recipient recipient;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	@Override public String toString() {
		return "Event{" +
				"orderId='" + orderId + '\'' +
				", products=" + products +
				", recipient=" + recipient +
				'}';
	}
}
