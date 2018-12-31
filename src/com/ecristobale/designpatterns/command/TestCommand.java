package com.ecristobale.designpatterns.command;

import com.ecristobale.designpatterns.command.model.Producto;
import com.ecristobale.designpatterns.command.tareas.GestorTareas;
import com.ecristobale.designpatterns.command.tareas.SuperTarea;
import com.ecristobale.designpatterns.command.tareas.TareaEnvioCorreo;
import com.ecristobale.designpatterns.command.tareas.TareaImprimir;
import com.ecristobale.designpatterns.command.tareas.TareaValidar;

public class TestCommand {

	public static void main(String[] args) {
		// Has to be SuperTarea, it won´t work with ITareaProducto
		SuperTarea grupoTareas = new SuperTarea();

		grupoTareas.addTarea(new TareaEnvioCorreo());
		grupoTareas.addTarea(new TareaImprimir());
		grupoTareas.addTarea(new TareaValidar());
		
		GestorTareas gestorTareas = new GestorTareas();
		Producto producto = new Producto(10, "FFX", 30);
		
		gestorTareas.ejecutar(grupoTareas, producto);
	}

}
