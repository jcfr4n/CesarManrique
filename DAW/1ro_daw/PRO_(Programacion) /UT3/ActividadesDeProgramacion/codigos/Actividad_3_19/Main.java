package Actividad_3_19;

import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {

    /**
     * Calcula la raíz cuadrada de un número natural mediante aproximaciones. En
     * el caso de que no sea exacta, muestra el resto. Por ejemplo, para
     * calcular la raíz cuadrada de 23, probamos 1^2 = 1 , 2^2 = 4 , 3^2 = 9 , 
     * 4^2 = 16 , 5^2 = 25 ( nos pasamos ), resultando 4 la raíz cuadrada de 23 
     * con un resto ( 23 – 16 ) de 7.
     */
    public static void main(String[] args) {
        int numero, base = 1;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduce un número para hallar su raíz cuadrada"
                + " aproximada: ");
        numero = sc.nextInt();
        
        while (base * base <= numero){
            base++;
        }
        base--;
        sc.close();
        System.out.print("La raíz cuadrada es: " + base); 
        System.out.println((numero - (base * base)==0)? " exacto":
                " con un resto de: " + (numero - (base * base)));
    }
}
