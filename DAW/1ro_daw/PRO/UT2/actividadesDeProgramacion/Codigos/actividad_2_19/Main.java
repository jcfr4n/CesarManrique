import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double grados, radianes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Transformar grados a radianes.");
        System.out.print("Introduzca cuántos grados tiene el ángulo: ");
        grados = sc.nextInt();
        sc.close();
        System.out.println("El rángulo introducido fue de: " 
                + grados + " grados.");
        if(grados > 360) {
            System.out.println("que es equivalente a un ángulo de: " 
                    + (grados % 360) + " grados.");
            radianes = (grados) * Math.PI / 180;            
        }else{
            radianes = grados * Math.PI / 180;
        }
        System.out.println("y son : " + radianes + "radianes");
    }
}