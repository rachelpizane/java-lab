package com.rachelpzm.formageometrica;

public class Retangulo extends FormaGeometrica{

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        super("Retângulo");
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return largura * comprimento;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + comprimento);
    }
}
