package com.ecristobale.designpatterns.decorator;

import com.ecristobale.designpatterns.decorator.model.IVendible;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(IVendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + Aire Acondicionado";
	}

	@Override
	public int getPrecio() {
		return getVendible().getPrecio() + 1500;
	}

}
