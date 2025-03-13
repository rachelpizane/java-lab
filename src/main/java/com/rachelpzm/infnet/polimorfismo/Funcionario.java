package com.rachelpzm.infnet.polimorfismo;

public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected String cargo;

    public Funcionario(int matricula, String nome, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }

    public abstract String calcularSalario();
}
