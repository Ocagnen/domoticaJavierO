/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

/**
 *
 * @author Javier
 */
public class Main {
    public static void main(String[] args) {    
        
        if(Vista.loggin().equals(new Usuario())){
            Vista.mostrarMenu();
        } else {
            System.out.println("Usuario no autorizado");
        }
        
        Garaje g1 = new Garaje();
        System.out.println(g1);
        
        Garaje g2 = new Garaje(2,new Puerta(), 50);
        System.out.println(g2);
    }
}
