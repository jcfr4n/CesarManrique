/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 * @author juancfm
 */
public class Main {

    /**
     *
     * 7.16. Escribe la clase Punto que representa un punto en el plano (con un
     * componente x y un componente y), con los métodos: 
     * Punto (double x,double): construye un objeto con los datos pasados
     * parámetros. 
     * void desplazax(double dx): incrementa el componente x en la cantidad dx.
     * void desplazaY(double dy): incrementa el componente y en la cantidad dy.
     * void desplaza(double dx, double dy): desplaza ambos componentes según las
     * cantidades dx (en el eje x) y dy (en el componente y). 
     * double distanciaEuclidea(Punto otro): calcula y devuelve la distancia
     * euclidea entre el punto invocante y el punto otro. 
     * void muestra(): muestra por consola la información relativa al punto.
     *
     */
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 4);
        p1.desplazaX(1);
        p1.desplazaY(-2);
        p1.muestra();
        Punto p2 = new Punto(3, 3);

        System.out.println("Distancia: " + p1.distanciaEuclidea(p2));
    }
}
