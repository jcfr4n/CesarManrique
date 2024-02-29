package Actividad_3_16;


import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {

    /* 
    * Realiza un programa que nos pida un número n, y nos diga cuántos 
    * números hay entre 1 y n que sean primos.
     */

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para dibujar un "
                + "triángulo de esa base y altura:");
        n = sc.nextInt();
        System.out.println("\n");
        for(int i=0;i<=n;i++){
            for(int j= n; j > i; j--){
                System.out.print(" ");
            }
            for(int k= 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
        System.out.println("fin");

    }

}
