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
public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("La melodía es:\n");
        for (Nota nota : melodia) {
            // Se imprimen las notas de la melodía cambiando de mayúsculas
            // a minúsculas para señalar un timbre diferente
            System.out.println(nota.toString().toLowerCase());
        }
        System.out.println("\nGracias");
    }
}
