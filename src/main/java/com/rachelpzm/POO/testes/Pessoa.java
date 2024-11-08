package com.rachelpzm.POO.testes;

public abstract class Pessoa {
    private String name;
    private int age;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String setName(){
        return this.name;
    }

    public int setAge(){
        return this.age;
    }
}
