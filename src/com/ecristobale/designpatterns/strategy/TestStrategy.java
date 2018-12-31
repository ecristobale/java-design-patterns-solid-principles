package com.ecristobale.designpatterns.strategy;

import com.ecristobale.designpatterns.strategy.excepciones.ConstructorIncorrectoException;
import com.ecristobale.designpatterns.strategy.excepciones.PoligonoNoExisteException;
import com.ecristobale.designpatterns.strategy.excepciones.PoligonoNoSoportadoException;
import com.ecristobale.designpatterns.strategy.implementacion.CuerpoGeometrico;

public class TestStrategy {

	public static void main(String[] args) {

		try {
			CuerpoGeometrico figura = new CuerpoGeometrico(2f);
			figura.estableceCalculadoraArea();
			figura.imprimeArea();
			
			figura = new CuerpoGeometrico(2f, 3f, 3);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
            figura = new CuerpoGeometrico(2f, 3f, 4);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
            figura = new CuerpoGeometrico(2f, 12);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
            figura = new CuerpoGeometrico(Math.abs((float)(2f * Math.cos(90))), 
                    Math.abs((float)(2f * Math.sin(90))), 4);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
            figura = new CuerpoGeometrico(2f, 4);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
            figura = new CuerpoGeometrico(0, 12);
            figura.estableceCalculadoraArea();
            figura.imprimeArea();
            
		} catch (PoligonoNoExisteException | PoligonoNoSoportadoException
				| ConstructorIncorrectoException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
