/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projectdw;

import java.util.ArrayList;
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
     * Test of getResults method, of class Elaborations.
     */
    @Test
    public void testGetResults() {
        System.out.println("getResults");
        Elaborations instance = null;
        ArrayList<Day> expResult = null;
        ArrayList<Day> result = instance.getResults();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Elaborations.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Elaborations instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResults method, of class Elaborations.
     */
    @Test
    public void testSetResults() {
        System.out.println("setResults");
        ArrayList<Day> results = null;
        Elaborations instance = null;
        instance.setResults(results);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheoricalMaximum method, of class Elaborations.
     */
    @Test
    public void testGetTheoricalMaximum() {
        System.out.println("getTheoricalMaximum");
        Elaborations instance = null;
        int expResult = 0;
        int result = instance.getTheoricalMaximum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheoricalMaximum method, of class Elaborations.
     */
    @Test
    public void testSetTheoricalMaximum() {
        System.out.println("setTheoricalMaximum");
        int theoricalMaximum = 0;
        Elaborations instance = null;
        instance.setTheoricalMaximum(theoricalMaximum);
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
     * Test of setHowMuch method, of class Elaborations.
     */
    @Test
    public void testSetHowMuch() {
        System.out.println("setHowMuch");
        int howMuch = 0;
        Elaborations instance = null;
        instance.setHowMuch(howMuch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentage method, of class Elaborations.
     */
    @Test
    public void testGetPercentage() {
        System.out.println("getPercentage");
        Elaborations instance = null;
        Double expResult = null;
        Double result = instance.getPercentage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentage method, of class Elaborations.
     */
    @Test
    public void testSetPercentage() {
        System.out.println("setPercentage");
        Double percentage = null;
        Elaborations instance = null;
        instance.setPercentage(percentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequentValues method, of class Elaborations.
     */
    @Test
    public void testGetFrequentValues() {
        System.out.println("getFrequentValues");
        Elaborations instance = null;
        HashMap<Integer, Integer> expResult = null;
        HashMap<Integer, Integer> result = instance.getFrequentValues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequentValues method, of class Elaborations.
     */
    @Test
    public void testSetFrequentValues() {
        System.out.println("setFrequentValues");
        HashMap<Integer, Integer> frequentValues = null;
        Elaborations instance = null;
        instance.setFrequentValues(frequentValues);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTheoreticalMaximum method, of class Elaborations.
     */
    @Test
    public void testCalculateTheoreticalMaximum() {
        System.out.println("calculateTheoreticalMaximum");
        Elaborations instance = null;
        instance.calculateTheoreticalMaximum();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateHowMuch method, of class Elaborations.
     */
    @Test
    public void testCalculateHowMuch() {
        System.out.println("calculateHowMuch");
        Elaborations instance = null;
        instance.calculateHowMuch();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePercentage method, of class Elaborations.
     */
    @Test
    public void testCalculatePercentage() {
        System.out.println("calculatePercentage");
        Elaborations instance = null;
        instance.calculatePercentage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caluculateFrequentValues method, of class Elaborations.
     */
    @Test
    public void testCaluculateFrequentValues() {
        System.out.println("caluculateFrequentValues");
        Elaborations instance = null;
        instance.caluculateFrequentValues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
