package com.rachelpzm.infnet.excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args){
        System.out.println("main START");

        try {
            System.out.println("try START");
            metodoA();
            System.out.println("try END");

        } catch (FileNotFoundException e) {
            System.out.println("catch START");
            System.out.println("Tratando a exceção");
            System.out.println("catch END");

        }

        System.out.println("main END");
    }

    private static void metodoA() throws FileNotFoundException {
        System.out.println("metodoA START");

        metodoB();

        System.out.println("metodoA END");
    }

    private static void metodoB() throws FileNotFoundException {
        System.out.println("metodoB START");

        FileReader fileReader = new FileReader("nao-existe.txt");

        System.out.println("metodoB END");
    }
}
