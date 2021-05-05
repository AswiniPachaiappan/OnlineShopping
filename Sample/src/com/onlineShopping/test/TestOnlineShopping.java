package com.onlineShopping.test;

import static org.mockito.Mockito.mock;

import java.util.Scanner;

import org.junit.Test;

import com.onlineShopping.OnlineShopping;



public class TestOnlineShopping {
	

	
	@Test
	public void testOnlineShoppingAddProduct() {
		Scanner mockScanner = mock(Scanner.class);
		String[] args = {"Test"};
		OnlineShopping.main(args);
		
		
	}

}
