package com.rachelpzm.infnet.polimorfismo;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String fone;

    public Pessoa(String nome, String email, String fone) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome + " " +
                "email=" + email + " " +
                "fone=" + fone + " ";
    }

    public double retornarNumeroAleatorio(){
        return Math.floor(Math.random() * 60) + 1;
    }
}
