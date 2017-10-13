/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reroes
 */
public class CalificacionesTest {
    
    public CalificacionesTest() {
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
     * Test of mostrarMensaje method, of class Calificaciones.
     */
    @Test
    public void testMostrarMensaje() {
        System.out.println("mostrarMensaje");
        String nombre = "";
        Calificaciones instance = new Calificaciones();
        
        assertTrue("Error", instance.mostrarMensaje("nombre").equals("NOMBRE"));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
