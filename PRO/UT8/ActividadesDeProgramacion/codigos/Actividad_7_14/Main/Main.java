/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;
import java.util.Arrays;
/**
 * @author juancfm
 */

public class Main {

    /**
     *
     * 7.14. Crea una clase que sea capaz de mostrar el importe de un cambio, 
     * por ejemplo, al realizar una compra, con el menor número de monedas y 
     * billetes posibles.
     *
     */

   public static void main(String[] args) {
      Cambio c = new Cambio(12.30);
      c.mostrarCambio();
      c.setImporte(1234.56);
      c.mostrarCambio();
   }
}
