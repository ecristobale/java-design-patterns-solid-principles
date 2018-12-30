package com.ecristobale.designpatterns.fachade;

public class TestFachade {

	public static void main(String[] args) {

		SearchFacade client1 = new SearchFacade();
		client1.buscar("Cliente 1: 03-11-1988", "02-12-2018", "Madrid", "Sevilla");

		SearchFacade client2 = new SearchFacade();
		client2.buscar("Cliente 2: 02-12-2018", "03-11-2019", "Sevilla", "Valencia");
	}

}
