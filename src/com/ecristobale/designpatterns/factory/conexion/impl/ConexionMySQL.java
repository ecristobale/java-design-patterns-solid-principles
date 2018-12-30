package com.ecristobale.designpatterns.factory.conexion.impl;

import com.ecristobale.designpatterns.factory.conexion.IConexion;

public class ConexionMySQL implements IConexion{

	private String host = "";
	private String port = "";
	private String user = "";
	private String password = "";
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.port = "3306";
		this.user = "root";
		this.password = "password";
	}
	
	@Override
	public void connect() {
		// Aquí introduciriamos código JDBC
		System.out.println("Conectado a MySQL");
	}

	@Override
	public void disconnect() {
		System.out.println("Desconectado de MySQL");
	}

}
