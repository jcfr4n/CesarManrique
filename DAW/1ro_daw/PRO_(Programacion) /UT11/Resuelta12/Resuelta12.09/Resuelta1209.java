package resuelta12.pkg09;

import java.util.*;

public class Resuelta1209 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        System.out.print("Introducir número: ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            lista.add(n);
            System.out.print("Introducir número: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println(lista);
        System.out.print("Índices de valores pares: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.print(i + " ");
                lista.set(i, lista.get(i) * 100);
            }
        }
        System.out.println("");
        System.out.println(lista);
    }

}
