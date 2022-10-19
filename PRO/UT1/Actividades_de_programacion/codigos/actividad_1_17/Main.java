import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                double primeraMedida, segundaMedida, terceraMedida;
                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese la primera medida de longitud "
                                + "(expresada en milímetros): ");
                primeraMedida = sc.nextDouble();

                System.out.print("Ingrese la segunda medida de longitud "
                                + "(expresada en centímetros): ");
                segundaMedida = sc.nextDouble();

                System.out.print("Ingrese la tercera medida de longitud "
                                + "(expresada en metros): ");
                terceraMedida = sc.nextDouble();

                primeraMedida = primeraMedida / 10;
                terceraMedida = terceraMedida * 100;

                sc.close();

                System.out.println("La suma de las tres longitudes introducidas es: "
                                + (primeraMedida + segundaMedida + terceraMedida)
                                + "centímetros");

        }
}
