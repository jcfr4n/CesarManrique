/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     *
     */
    public static void main(String[] args) {

        int valores[];
        valores = new int[10]; 

        //Vamos a recorrer la tabla para inicializar con valores aleatorios. 
        //Cuando se modifican los elementos de una tabla no podemos usar for-each 
        
        for (int i = 0; i < valores.length; i++) { 
            valores[i] = (int)(Math.random()*100 + 1); 
        }
        
        //Ahora recorreremos la tabla para calcular la suma de sus elementos 
        
        int suma = 0; 
        
        for(int valor: valores) { 
            suma += valor; 
        } 
        
        System.out.println("La suma de los valores aleatorios es " + suma);



    }

}
