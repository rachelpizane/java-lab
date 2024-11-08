package com.rachelpzm.javaBasico.aula06;

public class Extra {
    public static void main(String[] args) {

        char c = 71; // Tabela ASCII
        System.out.println(c);

        char unicode = '\u0061'; // Unicode
        System.out.println(unicode);

        char interrogacao = '\u003F'; // Unicode
        System.out.println(interrogacao);

        int hexVal = 0x1a;
        System.out.println(hexVal);

        // Conversão - Casting

        // Numeros para String
        int numI = 24;
        double numD = 2.34;

        String sNumI = String.valueOf(numI);
        String sNumD = String.valueOf(numD);

        System.out.println(sNumI + sNumD);

        // String para Numeros
        String stringI = "12";
        String stringD = "12.5232";

        int numStringI = Integer.parseInt(stringI);
        double numStringD = Double.valueOf(stringD);

        System.out.println(numStringI + numStringD);

        byte numBI = 2;
        int numIB = numBI;

        int num2IB = 300;
        byte num2BI = (byte) num2IB;

        System.out.println(num2BI); // 44

        double numX = 4.5657787998;
        int numY = (int) numX; // Forçando

        System.out.println(numY);


    }
}
