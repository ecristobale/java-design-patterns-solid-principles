package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

// This high level class depends on low level classes (SqlDatabase and CreditCard) 
public class ShoppingBasketBadApplied {

	// What happen if you want to add more ways of doing the payment?
	// For example by storing into a server instead of db, or using PayPal to pay
	public boolean buy(List<Product> products) {
		SqlDatabase db = new SqlDatabase();
		db.save(products);
		
		CreditCard creditCard = new CreditCard();
		return creditCard.pay(products);
	}

	// Inner class in order to see better the example
	public class SqlDatabase {
		public void save(List<Product> products){
			// Saves data in SQL database
		}
	}
	
	// Inner class in order to see better the example
	public class CreditCard {
	    public boolean pay(List<Product> products){
	        // Performs payment using a credit card
	    	return true;
	    }
	}
	
	// Inner class in order to see better the example
	public class Product {
		String name;
		int price;
		int units;
		// more attributes, constructors, getters and setters...
	}
}

