/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaiso;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Braulio
 */
public class TiendaISOTest {
    
    public TiendaISOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularSubtotal method, of class TiendaISO.
     */
    @Test
    public void testCalcularSubtotal() {
        System.out.println("calcularSubtotal");
        TiendaISO instance = null;
        double expResult = 0.0;
        double result = instance.calcularSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDescuento method, of class TiendaISO.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
        TiendaISO instance = null;
        double expResult = 0.0;
        double result = instance.calcularDescuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotal method, of class TiendaISO.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        TiendaISO instance = null;
        double expResult = 0.0;
        double result = instance.calcularTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TiendaISO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TiendaISO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
