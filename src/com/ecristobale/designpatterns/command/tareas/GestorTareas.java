package com.ecristobale.designpatterns.command.tareas;

import com.ecristobale.designpatterns.command.model.Producto;

// Command pattern: This just executes one task on an object
// With command pattern we define the task and create multiple task objects and group them SuperTarea
public class GestorTareas {

	public void ejecutar (ITareaProducto tarea, Producto producto) {
		tarea.ejecutar(producto);
	}
}
