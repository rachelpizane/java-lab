package com.rachelpzm.infnet.polimorfismo;

public class Console {
    public static void main(String[] args) {
        Pessoa[] pessoas = {
                new Pessoa("Rachel", "rachel@exemplo.com", "2223"),
                new Professor("Ricardo", "ricardo@exemplo.com", "22235", "especialista")
        }; // Possibilidade de poder armazenar

        Pessoa p1 = new Professor("Carlos", "carlos@exemplo.com", "345", "doutor");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getClass().getName());
            System.out.println(pessoa.toString());
            System.out.println(pessoa.retornarNumeroAleatorio());
            System.out.println("--");

        } // Ele chama o metodo real de cada classe.

        // Mesmo em uma lista de Objects, seus métodos originais ainda são preservados.
        // Contudo ele só consegue executar os métodos que são comuns aos objetos.

        // ------------------
        Funcionario[] folhaPagamento = {
                new Mensalista(123,"Rachel", "Gerente", 60),
                new Horista(124,"Fernanda", "Junior", 50, 160),
                new Vendedor(125,"Gabriela", "Vendedor", 1340, 0.05, 20000)
        };

        for (Funcionario func : folhaPagamento) {
            System.out.println(func.calcularSalario());
            System.out.println("--");

        }
    }
}
