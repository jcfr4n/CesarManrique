package resuelta12.pkg04;

import java.util.*;

public class Resuelta1204 {

    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        System.out.print("Introducir entero: ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            numeros.add(n);
            System.out.print("Introducir entero: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println("Lista completa: " + numeros);
        System.out.print("Pares: ");
        for (Integer a : numeros) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println("");
        for (Iterator<Integer> it = numeros.iterator(); it.hasNext();) {
            n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }
        System.out.println("No múltiplos de 3: " + numeros);
    }

}
