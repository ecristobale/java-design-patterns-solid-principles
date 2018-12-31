package com.ecristobale.designpatterns.decorator;

import com.ecristobale.designpatterns.decorator.model.IVendible;

// This is not going to extend Auto, but IVendible, and is not going to
// implement interface methods, this is abstract, it has parent getter & setter
public abstract class AutoDecorator implements IVendible {

	private IVendible vendible;
	
	public AutoDecorator(IVendible vendible) {
		this.vendible = vendible;
	}

	public IVendible getVendible() {
		return vendible;
	}

	public void setVendible(IVendible vendible) {
		this.vendible = vendible;
	}
}
