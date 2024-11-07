package POO.aula02;

public class Caneta {
    private String modelo;
    protected String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, double ponta, int carga){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = true;
    }

    private String validarRabisco(){
        if(carga <= 0){
            return "Caneta sem carga....";
        }

        if(tampada){
            return "Caneta tampada. Retire-a antes de rabiscar.";
        }

        this.carga -= 20;
        return "**Rabiscando** (-20 de carga)";
    }

    public void rabiscar(){
        String resposta = validarRabisco();
        System.out.println(resposta);
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada!");
    }

    public void destampar(){
        this.tampada = false;
        System.out.println("Caneta destampada!");
    }

    public void cargaAtual(){
        System.out.printf("Carga atual: %d%n", this.carga);
    }

    public void info(){
        String tampada = this.tampada ? "Sim" : "Não";

        String info = "Modelo: %s%n" + "Cor: %s%n" + "Ponta: %.2f%n" + "Carga atual: %d%n" + "Tampada: %s%n";

        System.out.printf(info, this.modelo, this.cor, this.ponta, this.carga, tampada);
    }
}
