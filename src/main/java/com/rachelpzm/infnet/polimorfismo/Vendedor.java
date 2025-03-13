package com.rachelpzm.infnet.polimorfismo;

public class Vendedor extends Mensalista {
    private double percentual;
    private double totalVendas;

    public Vendedor(int matricula, String nome, String cargo, double salario, double percentual, double totalVendas) {
        super(matricula, nome, cargo, salario);
        this.percentual = percentual;
        this.totalVendas = totalVendas;
    }

    @Override
    public String calcularSalario() {
        double comissao = percentual * totalVendas;
        double bruto = salario + comissao;
        return "Matrícula: " + matricula + " Nome: " + nome + " Cargo: " + cargo + " Salário Bruto e Comissões: " + bruto;
    }
}
