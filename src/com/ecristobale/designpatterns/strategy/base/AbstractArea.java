package com.ecristobale.designpatterns.strategy.base;

// base class that has to extend all the shapes
public abstract class AbstractArea implements IArea {

	private String nombreFigura;
	
	public AbstractArea(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	@Override
	public abstract float calcularArea();

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
}
