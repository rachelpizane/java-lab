package com.rachelpzm.infnet.arquivo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainRead {
    public static void main(String[] args) {
        File file = new File("src/main/resources/uf1.csv");
        try {
            if(file.exists()){
                FileReader reader = new FileReader(file);
                char[] chars = new char[(int) file.length()];
                reader.read(chars);

                String texto = new String(chars);
                texto = texto.replaceAll("\"","");

                String[] linhas = texto.split("\n");

                for(int i = 1; i < linhas.length - 1; i++){
                    String[] datas = linhas[i].split(";");
                    System.out.println(datas[1] + " - " + datas[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro");
        }
    }

}
