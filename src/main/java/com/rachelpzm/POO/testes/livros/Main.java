package com.rachelpzm.POO.testes.livros;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = Arrays.asList(
                new Livro(1, "Os sete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 2019),
                new Livro(2, "Em agosto nos vemos", "Gabriel García Márquez", 2024),
                new Livro(3, "Oração para Desaparecer", "Socorro Acioli", 2023),
                new Livro(4, "A Metade Perdida", "Brit Bennett", 2020),
                new Livro(5, "A Biblioteca da Meia-Noite", "Matt Haig", 2023),
                new Livro(6, "Torto Arado", "Socorro Acioli", 2019)
        );

        Stream<Livro> livroPorAno = livros.stream().filter(livro -> livro.getAnoPublicacao() == 2023);
    }
}
