package Main;

import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {
    /*
     * 12.17. Implementa la clase Cola genérica utilizando un objeto ArrayList 
     * para guardar los elementos.
     * 
     */

    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Encolar un elemento");
            System.out.println("2. Desencolar un elemento");
            System.out.println("3. Consultar el primer elemento");
            System.out.println("4. Consultar el tamaño de la cola");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
// imprimir una línea en blanco para separar las respuestas
            System.out.println(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a encolar: ");
                    int elemento = scanner.nextInt();
                    cola.encolar(elemento);
                    System.out.println("Elemento encolado correctamente");
                    break;
                case 2:
                    cola.desencolar();
                    break;
                case 3:
                    cola.consultarPrimero();
                    break;
                case 4:
                    System.out.println("El tamaño de la cola es: " 
                            + cola.tamano());
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
// imprimir una línea en blanco para separar las iteraciones del ciclo while
            System.out.println(); 

        }
    }
}
