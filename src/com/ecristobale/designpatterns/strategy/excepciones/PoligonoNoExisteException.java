package com.ecristobale.designpatterns.strategy.excepciones;

public class PoligonoNoExisteException extends Exception {

	public PoligonoNoExisteException() {
		super("El polígono no existe");
	}
}
