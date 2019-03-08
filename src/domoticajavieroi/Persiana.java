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
public class Persiana {
    
    private boolean estado;
    private int largo; //cm
    private int ancho; //cm

    public Persiana(boolean estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public int abrirPersiana(){
        if(!this.estado){
            this.estado=true;
            return 1;
        }
        return -1;
    }
    
    public int cerrarPersiana(){
        if(this.estado){
            this.estado=false;
            return 1;
        }
        return -1;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Persiana{" + "estado=" + estado + ", largo=" + largo + ", ancho=" + ancho + '}';
    }
    
        
    
    
}
