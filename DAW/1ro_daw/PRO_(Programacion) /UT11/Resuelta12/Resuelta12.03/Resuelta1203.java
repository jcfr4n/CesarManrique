package resuelta12.pkg03;

import java.util.Scanner;

public class Resuelta1203 {

    public static void main(String[] args) {
        Pila<Integer> p = new Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir entero positivo (-1 para terminar): ");
        Integer n = sc.nextInt();
        while (n != -1) {
            p.apilar(n);
            System.out.print("Introducir entero positivo (-1 para terminar): ");
            n = sc.nextInt();
        }
        System.out.print("Desapilamos: ");
        n = p.desapilar();
        while (n != null) {
            System.out.print(n + " ");
            n = p.desapilar();
        }
        System.out.println("");
    }

}
