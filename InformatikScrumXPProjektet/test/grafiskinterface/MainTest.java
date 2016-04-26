/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import databas.DBClass;


/**
 *
 * @author Ben Baldwin
 */
public class MainTest {
    
    private DBClass database = new DBClass();    

    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserInTimeChoicesTable method, of class Main.
     */
    @Test
    public void testIsUserInTimeChoicesTable() {
        System.out.println("isUserInTimeChoicesTable");
        int thisID = 1;
        database.insertExampleDataJonasInTimeChoices();
        Main instance = new Main();
        boolean expResult = true;
        boolean result = instance.isUserInTimeChoicesTable(thisID);
        assertEquals(expResult, result);
        database.deleteExampleDataJonasFromTimeChoices();
    }
    
    
    
}
