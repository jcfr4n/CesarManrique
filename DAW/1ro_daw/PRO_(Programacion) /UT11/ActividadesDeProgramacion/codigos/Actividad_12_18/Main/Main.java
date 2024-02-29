package Main;

import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {
    /*
     * 12.18. Implementa la clase Pila genérica utilizando un objeto ArrayList
     * para guardar los elementos.
     * 
     */

    public static void main(String[] args) {
        Pila miPila = new Pila();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("***** MENÚ *****");
            System.out.println("1. Apilar elemento");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Consultar tope de la pila");
            System.out.println("4. Ver tamaño de la pila");
            System.out.println("5. Verificar si la pila está vacía");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elemento = sc.nextInt();
                    miPila.apilar(elemento);
                    System.out.println("Elemento apilado correctamente");
                    break;

                case 2:
                    miPila.desapilar();
                    break;

                case 3:
                    miPila.consultarTope();
                    break;

                case 4:
                    int tamano = miPila.tamano();
                    System.out.println("Tamaño de la pila: " + tamano);
                    break;

                case 5:
                    if (miPila.estaVacia()) {
                        System.out.println("La pila está vacía");
                    } else {
                        System.out.println("La pila no está vacía");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }
}