package com.rachelpzm.infnet.banco;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<ContaCorrente> contas = new ArrayList<>();

    public void inserirConta(ContaCorrente cc) {
        contas.add(cc);
    }// Aceita tanto a conta corrente, quanto conta especial

    public double calcularTotal() {
        double retorno = 0;
        for(ContaCorrente conta : contas) {
            retorno += conta.getTotal();
        }
        return retorno;
    }

    public int contarEspeciais() {
        int retorno = 0;
        for(ContaCorrente conta : contas) {
            if(conta instanceof ContaEspecial) {
                retorno++;
            } // Se conta for do tipo contaEspecial, soma o contador de contas especiais
        }
        return retorno;
    }
}
