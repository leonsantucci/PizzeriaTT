/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITUOM
 */
public class HoraTest {

    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarHoraMayorA23() {
        Hora unaHora = new Hora(24, 00);
    }
    
    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarHoraMenorA0() {
        Hora unaHora = new Hora(-1, 00);
    }
    
    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarMinutosMayorA59() {
        Hora unaHora = new Hora(22, 60);
    }
    
    @Test(expected = Error.class)
    public void deberiaDarErrorAlIngresarMinutosMenorA0() {
        Hora unaHora = new Hora(22, -1);
    }

}
