/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 5.12. Escribe la función void desordenar (int t[ ]), que cambia de forma
     * aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera
     * ordenada, dejaría de estarlo.
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int longitud;
        
        int[] tabla1;

        System.out.println("Vamos a crear un array del tamaño que Ud desee,"
                + "\nluego lo vamos a poblar con datos aleatorios(entre 1 y 50)"
                + "\ny finalmente, lo vamos a desordenar.");
        System.out.print("Por favor introduzca la longitud del array: ");
        longitud = sc.nextInt();
        sc.close();
        
        tabla1 = new int[longitud];
        poblarArray(tabla1);
        System.out.println("La tabla quedó así: ");
        System.out.println(Arrays.toString(tabla1));
        
        System.out.println("Al desordenarla quedó asi: ");
        desordenar(tabla1);
        System.exit(0);

    }
    
    private static void poblarArray(int[] tabla1) {
        for (int i = 0; i < tabla1.length; i++) {
            tabla1[i] = (int) (Math.random() * 20) + 1;
        }
    }

    private static void desordenar(int[] tabla1) {
        
        List<Integer> lista;
        lista = (List) Arrays.asList((int[]) tabla1);
        
        Collections.shuffle(lista);
        
        
        System.out.println(lista.toString());
        
        
    }

}
