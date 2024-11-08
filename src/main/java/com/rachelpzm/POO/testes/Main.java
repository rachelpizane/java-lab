package com.rachelpzm.POO.testes;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.getValues(3, 2);

        calculadora.sum();
        calculadora.sub();

        Paciente carlos = new Paciente("Carlos", 47, "Diabetes");
        carlos.relatorio();
    }
}
