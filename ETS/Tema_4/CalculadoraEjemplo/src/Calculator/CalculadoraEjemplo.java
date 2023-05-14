package Calculator;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa una calculadora básica con las operaciones de suma, resta,
 * multiplicación y división.
 * 
 * @author juancfm
 */
public class CalculadoraEjemplo {
    /**
     * Objeto Scanner para acceder a sus métodos
     * 
     * @var sc Scanner
     */
    private final Scanner sc = new Scanner(System.in);
    
    /**
     * Variable que recoge la opción selleccionada por el usuario en el menú
     * 
     * @var opcion int
     */
    private int opcion;
    
    /**
     * Variable para guardar el primer operando
     * 
     * @var operando1 double
     */
    private double operando1;
    
    /**
     * Variable para guardar el segundo operando
     * 
     * @var operando2 double
     */
    private double operando2;
    
    /**
     * Variable para guardar resultado de la operación
     * 
     * @var resultado double
     */
    private double resultado;

    /**
     * Constructor que inicializa los operandos en cero.
     */
    public CalculadoraEjemplo() {
        this.operando1 = 0;
        this.operando2 = 0;
        this.resultado = 0;
    }

    /**
     * Método que pregunta al usuario qué operación desea realizar y llama al
     * método correspondiente.
     */
    public void seleccionar() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Seleccione la operación a realizar:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");

                opcion = scanner.nextInt();

                if (opcion == 5) {
                    break;
                }

                System.out.println("Introduzca el primer número:");
                this.operando1 = pedirNumeroDecimal(sc);
                System.out.println("Introduzca el segundo número:");
                this.operando2 = pedirNumeroDecimal(sc);

                switch (opcion) {
                    case 1 -> {
                        this.resultado = sumar(this.operando1, this.operando2);
                        presentarResultado("suma", this.resultado);
                    }
                    case 2 -> {
                        this.resultado = restar(this.operando1, this.operando2);
                        presentarResultado("resta", this.resultado);
                    }
                    case 3 -> {
                        this.resultado = multiplicar(this.operando1, this.operando2);
                        presentarResultado("multiplicación", this.resultado);
                    }
                    case 4 -> {
                        this.resultado = dividir(this.operando1, this.operando2);
                        presentarResultado("división", this.resultado);
                    }
                    default ->
                        System.out.println("Operación no válida.");
                }
            }
        }
    }

    /**
     * Método que pide al usuario que introduzca un número decimal.
     *
     * @param scanner
     * @return el número decimal introducido por el usuario
     */
    public static double pedirNumeroDecimal(Scanner scanner) {
        return scanner.nextDouble();
    }

    /**
     * Método para sumar los operandos.
     * 
     * @param operando1 Primer operando.
     * @param operando2 Segundo operando.
     * @return Resultado de la suma de los operandos.
     */
    public double sumar(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Método para restar los operandos.
     * 
     * @param operando1 Primer operando.
     * @param operando2 Segundo operando.
     * @return Resultado de la resta de los operandos.
     */
    public double restar(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Método para multiplicar los operandos.
     * 
     * @param operando1 Primer operando.
     * @param operando2 Segundo operando.
     * @return Resultado de la multiplicación de los operandos.
     */
    public double multiplicar(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Método para dividir los operandos.
     * 
     * @param operando1 Primer operando.
     * @param operando2 Segundo operando.
     * @return Resultado de la división de los operandos.
     * @throws ArithmeticException Si el segundo operando es cero.
     */
    public double dividir(double operando1, double operando2) throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Método para obtener el valor del primer operando.
     * 
     * @return Valor del primer operando.
     */
    public double getOperando1() {
        return operando1;
    }

    /**
     * Método para obtener el valor del segundo operando.
     * 
     * @return Valor del segundo operando.
     */
    public double getOperando2() {
        return operando2;
    }

    /**
     * Método para obtener el valor del resultado.
     * 
     * @return Valor del resultado.
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Método que presenta el resultado de las operaciones y les da formato para
     * presentar resultado con dos decimales.
     *
     * @param operacion el nombre de la operación efectuada
     * @param numero el resultado obtenido
     */
    public void presentarResultado(String operacion, double numero) {
        System.out.println("\n\n########################################\n");
        System.out.print("El resultado de la " + operacion + " es: ");
        System.out.printf("%.2f", numero);
        System.out.println("");
        System.out.println("\n########################################\n\n");
    }
}

