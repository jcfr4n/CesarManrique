package Main;


import java.util.Scanner;


/**
 * @author juancfm
 */
public class Main {
    /*
     * 12.16. Implementa una aplicación que gestione los socios de un club 
     * usando la clase Socio implementada en la Actividad resuelta 12.11. 
     * En particular, se deberán ofrecer las opciones de alta, baja y 
     * modificación de los datos de un socio. 
     * Además, se listarán los socios por nombre o por antigüedad en el club.
     * 
     */

    public static void main(String[] args) {
        Club club = new Club();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("1. Alta socio");
                System.out.println("2. Baja socio");
                System.out.println("3. Modificar socio");
                System.out.println("4. Listar socios por nombre");
                System.out.println("5. Listar socios por antiguedad");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opcion: \n");
                
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de linea
                
                switch (opcion) {
                    case 1:
                        club.altaSocio(altaDatosCompletos(scanner));
                        break;
                    case 2:
                        club.bajaSocio(bajaSocio(scanner));
                        break;
                    case 3:
                        Socio socio = updateSocio(scanner);
                        int index = club.socios.indexOf(socio);
                        if (index >= 0) {
                            socio = club.socios.get(index);
                            System.out.print("Nuevo nombre: ");
                            String nombre = scanner.nextLine();
                            socio.nombre = nombre;
                            club.modificarSocio(socio);
                        }
                        break;
                    case 4:
                        System.out.println("Lista de socios ordenados por "
                                + "nombre:");
                        club.listarSociosPorNombre();
                        break;
                    case 5:
                        System.out.println("Lista de socios ordenados por "
                                + "antiguedad en el club:");
                        club.listarSociosPorAntiguedad();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
                System.out.println();
            } while (opcion != 0);
        }

    }        
        public static Socio altaDatosCompletos(Scanner scanner){
                System.out.print("\nDNI: ");
                String dni = scanner.nextLine();
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Fecha de alta (dd/MM/yyyy): ");
                String fechaAlta = scanner.nextLine();
                Socio socio = new Socio(dni, nombre, fechaAlta);

            return socio;            
        }
        
        public static Socio datosDni(Scanner scanner){
            String dni = scanner.nextLine();

            return new Socio(dni);          
        }
        
        public static Socio bajaSocio(Scanner scanner){
            System.out.print("\nDNI del socio a dar de baja: ");
            
            return datosDni(scanner);
        }
        
        public static Socio updateSocio(Scanner scanner){
            System.out.print("\nDNI del socio a modificar: ");

            return datosDni(scanner);
        }
}


