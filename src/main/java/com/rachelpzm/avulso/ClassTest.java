package com.rachelpzm.avulso;

public class ClassTest {
    public int subtracao(int a, int b){
        return a - b;
    }

    public int[] vetores(int a, int b){
        int[] vetor = new int[2];
        vetor[0] = a;
        vetor[1] = b;

        return vetor;
    }

    private String palavra = "palavra";

    public String getName(){
        return this.palavra;
    }

    public ClassTest compareObjects(){
        return new ClassTest();
    }

    public boolean ehPositivo(double num){
        return num >= 0;
    }

    String name;

    private boolean checkName(String name){
        if(name.isBlank()){
            throw new IllegalArgumentException("Não pode nome vazio");
        }

        if(name == null){
            throw new NullPointerException("Não pode nome nulo");
        }

        return true;
    }

    public void setName(String name){
        if(checkName(name)){
            this.name = name;
        }
    }

}
