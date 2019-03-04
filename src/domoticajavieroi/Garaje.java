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

//La clase Garaje es un subtipo o subclase de Estancia. Garaje extiende
// (hereda) a(de) Extancia.
public class Garaje extends Estancia {
    
    private int capacidadVehiculos;
    private Puerta puertaGaraje;
    
    // Los constructores son los únicos métodos que no se heredan

    public Garaje(int capacidadVehiculos, Puerta puertaGaraje, int m2) {        
       
        // Llamada al constructor de la clase padre
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puertaGaraje = puertaGaraje;
    }
    
    public Garaje(){
        
        //Llama al constructor por defecto de la clase padre
        super();
        this.capacidadVehiculos=0;
        this.puertaGaraje= new Puerta();
    }
    
    
    
}
