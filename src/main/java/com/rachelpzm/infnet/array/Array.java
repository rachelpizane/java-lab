package com.rachelpzm.infnet.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] nomes;
        int numeros[] = new int[4];

        nomes = new String[2];

        float[] notas = {10, 8.5f, 4, 7};

        nomes[1] = "Rachel";

        System.out.println("Nota: " + notas[1]);

        System.out.println("Nomes: " + Arrays.toString(nomes));
        System.out.println("Numeros Inteiros: " + Arrays.toString(numeros));

        // ---------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra = input.nextLine();

        if(!palavra.isEmpty()){
            String palavraReversa = "";

            for(int i = palavra.length() - 1; i >= 0; i--){
                palavraReversa += palavra.charAt(i);
            }

            System.out.println(palavraReversa);

            for(int i = 0; i < palavra.length(); i++){
                System.out.println(palavra.charAt(i)); // Caractere no index.
            }
        }

        // ---------------------------------------------------------------------------------
    }
}
