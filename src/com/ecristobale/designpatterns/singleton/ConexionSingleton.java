package com.ecristobale.designpatterns.singleton;

public class ConexionSingleton {

	private boolean option = false;
	
	// just 1 instance of this class
	private static ConexionSingleton singletonInstance;
	
	// private constructor to avoid multiple instances using "new" operator
	private ConexionSingleton() {}
	
	// Singleton method: this handle the outside instance requests
	// it will return the same instance -> Just 1 object of this class
	// Nice when accessing to the DB for example, in order to use the same JDBC
	// This saves a lot of memory
	public static ConexionSingleton getSingletonInstance() {
		if(singletonInstance == null) {
			// if null, call to the private constructor, just one time
			singletonInstance = new ConexionSingleton();
		}
		return singletonInstance;
	}

	public boolean isOption() {
		return option;
	}

	public void setOption(boolean option) {
		this.option = option;
	}
}
