package com.ecristobale.designpatterns.fachade;

import com.ecristobale.designpatterns.fachade.api.HotelesAPI;
import com.ecristobale.designpatterns.fachade.api.VuelosAPI;

//Fachade pattern is about expose to the client one simple, single and easy action and
// behind that there are hidden all the complex operations that must be completed in 
// order to do all the actions that are required to complete that.
// So the client can use that system without knowing how it works. 
public class SearchFacade {

	private HotelesAPI hotelesAPI;
	private VuelosAPI vuelosAPI;
	
	public SearchFacade() {
		hotelesAPI = new HotelesAPI();
		vuelosAPI = new VuelosAPI();
	}
	
	// The client will use that method in order to search for a flight and for a hotel 
	// without knowing that there are calls to remote APIs.. and so on to perform that
	// action
	public void buscar(String fechaInicio, String fechaFin, String origen, String destino) {
		vuelosAPI.buscarVuelos(fechaInicio, fechaFin, origen, destino);
		hotelesAPI.buscarHoteles(fechaInicio, fechaFin, origen, destino);
	}
}
