/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * 5.15. Debes desarrollar una aplicación que ayude a gestionar las
         * notas de un centro educativo.
         * Los alumnos se organizan en grupos compuestos por 5 personas. Leer
         * las notas (números enteros) del primer, segundo y tercer trimestre
         * de un grupo. Debes mostrar al final la nota media del grupo en cada
         * trimestre y la media del alumno que se encuentra en una posición
         * dada (que el usuario introduce por teclado ).
         */

        boolean continuar = true;
        int persona;
        Scanner sc = new Scanner(System.in);

        int[][] notas = {
                { 1, 8, 9 }, // Notas Persona 1, posición 0
                { 9, 8, 4 }, // Notas Persona 2, posición 1
                { 10, 4, 9 }, // Notas Persona 3, posición 2
                { 7, 9, 8 }, // Notas Persona 4, posición 3
                { 10, 10, 10 } // Notas Persona 5, posición 4
        };

        notas = cambioNotas(notas); // Comprueba si se desean notas aleatorias

        notasTrimestre(notas); // Muestra la media de notas trimestral del grupo

        // Se mantiene en un bucle para mostrar las notas de un alumno en una
        // posición que el usuario escoja, hasta que se introduzca un número
        // menor a cero o mayor a cuatro
        while (continuar) {
            System.out.print(
                    "Para ver la nota de algún alumno pulse su posición (0-4) \n(Introduzca otro número para salir): ");
            persona = sc.nextInt();
            if (persona >= 0 && persona <= 4) {
                mostrarNotas(notas, persona); // Muestra las notas y el promedio de una persona
            } else {
                continuar = false;
            }

        }

        sc.close();
        System.exit(0);
    }

    /**
     * Le pregunta al usuario si desea cambiar las notas predeterminadas por
     * unas aleatorias, en caso afirmativo, se recorre el array bidimensional y
     * se asignan valores aleatorios enteros entre 1 y 10, y devuelve el array
     * con los nuevos datos.
     * 
     * @param notas
     * @return int[][]
     */
    private static int[][] cambioNotas(int[][] notas) {
        String option;
        System.out.println("Las notas actuales son: ");
        System.out.println(Arrays.deepToString(notas));
        System.out.println("¿Desea sustituir las notas con otras aleatorias?(s/n)");
        Scanner sc1 = new Scanner(System.in);
        option = sc1.nextLine();
        if (option.equals("s")) {
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    notas[i][j] = (int) (Math.random() * 10 + 1);
                }
            }

            System.out.println("Las nuevas notas son: ");
            System.out.println(Arrays.deepToString(notas) + "\n");
        }
        return notas;
    }

    /**
     * Imprime por consola el promedio de notas agrupadas por trimestre
     * 
     * @param notas
     */
    private static void notasTrimestre(int[][] notas) {
        double[] trim = new double[3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                trim[j] += notas[i][j];
            }

        }

        System.out.println("El promedio de notas por trimestre es: ");
        System.out.println("Primer Trimestre:\t" + trim[0] / notas.length);
        System.out.println("Segundo Trimestre:\t" + trim[1] / notas.length);
        System.out.println("Tercer Trimestre:\t" + trim[2] / notas.length + "\n");

    }

    /**
     * Muestra las notas de una persona determinada y su promedio de notas
     * 
     * @param notas
     * @param persona
     */
    private static void mostrarNotas(int[][] notas, int persona) {
        double prom = 0;

        for (int i = 0; i < notas[persona].length; i++) {
            prom += notas[persona][i];
        }
        System.out.print(
                "\nLas notas de la persona en la posición " + persona + " son: " + Arrays.toString(notas[persona]));
        System.out.println("\nSu promedio es: " + prom / 3 + "\n");
    }

}
