/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file582525525454, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

/**
 *
 * @author ITUOM
 */
public class Hora {

    int hora = 0;
    int minutos = 0;

    public Hora(int hora, int minuto) {

        if (hora < 0 || hora > 23) {
            throw new Error("Hora incorrecta");
        }

        if (minuto < 0 || minuto > 59) {
            throw new Error("Minuto incorrecto");
        }

        this.hora = hora;
        this.minutos = minuto;
    }

}
