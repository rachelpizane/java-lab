package com.rachelpzm.infnet.formageometrica;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
