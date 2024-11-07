package POO.testes;

public class Paciente extends Pessoa{
    private String doenca;

    public Paciente(String name, int age, String doenca){
        super(name, age);
        this.doenca = doenca;
    }

    public void relatorio(){
        String name = super.setName();
        int age = super.setAge();

        System.out.printf(
                "RELATÓRIO ---------%n" +
                "Nome: %s%n" +
                "Idade: %d%n" +
                "Doença: %s%n", name, age, this.doenca
        );
    }
}
