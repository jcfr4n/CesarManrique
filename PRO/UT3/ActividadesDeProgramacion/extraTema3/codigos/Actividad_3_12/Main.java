package Actividad_3_12;
import java.util.Scanner;
/**
 *
 * @author juancfm
 */
public class Main {

    /*  Modifica la Actividad de aplicación 3.11 para que el usuario pueda 
        introducir un número en binario y el programa muestre su conversión 
        a decimal.*/
    
    public static void main(String[] args) {
        String numToDecimal = "";
        int numero = 0;
        double result = 0;
        double potencia = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número binario el "
                + "cual será convertido a sistema decimal: ");
        try {
            /* capturamos el número como string y lo controlamos con un patrón
            para asegurarnos que es un binario*/
            numToDecimal = sc.next("[01]+");
            numero = Integer.parseInt(numToDecimal);
            
        }catch (Exception ex) {
            System.out.println("\nPerdone, no introdujo un número válido.");
            sc.close();
            System.exit(0);
        }
        
        
        do {
            if (numero%10 != 0) result = result + Math.pow(2, potencia);
            numero /= 10;
            potencia++;
                    
        }while(numero>=1);
        
        System.out.println("\n" + numToDecimal + " expresado en base binario "
                + "es: " + (int)result + " expresado en decimal.");
        
        sc.close();        
    }

}
