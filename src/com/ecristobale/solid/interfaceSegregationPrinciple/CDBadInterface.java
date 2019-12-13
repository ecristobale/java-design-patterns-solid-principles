package com.ecristobale.solid.interfaceSegregationPrinciple;

public class CDBadInterface implements IProductBadApplied {


	// Here comes the problem, as a CD doesn´t have that info
	// we are forced to implement a method that is not going to use
	// or if it is used due to an error we have to throw an exception
	@Override
	public int getRecommendedAge() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String getName() {
		// Do some business logic and return a String
		return "CD name";
	}

	@Override
	public int getStock() {
		// Do some business logic and return an int
		return 3;
	}

	@Override
	public int getNumberOfTracks() {
		// Do some business logic and return an int
		return 10;
	}

}
