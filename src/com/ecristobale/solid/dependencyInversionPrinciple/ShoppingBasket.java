package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

// Class decoupled by depending on abstract classes instead of implemented classes
// And the specific instance are passed by parameters in the class constructor
// If we want to use another implementation for payment for example
// We just need to create another class that implements IPayment and pass it in the constructor
// This class doesn´t change!!!
public class ShoppingBasket {

	private final IPersistence persistence;
	private final IPayment payment;
	
	public ShoppingBasket(IPersistence persistence, IPayment payment) {
		this.persistence = persistence;
		this.payment = payment;
	}
	
	public boolean buy(List<Product> products) {
		persistence.save(products);
		return payment.pay(products);
	}
}
