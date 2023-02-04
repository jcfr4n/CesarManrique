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
     * 7.11. Escribe la clase MarcaPagina, que ayuda a llevar el control de la 
     * lectura de un libro. Deberá disponer de métodos para incrementar la 
     * página leída, para obtener información de la última página que se ha 
     * leído y para comenzar desde el principio una nueva lectura del mismo 
     * libro.
     *
     */
    public static void main(String[] args) {
      Marcapagina marca;
      marca = new Marcapagina();
      marca.siguientePag();
      marca.siguientePag();
      marca.siguientePag();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
      marca.comenzar();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
        
    }

}
