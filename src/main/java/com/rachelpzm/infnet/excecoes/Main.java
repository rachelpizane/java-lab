package com.rachelpzm.infnet.excecoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser dividendo de 10: ");
        int numero = input.nextInt();

        try {
            double divisao = 10 / numero;
            System.out.println("Resultado: " + divisao);

        } catch (ArithmeticException ae) {
            System.out.println("Deu erro de divisao por zero");

        } finally {
            System.out.println("Finalizando o programa");

        }


    }
}
