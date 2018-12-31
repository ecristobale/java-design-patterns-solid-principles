package com.ecristobale.designpatterns.command.tareas;

import com.ecristobale.designpatterns.command.model.Producto;

public class TareaImprimir implements ITareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		System.out.println("Imprimiendo producto...\n" 
					+ " " + producto.getName());
		System.out.println(" " + producto.getId());
		System.out.println(" " + producto.getPrecio());
		System.out.println("Finalizó la impresión");
	}

}
