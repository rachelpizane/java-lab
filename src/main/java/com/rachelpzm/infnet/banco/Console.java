package com.rachelpzm.infnet.banco;


public class Console{
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, "Machado de Assis", 3456.78);
        System.out.println(cc);
        ContaEspecial ce = new ContaEspecial(456, "Rachel de Queiroz", 5678.90, 3000);
        System.out.println(ce);
        //---------------------------------------------------------------------------
        //cc.sacar(500);
        //System.out.println(cc);
        //ce.sacar(6000);
        //System.out.println(ce);
        //ce.sacar(2000);
        //System.out.println(ce);
        //---------------------------------------------------------------------------
        Agencia agencia = new Agencia();
        agencia.inserirConta(cc);
        agencia.inserirConta(ce);

        System.out.println("Total em Contas: " + agencia.calcularTotal());
        System.out.println("Contas Especiais: " + agencia.contarEspeciais());
    }
}
