package com.rachelpzm.avulso.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Stream<Integer> streamNumeros = numeros.stream();

        // streamNumeros.forEach( numero -> System.out.println(numero));
        Stream<Integer> streamNumerosFiltrado = numeros.stream().filter(numero -> numero > 2); // intermediario - filtra
        List<Integer> numerosFiltrados = streamNumerosFiltrado.collect(Collectors.toList()); // Terminal - coleta
        numerosFiltrados.forEach(numero -> System.out.println(numero)); // 3, 4, 5
        
        System.out.println("-----------------");
        List<Integer> numerosFiltradosDobrados = numerosFiltrados.stream()
                .map(numero -> numero * 2) // intermediario - transforma
                .collect(Collectors.toList()); // Terminal - coleta

        numerosFiltradosDobrados.forEach(numero -> System.out.println(numero)); // 6, 8, 10
        
        System.out.println("-----------------");
        List<String> letras = List.of("b", "e", "a", "d", "c");
        List<String> letrasOrdemCrescente = letras.stream().sorted().collect(Collectors.toList());
        letrasOrdemCrescente.forEach(numero -> System.out.println(numero)); // a, b, c, d, e
        
        System.out.println("-----------------");
        List<String> letrasOrdemDecrescente = letras.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        letrasOrdemDecrescente.forEach(numero -> System.out.println(numero)); // e, d, c, b, a
        
        System.out.println("-----------------");
        List<Pessoa> pessoas = List.of(new Pessoa("Ana", 43), new Pessoa("Bruno", 20), new Pessoa("Carlos", 32));

        List<Pessoa> pessoasOrdemCrescente = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade)) // Ordena por idade
                .collect(Collectors.toList());

        pessoasOrdemCrescente.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getIdade())); // Bruno - 20, Carlos - 32, Ana - 43

        System.out.println("-----------------");
        boolean existeNumeroMaiorQue07 = numerosFiltradosDobrados.stream()
                .anyMatch(numero -> numero > 7); // Verifica se existe algum número maior que 7

        System.out.println("Existe algum numero maior que 7: " + existeNumeroMaiorQue07); // true

        boolean todosNumerosMenorQue07 = numerosFiltradosDobrados.stream() 
                .allMatch(numero -> numero < 7); // Verifica se todos os números são menores que 7

        System.out.println("Todos os numeros são menores que 7: " + todosNumerosMenorQue07); // false

        boolean todosNumerosSaoPositivos = numerosFiltradosDobrados.stream()
                .allMatch(numero -> numero > 0); // Verifica se todos os números são positivos

        System.out.println("Todos os numeros são positivos: " + todosNumerosSaoPositivos); // true
        
        boolean nehumaNomeComecaComR = pessoas.stream()
                .noneMatch(pessoa -> pessoa.getNome().startsWith("R")); // Verifica se nenhum nome começa com R

        System.out.println("Nenhum nome começa com R: " + nehumaNomeComecaComR); // true

        boolean existeNomeComecaComA = pessoas.stream()
                .noneMatch(pessoa -> pessoa.getNome().startsWith("A")); // Verifica se nenhum nome começa com A

        System.out.println("Algum nome começa com A: " + existeNomeComecaComA); // false

        System.out.println("-----------------");
        List<String> palavras = List.of("Hoje", "é", "um", "dia", "lindo");
        Optional<String> frase = palavras.stream().reduce((acc, palavra) -> acc + " " + palavra); // Reduz a lista de palavras em uma frase
        System.out.println(frase.get()); // Hoje é um dia lindo

        List<Integer> numerosSimples = List.of(2,5,3);
        int soma = numerosSimples.stream().reduce(0, (acc, numero) -> acc + numero); // Reduz a lista de números em uma soma
        System.out.println("Soma: " + soma); // Soma: 10
        
        int soma2 = numerosSimples.stream().mapToInt(numero -> numero).sum(); // Reduz a lista de números em uma soma
        System.out.println("Soma2: " + soma2); // Soma2: 10

        System.out.println("-----------------");
        long quantidadeNumeros = numerosSimples.stream().count(); // Conta a quantidade de números na lista
        System.out.println("Quantidade de numeros: " + quantidadeNumeros); // Quantidade de numeros: 3

        long quantidadePessoas = pessoas.stream().count(); // Conta a quantidade de pessoas na lista
        System.out.println("Quantidade de pessoas: " + quantidadePessoas); // Quantidade de pessoas: 3

        System.out.println("-----------------");
        List<Pessoa> outrasPessoas = List.of(new Pessoa("Olivia", 25), new Pessoa("Rafael", 30), new Pessoa("Ana", 22), new Pessoa("Bruno", 28), new Pessoa("Rafael", 30));

        List<Pessoa> pessoasUnicas = outrasPessoas.stream()
                .distinct() // Remove duplicatas
                .collect(Collectors.toList());

        pessoasUnicas.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getIdade()));

        List<Integer> outrosNumeros = List.of(1, 1, 2, 3, 3, 4, 5, 6, 6,7);
        
        long quantidadeNumerosLista = outrosNumeros.stream().count(); // Conta a quantidade de números na lista
    
        long quantidadeNumerosListaUnicos = outrosNumeros.stream()
                .distinct() // Remove duplicatas
                .count(); // Conta a quantidade de números únicos

        System.out.println("Quantidade de numeros: " + quantidadeNumerosLista); // Quantidade de numeros: 10
        System.out.println("Quantidade de numeros unicos: " + quantidadeNumerosListaUnicos); // Quantidade de numeros unicos: 7
    }   

}
