package com.rachelpzm.infnet.validacoes;

import java.util.Scanner;

public class Validacoes {
    final static String RGX_LETRAS_ESPACOS = "[A-Za-z\\s]*";
    final static String RGX_NUMEROS_INTEIROS = "[0-9]*";

    public static void main(String[] args) {
        String erros = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        if(nome.isEmpty() || !nome.matches(RGX_LETRAS_ESPACOS)){
            erros += "Nome inválido\n";
        }

        System.out.print("Digite a sua idade: ");
        String sIdade = scanner.nextLine();
        int idade = 0;

        if(sIdade.isEmpty() || !sIdade.matches(RGX_NUMEROS_INTEIROS)){
            erros += "Idade inválida";

        } else {
            idade = Integer.parseInt(sIdade);
        }

        if(erros.isEmpty()){
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Idade: %d\n", idade);
            System.out.println("Informações válidas. Pode seguir.");

        } else {
            System.out.println(erros);
        }

    }
}
