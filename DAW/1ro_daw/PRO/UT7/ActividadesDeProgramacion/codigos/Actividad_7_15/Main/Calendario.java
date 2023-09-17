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
class Calendario {
    int año;
    int mes;
    int dia;

    public Calendario(int año, int mes, int dia) {
        if (
                año > 0 
                && mes > 0 
                && mes <= 12 
                && dia > 0 
                && dia <= diasEnMes(mes)
            ) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha inválida");
        }
    }

    public void incrementarDia() {
        if (dia == diasEnMes(mes)) {
            dia = 1;
            incrementaMes();
        } else {
            dia++;
        }
    }

    public void incrementaMes() {
        if (mes == 12) {
            mes = 1;
            incrementarAño(1);
        } else {
            mes++;
        }
    }

    public void incrementarAño(int cantidad) {
        if (cantidad > 0) {
            año += cantidad;
        } else {
            System.out.println("Cantidad inválida");
        }
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

    public boolean iguales(Calendario otraFecha) {
        return (
                año == otraFecha.año 
                && mes == otraFecha.mes 
                && dia == otraFecha.dia
                );
    }

    private int diasEnMes(int mes) {
        return switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
}




