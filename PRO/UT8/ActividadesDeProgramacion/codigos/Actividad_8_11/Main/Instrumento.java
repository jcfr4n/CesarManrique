/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

import java.util.Arrays;

/**
 *
 * @author juancfm
 */
public abstract class Instrumento {

    protected Nota[] melodia; //tabla que almacena las notas a interpretar

    public Instrumento() {
        melodia = new Nota[0]; //creamos la tabla
    }
//Usa el algoritmo de inserción no ordenada

    void add(Nota n) {
        //redimensionamos
        melodia = Arrays.copyOf(melodia, melodia.length + 1); 
        melodia[melodia.length - 1] = n; //insertamos el nuevo elemento al final
    }

    abstract void interpretar(); //a implementar en cada subclase
}
