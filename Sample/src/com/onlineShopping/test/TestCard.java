package com.onlineShopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.onlineShopping.card.Card;
import com.onlineShopping.card.CardFactory;

public class TestCard {
	
	@Test
	public void testGoldCard() {
		Card card = CardFactory.getCard("GOLD");
		assertEquals(40000.00, card.calculateDiscount(50000.00), 0.001);
	}
	
	@Test
	public void testSilverCard() {
		Card card = CardFactory.getCard("SILVER");
		assertEquals(45000.00, card.calculateDiscount(50000.00), 0.001);
	}
	
	@Test
	public void testNormalCard() {
		Card card = CardFactory.getCard("NORMAL");
		assertEquals(50000.00, card.calculateDiscount(50000.00), 0.001);
	}

}
