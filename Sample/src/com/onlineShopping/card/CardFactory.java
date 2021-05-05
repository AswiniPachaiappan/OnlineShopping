package com.onlineShopping.card;

import com.onlineShopping.util.Constants;

public class CardFactory {
	
	public static Card getCard(String cardType) {
		switch(cardType.toUpperCase()) {
		case Constants.GOLD:
			return new GoldCard();
		case Constants.SILVER:
			return new SilverCard();
		default:
			return new NormalCard();		
		}
	}

}
