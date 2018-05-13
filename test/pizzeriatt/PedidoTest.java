/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ITUOM
 */
public class PedidoTest {

    private Pizza unaPizza;

    @Before
    public void objetoUnico() {
        unaPizza = new Pizza(8, Tipo.MOLDE, new Variedad("jamon y morron", 65));
    }

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarCantidadMenorA1() {
        Pedido unPedido = new Pedido("jose",
                new Hora(14, 20),
                30,
                new Pizza(8, Tipo.MOLDE, new Variedad("mozarella", 70)),
                0);
    }

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarUnaPizzaNull() {
        Pedido unPedido = new Pedido("jose",
                new Hora(14, 20),
                30,
                null,
                0);
    }

    @Test(expected = Error.class)
    public void deberiaDarErrorAlNoIngresarUnNombre() {
        Pedido unPedido = new Pedido("",
                new Hora(14, 20),
                30,
                unaPizza,
                0);
    }

    @Test
    public void deberiaDar600AlComprar3DeMuzzarella() {
        Pedido unPedido = new Pedido("juan", new Hora(13, 20), 30, new Pizza(8, Tipo.PARRILLA, new Variedad("mozarella", 70)), 3);
        double precio = unPedido.getPrecio();
        assertEquals(600, precio, 0.001);
    }

}
