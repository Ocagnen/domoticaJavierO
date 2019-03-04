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
public class Usuario {

    private String nombre;
    private String password;
    
    // Metodo equals y hashcode

    public Usuario() {
        this.nombre = "Javier";
        this.password = "123456";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + '}';
    }
    
    

}
