import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sumaUsuario, numA, numB;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        numA = (int) (Math.random() * 99 + 1);
        numB = (int) (Math.random() * 99 + 1);
        
        System.out.println("Cuanto es: " + numA + " + " + numB + ":");
        sumaUsuario = sc.nextInt();
        respuesta = ((numA + numB) == sumaUsuario) ? "Correcto" : "Incorrecto";
        System.out.println("\n" + respuesta);
    }
}