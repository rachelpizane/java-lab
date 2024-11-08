package com.rachelpzm.POO.aula05;

public class Main {
    public static void main(String[] args) {
        ContaBanco maria = new ContaBanco("3456-09","cp","Maria");
        System.out.println(maria.getDono());

        maria.abrirConta();
        maria.depositar(200);
        maria.setSaldo(500);
        maria.pagarMensal();
        maria.sacar(330);
        maria.fecharConta();
        maria.depositar(150);
    }
}


