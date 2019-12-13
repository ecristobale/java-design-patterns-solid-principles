package com.ecristobale.solid.interfaceSegregationPrinciple;

public class DVD implements IProduct, IAgeAware {

	@Override
	public int getRecommendedAge() {
		// Do some business logic and return an int
		return 18;
	}

	@Override
	public String getName() {
		// Do some business logic and return an int
		return "dvd name";
	}

	@Override
	public int getStock() {
		// Do some business logic and return an int
		return 2;
	}

	@Override
	public int getNumberOfTracks() {
		// Do some business logic and return an int
		return 6;
	}

}
