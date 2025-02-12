package com.rachelpzm.infnet.iteracao;

public class Iteracao {
    public static void main(String[] args) {
        int c = 1;

        while(c <= 3){
            System.out.println("While: " + c);
            c++;
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("[%d][%d]\n", i, j);
            }
        }
    }
}
