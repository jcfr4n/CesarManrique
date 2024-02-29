import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double longitudLanzamiento;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lanzamiento "
                + "expresado en metros: ");

        longitudLanzamiento = sc.nextDouble();
        resultado = (int) (longitudLanzamiento * 100);

        sc.close();

        System.out.println("Longitud del lanzamiento en centímetros: "
                + resultado);
    }
}
