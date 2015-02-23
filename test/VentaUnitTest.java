/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Assert;
import org.junit.Test;
import puntoventa.PuntoVenta;


/**
 *
 * @author JULIO
 */
public class VentaUnitTest {
    
    public VentaUnitTest() {
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void nuevaVenta() {
     String cajero = "Juan Perez";
     Integer caja=5;
     PuntoVenta ventaUno= new PuntoVenta(cajero,caja);
        Assert.assertEquals("Juan Perez",ventaUno.getCajero());
        Assert.assertTrue(5 == ventaUno.getCaja());
             
     }
}
