package com.rachelpzm.infnet.arquivo;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/uf2.csv");
        if(file.isFile() && file.canRead()){
            System.out.println("Length: " + file.length());
        }
    }
}
