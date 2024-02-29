package Main;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.11. Escribe un programa que solicite al usuario el nombre de un
         * fichero de texto y muestre su contenido en pantalla. Si no se
         * proporciona ningún nombre de fichero, la aplicación utilizará por
         * defecto prueba.txt.
         */
        String texto;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("El presente programa le solicitará el nombre "
                    + "de un fichero de texto y le mostrará su contenido por "
                    + "pantalla.");
            System.out.println("\nPulse la tecla Enter para continuar");
            texto = s.nextLine();

            System.out.println("\nPor favor introduzca el nombre del "
                    + "fichero a leer: ");
            texto = s.nextLine();

            fileContent file = new fileContent();

            System.out.println(file.fileContent(texto));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.exit(0);

    }

}
