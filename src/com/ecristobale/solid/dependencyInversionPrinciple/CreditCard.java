package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

public class CreditCard implements IPayment {

	@Override
	public boolean pay(List<Product> products) {
		// operations in order to pay the product list
		return true;
	}

}
