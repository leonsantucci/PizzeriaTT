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
public class Pizza {
    
    private int tamanio;
    private Variedad variedadPizza;
    private Tipo tipo;

    public Pizza ( int tamanio, Tipo tipo, Variedad variedad){
        if (tamanio != 8 && tamanio != 10 && tamanio != 12){
            throw new Error("El tamanño solo puede ser 8, 10, 12");
        }
        
        this.variedadPizza = variedad;
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    public double getPrecioPedido (){
        return obtenerPrecioTamanio() +
                obtenerPrecioVariedad()
                + precioTipo();
    }
    
    private double obtenerPrecioTamanio (){
        double precioTamanio = 0;
        if (this.tamanio == 8){
            precioTamanio = 100;
        } else if (this.tamanio == 10){
            precioTamanio = 110;
        } else if (this.tamanio == 12){
            precioTamanio = 125;
        }
        return precioTamanio;
    }
    
    private double precioTipo (){
        double precioTipo = 0;
        if (this.tipo == Tipo.MOLDE){
            precioTipo = 50;
        } else if (this.tipo == Tipo.PIEDRA){
            precioTipo = 40;
        } else if (this.tipo == Tipo.PARRILLA){
            precioTipo = 30;
        }
        return precioTipo;
    }
    
    private double obtenerPrecioVariedad (){
        return variedadPizza.getPrecio();
    }

    public int getTamanio() {
        return tamanio;
    }

    public Variedad getVariedadPizza() {
        return variedadPizza;
    }

    public Tipo getTipo() {
        return tipo;
    }
  

   
    
}
