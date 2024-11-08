package com.rachelpzm.javaBasico.aula07;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Operadores Aritméticos
        System.out.println("Operador Aritmético");

        int num1 = 2;
        int num2 = 5;
        double num3 = num2;


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        System.out.println(num2 / num1); // 5/2 = 2 | Int / Int == Int.
        System.out.println(num3 / num1); // 5/2 = 2.5 | Float / Int == Float

        System.out.println(num2 % num1);

        // Operador Unários
        System.out.println("Operador Unário");

        int a = 1;

        System.out.println(a++); // pós 1
        System.out.println(++a); // pré 3

        // Operador de Atribuição
        System.out.println("Operador de Atribuição");

        int b = 1;

        b += a; // 4
        System.out.println(b);

        b -= a; // 1
        System.out.println(b);

        b *= a; // 3
        System.out.println(b);

        // Class Math

        final double PI = Math.PI;
        System.out.println(PI);

        double valor1 = Math.pow(2,3);
        double raizQuadrada = Math.sqrt(16);

        System.out.printf("%.0f%n", raizQuadrada);

        double valor2 = 4.567;

        System.out.println(Math.floor(valor2));
        System.out.println(Math.ceil(valor2));
        System.out.println(Math.round(valor2));

        int random = (int) Math.floor(Math.random() * 10) + 1;
        System.out.println(random);

    }
}
