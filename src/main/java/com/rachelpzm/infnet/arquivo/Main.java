package com.rachelpzm.infnet.arquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/main/resources/uf1.csv");
            System.out.println("Sucesso!");
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado");

        } catch (IOException e){
            System.out.println("Erro: Não consegui fechar o arquivo");
        }
    }
}
