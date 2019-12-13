package com.ecristobale.solid.interfaceSegregationPrinciple;

public class CD implements IProduct {

	@Override
	public String getName() {
		// Do some business logic and return a String
		return "CD name";
	}

	@Override
	public int getStock() {
		// Do some business logic and return an int
		return 7;
	}

	@Override
	public int getNumberOfTracks() {
		// Do some business logic and return an int
		return 5;
	}

}
