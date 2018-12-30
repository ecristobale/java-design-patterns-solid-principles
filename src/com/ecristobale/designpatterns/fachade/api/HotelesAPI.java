package com.ecristobale.designpatterns.fachade.api;

public class HotelesAPI {

	// Simulation class about a hotel searcher (which request to a remote API about hotels)
	public void buscarHoteles(String fechaInicio, String fechaFin, String origen, String destino) {
		System.out.println("------------------------------------------");
		System.out.println("Hoteles encontrados para las fechas indicadas");
		System.out.println("Hotel 1");
		System.out.println("Hotel 2");
		System.out.println("Hotel 3");
		System.out.println("------------------------------------------");
	}
}
