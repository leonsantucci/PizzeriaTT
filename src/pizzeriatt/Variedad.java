/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

/**
 *
 * @author ITUOM
 */
public class Variedad {
    
    private String nombre;
    private double precio;

    public Variedad(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

   

    public double getPrecio() {
        return precio;
    }
    
    
    
}
