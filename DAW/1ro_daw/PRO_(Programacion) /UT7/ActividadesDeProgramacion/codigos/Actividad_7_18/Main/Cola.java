/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author juancfm
 */
public class Cola {    

  int[] fila;
  int primero;
  int indiceUltimo;

  public Cola() {
    fila = new int[10];
    primero = 0;
    indiceUltimo = 0;
  }

  public void encola(int i) {
    fila[indiceUltimo] = i;
    indiceUltimo++;
  }

  public int desencola() {
    int valor = fila[primero];
    primero++;
    return valor;
  }

  public int primero() {
    return fila[primero];
  }

  public boolean vacia() {
    return primero == indiceUltimo;
  }

    
}
