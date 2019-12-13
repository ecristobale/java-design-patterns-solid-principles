package com.ecristobale.solid.singleResponsabilityPrinciple;

public class PersonBadApplied {

	private String name;
	private String surname;
	private int age;
	
	
	public PersonBadApplied(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	// A class, component or microservice has one task, and no more.
	// So if this class has the responsability of:
	// 1. Access the person properties
	// 2. We added the saveInDB method to persist in DB.
	// We have to divide this class in 2, one for each task.
	public void saveInDB(PersonBadApplied person) {
		// do some logic like call the repository and save it to the DB.
		System.out.println("saving person in DB...");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
