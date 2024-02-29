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
     * 7.15. Diseña la clase Calendario que representa una fecha concreta 
     * (año, mes y día). 
     * La clase debe disponer de los métodos : 
     * Calendario (int año, int mes, int dia) : que crea un objeto con los datos 
     * pasados como parámetros, siempre y cuando, la fecha que representen sea 
     * correcta. 
     * void incrementarDia(): que incrementa en un día la fecha del calendario. 
     * void incrementarmes(): que incrementa en un mes la fecha del calendario. 
     * void incrementarAño(int cantidad): que incrementa la fecha del calendario 
     * en el número de años especificados.Ten en cuenta que el año O no existió. 
     * void mostrar (): muestra la fecha por consola. 
     * boolean iguales (Calendario otraFecha): que determina si la fecha 
     * invocante y la que se pasa como parámetro son iguales o distintas.
     * 
     * Por simplicidad, solo tendremos en consideración que existen meses con 
     * distinto número de días, pero no tendremos en cuenta los años bisiestos.
     *
     */

   public static void main(String[] args) {
      Calendario c = new Calendario(2021, 12, 31);
      c.mostrar();
      c.incrementarDia();
      c.mostrar();
      c.incrementaMes();
      c.mostrar();
      
      Calendario a = new Calendario(2022, 2, 1);
      System.out.println("Iguales: " + c.iguales(a));
   }
}
