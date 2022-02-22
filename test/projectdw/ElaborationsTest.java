/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projectdw;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexb
 */
public class ElaborationsTest {
    
    public ElaborationsTest() {
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
     * Test of getTheoreticalMaximum method, of class Elaborations.
     */
    @Test
    public void testGetTheoreticalMaximum() {
        System.out.println("getTheoreticalMaximum");
        Elaborations instance = null;
        int expResult = 0;
        int result = instance.getTheoreticalMaximum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHowMuch method, of class Elaborations.
     */
    @Test
    public void testGetHowMuch() {
        System.out.println("getHowMuch");
        Elaborations instance = null;
        int expResult = 0;
        int result = instance.getHowMuch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of percentage method, of class Elaborations.
     */
    @Test
    public void testPercentage() {
        System.out.println("percentage");
        Elaborations instance = null;
        double expResult = 0.0;
        double result = instance.percentage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frequentValues method, of class Elaborations.
     */
    @Test
    public void testFrequentValues() {
        System.out.println("frequentValues");
        Elaborations instance = null;
        HashMap<Double, Double> expResult = null;
        HashMap<Double, Double> result = instance.frequentValues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
