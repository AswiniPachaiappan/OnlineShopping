package com.onlineShopping.card;

public class GoldCard implements Card{
	
	public double discountRate = 20.00;
	
	/*
	 * (non-Javadoc)
	 * @see com.onlineShopping.card.Card#calculateDiscount(double)
	 * Calculates amount for 20% discount
	 */
	@Override
	public double calculateDiscount(double totalPrice) {
		return totalPrice - (totalPrice * discountRate / 100);
	}

}
