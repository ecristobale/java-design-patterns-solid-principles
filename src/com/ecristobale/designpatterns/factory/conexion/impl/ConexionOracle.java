package com.ecristobale.designpatterns.factory.conexion.impl;

import com.ecristobale.designpatterns.factory.conexion.IConexion;

public class ConexionOracle implements IConexion{

	private String host = "";
	private String port = "";
	private String user = "";
	private String password = "";
	
	public ConexionOracle() {
		this.host = "localhost";
		this.port = "1521";
		this.user = "root";
		this.password = "password";
	}
	
	@Override
	public void connect() {
		// Aquí introduciriamos código JDBC
		System.out.println("Conectado a Oracle");
	}

	@Override
	public void disconnect() {
		System.out.println("Desconectado de Oracle");
	}
}
