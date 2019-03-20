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

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuertaGaraje() {
        return puertaGaraje;
    }

    public void setPuertaGaraje(Puerta puertaGaraje) {
        this.puertaGaraje = puertaGaraje;
    }
    
    

    /*public void cambiarM2(int nuevo){
    super.setM2(nuevo);
    }
    */
    
    // Ejemplo de acceso a método heredado usando el puntero super, que 
    // apunta a la clase padre de la clase en la que estoy
    @Override
    public String toString() {
        return super.toString() + "\nGaraje: " + "\tCapacidad de vehículos=" + capacidadVehiculos + "\n" + puertaGaraje;
    }
    
    
    
    
}
