package pizzeriatt;

import java.util.function.UnaryOperator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pizzeriatt.Pizza;
import pizzeriatt.Tipo;
import pizzeriatt.Variedad;
import sun.security.provider.VerificationProvider;

/**
 *
 * @author ITUOM
 */
public class PizzaTest {

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarUnaPizzaDe9Porciones() {
        Pizza unaPizza = new Pizza(9, Tipo.MOLDE, new Variedad("Mozarella", 70));
    }

    @Test
    public void deberiaValer200LaMuzarellaDe8PorcionesAlaParilla() {
        Pizza unaPizza = new Pizza(8, Tipo.PARRILLA, new Variedad("mozarella", 70));
        double valorPizza = unaPizza.getPrecio();
        assertEquals(200, valorPizza, 0.001);
    }

    @Test
    public void deberiaValer245LaPizzaDeMuzarellaDe12PorcionesAElMolde() {
        Pizza unaPizza = new Pizza(12, Tipo.MOLDE, new Variedad("4 Quesos", 70));
        double valorPizza = unaPizza.getPrecio();
        assertEquals(245, valorPizza, 0.001);
    }

    @Test
    public void deberiaValer250LaPizzaDe4QuesosDe12PorcionesAElMolde() {
        Pizza unaPizza = new Pizza(12, Tipo.MOLDE, new Variedad("4 Quesos", 75));
        double valorPizza = unaPizza.getPrecio();
        assertEquals(250, valorPizza, 0.001);
    }

}
