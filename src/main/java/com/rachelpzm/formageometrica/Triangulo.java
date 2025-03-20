package com.rachelpzm.formageometrica;

public class Triangulo extends FormaGeometrica{
    private double[] lados = new double[3];

    public Triangulo(double[] lados) {
        super("Triangulo");
        this.lados = lados;
    }

    @Override
    public double getArea() {
        double semiperimetro = (lados[0] + lados[1] + lados[2]) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lados[0]) * (semiperimetro - lados[1]) * (semiperimetro - lados[2]));
    }

    @Override
    public double getPerimetro() {
        return lados[0] + lados[1] + lados[2];
    }
}
