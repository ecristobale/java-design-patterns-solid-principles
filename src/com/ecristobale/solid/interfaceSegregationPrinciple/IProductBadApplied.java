package com.ecristobale.solid.interfaceSegregationPrinciple;

public interface IProductBadApplied {

	// Good for musik CDs
	public String getName();
	public int getStock();
	public int getNumberOfTracks();
	
	// Good for film DVDs but not applied for musik CD
	public int getRecommendedAge();
	
}
