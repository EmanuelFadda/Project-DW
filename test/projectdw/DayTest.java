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
public class DayTest {
    
    public DayTest() {
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
     * Test of getClosePrice method, of class Day.
     */
    @Test
    public void testGetClosePrice() {
        System.out.println("getClosePrice");
        Day instance = new Day();
        double expResult = 0.0;
        double result = instance.getClosePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeUnixMsec method, of class Day.
     */
    @Test
    public void testGetTimeUnixMsec() {
        System.out.println("getTimeUnixMsec");
        Day instance = new Day();
        long expResult = 0L;
        long result = instance.getTimeUnixMsec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHighestPrice method, of class Day.
     */
    @Test
    public void testGetHighestPrice() {
        System.out.println("getHighestPrice");
        Day instance = new Day();
        double expResult = 0.0;
        double result = instance.getHighestPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLowestPrice method, of class Day.
     */
    @Test
    public void testGetLowestPrice() {
        System.out.println("getLowestPrice");
        Day instance = new Day();
        double expResult = 0.0;
        double result = instance.getLowestPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenPrice method, of class Day.
     */
    @Test
    public void testGetOpenPrice() {
        System.out.println("getOpenPrice");
        Day instance = new Day();
        double expResult = 0.0;
        double result = instance.getOpenPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Day.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Day instance = new Day();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
