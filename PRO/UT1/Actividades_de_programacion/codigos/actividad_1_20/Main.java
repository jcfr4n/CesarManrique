import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double numeroUsuario, raizCuadrada;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numeroUsuario = sc.nextDouble();

        raizCuadrada = Math.sqrt(numeroUsuario);

        sc.close();

        System.out.println("La raíz cuadrada de "
                + numeroUsuario + " es: " + raizCuadrada);
    }
}
