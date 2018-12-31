package com.ecristobale.designpatterns.fachade.api;

public class VuelosAPI {

	// Simulation class about a flights searcher (which request to a remote API about flights)
	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("------------------------------------------");
		System.out.println("Vuelos encontrados para las fechas indicadas");
		System.out.println("Ida: Vuelo 1, Vuelo 2");
		System.out.println("Vuelta: Vuelo 3");
		System.out.println("------------------------------------------");
	}
}
