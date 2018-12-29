package com.ecristobale.designpatterns.factory;

import com.ecristobale.designpatterns.factory.conexion.IConexion;

public class TestFactory {

	public static void main(String[] args) {
		ConexionFactory factory = new ConexionFactory();

		IConexion conexion1 = factory.getConexion("mysql");
		conexion1.connect();
		conexion1.disconnect();
		
		System.out.println("----------------------------------------");
		
		IConexion conexion2 = factory.getConexion("ORACLE");
		conexion2.connect();
		conexion2.disconnect();
		
		System.out.println("----------------------------------------");
		
		IConexion conexion3 = factory.getConexion("db_incorrecta");
		conexion3.connect();
		conexion3.disconnect();
	}

}
