import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número a: ");
        a = sc.nextInt();

        System.out.print("Ingrese número b: ");
        b = sc.nextInt();

        sc.close();

        System.out.println("¿Son iguales los números?");

        System.out.println((a == b) ? "true" : "false");
    }
}
