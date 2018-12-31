package com.ecristobale.designpatterns.command.model;

public class Producto {

	public Producto(int id, String name, double precio) {
		this.id = id;
		this.name = name;
		this.precio = precio;
	}
	
	private int id;
	private String name;
	private double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
