package javaBasico.primeiroprograma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Extra0502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[3];

        for(int c = 0; c < valores.length; c++){
            valores[c] = scan.nextInt();
        }

        System.out.println(Arrays.toString(valores)); // [8, 9 ,1]

        ArrayList<Double> numeros = new ArrayList<>();

        for(int c = 0; c < valores.length; c++){
            numeros.add(scan.nextDouble());
        }

        System.out.println(numeros);

        String letra = scan.next();

        System.out.println(letra);

        scan.close();


    }
}
