package javaBasico.aula15;

public class Metodos {
    static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    static double sub(double a, double b){
        return a - b;
    }

    public static void main(String[] args) {
        sum(5,2);

        int sub = (int)sub(15,6);

        System.out.println(sub);

        Operacoes operacoes = new Operacoes();

        operacoes.entrei();
        operacoes.multi(6,7); // Pensei que nem ia funcionar...


    }

}
