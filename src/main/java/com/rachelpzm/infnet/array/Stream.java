package com.rachelpzm.infnet.array;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        String[] nomes = {"Rachel", "Maria", "Vitoria", "Ricardo"};

        Arrays.stream(nomes).forEach(nome -> {
            System.out.println(nome);
        });

        System.out.println("---");
        String[] nomesComR = Arrays.stream(nomes)
                .filter(item -> item.startsWith("R"))
                .toArray(String[]::new); // String[]::new --> Referencia do construtor de array de strings.

        Arrays.stream(nomesComR).forEach(nome -> System.out.println(nome));

        System.out.println("---");
        String[] nomesInvertidos = Arrays.stream(nomes).map(nome -> {
            String nomeInvertido = "";
            for(int i = nome.length() - 1; i >= 0; i--){
                nomeInvertido += nome.charAt(i);
            }
            return nomeInvertido;
        }).toArray(String[]::new);

        Arrays.stream(nomesInvertidos).forEach(nome -> System.out.println(nome));
    }
}
