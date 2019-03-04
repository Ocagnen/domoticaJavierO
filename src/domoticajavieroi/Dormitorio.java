/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

/**
 *
 * @author javier
 */
public class Dormitorio extends Habitacion{
    
    private Orientacion orientacion;

    public Dormitorio(Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
    }      
    

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public String toString() {
        return "Dormitorio{" + "orientacion=" + orientacion + '}';
    }

    
    
    
    
}
