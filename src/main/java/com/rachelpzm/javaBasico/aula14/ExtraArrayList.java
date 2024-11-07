package javaBasico.aula14;

import java.util.*;

public class ExtraArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println(lista); // Sem valores padrões

        lista.add(23);
        lista.add(45);
        lista.add(12);

        System.out.println(lista); // [23, 45, 12]

        System.out.println(lista.get(1)); // 45

        lista.set(0, 67);
        System.out.println(lista); // [67, 45, 12]

        lista.remove(1);
        System.out.println(lista); // [67, 12]

        System.out.println(lista.size()); // 2

        System.out.println(lista.contains(12)); // true
        System.out.println(lista.contains(6)); // false

        lista.add(101);

        //Ordenando lista

        lista.sort(null);
        System.out.println(lista); // [12,67,101]

        lista.sort(Collections.reverseOrder());
        System.out.println(lista); // [101,67,12]

        List<String> list = new ArrayList<>(20);
        list.add("Paula");
        list.add("Thiago");
        list.add(1, "Carlos");

        System.out.println(list); // ["Carlos", "Paula, "Thiago"]

        list.forEach(System.out::println);

        System.out.println(list.indexOf("Thiago")); // 2
        System.out.println(list.indexOf("Thalia")); // -1 (erro)

        Iterator<String> it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
