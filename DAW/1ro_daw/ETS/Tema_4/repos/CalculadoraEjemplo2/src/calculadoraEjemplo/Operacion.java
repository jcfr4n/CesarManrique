/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraEjemplo;

import java.util.Scanner;

/**
 * Clase para seleccionar la operación a realizar.
 *
 * @author juancfm
 */
public class Operacion {

    /**
     * Método que pregunta al usuario qué operación desea realizar y llama al
     * método correspondiente.
     */
    public static void seleccionar() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Seleccione la operación a realizar:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");

                int opcion = scanner.nextInt();

                if (opcion == 5) {
                    break;
                }

                System.out.println("Introduzca el primer número:");
                double a = CapturaOperandos.pedirNumeroDecimal();
                System.out.println("Introduzca el segundo número:");
                double b = CapturaOperandos.pedirNumeroDecimal();

                switch (opcion) {
                    case 1 -> {
                        double resultadoSuma = Suma.calcular(a, b);
                        Resultado.presentarResultado("suma", resultadoSuma);
                    }
                    case 2 -> {
                        double resultadoResta = Resta.calcular(a, b);
                        Resultado.presentarResultado("resta", resultadoResta);
                    }
                    case 3 -> {
                        double resultadoMultiplicacion = Multiplicacion.calcular(a, b);
                        Resultado.presentarResultado("multiplicación", resultadoMultiplicacion);
                    }
                    case 4 -> {
                        double resultadoDivision = Division.calcular(a, b);
                        Resultado.presentarResultado("división", resultadoDivision);
                    }
                    default ->
                        System.out.println("Operación no válida.");
                }
            }
        }
    }

}
