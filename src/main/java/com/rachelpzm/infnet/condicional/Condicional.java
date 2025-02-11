package com.rachelpzm.infnet.condicional;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int numero = 10;

        String parImpar = numero % 2 == 0 ? "É Par" : "É ímpar";

        System.out.println(parImpar);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha uma opção: ");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case "a":
                System.out.println("Bom dia!!");
                break;
            case "b":
                System.out.println("Boa tarde!!");
                break;
            default:
                System.out.println("Nada declarado...");
        }
    }
}
