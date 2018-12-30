package com.ecristobale.designpatterns.decorator.main;

import com.ecristobale.designpatterns.decorator.AireAcondicionado;
import com.ecristobale.designpatterns.decorator.Mp3Player;
import com.ecristobale.designpatterns.decorator.model.BmwM2;
import com.ecristobale.designpatterns.decorator.model.IVendible;
import com.ecristobale.designpatterns.decorator.model.SubaruBRZ;

public class TestDecorator {

	public static void main(String[] args) {
		
		IVendible auto = new BmwM2();
		auto = new AireAcondicionado(auto);
		auto = new Mp3Player(auto);
		System.out.println(auto.getDescription());
		System.out.println("Su precio es " + auto.getPrecio());
		
		IVendible auto2 = new SubaruBRZ();
		auto2 = new Mp3Player(auto2);
		System.out.println(auto2.getDescription());
		System.out.println("Su precio es " + auto2.getPrecio());
	}

}
