package com.rachelpzm.infnet.classes.domain;

public class Validacoes {
    public static boolean inteiro(String campo) {
        return campo != null & !campo.isEmpty() && campo.matches("[0-9]*");
    }

    public static boolean real(String campo) {
        return campo != null & !campo.isEmpty() && campo.matches("[0-9\\.0-9]*");
    }
}
