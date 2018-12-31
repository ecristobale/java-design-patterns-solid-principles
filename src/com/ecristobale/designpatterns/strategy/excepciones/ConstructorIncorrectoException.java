package com.ecristobale.designpatterns.strategy.excepciones;

public class ConstructorIncorrectoException extends Exception {

	public ConstructorIncorrectoException() {
        super("Constructor incorrecto");
    }
}
