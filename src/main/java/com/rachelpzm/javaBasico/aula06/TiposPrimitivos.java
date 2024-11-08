package com.rachelpzm.javaBasico.aula06;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Comentario de uma linha
        /*
        * Comentario
        * Em multiplas
        * linhas
        */

        /**
         * Documentação com possibilidade de adicionar tags @author, @version
         */

        // Formas de declarar variaveis e tipos de dados

        int idade = 3;

        float sal = (float) idade; // typecast

        Integer numero = new Integer(4); // Não é uma variavel, é um objeto.

        System.out.println(idade + " " + sal + " " + numero);

        float sal1 = 123.56f;
        float sal2 = (float) 123.56;
        Float sal3 = new Float(123.56);

        System.out.println(sal1 + " " + sal2 + " " + sal3);

        char letra1 = 'G';
        char letra2 = (char) 'G';
        Character letra3 = new Character('G');

        String palavra1 = "Olá Mundo!"; // = String palavra1 = new String("Olá Mundo!");
        System.out.println(palavra1);

        long numBig = 1L;

        System.out.println(numBig);

        double numero1 = 3.576869769695;
        float numero2 = 3.576869769695f;

        System.out.println(numero1 + " " + numero2); // 3.576869769695 3.5768697

        // Saida de Dados em Java
        float real = 4.5676f;
        short numX = 12456;
        String sobrenome = "Silva";
        char letter = 'b';

        System.out.print("O valor é " + real);
        System.out.println(real);

        System.out.printf("Sua nota é %.2f %n", real);
        System.out.format("O valor é %d \n", numX);
        System.out.printf("O valor é %s %n", sobrenome);
        System.out.format("O valor é %s %n", letter);

        // Entrada de Dados

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        // String nomeEntrada = teclado.nextLine();

        System.out.print("Digite a idade: \n");
        // int idadeEntrada = teclado.nextInt();

        // System.out.printf("Meu nome é %s e eu tenho %d anos. %n", nomeEntrada, idadeEntrada);

        // Compatibilidade entre Tipos

        int valor = 34;
        float valor1 = valor; // 34.0

        System.out.println(valor1);

        String valorString = Integer.toString(valor);

        System.out.println(valorString);

        String valorString2 = "30";
        int valor2 = Integer.parseInt(valorString2);

        String valorString3 = "30.5";
        double valor3 = Double.parseDouble(valorString2);











    }
}
