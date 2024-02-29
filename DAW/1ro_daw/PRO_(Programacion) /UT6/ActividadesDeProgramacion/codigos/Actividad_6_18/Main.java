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
     * 6.18. Escribe una aplicación que convierte una frase ( que puede estar
     * escrita con cualquier combinación de mayúsculas y minúsculas ) en el
     * nombre de una variable que utilice la nomenclatura Camel. Por ejemplo, la
     * frase « Me GUsta merenDAR gaLLEtas », se convertirá en
     * «meGustaMerendarGalletas». Supondremos que cada palabra que compone la
     * frase está separada por un único espacio en blanco.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se llaman a los distintos métodos usados 
        presentarValor(
                prepararVarName(
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
     * Captura la frase que será convertida en el nombre de la variable
     *
     * @param sc Scanner usado para la captura de datos
     * @return frase Retorna un String con la frase
     */
    private static String capturarDatos(Scanner sc) {

        String frase;

        System.out.print("Introduzca la frase a utilizar: ");
        frase = sc.nextLine();

        return frase;

    }

    /**
     *
     * Primero convertimos todas las letras de la frase en minúsculas, usando el
     * método split creamos un array con todas las palabras de la frase, y
     * luego, listamos esas palabras una a una conviertiendo su primera letra en
     * mayúscula, a excepción de la primera palabra que permanecerá en
     * minúscula, todo eso lo concatenamos y lo retornamos
     *
     * @param frase String con la frase a tratar
     * @return varName Nombre de la variable creada a partir de la frase dada
     *
     */
    private static String prepararVarName(String frase) {

        frase = frase.toLowerCase();
        String[] words = frase.split("\\s+");
        String varName = "";
        int cont = 0;

        for (String word : words) {

            cont++;

            if (cont == 1) {
                varName += word;
            } else {

                varName
                        += word.substring(0, 1).toUpperCase()
                        + word.substring(1);

            }

        }

        return varName;

    }

    /**
     * Imprime el resultado de la creación del nombre de la variable
     *
     * @param varName Nombre de la variable que va a ser presentada por pantalla
     */
    private static void presentarValor(String varName) {

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }

        System.out.println("\n\nEl resultado es: \n\n" + varName);

        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\n\n\n");
    }

}

