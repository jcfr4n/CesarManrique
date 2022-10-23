import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numAnimales;
        double comidaDiaria, kilosPorAnimal;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿A cuántos animales vamos a alimentar hoy: ");
        numAnimales = sc.nextInt();
        System.out.print("¿Cuántos kilos de alimento come "
                + "cada animal al día?: ");
        kilosPorAnimal = sc.nextDouble();
        System.out.print("¿Cuánta comida compramos hoy: ");
        comidaDiaria = sc.nextDouble();
        if (numAnimales <= 0) {

            System.out.println("\nLo sentimos pero no ha indicado "
                    + "correctamente el número de animales.");
        } else {
            if ((comidaDiaria / numAnimales) >= kilosPorAnimal) {
                System.out.println("Perfecto, hay alimentos en cantidad "
                        + "suficiente para todos los animales");
            } else {
                System.out.println("Lo sentimos, pero la comida no alcanza.");
                System.out.println("\nTendremos que racionar los alimentos a:");
                System.out.println(comidaDiaria / numAnimales + " kilos de "
                        + "alimento por animal");
            }
        }
        System.out.println("\nGracias por usar nuestro servicio.");
    }
}