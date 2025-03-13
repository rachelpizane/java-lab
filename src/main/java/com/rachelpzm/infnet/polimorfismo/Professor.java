package com.rachelpzm.infnet.polimorfismo;

public class Professor extends Pessoa{
    private String titulacao;

    public Professor(String nome, String email, String fone, String titulacao) {
        super(nome, email, fone);
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() + "titulação=" + titulacao;
    }
}
