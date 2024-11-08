package com.rachelpzm.javaBasico.pacote01;

import com.rachelpzm.javaBasico.pacote02.Pessoa;

public class Aluna extends Pessoa{
    public Aluna(String nome){
        super(nome);
    }

    public void resposta(){
        System.out.printf("%s: Volto Já!%n", this.nome);
    }

}
