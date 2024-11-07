package POO.testes;

public class Calculadora {
    private double num1;
    private double num2;

    public void getValues(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum(){
        double sum = this.num1 + this.num2;
        System.out.printf("Soma: %.2f%n", sum);
    }

    public void sub(){
        double sub = this.num1 - this.num2;
        System.out.printf("Subtração: %.2f%n", sub);
    }
}
