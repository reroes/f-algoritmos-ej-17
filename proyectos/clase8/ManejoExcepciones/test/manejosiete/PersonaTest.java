/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosiete;

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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of set_nombre method, of class Persona.
     */
    @Test
    public void testSet_nombre() {
        System.out.println("set_nombre");
        String n = "rene";
        Persona instance = null;
        instance.set_nombre(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_apellido method, of class Persona.
     */
    @Test
    public void testSet_apellido() {
        System.out.println("set_apellido");
        String a = "";
        Persona instance = null;
        instance.set_apellido(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_calificaciones method, of class Persona.
     */
    @Test
    public void testSet_calificaciones() {
        System.out.println("set_calificaciones");
        String[] cali = null;
        Persona instance = null;
        instance.set_calificaciones(cali);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_nombre method, of class Persona.
     */
    @Test
    public void testGet_nombre() {
        System.out.println("get_nombre");
        Persona instance = null;
        String expResult = "";
        String result = instance.get_nombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_apellido method, of class Persona.
     */
    @Test
    public void testGet_apellido() {
        System.out.println("get_apellido");
        Persona instance = null;
        String expResult = "";
        String result = instance.get_apellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_calificaciones method, of class Persona.
     */
    @Test
    public void testGet_calificaciones() {
        System.out.println("get_calificaciones");
        Persona instance = null;
        String[] expResult = null;
        String[] result = instance.get_calificaciones();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_promedio method, of class Persona.
     */
    @Test
    public void testGet_promedio() {
        System.out.println("get_promedio");
        Persona instance = null;
        double expResult = 0.0;
        double result = instance.get_promedio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
