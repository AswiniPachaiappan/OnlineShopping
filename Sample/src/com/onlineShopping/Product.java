package com.onlineShopping;

public class Product {

	private final String productId;
	private final String productName;
	private final double price;
	
	public Product(String productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * To print the product
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("\n");
		sb.append(productId).append("\t").append(productName).append("\t").append(price);
		return sb.toString();
	}
	
	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
}
