/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion8.pkg14;

/**
 *
 * @author Ana
 */
public class Aplicacion814 {


    public static void main(String[] args) {
     Lista l1 = new Lista();
        for (int i = 0; i < 3; i++) {
            l1.insertarFinal(i);
        }
         System.out.println("l1: "+l1);
        Lista l2 = new Lista();
        for (int i = 0; i < 3; i++) {
            l2.insertarFinal(i);
        }
        System.out.println("l2: "+l2);
    }
    
}
