package com.rachelpzm.POO.testes.livros;

public class Livro {
    private int id;
    private String name;
    private String autor;
    private int anoPublicacao;

    public Livro(int id, String name, String autor, int anoPublicacao) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
