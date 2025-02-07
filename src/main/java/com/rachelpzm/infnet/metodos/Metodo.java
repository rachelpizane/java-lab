package com.rachelpzm.infnet.metodos;

import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine(); // Exemplo de metodo dinamico
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        //----------------------------------------------
        String sAno = "2024";
        int ano = Integer.parseInt(sAno); // Exemplo de metodo estatico.
        int numero =  numeroAleatorioNatural(60);

        System.out.println(numero);
    }

    private static int numeroAleatorioNatural(int maximo) {
        if(maximo > 0) {
            return (int) (Math.random() * maximo) + 1;
        }

        return 0;
    }


}
