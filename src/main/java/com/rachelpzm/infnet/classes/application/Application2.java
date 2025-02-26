package com.rachelpzm.infnet.classes.application;

import com.rachelpzm.infnet.classes.domain.ContaCorrente;
import com.rachelpzm.infnet.classes.domain.Pessoa;

public class Application2 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(3453,"Vitória", 200.50);
        ContaCorrente cc2 = new ContaCorrente(4370,"Carla", 500.80);

        ContaCorrente.setAgencia("antigo-banco");
        System.out.println(cc1.obterSaldo());
        System.out.println(cc2.obterSaldo());

        Pessoa pessoa = new Pessoa("Rachel");
    }
}
