package com.rachelpzm.POO.aula05;

public class TipoConta {
    private int id;
    private String nome;
    private double saldoInicial;
    private double mensalidade;

    public TipoConta(int id, String nome, double saldoInicial, double mensalidade) {
        this.id = id;
        this.nome = nome;
        this.saldoInicial = saldoInicial;
        this.mensalidade = mensalidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
