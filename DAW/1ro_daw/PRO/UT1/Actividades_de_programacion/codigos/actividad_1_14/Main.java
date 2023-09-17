import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        base = sc.nextInt();
        System.out.print("Indique su altura: ");
        altura = sc.nextInt();

        sc.close();

        System.out.println("El área del triángulo es: " + (base * altura / 2)
                + " unidades cuadradas \n(Si usted ingresó las medidas en cm "
                + "el resultado será expresado en cm2)");
    }
}