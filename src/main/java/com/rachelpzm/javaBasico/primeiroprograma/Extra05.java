package javaBasico.primeiroprograma;

import java.util.Scanner;

public class Extra05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        int idade = scan.nextInt();
        double salario = scan.nextDouble();

        scan.close();

        System.out.printf("Meu nome é %s, tenho %d e ganho R$ $.2f", nome, idade, salario);
    }



}
