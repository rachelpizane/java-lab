package com.rachelpzm.POO.aula03;

public class Main {
    public static void main(String[] args) {
        Perfil perfilAna= new Perfil("Ana", 23);
        Perfil perfilGabs = new Perfil("Gabriela", 17);

        System.out.println(perfilAna.getName());
        perfilAna.addFriend("Beatriz");
        perfilAna.removeFriend("Carla");
        perfilAna.removeFriend("Beatriz");

        perfilAna.addFriend("Luiz");
        perfilAna.addFriend("Bernardo");
        perfilAna.addFriend("Fernanda");

        perfilAna.isPopular();

        perfilAna.status();

        perfilAna.removeFriend("Fernanda");

        perfilAna.status();

        System.out.println();

        perfilGabs.status();
        perfilGabs.addFriend("Vitoria");
        perfilGabs.isPopular();
    }



}
