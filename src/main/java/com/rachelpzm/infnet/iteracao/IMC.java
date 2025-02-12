package com.rachelpzm.infnet.iteracao;

import java.util.Scanner;

public class IMC {
    final static String REGEX_NUMEROS_INTEIROS = "[0-9]*";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (KG): ");
        String sPeso = scanner.nextLine();

        if(!sPeso.isEmpty() && sPeso.matches(REGEX_NUMEROS_INTEIROS)){
            System.out.print("Digite a sua altura (cm): ");
            String sAltura = scanner.nextLine();

            if(!sAltura.isEmpty() && sAltura.matches(REGEX_NUMEROS_INTEIROS)){
                int peso = Integer.parseInt(sPeso);
                double altura = Integer.parseInt(sAltura) / 100.00;
                double imc = peso / Math.pow(altura, 2);

                String resultado = String.format("Seu IMC é %.2f e você está na categoria ", imc);

                if(imc < 18.5){
                    resultado += "Magreza";

                } else if (imc <= 24.5){
                    resultado += "Normal";

                } else if (imc <= 29){
                    resultado += "Sobrepeso";

                } else if (imc <= 39.9){
                    resultado += "Obesidade";

                } else if (imc >= 40.0){
                    resultado += "Obesidade Grave";
                }

                System.out.println("\n" + resultado + ".");

            } else {
                System.out.println("[ERRO] Altura inválida");
            }

        } else {
            System.out.println("[ERRO] Peso inválido");
        }
    }
}
