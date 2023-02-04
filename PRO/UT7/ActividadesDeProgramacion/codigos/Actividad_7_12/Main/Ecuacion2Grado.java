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
public class Ecuacion2Grado {

    int a = 0;
    int b = 0;
    int c = 0;
    double disc;
    
    void setA(int a){
        this.a = a;
    }    
    void setB(int b){
        this.b = b;
    }    
    void setC(int c){
        this.c = c;
    }

    Ecuacion2Grado(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    String esPositivoDiscriminante() {
        String txt;
        disc = Math.pow(this.b, 2) - (4 * this.a * this.c);
        if (disc > 0) {
            txt = "El discriminante es positivo";
        }
        else if(disc == 0) {
            txt = "El discriminante es igual a 0";
        }else{
            txt = "El discriminante es negativo y la solución no son "
                    + "\nnúmeros reales";
        }
        return txt;
    }
    
    double[] solucion(){
        
        double[] solucion = new double[2];
        esPositivoDiscriminante();
        
        if (disc >= 0){
        solucion[0] = (-this.b + Math.sqrt(disc))/(2*this.a);
        solucion[1] = (-this.b - Math.sqrt(disc))/(2*this.a);
        }else{
        solucion[0] = (-this.b + Math.sqrt(disc))/(2*this.a);
        }
                       
        return solucion;
    }

}
