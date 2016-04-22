/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databas;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import oru.inf.InfDB;

/**
 *
 * @author Ben Baldwin
 */
public class DBClassTest {
    
    public DBClassTest() {
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
     * Test of addPersonToAttendees method, of class DBClass.
     */
    @Test
    public void testAddPersonToAttendees() {
        System.out.println("addPersonToAttendees");
        String meetingID = "";
        String[] arrayPerson = null;
        DBClass instance = new DBClass();
        instance.addPersonToAttendees(meetingID, arrayPerson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAllHired method, of class DBClass.
     */
    @Test
    public void testListAllHired() {
        System.out.println("listAllHired");
        DBClass instance = new DBClass();
        ArrayList<HashMap<String, String>> expResult = null;
        ArrayList<HashMap<String, String>> result = instance.listAllHired();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAllRooms method, of class DBClass.
     */
    @Test
    public void testListAllRooms() {
        System.out.println("listAllRooms");
        DBClass instance = new DBClass();
        ArrayList<HashMap<String, String>> expResult = null;
        ArrayList<HashMap<String, String>> result = instance.listAllRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnDatabase method, of class DBClass.
     */
    @Test
    public void testReturnDatabase() {
        System.out.println("returnDatabase");
        DBClass instance = new DBClass();
        InfDB expResult = null;
        InfDB result = instance.returnDatabase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hamtaAlla method, of class DBClass.
     */
    @Test
    public void testHamtaAlla() {
        System.out.println("hamtaAlla");
        String sql = "";
        DBClass instance = new DBClass();
        ArrayList<HashMap<String, String>> expResult = null;
        ArrayList<HashMap<String, String>> result = instance.hamtaAlla(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class DBClass.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String sql = "";
        DBClass instance = new DBClass();
        String expResult = "";
        String result = instance.getId(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertIntoTableWithAutoIncrement method, of class DBClass.
     */
    @Test
    public void testInsertIntoTableWithAutoIncrement() {
        System.out.println("insertIntoTableWithAutoIncrement");
        String table = "";
        String query = "";
        DBClass instance = new DBClass();
        boolean expResult = false;
        boolean result = instance.insertIntoTableWithAutoIncrement(table, query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomIDfromRoomname method, of class DBClass.
     */
    @Test
    public void testGetRoomIDfromRoomname() {
        System.out.println("getRoomIDfromRoomname");
        String roomname = "";
        DBClass instance = new DBClass();
        String expResult = "";
        String result = instance.getRoomIDfromRoomname(roomname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDateToDate_Time method, of class DBClass.
     */
    @Test
    public void testInsertDateToDate_Time() {
        System.out.println("insertDateToDate_Time");
        ArrayList<String> dates = new ArrayList<String>();
        dates.add("2016-09-07 12:32:00");
        dates.add("2011-04-07 12:40:00");
        DBClass instance = new DBClass();
        String expResult = "Success";
        String result = instance.insertDateToDate_Time(dates);
        assertEquals(expResult, result);
       
    }


    /**
     * Test of addMeetingTime method, of class DBClass.
     */
    @Test
    public void testAddMeetingTime() {
        System.out.println("addMeetingTime");
        String meetingID = "";
        String dateTimeID = "";
        DBClass instance = new DBClass();
        String expResult = "";
        String result = instance.addMeetingTime(meetingID, dateTimeID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMeeting method, of class DBClass.
     */
    @Test
    public void testAddMeeting() {
        System.out.println("addMeeting");
        String title = "";
        String description = "";
        String roomID = "";
        DBClass instance = new DBClass();
        String expResult = "";
        String result = instance.addMeeting(title, description, roomID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMeetingTimeToMeeting method, of class DBClass.
     */
    @Test
    public void testAddMeetingTimeToMeeting() {
        System.out.println("addMeetingTimeToMeeting");
        String meetingID = "";
        String meetingTimeID = "";
        DBClass instance = new DBClass();
        instance.addMeetingTimeToMeeting(meetingID, meetingTimeID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class DBClass.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        String user = "";
        String pass = "";
        DBClass instance = new DBClass();
        boolean expResult = false;
        boolean result = instance.logIn(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hamtaAnstalldPid method, of class DBClass.
     */
    @Test
    public void testHamtaAnstalldPid() {
        System.out.println("hamtaAnstalldPid");
        String namnIn = "";
        DBClass instance = new DBClass();
        String expResult = "";
        String result = instance.hamtaAnstalldPid(namnIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPost method, of class DBClass.
     */
    @Test
    public void testCreatePost() {
        System.out.println("createPost");
        String title = "";
        String text = "";
        int correctForum = 0;
        String ResearchGroup = "";
        DBClass instance = new DBClass();
        instance.createPost(title, text, correctForum, ResearchGroup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hamtaAllNamnPid method, of class DBClass.
     */
    @Test
    public void testHamtaAllNamnPid() {
        System.out.println("hamtaAllNamnPid");
        DBClass instance = new DBClass();
        ArrayList<HashMap<String, String>> expResult = null;
        ArrayList<HashMap<String, String>> result = instance.hamtaAllNamnPid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertIntoTable method, of class DBClass.
     */
    @Test
    public void testInsertIntoTable() {
        System.out.println("insertIntoTable");
        String table = "";
        String query = "";
        DBClass instance = new DBClass();
        boolean expResult = false;
        boolean result = instance.insertIntoTable(table, query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchLoggedInDB method, of class DBClass.
     */
    @Test
    public void testFetchLoggedInDB() {
        System.out.println("fetchLoggedInDB");
        String userNameIn = "";
        DBClass instance = new DBClass();
        int expResult = 0;
        int result = instance.fetchLoggedInDB(userNameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccess method, of class DBClass.
     */
    @Test
    public void testCheckAccess() {
        System.out.println("checkAccess");
        int userID = 0;
        String department = "";
        DBClass instance = new DBClass();
        boolean expResult = false;
        boolean result = instance.checkAccess(userID, department);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
