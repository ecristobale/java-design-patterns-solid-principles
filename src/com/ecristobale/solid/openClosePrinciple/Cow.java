package com.ecristobale.solid.openClosePrinciple;

import java.util.Date;

public class Cow extends Animal{

	private int milkedTimes;
	
	public Cow(String name, Date birth, int milkedTimes) {
		super(name, birth);
		this.milkedTimes = milkedTimes;
	}

	public int getMilkedTimes() {
		return milkedTimes;
	}

	public void setMilkedTimes(int milkedTimes) {
		this.milkedTimes = milkedTimes;
	}
}
