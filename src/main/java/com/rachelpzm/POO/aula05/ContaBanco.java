package com.rachelpzm.POO.aula05;

import java.util.Arrays;
import java.util.List;

public class ContaBanco {
    TipoConta contaPoupanca; // Em construção (??)

    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    private boolean checarTipo(String tipo){
        if(tipo.equals("cp") && tipo.equals("cc")){
            throw new IllegalArgumentException("O tipo deve ser cp ou cc");
        }

        return true;
    }

    public ContaBanco(String numConta, String tipo, String dono) {
        this.status = false;
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;
        setTipo(tipo.toLowerCase());
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(checarTipo(tipo)){
            this.tipo = tipo;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        double saldoInicial = tipo.equals("cp") ? 150 : 50;

        if(status){
            System.out.println("Conta já está aberta.\n");
            return;
        }

        status = true;
        saldo += saldoInicial;

        System.out.println("Conta aberta!\n");
        saldoAtual();
    }

    public void fecharConta(){
        if (!validarStatus()) return;

        if(saldo > 0){
            System.out.printf(
                    "A conta ainda tem um saldo de R$ %.2f.%nSaque o dinheiro todo antes de fechar conta.%n%n",
                    this.saldo
            );
            return;
        }

        status = false;

        System.out.println("Conta fechada.\n");
    }

    public void depositar(double deposito){
        if (!validarStatus()) return;

        if(!isPositive(deposito)){
            System.out.println("Número precisa ser positivo.\n");
            return;
        }

        saldo += deposito;

        System.out.println("Deposito realizado.");
        saldoAtual();
    }

    public void sacar(double saque){
        if (!validarStatus()) return;

        if(!isPositive(saque)){
            System.out.println("Número precisa ser positivo.\n");
            return;
        }

        if(saque > saldo){
            System.out.println("Você não tem saldo o suficiente");
            return;
        }

        saldo -= saque;

        System.out.println("Saque realizado.");
        saldoAtual();
    }

    public void pagarMensal(){
        if (!validarStatus()) return;

        double mensalidade = tipo.equals("cp") ? 20 : 12;

        if(mensalidade > this.saldo){
            System.out.println("Você não tem saldo o suficiente.\n");
            return;
        }

        saldo -= mensalidade;

        System.out.println("Pagamento realizado.");
        saldoAtual();
    }

    public void saldoAtual(){
        System.out.printf("Saldo atual: R$ %.2f%n%n", this.saldo);
    }

    private boolean validarStatus(){
        if(!status){
            System.out.println("Ação bloqueada.A conta está fechada.\n");
            return false;
        }

        return true;
    }

    private boolean isPositive(double num){
        return num >= 0;
    }
}
