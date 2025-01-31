package com.rachelpzm.infnet.gui;

// 300125
public class TesteGui {
    public static void main(String[] args) {
        final String TITULO = "Javaland";

        System.out.println("Antes da mensagem....");

        javax.swing.JOptionPane.showMessageDialog( // Exemplo sem importar, colocando a biblioteca dentro do código.
                null,
                "Seja bem-vindo!!",
                TITULO,
                javax.swing.JOptionPane.QUESTION_MESSAGE
                // Dá pra ve que não é muito prático.
                // Meu deus, é uma constanteeeeee
        );

        System.out.println("Depois da mensagem....");
    }
}
