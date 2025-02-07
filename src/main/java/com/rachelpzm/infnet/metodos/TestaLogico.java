package com.rachelpzm.infnet.metodos;

public class TestaLogico {

    public static void main(String[] args) {

        // cluster de alta disponibilidade A e B
        if(testarServidor("A", "armenio") ^ testarServidor("B", "armenio")){
            // deu certo a alta disponibilidade
        }
    }

    private static boolean testarServidor(String ip, String usuario) {
        //registra se houve o teste em log
        //gravar o usuario
        //testar o servidor
        return true;
    }
}
