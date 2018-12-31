package com.ecristobale.designpatterns.memento.savestates;

import com.ecristobale.designpatterns.memento.model.Juego;

// This class knows how to save and restore the state from the object Juego
public class Originator {

	private Juego estado;
	
	public void setEstado(Juego estado) {
		this.estado = estado;
	}
	
	public Juego getEstado() {
		return this.estado;
	}
	
	// return a Memento object because is going to be used by CareTaker
	public Memento guardar() {
		return new Memento(estado);
	}
	
	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}
}
