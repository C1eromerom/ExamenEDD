/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eloy011
 */
public class CambiarLongitudIT {
    
    public CambiarLongitudIT() {
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
     * Test of borrar method, of class CambiarLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] vector = null;
        CambiarLongitud instance = new CambiarLongitud();
        instance.borrar(vector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class CambiarLongitud.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int[] vector = null;
        CambiarLongitud instance = new CambiarLongitud();
        instance.insertar(vector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class CambiarLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] v = null;
        CambiarLongitud instance = new CambiarLongitud();
        instance.modificar(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificaElemento method, of class CambiarLongitud.
     */
    @Test
    public void testModificaElemento() {
        System.out.println("ModificaElemento");
        int[] v = null;
        int p = 0;
        CambiarLongitud instance = new CambiarLongitud();
        instance.ModificaElemento(v, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Visualizar method, of class CambiarLongitud.
     */
    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int i = 0;
        int[] vector = null;
        CambiarLongitud instance = new CambiarLongitud();
        String expResult = "";
        String result = instance.Visualizar(i, vector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
