package com.ecristobale.designpatterns.strategy.derivadas;

import com.ecristobale.designpatterns.strategy.base.AbstractArea;

public class AreaRectangular extends AbstractArea {

	private float base;
    private float altura;

    public AreaRectangular(float base, float altura) {
        super("rectangulo");
        if (base == altura) {
            super.setNombreFigura("rectangulo");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base * altura);
    }

}
