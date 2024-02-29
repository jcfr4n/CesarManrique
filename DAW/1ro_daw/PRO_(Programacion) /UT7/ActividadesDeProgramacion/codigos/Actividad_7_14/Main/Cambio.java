/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
 * this template
 */
package Main;
/**
 *
 * @author juancfm
 */
public class Cambio {
    final double[] BILLETES_MONEDAS = {500, 200, 100, 50, 20, 10, 5, 2, 1, 
        0.50, 0.20, 0.10, 0.05, 0.01};    
    double importe = 0;
    
    void setImporte(double importe){
        this.importe = importe;
    }    
    Cambio(double importe){
        this.importe = importe;
    }
    public void mostrarCambio() {
        System.out.println("Importe a devolver: " + importe + "€");
        for (double billeteMoneda : this.BILLETES_MONEDAS) {
            int cantidad = (int) (this.importe / billeteMoneda);
            importe = Math.round((importe % billeteMoneda)*100) / 100d;
            if (cantidad > 0) {
                System.out.println(cantidad + " billetes/monedas de " + 
                        billeteMoneda + "€");
            }
        }
    }
}
