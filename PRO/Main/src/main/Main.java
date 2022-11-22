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
     * @param args
     */
    public static void main(String[] args) {
        
        
        int t[][]; // declaramos t como una tabla bidimensional 
        t = new int[5][5]; // creamos la tabla de 5x5 
        
        for (int i = 0; i < 5; i++) { // utilizamos i para la primera dimensión 
            for (int j = 0; j < 5; j++) { // y j para la segunda dimensión 
                t[i][j] = 10*i + j; 
            } 
        }
        
        System.out.println(Arrays.deepToString(t)); //mostramos 
    //otra forma de mostrar es hacerlo recorriendo nosotros la matriz. 
    //Una matriz es un conjunto de filas (tabla unidimensional). Y cada fila 
    //está compuesta por una serie de elementos. 
    for (int fila[] : t) { 
        for (int columna: fila) { 
            System.out.print(columna + "\t"); 
        } 
        System.out.println(); 
    }
    




    }
}
