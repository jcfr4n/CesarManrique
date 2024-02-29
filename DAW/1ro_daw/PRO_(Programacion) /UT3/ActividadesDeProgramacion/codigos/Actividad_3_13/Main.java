package Actividad_3_13;

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
        int hora, minutos, segundos, incremento, auxMin, auxHoras, auxDias;
        auxMin = auxHoras = auxDias = 0;
        Scanner sc = new Scanner(System.in);


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
            
            for (int i = 0; i<incremento; i++){
                segundos++;  
                if (segundos>59){
                    segundos = 0;
                    auxMin++;
                }
            }
            for (int i = 0; i<auxMin;i++){
                minutos++;
                if (minutos>59){
                    minutos = 0;
                    auxHoras++;
                }
            }
            for (int i = 0; i<auxHoras;i++){
                hora++;
                if (hora>23){
                    hora = 0;
                    auxDias++;
                }
            }
            
            System.out.println("El resultado es:");
            System.out.println(hora + ":" + minutos +":" + segundos);
            if (auxDias>0) System.out.println("de " + auxDias + 
                    " días después.");
            sc.close();

    }

}
