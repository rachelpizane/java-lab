package com.rachelpzm.POO.aula05;

import java.util.Arrays;
import java.util.List;

public class ContaBanco {
    List<TipoConta> contasDisponiveis = Arrays.asList(
            new TipoConta(1,"conta-poupança",150,20),
            new TipoConta(2,"conta-corrente",50,12)
            );

    public String numConta;
    protected TipoConta tipoConta;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String numConta, int tipoContaID, String dono) {
        this.status = false;
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;

        definirTipoConta(tipoContaID);
    }

    public String getNumConta() {
        return numConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void abrirConta(){
        double saldoInicial = tipoConta.getSaldoInicial();

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

        double mensalidade = tipoConta.getMensalidade();

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

    public void status(){
        String statusString = status ? "Aberta" : "Fechada";

        String mensagem = String.format(
                "Nome: %s%n" + "Tipo de Conta: %s%n" + "Status: %s%n" + "Saldo: R$ %.2f.%n",
                dono, tipoConta.getNome(), statusString, saldo
        );

        System.out.println(mensagem);
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

    private void definirTipoConta(int tipoContaID){
        boolean ehTipoValido = false;

        for(int i = 0; i < contasDisponiveis.size(); i++){
            TipoConta tipoConta = contasDisponiveis.get(i);
            if(tipoConta.getId() == tipoContaID){
                this.tipoConta = tipoConta;
                ehTipoValido = true;

                break;
            }
        }

        if(!ehTipoValido){
            throw new IllegalArgumentException("tipoContaID inválido.");
        }

    }
}
