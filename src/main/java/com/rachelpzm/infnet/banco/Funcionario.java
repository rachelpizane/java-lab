package com.rachelpzm.infnet.banco;

public class Funcionario {
    protected int matricula;
    protected String nome;
    protected String cargo;
    protected double salario;

    public Funcionario(int matricula, String nome, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String calcularSalario() {
        return matricula + " - " + nome + " - " + salario;
    }
}
