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
     * 6.17.  Construir un programa que convierta una palabra en secuencias de 
     * n letras.  Por ejemplo, la palabra «destornillador», dividida en 
     * secuencias de 4 letras, se mostrará de la siguiente forma :
     * 
     * dest 
     * orni
     * llad 
     * or
     *
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Se llaman a los distintos métodos usados 
        
        presentarValor(
                separarPalabra(
                        capturarDatos(sc)
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
     * Captura la palabra que será separada en secuencias
     *
     * @param sc Scanner usado para la captura de datos
     * @return Retorna un array de String con la palabra a procesar y el número 
     * de letras de las secuencias en las cuales será dividida la palabra
     */
    private static String[] capturarDatos(Scanner sc) {
        
        String[] datos = new String[2];

        System.out.print("Introduzca la palabra a dividir: ");
        datos[0] = sc.nextLine();

        System.out.print("Introduzca el número de letras de la secuencia: ");
        datos[1] = sc.nextLine();

        return datos;

    }
    
     /**
     *
     * Separa la palabra ingresada por el usuario en secuencias de la longitud 
     * especificada por él
     * 
     * @param datos Array que contiene la palabra a separar y extensión de la
     * secuencia
     * @return Retorna un String con la palabra separada en secuencias de n 
     * letras
     */
    private static String[] separarPalabra(String[] datos) {
        
        String myRegex = "(?<=\\G.{" + datos[1] + "})";
        
        return datos[0].split(myRegex);
            
        }
    
    /**
     * Imprime el resultado del proceso de cambio de letras por pantalla entre 
     * dos líneas hechas con el caracter "_" para que se pueda visualizar mejor
     *
     * @param sentencia Frase que va a ser presentada por pantalla
     */
    private static void presentarValor(String[] sentencia) {

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.println("\n\nEl resultado es: ");
        
        for (String word:sentencia){
            System.out.println(word);
        }
        
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\n\n\n");
    }
    
}

