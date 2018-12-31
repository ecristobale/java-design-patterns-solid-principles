package com.ecristobale.designpatterns.strategy.excepciones;

public class PoligonoNoSoportadoException extends Exception {

	public PoligonoNoSoportadoException() {
		super("Polígono no soportado");
	}
}
