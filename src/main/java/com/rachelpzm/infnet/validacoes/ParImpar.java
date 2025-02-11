package com.rachelpzm.infnet.validacoes;

import java.util.Scanner;

public class ParImpar {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String error = "";
        String resultado = "";

        System.out.print("Digite um número inteiro: ");
        String sNumero = scanner.nextLine();

        if(sNumero.isEmpty() || !sNumero.matches("[0-9]*")){
            error += "[ERRO] O número digitado não é um inteiro.";

        } else {
            int numero = Integer.parseInt(sNumero);

            resultado += String.format("O numero %s é ", sNumero);
            resultado += numero % 2 == 0 ? "par." : "ímpar.";

        }


        if(error.isEmpty()){
            System.out.println(resultado);

        } else {
            System.out.println(error);

        }
    }
}
