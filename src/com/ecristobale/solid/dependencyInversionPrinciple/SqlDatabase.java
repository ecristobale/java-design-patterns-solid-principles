package com.ecristobale.solid.dependencyInversionPrinciple;

import java.util.List;

public class SqlDatabase implements IPersistence {

	@Override
	public void save(List<Product> products) {
		// Operations to save products in the SQL database
	}

}
