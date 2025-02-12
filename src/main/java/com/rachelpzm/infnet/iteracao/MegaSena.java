package com.rachelpzm.infnet.iteracao;

import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da aposta (6 a 15): ");
        String sQtdNumero = scanner.nextLine();

        if(!sQtdNumero.isEmpty() && sQtdNumero.matches("[0-9]*")){
            int qntNumeros = Integer.parseInt(sQtdNumero);
            String resultado = "";

            while (qntNumeros > 0){
                int numero = 0;
                boolean temRepetido = true;

                while(temRepetido){
                    numero = (int) (Math.random() * 60) + 1;

                    if (!resultado.contains(String.valueOf(numero))){
                        temRepetido = false;
                    }
                }

                resultado += numero + " ";

                qntNumeros--;
            }

            System.out.println("Seu Jogo: " + resultado);

        } else {
            System.out.println("[Erro] Entrada inválida.");

        }

    }
}
