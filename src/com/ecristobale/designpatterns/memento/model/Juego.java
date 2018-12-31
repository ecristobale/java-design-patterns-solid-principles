package com.ecristobale.designpatterns.memento.model;

public class Juego {

	private String nombre;
	private int checkpoint;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCheckpoint() {
		return checkpoint;
	}
	public void setCheckpoint(int checkpoint) {
		this.checkpoint = checkpoint;
	}
	
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", checkpoint=" + checkpoint + "]";
	}
}
