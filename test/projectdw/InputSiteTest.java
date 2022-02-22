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
public class InputSiteTest {
    
    public InputSiteTest() {
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
     * Test of getSiteInput method, of class InputSite.
     */
    @Test
    public void testGetSiteInput() {
        System.out.println("getSiteInput");
        InputSite instance = null;
        String expResult = "";
        String result = instance.getSiteInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiteInput method, of class InputSite.
     */
    @Test
    public void testSetSiteInput() {
        System.out.println("setSiteInput");
        String siteInput = "";
        InputSite instance = null;
        instance.setSiteInput(siteInput);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restCall method, of class InputSite.
     */
    @Test
    public void testRestCall() throws Exception {
        System.out.println("restCall");
        InputSite instance = null;
        String expResult = "";
        String result = instance.restCall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
