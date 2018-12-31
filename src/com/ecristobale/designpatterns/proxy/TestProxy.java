package com.ecristobale.designpatterns.proxy;

import com.ecristobale.designpatterns.proxy.mensaje.IServicioMensaje;
import com.ecristobale.designpatterns.proxy.mensaje.ServicioMensajeImpl;

public class TestProxy {

	public static void main(String[] args) {
		
		// Sin proxy
		IServicioMensaje servicioMensaje = new ServicioMensajeImpl();
		System.out.println(servicioMensaje.mensaje("Ale"));
		
		System.out.println("------------------------------------");
		
		// Con proxy para tener un log de la ejecución
		IServicioMensaje servicioMensaje2 = new ServicioMensajeProxy();
		System.out.println(servicioMensaje2.mensaje("Ale"));
	}

}
