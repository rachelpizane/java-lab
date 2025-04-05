package com.rachelpzm.infnet.banco;

public class ValorNegativoException extends Exception {
    private double valor;

    public ValorNegativoException(String mensagem, double valor) {
        super(mensagem);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
