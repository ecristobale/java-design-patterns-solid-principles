package com.ecristobale.designpatterns.strategy.derivadas;

import com.ecristobale.designpatterns.strategy.base.AbstractArea;

public class AreaPoligonoRegular extends AbstractArea {

	private float radio;
	private int numeroLados;

	public AreaPoligonoRegular(int numeroLados, float radio) {
		super("polígono regular");
		this.numeroLados = numeroLados;
		this.radio = radio;
	}
	
	@Override
	public float calcularArea() {
		return (float) (numeroLados * Math.pow(radio, 2) *
							Math.sin(2 * Math.PI) / 2);
	}

}
