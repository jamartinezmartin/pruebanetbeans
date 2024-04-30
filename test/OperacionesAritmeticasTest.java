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
public class OperacionesAritmeticasTest {
    
    public OperacionesAritmeticasTest() {
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
     * Test of op1 method, of class OperacionesAritmeticas.
     */
    @Test
    public void testOp1() {
        System.out.println("op1");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = OperacionesAritmeticas.op1(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of op2 method, of class OperacionesAritmeticas.
     */
    @Test
    public void testOp2() {
        System.out.println("op2");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = OperacionesAritmeticas.op2(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
