package com.rachelpzm.infnet.polimorfismo;

public class Horista extends Funcionario {

    private double valorHora;
    private double totalHoras;

    public Horista(int matricula, String nome, String cargo, double valorHora, double totalHoras) {
        super(matricula, nome, cargo);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public String calcularSalario() {
        double salario = valorHora * totalHoras;
        return "Matrícula: " + matricula + " Nome: " + nome + " Cargo: " + cargo + " Salário Bruto: " + salario;
    }
}
