/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 *
 * @author juancfm
 */
public class Punto {

    double x;
    double y;

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void desplazaX(double dX) {
        this.x += dX;
    }

    void desplazaY(double dY) {
        this.y += dY;
    }

    void desplaza(double dX, double dY) {
        desplazaX(dX);
        desplazaY(dY);
    }

    double distanciaEuclidea(Punto otro) {
        double a = Math.pow((otro.x - this.x), 2);
        double b = Math.pow((otro.y - this.y), 2);

        return Math.sqrt(a + b);
    }

    void muestra() {

        System.out.println(this.getClass().getName() + 
                " (" + x + ", " + y + ").");

    }

}
