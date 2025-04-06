package com.rachelpzm.infnet.arquivo;

import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        try {
            File file = new File("src/main/resources/teste3.txt");

            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            writer.write(frase);
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado");

        } catch(IOException e) {
            System.out.println("Erro no arquivo");
        }

    }
}
