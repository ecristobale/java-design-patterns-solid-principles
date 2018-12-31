package com.ecristobale.designpatterns.memento;

import com.ecristobale.designpatterns.memento.model.Juego;
import com.ecristobale.designpatterns.memento.savestates.CareTaker;
import com.ecristobale.designpatterns.memento.savestates.Originator;

public class TestMemento {

	public static void main(String[] args) {

		Juego juego = new Juego();
		juego.setNombre("Golden Sun");
		juego.setCheckpoint(1); // first check state, at the beginning of the game

		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		
		juego = new Juego();
		juego.setNombre("Golden Sun");
		juego.setCheckpoint(2); 
		originator.setEstado(juego);
		
		juego = new Juego();
		juego.setNombre("Golden Sun");
		juego.setCheckpoint(3); 
		originator.setEstado(juego);
		careTaker.addMemento(originator.guardar()); // Estado: checkpoint 3 en pos 0

		juego = new Juego();
		juego.setNombre("Golden Sun");
		juego.setCheckpoint(4); 
		originator.setEstado(juego);
		careTaker.addMemento(originator.guardar()); // Estado: checkpoint 4 en pos 1
		
		// in order to work we need to create another instance of Juego, otherwise
		// since it is pointing to the same memory location, all mementos will have
		// the last state... or use the clonable pattern in order to create different
		// instances
		originator.restaurar(careTaker.getMemento(0));
		
		juego = originator.getEstado();
		System.out.println(juego);
	}

}
