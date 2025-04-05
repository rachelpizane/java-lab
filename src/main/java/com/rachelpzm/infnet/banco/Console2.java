package com.rachelpzm.infnet.banco;

public class Console2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, "Machado de Assis", 3456.78);
        System.out.println(cc);
        ContaEspecial ce = new ContaEspecial(456, "Rachel de Queiroz", 5678.90, 3000);
        System.out.println(ce);

        try {
            cc.depositar(-600);
            System.out.println("Deposito efetuado ---->" + cc);

        } catch (ValorNegativoException vne) {
            System.out.println(vne.getMessage() + ": " + vne.getValor());
        }
    }
}
