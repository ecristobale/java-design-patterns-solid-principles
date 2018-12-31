package com.ecristobale.designpatterns.strategy.implementacion;

import com.ecristobale.designpatterns.strategy.base.AbstractArea;
import com.ecristobale.designpatterns.strategy.derivadas.AreaCircular;
import com.ecristobale.designpatterns.strategy.derivadas.AreaPoligonoRegular;
import com.ecristobale.designpatterns.strategy.derivadas.AreaRectangular;
import com.ecristobale.designpatterns.strategy.derivadas.AreaTriangular;
import com.ecristobale.designpatterns.strategy.excepciones.ConstructorIncorrectoException;
import com.ecristobale.designpatterns.strategy.excepciones.PoligonoNoExisteException;
import com.ecristobale.designpatterns.strategy.excepciones.PoligonoNoSoportadoException;

public class CuerpoGeometrico {

	private AbstractArea _estrategia;
	private final float radio;
	private final int lados;
	private final float base;
	private final float altura;
	
	public CuerpoGeometrico(float radio, int lados) throws
			ConstructorIncorrectoException{
		if(lados < 5) {
			throw new ConstructorIncorrectoException();
		}
		this.radio = radio;
		this.lados = lados;
		this.base = 0;
		this.altura = 0;
	}

	public CuerpoGeometrico(float radio) {
		this.radio = radio;
		this.lados = (int) Float.POSITIVE_INFINITY;
		this.base = 0;
		this.altura = 0;
	}

	public CuerpoGeometrico(float base, float altura, int lados) {
		this.radio = 0;
		this.lados = lados;
		this.base = base;
		this.altura = altura;
	}
	
	public void estableceCalculadoraArea() throws PoligonoNoExisteException,
			PoligonoNoSoportadoException {
		if(isCircunferencia()) {
			_estrategia = new AreaCircular(radio);
		} else if(isTriangulo()) {
			_estrategia = new AreaTriangular(base, altura);
		} else if(isRectangulo()) {
			_estrategia = new AreaRectangular(base, altura);
		} else if(isPoligonoRegular()) {
			_estrategia = new AreaPoligonoRegular(lados, radio);
		} else if(lados == 2 || lados == 0) {
			throw new PoligonoNoExisteException();
		} else {
			throw new PoligonoNoSoportadoException();
		}
	}
	
	public void imprimeArea() {
		System.out.println("El área del " + _estrategia.getNombreFigura()
				+ " es: " + _estrategia.calcularArea());
	}
	
	private boolean isCircunferencia() {
		return lados == (int) Float.POSITIVE_INFINITY && radio != 0;
	}
	
	private boolean isPoligonoRegular() {
		return radio != 0 && lados != 0 && lados != 2;
	}
	
	private boolean isTriangulo() {
		return base != 0 && altura != 0 && lados == 3;
	}
	
	private boolean isRectangulo() {
		return base != 0 && altura != 0 && lados == 4;
	}
}
