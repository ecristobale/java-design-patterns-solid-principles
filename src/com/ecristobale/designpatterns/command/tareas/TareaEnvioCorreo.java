package com.ecristobale.designpatterns.command.tareas;

import com.ecristobale.designpatterns.command.model.Producto;

public class TareaEnvioCorreo implements ITareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		System.out.println(producto.getName() + " enviado por correo");
	}

}
