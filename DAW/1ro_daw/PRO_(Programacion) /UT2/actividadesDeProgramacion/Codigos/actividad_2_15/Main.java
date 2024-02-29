import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double base, altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor introducir la misma unidad de medida."); 
        System.out.print("Introduce la base del triángulo: ");
        base = sc.nextDouble();
        System.out.print("Introduce ahora la altura del triángulo: ");
        altura = sc.nextDouble();
        
// Se comprueba la condición de existencia de un triángulo, que nos dice que la 
// suma de cualquiera de los dos lados de un triángulo sera mayor que la 
// longitud del tercero, para lo cual todos los lados han de ser mayores a 0.

        if (base <= 0 || altura <= 0) {
            System.out.print("Lo siento, "
                    + "las medidas no pueden ser negativas ni iguales a cero");
        }else{
            System.out.println("\nEl área del triángulo es " 
                    + (base*altura/2) + " unidades cuadradas.");
        }
            System.out.println("\nGracias por hacer uso de este programa.");
    }
}