package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

public interface IPayment {

	public boolean pay(List<Product> products);
}
