package com.rachelpzm.POO.aula02.revisao;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Go to the school", 2,"03/11/2024");
        task1.changeStatus("Canceled");
        task1.changeStatus("Doing");

        task1.info();
    }
}
