package com.ecristobale.solid.singleResponsabilityPrinciple;

public class PersonServiceImpl implements PersonService {

	@Override
	public void saveInDB(Person person) {
		// do some logic like call the repository and save it to the DB.
		System.out.println("saving person in DB...");
	}
}
