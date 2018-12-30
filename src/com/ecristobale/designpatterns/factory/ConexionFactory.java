package com.ecristobale.designpatterns.factory;

import com.ecristobale.designpatterns.factory.conexion.IConexion;
import com.ecristobale.designpatterns.factory.conexion.impl.ConexionMySQL;
import com.ecristobale.designpatterns.factory.conexion.impl.ConexionOracle;
import com.ecristobale.designpatterns.factory.conexion.impl.ConexionVacia;

public class ConexionFactory {

	// Factory patterns, used when you have SOME implementations of an interface
	// to retrieve one concrete by passing to the method a concrete name.
	public ConexionFactory() {}
	
	// It is important to note that the method returns the type of the interface!!
	// Otherwise it won't work
	public IConexion getConexion(String database) {
		if(database == null) {
			return new ConexionVacia();
		}
		if(database.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if(database.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}
		return new ConexionVacia();
	}
}
