package com.rachelpzm.infnet.classes.domain;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
