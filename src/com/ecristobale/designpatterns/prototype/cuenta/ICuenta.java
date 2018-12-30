package com.ecristobale.designpatterns.prototype.cuenta;

public interface ICuenta extends Cloneable {

	public void hacerTransferencia(double cantidad);
	public void bloquearCuenta();
	public void ingresarCantidad(double cantidad);
	public ICuenta clonar();
}
