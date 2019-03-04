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
public class Luz {
    
    private boolean estado;
    private double consumo;

    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }    

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Luz{" + "estado=" + estado + ", consumo=" + consumo + '}';
    }
    
    
    
}
