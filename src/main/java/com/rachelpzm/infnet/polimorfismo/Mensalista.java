package com.rachelpzm.infnet.polimorfismo;

public class Mensalista extends Funcionario{
    protected double salario;

    public Mensalista(int matricula, String nome, String cargo, double salario) {
        super(matricula, nome, cargo);
        this.salario = salario;
    }

    @Override
    public String calcularSalario() {
        return "Matricula: " + matricula + " Nome: " + nome + " Cargo: " + cargo + " Salario Bruto: " + salario;
    } // Obrigado a sobrescrever o metodo
}
