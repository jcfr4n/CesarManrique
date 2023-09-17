/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion8.pkg12;

/**
 *
 * @author Ana
 */
public class Aplicacion812 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

		Unidad Unidades = Unidad.M;
             Caja cajaGrande = new Caja(1,2,3,Unidades);
             
             Unidades = Unidad.CM;
             Caja cajaPequeña = new Caja(3,3,5,Unidades);
             
             System.out.println((double)cajaGrande.getVolumen());  
             
             System.out.println((double)cajaPequeña.getVolumen());  
             
             
             cajaGrande.setEtiqueta("Monitor");
             cajaPequeña.etiqueta = "Raton";
             
             System.out.println(cajaGrande.etiqueta); 
             System.out.println(cajaPequeña.etiqueta); 
             
             System.out.println(cajaGrande); 
             System.out.println(cajaPequeña); 
    }
    
}
