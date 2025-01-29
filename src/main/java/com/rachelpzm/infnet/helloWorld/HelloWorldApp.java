package com.rachelpzm.infnet.helloWorld;

import java.util.Scanner;

// 280125
public class HelloWorldApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // System.in - entrada padrão. Pega do teclado.

        System.out.println("Hello World!!!");
        System.out.print("Digite o seu nome: ");

        String nome = input.nextLine();

        System.out.printf("Bem vindo %s! ", nome);
    }
}
