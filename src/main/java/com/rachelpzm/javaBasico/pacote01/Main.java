package com.rachelpzm.javaBasico.pacote01;

import com.rachelpzm.javaBasico.pacote02.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa amanda = new Pessoa("Amanda");
        amanda.saudacao();
        amanda.despedida();
        Pessoa.despedida();

        Aluna carla = new Aluna("Carla");
        carla.saudacao();
        carla.resposta();
    }
}
