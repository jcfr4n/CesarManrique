package Main;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.12. Diseña una aplicación que pida al usuario su nombre y edad.
         * Estos datos deben guardarse en el fichero datos.txt. Si este fichero
         * existe, deben añadirse al final en una nueva línea, y en caso de no
         * existir, debe crearse.
         */
        String nombre = "1";
        String pausa;
        String pathname = "datos.txt";
        int edad = 0;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("El presente programa le solicitará un nombre "
                    + "y una edad, estos datos se guardarán en un fichero de "
                    + "texto llamado \"datos.txt\"");
            System.out.println("Si este fichero existe, deben añadirse al "
                    + "final en una nueva línea, y en caso de no existir, "
                    + "debe crearse.");
            System.out.println("\nPulse la tecla Enter para continuar");
            pausa = s.nextLine();

            System.out.println("\nPor favor introduzca el nombre de la persona"
                    + " que será agregada al fichero: ");
            nombre = s.nextLine();

            System.out.println("\nPor favor introduzca la edad de la persona"
                    + " que será agregada al fichero: ");
            edad = s.nextInt();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Archivo.escribirDatos(pathname, nombre, edad);

        System.out.println("Gracias por usar este programa.");
        System.exit(0);
    }
}
