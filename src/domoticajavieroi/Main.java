/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domoticajavieroi;

import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        Central c1 = new Central(new Reloj(), new Usuario(), "00001", LocalDate.now(), new Garaje(), new Salon(), new Dormitorio());

        boolean usuarioCorrecto = false;
        int intentos = 0;

        usuarioCorrecto = Vista.loggin().equals(c1.getU());

        while (usuarioCorrecto == false && intentos < 4) {
            System.out.println("Usuario o contraseña incorrectos");
            usuarioCorrecto = Vista.loggin().equals(c1.getU());
            intentos++;
        }

        if (usuarioCorrecto) {
            Comando a;
            do {
                a = Vista.mostrarMenu();
                c1.ejecutarOrden(a);
                System.out.println("");
            } while (a != a.APAGAR_SISTEMA);
        }

    }
}
