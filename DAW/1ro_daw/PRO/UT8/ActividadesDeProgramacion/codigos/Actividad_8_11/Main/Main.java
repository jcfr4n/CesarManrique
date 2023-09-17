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
     * 8.11. Crea la clase Campana que hereda de Instrumento (definida en la
     * Actividad resuelta 8.4).
     *
     */
    public static void main(String[] args) {

        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Campana p = new Campana();
        for (Nota nota : cancion) {
            p.add(nota);
        }
        p.interpretar();
    }
}
