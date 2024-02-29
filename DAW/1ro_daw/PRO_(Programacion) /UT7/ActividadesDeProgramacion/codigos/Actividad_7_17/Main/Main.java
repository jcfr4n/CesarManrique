/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 * @author juancfm
 */
public class Main {

    /**
     *
     * El cifrado César es una forma sencilla de modificar un texto para que no
     * sea entendible a quienes no conocen el código. Este cifrado consiste en
     * modificar cada letra de un texto por otra que se encuentra en el alfabeto
     * n posiciones detrás. Por ejemplo, para un valor de n igual a 3, la letra
     * a se codifica con la d, y la letra q se codifica con la x. En el caso de
     * que una letra exceda a la z, seguiremos de forma circular utilizando la
     * a. Solo se cifrarán las letras, mayúsculas o minúsculas. 
     * Realiza una clase que, mediante un método estático, devuelva cifrado 
     * el texto que se le pasa con un paso de n letras.
     *
     */

   public static void main(String[] args) {
      System.out.println(Cifrado.cesar("abcdef ... vwxyz", 3));
      System.out.println(Cifrado.cesar("Hola mundo", 5));
   }
}
