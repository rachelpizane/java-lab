package com.rachelpzm.infnet.ehBissexto;

public class TestesPrimitivos {
    public static void main(String[] args) {
        long longo = 6_000_000_000L; // 6 bilhões - Sem "L" o executador entende como um erro, pois um inteiro não chega a 6bilhões.
        float numFloat = 14.3f; // 14.3 é implicitamente double, para ser amazenada como float precisamos explicitar com o "f";

        long numero =  2147483647;
        numero += 10;
        System.out.println(numero);

        char letra1 = 'A'; // Tipo primitivo
        String letra2 = "B"; // Classe | Objeto

        System.out.println("Esse é um teste\n com \t\tescape");

        long num = 3 + 5L + 4 + 1;
        System.out.println(num);

        String n5 = num + "abc";
        System.out.println(n5);

        int a = 5, b = 2;

        int d = a / b;
        double e = (double) a /b;

        System.out.println(d);
        System.out.println(e);
    }
}
