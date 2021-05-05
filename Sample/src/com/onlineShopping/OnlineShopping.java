package com.onlineShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.onlineShopping.card.Card;
import com.onlineShopping.card.CardFactory;
import com.onlineShopping.util.Constants;

public class OnlineShopping {

	public static List<Product> productsAvailable;

	public static void main(String args[]) {
		initializeProducts();
		System.out.println("Welcome to Online Shopping!");
		ShoppingCart shoppingCart = new ShoppingCart();  //New Shopping cart instance for the user
		try( Scanner input = new Scanner(System.in)) {
			System.out.println("Please choose one of the Options to Proceed shopping");
			boolean exit = false;
			do {
				listOptions();
				int option = input.nextInt();
				switch(option) {	
				case 1:   //Scenario to add Products to the Shopping cart
					System.out.println("Please enter any of below product id to add");
					listAllProducts();
					String productId = input.next();
					System.out.println(productId);
					shoppingCart.addProduct(productsAvailable.stream().
							filter(product -> product.getProductId().equalsIgnoreCase(productId)).findFirst());
					System.out.println("Product added to the cart: " + productId);
					break;
				case 2:   //Scenario to remove Product from the Shopping cart
					System.out.println("Please enter any of below product id to remove");
					listAllProducts();
					String removeProductId = input.next();
					shoppingCart.removeProduct(removeProductId);
					System.out.println("Product removed from the cart: " + removeProductId);
					break;
				case 3:	   //Scenario to get the total price and discounted price for the total products	
					if(shoppingCart.numberOfItemInTheCart() <= 0) {
						System.out.println("No items in the cart");
						break;
					}
					System.out.println("List of items selected");
					shoppingCart.listAllProductInTheCart();
					double totalPrice = shoppingCart.priceOfAllItemInTheCart();
					System.out.println("Total Price accounts to: " + totalPrice);
					System.out.println("Please enter the Card Type (GOLD, SILVER or NORMAL) to calculate the discount");
					String cardType = input.next();
					Card card = CardFactory.getCard(cardType);  //Gets the corresponding Card as per type from the CardFactory
					System.out.println("Discounted Amount is : " + card.calculateDiscount(totalPrice) );
					System.out.println("Payment sucessful");
					exit = true;
					break;
				default:
					listOptions();
					break;
				}
			}while (!exit);
		}
	}

	/*
	 * To initialize some sample products
	 */
	public static void initializeProducts() {
		productsAvailable = new ArrayList<Product>();
		productsAvailable.add(new Product("P01","Mobile",30000.00));
		productsAvailable.add(new Product("P02", "Television",50000.00));
		productsAvailable.add(new Product("P03","Sound System", 20000.00));
		productsAvailable.add(new Product("P04","Laptop",75000.00));
		productsAvailable.add(new Product("P05","Alexa",40000.00));
	}

	/*
	 * Lists all the products in the productsAvailable
	 */
	public static void listAllProducts() {
		System.out.println(Constants.PRODUCT_COLUMNS);
		System.out.println(productsAvailable);
	}

	/*
	 * List the options to perform online shopping
	 */
	public static void listOptions() {
		System.out.println("1) Add Product");
		System.out.println("2) Remove Product");
		System.out.println("3) Checkout");
	}

}

