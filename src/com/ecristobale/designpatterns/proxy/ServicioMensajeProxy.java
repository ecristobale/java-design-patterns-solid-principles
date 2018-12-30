package com.ecristobale.designpatterns.proxy;

import java.util.logging.Logger;
import com.ecristobale.designpatterns.proxy.mensaje.IServicioMensaje;
import com.ecristobale.designpatterns.proxy.mensaje.ServicioMensajeImpl;

// This is just an extra layer that is going to be used by the client and just
// delegate in ServicioMensajeImpl but is going to add a LOGGER
// (it is used for that) <-- this way the code isn´t modified for the logs code
public class ServicioMensajeProxy implements IServicioMensaje {

	private ServicioMensajeImpl servicioMensaje;
	private final static Logger LOGGER = Logger.getLogger(ServicioMensajeProxy.class.getName());
	
	public ServicioMensajeProxy() {
		super();
		this.servicioMensaje = new ServicioMensajeImpl();
	}
	
	@Override
	public String mensaje(String persona) {
		LOGGER.info("----- ServicioMensajeProxy - mensaje");
		return servicioMensaje.mensaje(persona);
	}

}
