/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ben Baldwin
 */
public class SkapaMoteTest {
    
    public SkapaMoteTest() {
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
     * Test of insertDateTime method, of class SkapaMote.
     */
    @Test
    public void testreturnDateTimeArray() {
        System.out.println("insertDateTime");
        DefaultListModel<String> thisListModel = new DefaultListModel<String>();
        thisListModel.addElement("11.03.2017, 13:00:00.000");
        thisListModel.addElement("24.04.2016, 08:00:00.000");
        SkapaMote instance = new SkapaMote();
        ArrayList<String> expResult = new ArrayList<String> ();
        expResult.add("11.03.2017, 13:00:00.000");
        expResult.add("24.04.2016, 08:00:00.000");        
        ArrayList<String> result = instance.returnDateTimeArray(thisListModel);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getChoosenDate method, of class SkapaMote.
     */
    @Test
    public void testGetChoosenDate() {
        System.out.println("getChoosenDate");
        SkapaMote instance = new SkapaMote();
        String expResult = "";
        String result = instance.getChoosenDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of laggTillMote method, of class SkapaMote.
     */
    @Test
    public void testLaggTillMote() {
        System.out.println("laggTillMote");
        SkapaMote instance = new SkapaMote();
        String expResult = "";
        String result = instance.laggTillMote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertMEETING_TIME method, of class SkapaMote.
     */
    @Test
    public void testInsertMEETING_TIME() {
        System.out.println("insertMEETING_TIME");
        String meetingID = "";
        String dateTimeID = "";
        SkapaMote instance = new SkapaMote();
        String expResult = "";
        String result = instance.insertMEETING_TIME(meetingID, dateTimeID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDwithOneSplit method, of class SkapaMote.
     */
    @Test
    public void testGetIDwithOneSplit() {
        System.out.println("getIDwithOneSplit");
        String sqlQuery = "";
        SkapaMote instance = new SkapaMote();
        String expResult = "";
        String result = instance.getIDwithOneSplit(sqlQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDwithTwoSplits method, of class SkapaMote.
     */
    @Test
    public void testGetIDwithTwoSplits() {
        System.out.println("getIDwithTwoSplits");
        String sqlQuery = "";
        SkapaMote instance = new SkapaMote();
        String expResult = "";
        String result = instance.getIDwithTwoSplits(sqlQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMeetingTimeToMeeting method, of class SkapaMote.
     */
    @Test
    public void testAddMeetingTimeToMeeting() {
        System.out.println("addMeetingTimeToMeeting");
        String meetingID = "";
        String meetingTimeID = "";
        SkapaMote instance = new SkapaMote();
        instance.addMeetingTimeToMeeting(meetingID, meetingTimeID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of laggTillNamn method, of class SkapaMote.
     */
    @Test
    public void testLaggTillNamn() {
        System.out.println("laggTillNamn");
        SkapaMote instance = new SkapaMote();
        instance.laggTillNamn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRooms method, of class SkapaMote.
     */
    @Test
    public void testAddRooms() {
        System.out.println("addRooms");
        SkapaMote instance = new SkapaMote();
        instance.addRooms();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SkapaMote.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SkapaMote.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnDateTimeArray method, of class SkapaMote.
     */
    @Test
    public void testReturnDateTimeArray() {
        System.out.println("returnDateTimeArray");
        DefaultListModel<String> thisListModel = null;
        SkapaMote instance = new SkapaMote();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.returnDateTimeArray(thisListModel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testgetDateTimeIDsFromTimecodes() {
        System.out.println("getDateTimeIDsFromTimecodes");
        ArrayList<String> thetimes = new ArrayList<String>();
        thetimes.add("15.04.2016, 12:30:00.000");
        thetimes.add("11.03.2017, 13:00:00.000");
        SkapaMote instance = new SkapaMote();
        ArrayList<String> expResult = new ArrayList<String> ();
        expResult.add("1");
        expResult.add("2");
        ArrayList<String> result = instance.getDateTimeIDsFromTimecodes(thetimes);
        assertEquals(expResult, result);
       
    }
}
