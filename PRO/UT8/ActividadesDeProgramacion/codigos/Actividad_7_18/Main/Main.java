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
     * 7.18. Una cola es otra estructura dinámica como la pila, donde los
     * elementos, en vez de apilarse y desapilarse, se encolan y desencolan.
     * La diferencia con las pilas es que se desencola el primer elemento
     * encolado, ya que así es como funcionan las colas del autobús o del cine.
     * El primero que llega es el primero que sale de la cola (vamos a suponer
     * que nadie se cuela). Por tanto, los elementos se encolan y desencolan en
     * extremos opuestos de la estructura, llamados primero (el que está
     * primero y será el próximo en abandonar la cola) y último (el que llegó
     * último). Implementa la clase Cola donde los elementos Integer encolados
     * se guardan en una tabla.
     *
     */
    
   public static void main(String[] args) {
      Cola c = new Cola();
      for (int i = 1; i <= 10; i++) {
         c.encola(i);
      }
      
      System.out.println("Primero: " + c.primero());
      System.out.println("Vacía: " + c.vacia());
      while(!c.vacia()) {
         System.out.println(c.desencola());
      }
   }
}
