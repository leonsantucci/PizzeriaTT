/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.function.UnaryOperator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import sun.security.provider.VerificationProvider;

/**
 *
 * @author ITUOM
 */
public class PizzaTest {

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarUnaPizzaDe9Porciones() {
        Pizza unaPizza = new Pizza(new Variedad("muzarella", 70), 9, Tipo.MOLDE);
    }

    @Test
    public void deberiaValer200LaMuzarellaDe8PorcionesAlaParilla() {
        Pizza unaPizza = new Pizza(new Variedad("muzarella", 70), 8, Tipo.PARRILLA);
        double valorPizza = unaPizza.getPrecio();
        assertEquals(200, valorPizza, 0.001);
    }

    @Test
    public void deberiaValer245LaPizzaDeMuzarellaDe12PorcionesAElMolde() {
        Pizza unaPizza = new Pizza(new Variedad("muzarella", 70), 12, Tipo.MOLDE);
        double valorPizza = unaPizza.getPrecio();
        assertEquals(245, valorPizza, 0.001);
    }

    @Test
    public void deberiaValer250LaPizzaDe4QuesosDe12PorcionesAElMolde() {
        Pizza unaPizza = new Pizza(new Variedad("4 QUESOS", 75), 12, Tipo.MOLDE);
        double valorPizza = unaPizza.getPrecio();
        assertEquals(250, valorPizza, 0.001);
    }

}
