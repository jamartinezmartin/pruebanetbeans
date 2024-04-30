/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class OperacionesEstadisticasTest {
    
    public OperacionesEstadisticasTest() {
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
     * Test of op3 method, of class OperacionesEstadisticas.
     */
    @Test
    public void testOp3() {
        System.out.println("op3");
        double[] numeros = new double[2];
        numeros[0]=4;
        numeros[1]=2;
                
        double expResult = 3.0;
        double result = OperacionesEstadisticas.op3(numeros);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of op4 method, of class OperacionesEstadisticas.
     */
    @Test
    public void testOp4() {
        System.out.println("op4");
        double[] numeros = null;
        double expResult = 0.0;
        double result = OperacionesEstadisticas.op4(numeros);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
