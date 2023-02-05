/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author juancfm
 */
public class Cola extends Lista {    


  public void encolar(int i) {
      this.insertarFinal(i);
  }

  public Integer desencolar() {
    return this.eliminar(0);
  }
    
}
