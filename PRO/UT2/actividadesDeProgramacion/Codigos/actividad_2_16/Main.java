import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double absoluto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular el valor absoluto");
        System.out.println("Introduce un número: ");
        absoluto = sc.nextDouble();
        absoluto = (absoluto < 0) ? -1 * absoluto : 1 * absoluto;
        System.out.println("Su valor absoluto es: " + absoluto);
    }
}