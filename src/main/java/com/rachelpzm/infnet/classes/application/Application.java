package com.rachelpzm.infnet.classes.application;

import com.rachelpzm.infnet.classes.domain.ContaCorrente;
import com.rachelpzm.infnet.classes.domain.Validacoes;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234, "Carla Madeira", 1234.56);
        String opcao = "";

        while (!opcao.equals("9")) {
            System.out.println("\n-----------------------------");
            System.out.println("BANCO MONEY -- CONTA-CORRENTE");
            System.out.println("-----------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("9 - Sair");

            System.out.print("Selecione a opção: ");
            opcao = input.nextLine();

            double valor;
            switch (opcao) {
                case "1":
                    valor = solicitarValor("depósito");
                    cc.depositar(valor);
                    break;

                case "2":
                    valor = solicitarValor("saque");
                    cc.sacar(valor);
                    break;

                case "9":
                    break;
                default:
                    System.out.println("[ERRO] Entrada inválida.");
                    continue;
            }

            System.out.printf(cc.obterSaldo());
        }
    }

    private static double solicitarValor(String complemento){
        System.out.printf("Digite o valor do %s: ", complemento);

        String sValor = input.nextLine();

        return Double.parseDouble(sValor);

    }


}
