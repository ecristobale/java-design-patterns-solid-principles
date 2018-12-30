package com.ecristobale.designpatterns.decorator.model;

public abstract class Auto implements IVendible {

	private int puertas;
	String tipoMotor;
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
}
