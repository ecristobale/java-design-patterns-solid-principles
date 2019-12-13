package com.ecristobale.solid.liskovSubstitution;


// Functions that use references to base classes must be able to use  
// objects of the derived class without knowing it
// Derived classes must be substitutable for the base class
public class SquareBadApplied extends Rectangle {

	// This is changing the base methods and their purpose
	// So inheritance is not being applied in the right way
	@Override
	public void setBreadth(int breadth) {
		this.setBreadth(breadth);
		this.setLength(breadth);
	}

	@Override
	public void setLength(int length) {
		this.setBreadth(length);
		this.setLength(length);
	}
}
