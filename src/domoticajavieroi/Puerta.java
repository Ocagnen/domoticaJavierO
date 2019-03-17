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
public class Puerta {
    
    private boolean estado;
    private int retardo; //segundos ( lo que tarda en abrise/ cerrarse)
    
    // Java crea un constructor por defecto si no implementamos ninguno

    public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }

    public Puerta() {
    }
    
        
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }
    
    public int abrirPuerta(){
        if(!this.estado){
            this.estado = true;
            return 1;
        }
        return -1;
    }
    
    public int cerrarPuerta(){
        if(this.estado){
            this.estado=false;
            return 1;                   
        }
        return -1;
    }
    
    public String estadoPuerta(){
        
        String est = "";
        
        if(this.estado){
            est="Abierta";            
        } else {
            est="Cerrada";
        }
        
        return est;
        
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estadoPuerta() + ", retardo=" + retardo + '}';
    }
    
    
    
    
}
