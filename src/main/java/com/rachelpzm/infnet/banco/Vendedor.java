package com.rachelpzm.infnet.banco;

public class Vendedor extends Funcionario{
    private double comissao;
    private double totalVendas;

    public Vendedor(int matricula, String nome, String cargo, double salario, double comissao, double totalVendas) {
        super(matricula, nome, cargo, salario);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public String calcularSalario() {
        salario += totalVendas * comissao;
        return super.calcularSalario();
    }
}
