package com.ecristobale.designpatterns.command.tareas;

import java.util.ArrayList;
import java.util.List;

import com.ecristobale.designpatterns.command.model.Producto;

// this just groups the tasks in the list attribute
// remember to use it from client and don´t use the interface (ITareaProduct)
public class SuperTarea implements ITareaProducto {

	private List<ITareaProducto> listaTareas = new ArrayList<ITareaProducto>();
	
	public void addTarea(ITareaProducto tarea) {
		listaTareas.add(tarea);
	}
	
	@Override
	public void ejecutar(Producto producto) {
		//igual que poner: listaTareas.forEach((t)->t.ejecutar(producto));
		for (ITareaProducto iTareaProducto : listaTareas) {
			iTareaProducto.ejecutar(producto);
		}
	}

}
