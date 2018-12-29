package com.ecristobale.designpatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// Takes the same instance!!
		ConexionSingleton cs1 = ConexionSingleton.getSingletonInstance();
		ConexionSingleton cs2 = ConexionSingleton.getSingletonInstance();

		System.out.println("cs1 tiene un hascode: " + cs1.hashCode());
		System.out.println("cs2 tiene un hascode: " + cs2.hashCode());
		System.out.println("Apuntan a la misma dirección de memoria: " + (cs1 == cs2));
		
		System.out.println("Valor \"option\" antes de modificarlo desde cs1 visto desde cs2: " + cs2.isOption());
		cs1.setOption(true);
		System.out.println("Valor \"option\" después de modificarlo desde cs1 visto desde cs2: " + cs2.isOption());
	}

}
