package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

public interface IPersistence {

	public void save(List<Product> products);
}
