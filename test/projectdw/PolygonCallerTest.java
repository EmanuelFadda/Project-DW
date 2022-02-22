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
public class PolygonCallerTest {
    
    public PolygonCallerTest() {
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
     * Test of getAPIKeyLog method, of class PolygonCaller.
     */
    @Test
    public void testGetAPIKeyLog() {
        System.out.println("getAPIKeyLog");
        PolygonCaller instance = null;
        String expResult = "";
        String result = instance.getAPIKeyLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAPIKeyLog method, of class PolygonCaller.
     */
    @Test
    public void testSetAPIKeyLog() {
        System.out.println("setAPIKeyLog");
        String APIKeyLog = "";
        PolygonCaller instance = null;
        instance.setAPIKeyLog(APIKeyLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStocksTicker method, of class PolygonCaller.
     */
    @Test
    public void testSetStocksTicker() {
        System.out.println("setStocksTicker");
        String stocksTicker = "";
        PolygonCaller instance = null;
        instance.setStocksTicker(stocksTicker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart method, of class PolygonCaller.
     */
    @Test
    public void testSetStart() {
        System.out.println("setStart");
        String start = "";
        PolygonCaller instance = null;
        instance.setStart(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd method, of class PolygonCaller.
     */
    @Test
    public void testSetEnd() {
        System.out.println("setEnd");
        String end = "";
        PolygonCaller instance = null;
        instance.setEnd(end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restCall method, of class PolygonCaller.
     */
    @Test
    public void testRestCall() throws Exception {
        System.out.println("restCall");
        String link = "";
        PolygonCaller instance = null;
        String expResult = "";
        String result = instance.restCall(link);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restCallDataStocks method, of class PolygonCaller.
     */
    @Test
    public void testRestCallDataStocks() throws Exception {
        System.out.println("restCallDataStocks");
        PolygonCaller instance = null;
        String expResult = "";
        String result = instance.restCallDataStocks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restCallInfoStocks method, of class PolygonCaller.
     */
    @Test
    public void testRestCallInfoStocks() throws Exception {
        System.out.println("restCallInfoStocks");
        PolygonCaller instance = null;
        String expResult = "";
        String result = instance.restCallInfoStocks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
