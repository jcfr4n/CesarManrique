package Actividad_3_15;
import java.util.Scanner;
/**
 *
 * @author juancfm
 */
public class Main {

    /*  Diseña una aplicación que dibuje el triángulo de Pascal, para n filas.*/
    
    public static void main(String[] args) {
        
        int filas = 0;
        int nt;
        Scanner sc = new Scanner(System.in);
        String result;
        
        System.out.print("Por favor, introduzca el número de filas que "
                + "tendrá el triángulo: ");
        try {
            filas = sc.nextInt();
        }catch (Exception ex) {
            System.out.println("\nPerdone, no introdujo un número válido.");
            sc.close();
            System.exit(0);
        }
        
        for (int i = 0; i < filas ;i++){
            nt = 1;
            result = "";
            for (int j = 0; j <= i; j++){
                result += (nt + " ");
                nt = nt * (i-j)/(j+1);
            }
            System.out.println(result);
        }
        sc.close();        
    }

}
