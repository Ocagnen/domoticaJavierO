/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Vista {

    public static void mostrarMenu() {
        Scanner tec = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("¿Que parte del sistema quieres gestionar?");
            System.out.println("1. Hora");
            System.out.println("2. Fecha");
            System.out.println("3. Habitaciones");
            System.out.println("4. Garaje");
            System.out.println("5. Apagar el sistema");

            respuesta = tec.nextInt();
            switch (respuesta) {
                case 3:
                    System.out.println("Selecciona la habitación que consultar");
                    System.out.println("1. Dormitorio");
                    System.out.println("2. Despacho");
                    System.out.println("3. Salon");
                    respuesta = tec.nextInt();

                    System.out.println("Selecciona sistema a gestionar");
                    System.out.println("1. Persiana");
                    System.out.println("2. Cámara");
                    System.out.println("3. Luz");
                    respuesta = tec.nextInt();

                    switch (respuesta) {
                        case 1:
                            System.out.println("Selecciona acción a realizar");
                            System.out.println("1. Consultar estado de persiana");
                            System.out.println("2. Abrir persiana");
                            System.out.println("3. Cerrar persiana");
                            respuesta = tec.nextInt();
                            break;
                        case 2:
                            System.out.println("Selecciona acción a realizar");
                            System.out.println("1. Consultar estado de vigilancia");
                            System.out.println("2. Comenzar vigilancia");
                            System.out.println("3. Finalizar vigilancia");
                            respuesta = tec.nextInt();
                            break;
                        case 3:
                            System.out.println("Selecciona acción a realizar");
                            System.out.println("1. Consultar estado de luz");
                            System.out.println("2. Encender luz");
                            System.out.println("3. Apagar luz");
                            respuesta = tec.nextInt();
                            break;

                    }

                case 4:
                    System.out.println("Introduce accion a realizar");
                    System.out.println("1. Comprobar estado de puerta");
                    System.out.println("2. Abrir puerta");
                    System.out.println("3. Cerrar puerta");
                    respuesta = tec.nextInt();
                    break;

            }
        } while (respuesta != 5);

    }
}
