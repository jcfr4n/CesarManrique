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

        int[] resultado = {8, 9, 10, 3, 36, 15};
        
        int[] apuesta = {12, 36, 8, 5, 14, 19};
        
        int contador = 0;
              
        Arrays.sort(resultado);
        
        for (int element: apuesta){
            if (Arrays.binarySearch(resultado, element) > 0) {
                contador++;
            }
        }
        
        System.out.println("Han habido " + contador + " aciertos.");
        
        
    }

}
