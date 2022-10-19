import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double baseImponible, iva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique la base imponible: ");
        baseImponible = sc.nextDouble();
        System.out.print("Indique el IVA aplicado expresado en %: ");
        iva = sc.nextDouble();
        iva = iva / 100; // Esta expresión equivale a: iva /= 100;

        sc.close();

        System.out.println(" El IVA aplicado es: " + baseImponible * iva);
        System.out.println(" El total es: " + baseImponible * (1 + iva));
    }
}