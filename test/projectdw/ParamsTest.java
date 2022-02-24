/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projectdw;

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
public class ParamsTest {
    
    public ParamsTest() {
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
     * Test of getTicker method, of class Params.
     */
    @Test
    public void testGetTicker() {
        System.out.println("getTicker");
        Params instance = null;
        String expResult = "";
        String result = instance.getTicker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicker method, of class Params.
     */
    @Test
    public void testSetTicker() {
        System.out.println("setTicker");
        String ticker = "";
        Params instance = null;
        instance.setTicker(ticker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStarting_date method, of class Params.
     */
    @Test
    public void testGetStarting_date() {
        System.out.println("getStarting_date");
        Params instance = null;
        String expResult = "";
        String result = instance.getStarting_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStarting_date method, of class Params.
     */
    @Test
    public void testSetStarting_date() {
        System.out.println("setStarting_date");
        String starting_date = "";
        Params instance = null;
        instance.setStarting_date(starting_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnding_date method, of class Params.
     */
    @Test
    public void testGetEnding_date() {
        System.out.println("getEnding_date");
        Params instance = null;
        String expResult = "";
        String result = instance.getEnding_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnding_date method, of class Params.
     */
    @Test
    public void testSetEnding_date() {
        System.out.println("setEnding_date");
        String ending_date = "";
        Params instance = null;
        instance.setEnding_date(ending_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
