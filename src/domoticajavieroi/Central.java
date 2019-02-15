/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.time.LocalDate;

/**
 *
 * @author javier
 */
public class Central {

    private Usuario u;
    private int identificador;
    private LocalDate fechaInstal;  
    
    
    
    public Usuario getU() {
        return u;
    }

    public int getIdentificador() {
        return identificador;
    }

    public LocalDate getFechaInstal() {
        return fechaInstal;
    }

}
