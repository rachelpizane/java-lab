package com.rachelpzm.infnet.arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = "";

        try {
            FileWriter writer = new FileWriter("src/main/resources/teste4.txt");

            while(!frase.equals("99")) {
                System.out.print("Digite uma frase (99 sai): ");
                frase = input.nextLine();

                if(!frase.equals("99")) {
                    writer.write(frase + "\n");
                }
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
