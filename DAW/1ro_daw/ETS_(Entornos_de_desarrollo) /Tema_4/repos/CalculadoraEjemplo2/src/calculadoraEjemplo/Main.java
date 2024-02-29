/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraEjemplo;

import static calculadoraEjemplo.Operacion.seleccionar;
import static calculadoraEjemplo.Saludo.mostrarSaludo;

/**
 * Clase principal de la aplicación. Esta clase inicia la aplicación y muestra
 * un saludo en la pantalla.
 *
 * @author juancfm
 */
public class Main {

    /**
     * Método principal de la aplicación. Este método inicia la aplicación y
     * muestra un saludo en la pantalla. También llama al método 'seleccionar()'
     * para continuar con la aplicación.
     *
     * @param args argumentos de línea de comando (no se utilizan en esta
     * aplicación)
     */
    public static void main(String[] args) {

        mostrarSaludo();
        seleccionar();
    }

}
