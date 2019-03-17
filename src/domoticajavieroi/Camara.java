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
public class Camara {
    
    private boolean estado;
    private String ip; // Dirección IP de la cámara

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }
    
    public Camara(){
        
    }

    public boolean isEstado() {
        return estado;
    }
    
    public int encenderCamara(){
        if(!this.estado){
            this.estado=true;
            return 1;
        }
        return -1;
    }
    
    public int apagarCamara(){
        if(this.estado){
            this.estado=false;
            return 1;
        }
        return -1;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String mostrarEstadoCam(){
        
        String est = "";
        
        if(this.estado){
            est = "Encendida";
        } else {
            est = "Apagada";
        }
        
        return est;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Camara{" + "estado=" + mostrarEstadoCam() + ", ip=" + ip + '}';
    }
    
    
    
}
