package com.ecristobale.designpatterns.prototype.cuenta.impl;

import com.ecristobale.designpatterns.prototype.cuenta.ICuenta;

public class CuentaImpl implements ICuenta {
	
	private double cantidadTotal;
	private boolean bloqueada;
	
	public CuentaImpl() {
		cantidadTotal = 0;
		bloqueada = false;
	}
	
	// Calling clone method thanks to implements Cloneable (ICount implements it)
	// we takes one count cloned from the original, with same attribute values (it is a copy).
	// but pointing to a different memory address, so they are two different objects.
	@Override
	public ICuenta clonar() {
		CuentaImpl cuentaClonada = null;
		try {
			cuentaClonada = (CuentaImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuentaClonada;
	}

	@Override
	public void hacerTransferencia(double cantidad) {
		cantidadTotal -= cantidad;
	}

	@Override
	public void bloquearCuenta() {
		bloqueada = true;
	}

	@Override
	public void ingresarCantidad(double cantidad) {
		cantidadTotal += cantidad;
	}
	
	@Override
	public String toString() {
		return "CuentaImpl [cantidadTotal = " + cantidadTotal + ", bloqueada = " + bloqueada 
				+ ", hashCode = " + hashCode();
	}
}
