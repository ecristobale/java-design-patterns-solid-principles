package com.ecristobale.designpatterns.factory.conexion.impl;

import com.ecristobale.designpatterns.factory.conexion.IConexion;

public class ConexionVacia implements IConexion {

	@Override
	public void connect() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

	@Override
	public void disconnect() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

}
