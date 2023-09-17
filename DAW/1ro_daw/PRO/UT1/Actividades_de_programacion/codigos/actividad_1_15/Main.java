import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los siguientes coeficientes: \n");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();
        System.out.print("Ahora ingrese el valor de x: ");
        x = sc.nextInt();

        y = (int) ((a * Math.pow(x, 2)) + (b * x) + c);

        sc.close();

        System.out.println("El valor de y es: " + y);
    }
}