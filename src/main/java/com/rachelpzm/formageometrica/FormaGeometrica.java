package com.rachelpzm.formageometrica;

public abstract class FormaGeometrica {

    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return nome;
    }
}
