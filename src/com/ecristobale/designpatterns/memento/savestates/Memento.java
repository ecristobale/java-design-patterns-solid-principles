package com.ecristobale.designpatterns.memento.savestates;

import com.ecristobale.designpatterns.memento.model.Juego;

// This just contains one object with one state and one getter to return it
// the object is saved in the constructor method
// This class is used by both CareTaker and Originator
public class Memento {

	private Juego estado;
	
	public Memento(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}
}
