package com.rachelpzm.javaBasico.pacote02;

public class Pessoa {
    protected String nome;

    public Pessoa(){
        this.nome = "Não tem";
    };

    public Pessoa(String nome){
        this.nome = nome;
    } //Isso é um metodo construtor


    public void saudacao(){
        System.out.printf("Bem-vindo(a)! %s%n", this.nome);
    } // Isso é um metodo do objeto.

     public static void despedida(){
        System.out.println("Até mais tarde!");
    } // Isso é um metodo da classe
}
