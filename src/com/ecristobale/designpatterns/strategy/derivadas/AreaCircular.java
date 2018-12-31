package com.ecristobale.designpatterns.strategy.derivadas;

import com.ecristobale.designpatterns.strategy.base.AbstractArea;

public class AreaCircular extends AbstractArea {

	private float radio;
	
	public AreaCircular(float radio) {
		super("circunferencia");
		this.radio = radio;
	}

	@Override
	public float calcularArea() {
		return (float) (Math.pow(radio, 2) * Math.PI);
	}

}
