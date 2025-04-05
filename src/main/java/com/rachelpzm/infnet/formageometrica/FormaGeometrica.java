package com.rachelpzm.infnet.formageometrica;

public abstract class FormaGeometrica implements Comparable<FormaGeometrica>{

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

    @Override
    public int compareTo(FormaGeometrica outraFormaGeometrica) {
        return this.nome.compareTo(outraFormaGeometrica.nome); // qual é a classificação esperada desse objeto?
    }
}
