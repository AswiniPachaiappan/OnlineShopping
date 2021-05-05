package com.onlineShopping.card;

public interface Card {
	
	/*
	 * default method to have the default discount calculation for all the Card implementations
	 */
	default double calculateDiscount(double totalPrice) {
		return totalPrice;
	}

}
