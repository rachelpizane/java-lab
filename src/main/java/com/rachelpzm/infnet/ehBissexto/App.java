package com.rachelpzm.infnet.ehBissexto;

import javax.swing.*;
import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano para saber ser é bissexto: ");
        int ano = entrada.nextInt(); // .nextInt recebe o input e converta para int. Depois disso ele que armazenado no ano

        String mensagem = "O ano "  + ano;

        if(Year.isLeap(ano)){
            mensagem += " é bissexto.";
        } else {
            mensagem += " não é bissexto.";
        }

        System.out.println(mensagem);
    }
}
