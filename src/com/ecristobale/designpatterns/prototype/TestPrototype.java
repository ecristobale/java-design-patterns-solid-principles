package com.ecristobale.designpatterns.prototype;

import com.ecristobale.designpatterns.prototype.cuenta.impl.CuentaImpl;

public class TestPrototype {

	public static void main(String[] args) {
		
		CuentaImpl cuenta = new CuentaImpl();
		cuenta.ingresarCantidad(300);
		cuenta.hacerTransferencia(100);
		
		// We now create another object which is cloned from the original by using
		// the prototype pattern. They point to different memory locations
		CuentaImpl cuentaClonada = (CuentaImpl) cuenta.clonar();
		
		System.out.println("Cuenta original: " + cuenta);
		System.out.println("Cuenta clonada: " + cuentaClonada);
		
		System.out.println("Cuenta original == cuenta clonada ? -> " 
				+ (cuenta == cuentaClonada));
	}

}
