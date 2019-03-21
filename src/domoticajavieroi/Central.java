/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Central {

    private Reloj r;
    private Usuario u;
    private String identificador;
    private LocalDate fechaInstal;
    private Garaje garaje;
    private Salon salon;
    private Dormitorio dormitorio;

    public Central(Reloj r, Usuario u, String identificador, LocalDate fechaInstal, Garaje garaje, Salon salon, Dormitorio dormitorio) {
        this.r = r;
        this.u = u;
        this.identificador = identificador;
        this.fechaInstal = fechaInstal;
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
    }

    public void ejecutarOrden(Comando c) {

        switch (c.getCodigo()) {
            case 0:
                System.out.println("Apagando sistema");
                break;
            case 1:
                consultarHora();
                break;
            case 2:
                cambiarHor();
                break;
            case 3:
                consultarFecha();
                break;
            case 4:
                consultarDormitorio();
                break;
            case 5:
                consultarPersiana(this.dormitorio);
                break;
            case 6:
                abrirPersiana(this.dormitorio);
                break;
            case 7:
                mitadPersiana(this.dormitorio);
                break;
            case 8:
                cerrarPersiana(this.dormitorio);
                break;
            case 9:
                consultarCam(this.dormitorio);
                break;
            case 10:
                encenderCam(this.dormitorio);
                break;
            case 11:
                apagarCam(this.dormitorio);
                break;
            case 12:
                consultarLuz(this.dormitorio);
                break;
            case 13:
                encenderLuz(this.dormitorio);
                break;
            case 14:
                apagarLuz(this.dormitorio);
                break;
            case 15:
                consultarSalon();
                break;
            case 16:
                consultarPersiana(this.salon);
                break;
            case 17:
                abrirPersiana(this.salon);
                break;
            case 18:
                mitadPersiana(this.salon);
                break;
            case 19:
                cerrarPersiana(this.salon);
                break;
            case 20:
                consultarCam(this.salon);
                break;
            case 21:
                encenderCam(this.salon);
                break;
            case 22:
                apagarCam(this.salon);
                break;
            case 23:
                consultarLuz(this.salon);
                break;
            case 24:
                encenderLuz(this.salon);
                break;
            case 25:
                apagarLuz(this.salon);
                break;
            case 26:
                consultarPuertaGaraje();
                break;
            case 27:
                abrirPuertaGaraje();
                break;
            case 28:
                cerrarPuertaGaraje();
                break;
            case 29:
                apagarTodasLuces();
                break;
            case 30:
                apagadoEco();
                break;
            case 31:
                mostrarEstadoGeneral();
                break;
            case 32:
                mitadPersiana(this.salon);
                break;
            case 33:
                mitadPersiana(this.dormitorio);
                break;
        }

    }

    private void consultarHora() {
        System.out.println(r.getHoraSistema());
    }

    private void cambiarHor() {
        r.cambiarHora();
    }

    private void consultarFecha() {
        System.out.println(r.getFechaHoy());
    }

    private void consultarDormitorio() {
        System.out.println(dormitorio);
    }

    private void consultarPersiana(Habitacion hab) {
        System.out.println(hab.getPersiana().mostrarEstado());
    }

    private void abrirPersiana(Habitacion hab) {
        hab.getPersiana().abrirPersianaCompleta();
    }

    private void mitadPersiana(Habitacion hab) {
        hab.getPersiana().dejarPersianaMitad();
    }

    private void cerrarPersiana(Habitacion hab) {
        hab.getPersiana().cerrarPersiana();
    }

    private void consultarCam(Habitacion hab) {
        System.out.println(hab.getCamara().mostrarEstadoCam());
    }

    private void encenderCam(Habitacion hab) {

        hab.getCamara().encenderCamara();

        if (comprobarHoras(LocalTime.of(20, 0), LocalTime.of(8, 0)) && !hab.getLuz().isEstado()) {

            hab.getLuz().encenderLuz();

        } else if (comprobarHoras(LocalTime.of(8, 0), LocalTime.of(18, 0)) && !hab.getLuz().isEstado() && hab.getPersiana().getEstado() == 0) {

            hab.getLuz().encenderLuz();
        }

    }

    private boolean comprobarHoras(LocalTime inicio, LocalTime fin) {
        
        return LocalTime.now().isAfter(inicio) && LocalTime.now().isBefore(fin);
    }

    private void apagarCam(Habitacion hab) {
        
        hab.getCamara().apagarCamara();
        
        if(comprobarHoras(LocalTime.of(20, 0),LocalTime.of(8, 0))){
            
            hab.getLuz().apagarLuzManual();
            
        } else if (comprobarHoras(LocalTime.of(8, 0),LocalTime.of(18, 0))){
            
            hab.getLuz().apagarLuzManual();
        }

    }

    private void consultarLuz(Habitacion hab) {
        System.out.println(hab.getLuz().mostrarLuz());
    }

    private void encenderLuz(Habitacion hab) {
        hab.getLuz().encenderLuz();
    }

    private void apagarLuz(Habitacion hab) {
        hab.getLuz().apagarLuzManual();
    }

    private void consultarSalon() {
        System.out.println(salon);
    }

    private void consultarPuertaGaraje() {
        System.out.println(garaje.getPuertaGaraje().estadoPuerta());
    }

    private void abrirPuertaGaraje() {
        garaje.getPuertaGaraje().abrirPuerta();
    }

    private void cerrarPuertaGaraje() {
        garaje.getPuertaGaraje().cerrarPuerta();
    }

    private void apagarTodasLuces() {
        salon.getLuz().apagarLuzManual();
        dormitorio.getLuz().apagarLuzManual();
    }

    private void apagadoEco() {

        LocalTime comienzo = LocalTime.of(8, 0, 0);
        LocalTime fin = LocalTime.of(18, 0, 0);

        if (LocalTime.now().isAfter(comienzo) && LocalTime.now().isBefore(fin)) {
            if (this.dormitorio.getLuz().isEstado() && this.dormitorio.getPersiana().getEstado() == 2) {
                this.apagarLuz(dormitorio);
            }

            if (this.salon.getLuz().isEstado() && this.salon.getPersiana().getEstado() == 2) {
                this.apagarLuz(salon);
            }
        }

    }

    private void mostrarEstadoGeneral() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("ESTADO DE LA VIVIENDA");
        System.out.println("");
        System.out.println("Fecha del sistema: \t" + this.r.getFechaHoy());
        System.out.println("Hora del sistema: \t" + this.r.getHoraSistema());
        System.out.println("");
        System.out.println("Estado de DORMITORIO: \t" + this.dormitorio.toString());        
        System.out.println("");
        System.out.println("Estado de SALÓN: \t" + this.salon.toString());
        System.out.println("");
        System.out.println("Estado de GARAJE: \t" + this.garaje.toString());
        System.out.println("-----------------------------------------------------------");
    }

    public Usuario getU() {
        return u;
    }

    public String getIdentificador() {
        return identificador;
    }

    public LocalDate getFechaInstal() {
        return fechaInstal;
    }

}
