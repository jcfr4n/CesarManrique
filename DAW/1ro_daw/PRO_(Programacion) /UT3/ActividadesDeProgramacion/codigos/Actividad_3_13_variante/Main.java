package Actividad_3_13_variante;

import java.util.Scanner;
/**
 * @author juancfm
 */
public class Main {

    /* Escribe un programa que incremente la hora de un reloj. Se pedirán por 
teclado la hora, minutos y segundos, así como cuántos segundos se desea 
incrementar la hora introducida. La aplicación mostrará la nueva hora. 
Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, 
resultan las 14:00:01.*/
    
    public static void main(String[] args) {
        int hora, minutos, segundos, incremento;
        String salir = "n";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Vamos a calcular el incremento de unos "
                    + "segundos");
            System.out.print("Ingrese la hora(0-23): ");
            hora = sc.nextInt();
            System.out.print("Ingrese los minutos(0-60): ");
            minutos = sc.nextInt();
            System.out.print("Ingrese los segundos:(0-60): ");
            segundos = sc.nextInt();
            System.out.print("Ingrese el incremento en segundos: ");
            incremento = sc.nextInt();
            System.out.println("La hora introducida es:");
            System.out.println(hora + ":" + minutos +":" + segundos);
            System.out.println("El incremento indicado fue de:");
            System.out.println(incremento + " segundos");
            segundos += incremento; // Sumamos el incremento y calculamos
            if (segundos > 59) {
                minutos += segundos/60;
                segundos = segundos%60;
                if (minutos > 59) {
                    hora += minutos/60;
                    minutos = minutos%60;
                }
            }
            System.out.println("El resultado es:");
            System.out.println(hora + ":" + minutos +":" + segundos);
            System.out.print("Desea parar la ejecución del programa(s/n): ");
            salir = sc.next();
            sc.close();
            System.out.println("\n\n\n");
            
        } while("n".equals(salir));

    }

}
