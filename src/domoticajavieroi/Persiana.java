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

    private int estado; // 0(cerrada), 1(a la mitad) y 2(abierta)
    private int largo; //cm
    private int ancho; //cm

    public Persiana(int estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }

    public int abrirPersianaCompleta() {
        if (this.estado == 0 || this.estado == 1) {
            this.estado = 2;
            return 1;
        }
        return -1;
    }

    public int dejarPersianaMitad() {
        if (this.estado != 1) {
            this.estado = 1;
            return 1;
        }

        return -1;
    }

    public int cerrarPersiana() {
        if (this.estado != 0) {
            this.estado = 0;
            return 1;
        }
        return -1;
    }

    public void setEstado(int estado) {
        if (estado > 2 || estado < 0) {
            estado = 0;
        }
        this.estado = estado;
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
