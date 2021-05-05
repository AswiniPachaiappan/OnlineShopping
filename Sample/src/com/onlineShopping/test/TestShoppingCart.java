package com.onlineShopping.test;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

import com.onlineShopping.Product;
import com.onlineShopping.ShoppingCart;

public class TestShoppingCart {
	
	@Test
	public void testAddingProduct() {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addProduct(Optional.of(getProduct1()));
		shoppingCart.addProduct(Optional.of(getProduct2()));
		assertEquals(2,shoppingCart.numberOfItemInTheCart());
	}
	
	@Test
	public void testRemovingProduct() {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addProduct(Optional.of(getProduct1()));
		shoppingCart.addProduct(Optional.of(getProduct2()));
		assertEquals(2,shoppingCart.numberOfItemInTheCart());
		shoppingCart.removeProduct("P01");
		assertEquals(1,shoppingCart.numberOfItemInTheCart());
	}
	
	@Test
	public void testPriceOfAllItemInTheCart() {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addProduct(Optional.of(getProduct1()));
		shoppingCart.addProduct(Optional.of(getProduct2()));
		assertEquals(70000.00, shoppingCart.priceOfAllItemInTheCart(), 0.001);
	}
	
	public Product getProduct1() {
		return new Product("P01", "Mobile", 20000.00);
	}
	
	public Product getProduct2() {
		return new Product("P02", "LAPTOP", 50000.00);
	}
	
	
	

}
