/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author javier
 */
public class Central {

    private Reloj r;
    private Usuario u;
    private String identificador;
    private LocalDate fechaInstal; 
    private Estancia garaje;
    private Estancia salon;
    private Estancia dormitorio;
    
    // Método ejecutar orden

    public Central(Usuario u, String identificador, LocalDate fechaInstal, Estancia garaje, Estancia salon, Estancia dormitorio) {
        this.u = u;
        this.identificador = identificador;
        this.fechaInstal = fechaInstal;
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
    }
    
    public void ejecutarOrden(Comando c){
        
        switch(c.getCodigo()){
            case 0:
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
                
                
        }
        
    }
    
    private void consultarHora(){
        System.out.println(r.getHoraSistema());
    }
    
    private void cambiarHor(){
        r.cambiarHora();
    }
    
    private void consultarFecha(){
        System.out.println(r.getFechaHoy());
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
