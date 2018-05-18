/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import java.util.Date;
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
                "14:30",
                30,
                new Pizza(8, Tipo.MOLDE, new Variedad("mozarella", 70)),
                0);
    }

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarUnaPizzaNull() {
        Pedido unPedido = new Pedido("jose",
                "10:20",
                30,
                null,
                0);
    }

    @Test(expected = Error.class)
    public void deberiaDarErrorAlNoIngresarUnNombre() {
        Pedido unPedido = new Pedido("",
                "10:50",
                30,
                unaPizza,
                0);
    }

    @Test
    public void deberiaDar600AlComprar3DeMuzzarella() {
        Pedido unPedido = new Pedido("juan", "13:20", 30, new Pizza(8, Tipo.PARRILLA, new Variedad("mozarella", 70)), 3);
        double precio = unPedido.getPrecio();
        assertEquals(600, precio, 0.001);
    }
    
    @Test
    public void deberiaDar880AlComprar3DeFugazetaDe10PorcionesAlMolde() {
        Pedido unPedido = new Pedido("juan", "15:50", 30, new Pizza(10, Tipo.MOLDE, new Variedad("fugazeta", 60)), 4);
        double precio = unPedido.getPrecio();
        assertEquals(880, precio, 0.001);
    }
    
    @Test
    public void elPedidoDeberiaEstarAtrasado() {
        
        Pedido unPedido = new Pedido("juan", "16:00", 20, new Pizza(8, Tipo.PARRILLA, new Variedad("mozarella", 70)), 3);
        
        boolean estaAtrasado = unPedido.estaAtrasado(new Date());
        
        assertTrue(estaAtrasado);
        

    }

}
