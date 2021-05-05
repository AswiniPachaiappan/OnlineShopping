package com.onlineShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {
	
	private List<Product> products;
	
	public ShoppingCart() {
		products = new ArrayList<>(); //Initializes new Product list for each customers
	}
	
	/*
	 * Adds products to the Cart
	 */
	public void addProduct(Optional<Product> product) {
		if(product.isPresent())
			products.add(product.get());
	}
	
	/*
	 * Removes product from the cart
	 */
	public void removeProduct(String productId) {
		products.removeIf(product -> product.getProductId().equalsIgnoreCase(productId));
	}
	
	/*
	 * List all products in the cart
	 */
	public void listAllProductInTheCart() {
		System.out.println(products);
	}
	
	/*
	 * Sum of prices of all products in the cart
	 */
	public double priceOfAllItemInTheCart() {
		return products.stream().mapToDouble(Product::getPrice).sum();
	}
	
	/*
	 * Number of items in the cart
	 */
	public int numberOfItemInTheCart() {
		return products.size();
	}

}
