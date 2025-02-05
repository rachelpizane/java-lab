package com.rachelpzm.infnet.ehBissexto;

import javax.swing.*;
import java.time.Year;

public class AppTwo {
    public static void main(String[] args) {
        String anoString = JOptionPane.showInputDialog("Digite um ano para saber se é bissexto");

        int ano = Integer.parseInt(anoString);

        String mensagem = "O ano "  + ano;

        if(Year.isLeap(ano)){
            mensagem += " é bissexto.";

        } else {
            mensagem += " não é bissexto.";
        }

        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "O ano é bissexto?",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
