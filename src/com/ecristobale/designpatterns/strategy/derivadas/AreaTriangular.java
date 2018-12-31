package com.ecristobale.designpatterns.strategy.derivadas;

import com.ecristobale.designpatterns.strategy.base.AbstractArea;

public class AreaTriangular extends AbstractArea {

	private float base;
	private float altura;
	
	public AreaTriangular(float base, float altura) {
		super("triangulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return (base * altura) / 2;
	}

}
