package com.rachelpzm.infnet.formageometrica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formasGeometricas = {
                new Circulo(5),
                new Retangulo(12, 15),
                new Circulo(10),
                new Retangulo(22, 33),
                new Triangulo(new double[]{12, 34, 45})
        };

        //Arrays.sort(formasGeometricas, new AreaFormaComparator());
        Arrays.sort(formasGeometricas, new PerimetroFormaComparator());

        for(FormaGeometrica forma : formasGeometricas) {
            System.out.println(forma.toString() + ": Àrea: " + forma.getArea() + " Perimetro: " + forma.getPerimetro());
        }
    }
}
