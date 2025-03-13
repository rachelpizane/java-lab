package com.rachelpzm.infnet.banco;

public class ContaEspecial extends ContaCorrente {

    private double limite;

    public ContaEspecial(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    @Override
    public double getTotal() {
        return saldo + limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + " Titular:" + this.titular + " Saldo:" + this.saldo + " Limite: " + this.limite;
    }
}
