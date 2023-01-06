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
import java.util.Scanner;

public class Main {

    /**
     *
     * 6.16. Lee una palabra o frase y muestra el proceso en el que cada letra
     * se sustituye por otro símbolo no alfabético. Por ejemplo el carácter 'a' 
     * se podría sustituir por el carácter '@', la 'e' por '€', la 'i' por '1', 
     * etcétera.
     *
     */
    
    public static void main(String[] args) {
        String sentencia = "";
        Scanner sc = new Scanner(System.in);
        
        // Se llaman a los distintos métodos usados 
        
        presentarValor(
                cambiarLetras(
                        capturarDatos(sc, sentencia)
                )
        );
        /**
         * Cierra el Scanner y sale del programa con status 0 de ejecución
         * correcta
         */
        sc.close();
        System.exit(0);
        
   }
     /**
     *
     * Captura la sentencia que será depurada de los comentarios
     *
     * @param sc Scanner usado para la captura de datos
     * @param sentencia Sentencia, frase o palabra a ser procesada
     * @return Retorna un String con la sentencia a procesar
     */
    private static String capturarDatos(Scanner sc, String sentencia) {

        System.out.print("Introduzca la sentencia a depurar: ");
        sentencia = sc.nextLine();

        return sentencia;

    }
    
     /**
     *
     * Cambia las letras por los símbolos.
     * 
     * Para hacer esto de manera diferente a la actividad 6_11 se optó por
     * cambiar cada caracter por el caracteres correspondientes a los 
     * códigos decimales 913 y siguientes (alfabeto griego)
     *
     * @param sentencia Sentencia a la que se le van a cambiar las caracteres
     * @return Retorna un String con las letras de la sentencia cambiadas
     */
    private static String cambiarLetras(String sentencia) {
        
        String letrasCambiadas = "";
        char c;
        for (int i = 0; i < sentencia.length(); i++) {
            c = sentencia.charAt(i);
            
                if (c != ' ')   c += 913 - 65;
            
            letrasCambiadas +=  c;
            
            }

        return letrasCambiadas;
            
        }
    
    /**
     * Imprime el resultado del proceso de cambio de letras por pantalla entre 
     * dos líneas hechas con el caracter "_" para que se pueda visualizar mejor
     *
     * @param sentencia Frase que va a ser presentada por pantalla
     */
    private static void presentarValor(String sentencia) {

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.println("\n\nEl resultado es:\t" + sentencia);
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\n\n\n");
    }
    
}

