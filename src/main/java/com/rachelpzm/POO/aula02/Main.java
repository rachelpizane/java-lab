package com.rachelpzm.POO.aula02;

public class Main {
    public static void main(String[] args) {
        Caneta canetaBic = new Caneta("C2", "Azul", 2.0,100);
        Caneta canetaChique = new Caneta("X1", "Preta", 1.2, 150);

        canetaBic.destampar();
        canetaBic.rabiscar();

        canetaBic.info();

        canetaBic.tampar();
        canetaBic.rabiscar();

        canetaBic.destampar();
        canetaBic.rabiscar();
        canetaBic.rabiscar();

        canetaBic.cargaAtual();

        canetaBic.rabiscar();
        canetaBic.rabiscar();
        canetaBic.rabiscar();

        canetaBic.info();
        System.out.println();

        canetaChique.info();
        canetaChique.destampar();
        canetaChique.rabiscar();
        canetaChique.cargaAtual();

        canetaBic.cor = "Amarelo";
        canetaBic.info();
    }
}
