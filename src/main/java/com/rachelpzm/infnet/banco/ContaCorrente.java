package com.rachelpzm.infnet.banco;

public class ContaCorrente {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getTotal() {
        return saldo;
    }

    public void depositar(double valor) throws ValorNegativoException {
        if(valor > 0 ) {
            this.saldo += valor;
        } else {
            throw new ValorNegativoException("Deposito Inválido", valor);
        }
    }

    public void sacar(double valor) {
        if(valor > 0  && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + " Titular:" + this.titular + " Saldo:" + this.saldo;
    }
}
