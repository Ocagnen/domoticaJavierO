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
public enum Comando {

    // Los tipo ENUM tienen dos caracteristicas fundamentales:
    //1.- El constructor es privado
    //2.- Solo pueden instanciarse con un tipo de objeto concreto
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    CONSULTAR_HORA(1, "Consulta la hora del sistema"),
    
    MODIFICAR_HORA(2,"Modifica la hora de la centralita"),
    CONSULTAR_FECHA(3,"Consulta la fecha del sistema"),
    
    CONSULTAR_ESTADO_DORMITORIO(4,"Consulta el estado general del dormitorio"),
    CONSULTAR_PERSIANA_DORMITORIO(5,"Consulta el estado de la persiana del dormitorio"),
    ABRIR_PERSIANA_DORMITORIO(6,"Abre la persiana del dormitorio"),
    CERRAR_PERSIANA_DORMITORIO(7,"Cierra la persiana del dormitorio"),
    CONSULTAR_CAMARA_DORMITORIO(8,"Consulta el estado de la cámara del dormitorio"),
    ENCENDER_CAMARA_DORMITORIO(9,"Enciende la cámara del dormitorio"),
    APAGAR_CAMARA_DORMITORIO(10,"Apaga la cámara del dormitorio"),
    CONSULTAR_LUZ_DORMITORIO(11, "Consulta el estado de las luces del dormitorio"),
    ENCENDER_LUZ_DORMITORIO(12, "Enciende la luz del dormitorio"),
    APAGAR_LUZ_DORMITORIO(13,"Apaga la luz del dormitorio"),    
    
        
    CONSULTAR_ESTADO_SALON(14,"Consulta el estado general del salón"),
    CONSULTAR_PERSIANA_SALON(15,"Consulta el estado de la persiana del salón"),
    ABRIR_PERSIANA_SALON(16,"Abre la persiana del salón"),
    CERRAR_PERSIANA_SALON(17,"Cierra la persiana del salón"),
    CONSULTAR_CAMARA_SALON(18,"Consulta el estado de la cámara del salón"),
    ENCENDER_CAMARA_SALON(19,"Enciende la cámara del salón"),
    APAGAR_CAMARA_SALON(20,"Apaga la cámara del salón"),
    CONSULTAR_LUZ_SALON(21, "Consulta el estado de las luces del salón"),
    ENCENDER_LUZ_SALON(22, "Enciende la luz del salón"),
    APAGAR_LUZ_SALON(23,"Apaga la luz del salón"),
    
    CONSULTAR_PUERTA_GARAJE(24,"Consulta el estado de la puerta del garaje"),
    ABRIR_PUERTA_GARAJE(25,"Abre la puerta del garaje"),
    CERRAR_PUERTA_GARAJE(26, "Cierra la puerta del garaje");

    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

}
