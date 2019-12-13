package com.ecristobale.solid.openClosePrinciple;

import java.util.Date;

public class AnimalBadApplied {

	// Animal properties
	private String name;
	private Date birth;
	
	// This is not an animal property, in this case is a cow property!!
	// We need to extract that property and the setters/getters to a class 
	// that extends from Animal
	private int milkedTimes;
	
	public AnimalBadApplied(String name, Date birth, int milkedTimes) {
		this.name = name;
		this.birth = birth;
		this.milkedTimes = milkedTimes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getMilkedTimes() {
		return milkedTimes;
	}

	public void setMilkedTimes(int milkedTimes) {
		this.milkedTimes = milkedTimes;
	}
	
	
}
