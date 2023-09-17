/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /**
     * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude
     * a realizar encuestas estadísticas para conocer el nivel adquisitivo de
     * los habitantes del municipio.
     * Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A
     * priori, no conoces el número de encuestados. Para finalizar la entrada
     * de datos, introduce un sueldo con valor -1. Una vez terminada la entrada
     * de datos, muestra la siguiente información:
     * • Todos los sueldos introducidos ordenados de forma decreciente.
     * • El sueldo máximo y mínimo.
     * • La media de los sueldos.
     */
    public static void main(String[] args) {

        double[] sueldos = new double[0];

        sueldos = cargarDatos(sueldos);

        ordenarSueldos(sueldos);

        sueldosMaxMin(sueldos);

        mediaSueldos(sueldos);

        System.exit(0);
    }

    /**
     * Calcula la media de los sueldos y la imprime en pantalla
     * 
     * @param sueldos
     */
    private static void mediaSueldos(double[] sueldos) {
        double sum = 0;
        for (double sueldo : sueldos) {

            sum += sueldo;

        }
        System.out.println("\nLa media de sueldos es: " + sum / (sueldos.length + 1));
    }

    /**
     * Calcula el máximo y mínimo sueldo presente en el array y los presenta en
     * pantalla
     * 
     * @param sueldos
     */
    private static void sueldosMaxMin(double[] sueldos) {
        double max, min;
        max = min = sueldos[0];
        for (double sueldo : sueldos) {
            if (max < sueldo)
                max = sueldo;
            if (min > sueldo)
                min = sueldo;
        }
        System.out.println("\nEl sueldo máximo es: " + max);
        System.out.println("\nEl sueldo mínimo es: " + min);
    }

    /**
     * Ordena el array de forma decreciente.
     * El método sort los ordena de manera predeterminada de manera ascendente,
     * de modo que una vez ordenado de esa manera pasamos a invertir el array
     * intercambiando el primer valor con el último, el segúndo con el
     * penúltimo, el tercero con el antepenúltimo y así sucesivamente hasta
     * llegar al centro del array.
     * 
     * @param sueldos
     */
    private static void ordenarSueldos(double[] sueldos) {
        Arrays.sort(sueldos);
        double aux;
        for (int i = 0, j = sueldos.length - 1; i <= (int) ((sueldos.length - 1) / 2); i++, j--) {
            aux = sueldos[i];
            sueldos[i] = sueldos[j];
            sueldos[j] = aux;
        }

        System.out.println("\nLos sueldos en orden decreciente son: ");

        System.out.println(Arrays.toString(sueldos));
    }

    /**
     * Carga de datos que conforman el array.
     * 
     * @param sueldos
     * @return double[]
     */
    private static double[] cargarDatos(double[] sueldos) {
        double sueldo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a introducir los sueldos de las personas encuestadas");
        System.out.println("Cuando desee detener la carga de los datos introduzca \"-1\".");

        do {
            System.out.print("\nIntroduzca el sueldo de la persona " + (sueldos.length + 1) + ": ");
            sueldo = sc.nextDouble();
            if (sueldo != -1) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[sueldos.length - 1] = sueldo;
            }
        } while (sueldo != -1);
        System.out.println("\nLos sueldos en el orden original son: ");
        System.out.println(Arrays.toString(sueldos));

        return sueldos;

    }

}

