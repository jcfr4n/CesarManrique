package Actividad_3_11;
import java.util.Scanner;
/**
 *
 * @author juancfm
 */
public class Main {

    /*  Realiza un programa que convierta un número decimal en su representación 
        binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene 
        el número que introduce el usuario.*/
    
    public static void main(String[] args) {
        int numero, numToBinary;
            numToBinary = numero = 0;
        String result = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero decimal el "
                + "cual será convertido a sistema binario: ");
        try {
            numToBinary = numero = sc.nextInt();
        }catch (Exception ex) {
            System.out.println("\nPerdone, no introdujo un número válido.");
            sc.close();
            System.exit(0);
        }
        
        do {
            result = Integer.toString(numero % 2) + result;
            numero /= 2;
                    
        }while(numero>=2);
        
        if(numero % 2 == 1) result = "1" + result;
        
        System.out.println("\n" + numToBinary + " expresado en base diez es: " + 
                result + " expresado en binario.");
        
        sc.close();        
    }
}