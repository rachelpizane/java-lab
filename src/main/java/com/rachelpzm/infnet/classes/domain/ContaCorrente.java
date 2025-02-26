package com.rachelpzm.infnet.classes.domain;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;
    private static String agencia = "novo-banco";

    public ContaCorrente(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if( valor <= saldo){
            saldo -= valor;
        }
    }

    public String obterSaldo() {
        return numero + " - " + titular + " - " + saldo + " - " + agencia;
    }

    public static void setAgencia(String agencia){
        agencia = agencia;
    }
}
