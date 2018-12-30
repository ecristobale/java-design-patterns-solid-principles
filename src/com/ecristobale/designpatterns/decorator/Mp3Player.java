package com.ecristobale.designpatterns.decorator;

import com.ecristobale.designpatterns.decorator.model.IVendible;

public class Mp3Player extends AutoDecorator {

	public Mp3Player(IVendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + MP3 Player";
	}

	@Override
	public int getPrecio() {
		return getVendible().getPrecio() + 250;
	}

}
