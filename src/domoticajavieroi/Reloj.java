/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Reloj {

    private static LocalDate fechaHoy = LocalDate.now();
    private static LocalTime horaSistema = LocalTime.now();

    public static void cambiarHora() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca hora");
        int hora = teclado.nextInt();
        System.out.println("Introduzca minutos");
        int minutos = teclado.nextInt();
        System.out.println("Introduzca segundos");
        int segundos = teclado.nextInt();
        LocalTime nuevo = LocalTime.of(hora, minutos,segundos);
        horaSistema = nuevo;
    }

    /*public static LocalDate fechaHoy(){       
        return LocalDate.now();
        
    }
    
    public static LocalTime horaSistema(){
        return LocalTime.now();
    }
     */
    public LocalDate getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(LocalDate fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public LocalTime getHoraSistema() {
        return horaSistema;
    }

    public void setHoraSistema(LocalTime horaSistema) {
        this.horaSistema = horaSistema;
    }

    @Override
    public String toString() {
        return "Reloj{" + "fechaHoy=" + fechaHoy + ", horaSistema=" + horaSistema + '}';
    }

}
