package Actividad_3_20;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {

    /**
     * Escribe un programa que solicite al usuario las distintas cantidades de
     * dinero de las que dispone. Por ejemplo: la cantidad de dinero que tiene
     * en el banco, en una hucha, en un cajón y en los bolsillos. La aplicación
     * mostrará la suma total de dinero de la que dispone el usuario. La manera
     * de especificar que no se desea introducir más cantidades es mediante el
     * cero.
     */
    public static void main(String[] args) {
        double a, monedero = 0;
        Scanner sc=new Scanner(System.in);
        // Declaramos un objeto df de tipo DecimalFormat que nos sirve para
        // presentar nuestro resultado con dos decimales según el patrón que
        // le suministramos
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("Vamos a sumar unas cantidades de dinero:");
        do {
            System.out.print("Dime una cantidad (cero para totalizar): ");
            a = sc.nextDouble();
            monedero += a;
        }while(a!=0);
        sc.close();
        System.out.println("\nLa suma total es: " + df.format(monedero));
    }
}