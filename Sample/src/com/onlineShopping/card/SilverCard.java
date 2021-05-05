package com.onlineShopping.card;

public class SilverCard implements Card{
	
	public double discountRate = 10.00;
	
	/*
	 * (non-Javadoc)
	 * @see com.onlineShopping.card.Card#calculateDiscount(double)
	 * Calculates amount for 10% discount
	 */
	@Override
	public double calculateDiscount(double totalPrice) {
		return totalPrice - (totalPrice * discountRate / 100);
	}


}
