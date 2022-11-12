package main;

import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {
    
    /**
     * Para dos números dados, a y b, es posible buscar el máximo común divisor 
     * (el número más grande que divide a ambos) mediante un algoritmo 
     * ineficiente pero sencillo: desde el menor de a y b, ir buscando, de 
     * forma decreciente, el primer número que divide a ambos simultáneamente. 
     * Realiza un programa que calcule el máximo común divisor de dos números.
     */

    public static void main(String[] args) {
        
        int a, b, divisor;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Vamos a buscar el máximo común "
                + "divisor de dos números dados.");
        System.out.print("Introduzca el número A: ");
        a=sc.nextInt();
        System.out.print("Introduzca el número B: ");
        b=sc.nextInt();
        
        divisor = (a<b)? a : b;
        
        while(a%divisor!=0 || b%divisor!=0){
            divisor--;
        }
        
        System.out.println("El máximo común divisor de " + a +
                " y " + b + " es: " + divisor);
        
        sc.close();
        System.out.println("Fin.");        
    }

}