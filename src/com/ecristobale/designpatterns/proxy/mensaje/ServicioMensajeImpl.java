package com.ecristobale.designpatterns.proxy.mensaje;

public class ServicioMensajeImpl implements IServicioMensaje {

	@Override
	public String mensaje(String persona) {
		return "Hola " + persona;
	}

}
