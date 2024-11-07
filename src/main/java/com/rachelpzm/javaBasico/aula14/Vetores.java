package javaBasico.aula14;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args){
        int[] vetores = new int[4]; // O 4 é a quantidade de posições;

        System.out.println(vetores); // ???

        System.out.println(Arrays.toString(vetores)); // [0, 0, 0, 0]
        System.out.printf("Quantidade posições: %d%n", vetores.length);

        vetores[0] = 3;

        System.out.println(Arrays.toString(vetores)); // [3, 0, 0, 0]

        int[] vetores2 = {2,3,5,6};

        System.out.println(Arrays.toString(vetores2)); // [2, 3, 5, 6]

        // Exibindo com for
        for(int c = 0; c < vetores2.length; c++){
            System.out.printf("Índice nº %d - Valor: %d%n",c, vetores2[c]);
        }

        // Outro Exemplo
        String[] animais = new String[3];

        animais[0] = "cachorro";
        animais[1] = "gato";
        animais[2] = "papagaio";

        String[] ambiente = {"em casa", "na floresta", "na montanha"};

        for(int i = 0; i < animais.length; i++){
            System.out.printf("%s fica %s.%n", animais[i], ambiente[i]);
        }

        // ForEach s2;
        int[] valores = {2,8,4,6};

        for (int valor: valores){
            System.out.print(valor);
        }

        System.out.println();

        double[] valoresF = {5,4.2,4.8,2.1};

        // Criando uma copia
        double[] valoresFCopy = Arrays.copyOf(valoresF, valoresF.length);


        // Ordenando a copia e não o original
        Arrays.sort(valoresFCopy);

        for (double valorF: valoresF){
            System.out.printf("%s ",valorF);
        }

        System.out.println();

        System.out.println(Arrays.toString(valoresFCopy));


        // Ordenando palavras
        String[] animaisCopy = Arrays.copyOf(animais, 4); // Copia + 1 posição extra

        animaisCopy[3] = "Macaco";
        Arrays.sort(animaisCopy);

        System.out.println(Arrays.toString(animaisCopy));


        // Pesquisando o indice pelo valor.
        int indice = Arrays.binarySearch(animaisCopy, "papagaio");
        System.out.println(indice); // 3

        indice = Arrays.binarySearch(animaisCopy, "baleia");
        System.out.println(indice); // Como não tem, retorna um valor negativo.


        // Preenchendo vetor com um mesmo valor
        String[] vazios = new String[7];

        Arrays.fill(vazios, "Vazio");

        System.out.println(Arrays.toString(vazios));




        

    }
}
