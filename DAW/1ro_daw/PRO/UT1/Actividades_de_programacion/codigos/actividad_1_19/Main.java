import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entradasInfantiles, entradasAdultos;
        double total;
        final double descuento = 0.05;
        final double precioInfantiles = 15.50;
        final double precioAdultos = 20;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de entradas infantiles: \t");
        entradasInfantiles = sc.nextInt();

        System.out.print("Ingrese el número de entradas de adultos: \t");
        entradasAdultos = sc.nextInt();

        total = (entradasInfantiles * precioInfantiles)
                + (entradasAdultos * precioAdultos);

        if (total >= 100) {
            total *= (1 - descuento); // total = total - (total * descuento);
        }
        sc.close();

        System.out.println("\nEl valor total de las entradas es: "
                + total + "€");
    }
}
