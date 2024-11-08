package com.rachelpzm.javaBasico.aula08;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        // Ternário
        int num1 = 4;
        int num2 = 5;
        String resultado = num2 > num1 ? "É maior" : "É menor";

        System.out.println(resultado);

        // Relacionais
        System.out.println(num2 <= num1);
        System.out.println(num1 != num2);

        // Comparando Strings
        String nome1 = "Paula";
        String nome2 = "Paula";
        String nome3 = new String("Paula");

        boolean res1 = nome1 == nome2;

        boolean res2 = nome1 == nome3; // Compara o endereço
        boolean res3 = nome1.equals(nome3); // Compara o conteudo

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        // Operadores Lógicos
        int num3 = 6;
        boolean res4 = num2 > num1 || num3 > num1;
        boolean res5 = 7 == 3 ^ 8 > 2;
        boolean res6 = !true;

        System.out.println(res4 + " - " + res5 + " - " + res6);

        int idade = 78;
        String resposta = "Voto opcional";

        if (idade >= 18 && idade <= 70) {
            resposta = "Voto obrigatório";

        } else if (idade < 16) {
            resposta = "Não pode vota";

        }

        System.out.println(resposta);

    }

}
