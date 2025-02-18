package com.rachelpzm.infnet.array;

import javax.swing.*;

public class AvaliadorServico {
    public static void main(String[] args) {
        String[] perguntas = {
                "O técnico foi pontual?",
                "O técnico foi amável?",
                "O técnico prestou todos os esclarecimentos?",
                "O técnico deixou o ambiente limpo?"
        };

        String[] respostas = {
                "Concordo",
                "Concordo Parcialmente",
                "Discordo"
        };

        int notaTotal = 0;
        for(int i = 0; i < perguntas.length; i++){
            String resposta = (String) JOptionPane.showInputDialog(null,
                    perguntas[i],
                    "Pesquisa de Satsifação",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    respostas,
                    respostas[0]);

            switch (resposta) {
                case "Concordo":
                    notaTotal += 10;
                case "Concordo Parcialmente":
                    notaTotal += 5;
                case "Discordo":
                    notaTotal += 0;
            }

        }

        double resultado = (notaTotal / (double) (10 * perguntas.length)) * 100;

        JOptionPane.showMessageDialog(
                null,
                resultado + "%",
                "Resultado final da avaliação",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
