/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Variedad {
    
    @Column
    private String nombre;
    @Column
    private double precio;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Variedad() {
    }
    
    public Variedad(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

   

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
