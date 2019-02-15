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
public class Reloj {
    
    public static LocalDate fechaHoy(){       
        return LocalDate.now();
        
    }
    
    public static LocalTime horaSistema(){
        return LocalTime.now();
    }
    
}
