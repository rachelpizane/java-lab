package com.rachelpzm.javaBasico.pacote02;

public class Animal {
    public static void main(String[] args) {
        Pessoa amanda = new Pessoa("Thiago");

        amanda.nome = "Amanda"; // Consigo acessar o atributo protegido.
        amanda.saudacao();
        amanda.despedida();
        Pessoa.despedida();

        Pessoa anonimo = new Pessoa();
        anonimo.saudacao();
    }
}
