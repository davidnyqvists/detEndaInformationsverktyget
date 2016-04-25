/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databas;
// Test 11:44
/**
 *
 * @author David Nyqvist
 */

//KLASSER VI IMPORTERAR

import grafiskinterface.CurrentLogin;
import grafiskinterface.GrafikHelper;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;

//Klass som anrop till databasen görs




public class DBClass {
    private InfDB idb;
    private HashMap<String, String> primeKeys;
    public DBClass()
    {
    primeKeys = new HashMap<String, String>();
        addPrimeKeys();
        
        
        
        // Anslut till databasen
     try {
            idb = new InfDB(System.getProperty("user.dir") + "\\" + "BOOKFACE.FDB"); // Ändra personID till nuvarande databas
            System.out.println("Uppkopplingen lyckades");
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    
    
    }
    
    /**
     * 
     * @param arrayPerson send in a array with names you want to add to the table Attendees.
     * @param meetingID The meetingID you want to add the persons in.
     */
    public void addPersonToAttendees(String meetingID, String[] arrayPerson) {
        ArrayList<String> personidList = new ArrayList<String>();
        try{
            
            int length = arrayPerson.length;
            
            for (int i = 0; i < length ; ++i){
                String sql1 = "Select PERSONID from PERSON where NAME = '" + arrayPerson[i] + "'";
                String personID = idb.fetchSingle(sql1);
                personidList.add(personID);
                
            }
            for(int i = 0; i < personidList.size(); i++)
            {
                String sql2 = "INSERT INTO ATTENDEES values(" + meetingID + "," + personidList.get(i) + ")";
                idb.insert(sql2);
            }
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
     /**
     * Lists all hired persons and returns them in the form of an 
     * ArrayList<HashMap<String, String>>.
     * @return 
     */
    public ArrayList<HashMap<String, String>> listAllHired()
    {
        String sqlFraga = "select * from ANSTALLD";
        
        try
        {
           ArrayList<HashMap<String, String>> allHired = idb.fetchRows(sqlFraga);
           return allHired;
        }
        catch (InfException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public ArrayList<HashMap<String, String>> listAllRooms()
    {
        String sqlFraga = "select * from ROOM";
        
        try
        {
           ArrayList<HashMap<String, String>> allRooms = idb.fetchRows(sqlFraga);
           return allRooms;
        }
        catch (InfException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public InfDB returnDatabase(){
        return idb;
    }
    //Metod för att hämta alla "" från tabell
    public ArrayList<HashMap<String, String>> hamtaAlla(String sql) {
        //String sqlFraga = sql; // "Select BENAMNING FROM PLATTFORM";
        ArrayList<HashMap<String, String>> lista = new ArrayList<HashMap<String, String>>();

        try {
            lista = idb.fetchRows(sql);

        } catch (InfException e) {
            System.out.println("Något gick fel");
        }
        return lista;
    }
    
    //METOD FÖR ATT HÄMTA information
    public String getId(String sql) {
       String id = "";
       // String sqlFraga = "SELECT PERSONID FROM PERSON WHERE NAME = "
               // + "'" + namnIn + "'";

        //System.out.println("getNameAid() ger " + personID);

        try {
            id = idb.fetchSingle(sql);
        
            System.out.println("Lyckades att hämta namn");
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }

        return id;
    }
    
    //Metod Lägger till nya värden i tabeller med autoinkrementering
    public boolean insertIntoTableWithAutoIncrement(String table, String query) {
        String wholeQuery;
        try {
            System.out.println("tabellnamnet är" +"" +table + "sql frågan in är" + query);
            wholeQuery = "INSERT INTO " + table + " VALUES("
                    + idb.getAutoIncrement(table, "MEETINGID") + ", " + query + ")";
            // + idb.getAutoIncrement(table, primeKeys.get(table)) + ", " + query + ")";
           System.out.println(wholeQuery);
            idb.insert(wholeQuery);
            System.out.println("lyckades uppdatera, ny anstalld tillagd");
            
            return true;
        } catch (InfException e) {
            //JOptionPane.showMessageDialog(null, "Ett fel har uppstått, kontrollera värdena du angett i textfälten");
           
            System.out.println("något gick fel kunde inte lägga till nytt möte");
            return false;
        }
    }
    /**
     * Get the roomid by inserting the room name.
     * @param roomname is the name of the room
     * @return returns the roomID or null.
     */
    public String getRoomIDfromRoomname(String roomname) {
        String sql = "Select ROOMID from ROOM where RNAME ='" +roomname+ "'";
        try {
            String ROOMID = idb.fetchSingle(sql);
            return ROOMID;
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void addCurrentUserToMeeting(int userID, String meetingID){
        
        String sql = "UPDATE MEETING SET personID =" + userID + " where meetingID =" + meetingID;
        
        try {
            idb.update(sql);
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * inserts the date into date_time. Also returns the sql query.
     * @param date A string, and should be in the form: YYYY-MM-dd HH:mm:ss
     * @return Returns the sql query.
     */
    public String insertDateToDate_Time(ArrayList<String> dates) {
        String status = "";
        
        try {
            for (String date : dates) {
                String sql = "INSERT INTO DATE_TIME VALUES("
                    + idb.getAutoIncrement("DATE_TIME", "DATE_TIMEID") + ", '" + date + "')";
                idb.insert(sql);
            status = "Success";
            }
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
            status = "failed";
            return status;
        }
        
        return status;
    }
    
    /**
     * inserts meetingID and datetimeID to the database(MEETING_TIME)
     * @param meetingID
     * @param dateTimeID
     * @return the sql query
     */
    public String addMeetingTime(String meetingID, String dateTimeID) {
        try {
            String sql = "INSERT INTO meeting_time values (" + idb.getAutoIncrement("meeting_time", "MEETING_TIMEID") + ",'" + meetingID + "','" + dateTimeID + "')";
            idb.insert(sql);
            return sql;
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /**
     * Add a meeting. It also returns the sql query
     * @param title
     * @param description
     * @param roomID
     * @return Returns the sql query.
     */
    public String addMeeting (String title, String description, String roomID /*, String personID, String meeting_timeID*/ ) {
        try {
            String sql = "INSERT INTO MEETING (MEETINGID, TITLE, DESCRIPTION, ROOMID) VALUES (" + idb.getAutoIncrement("MEETING", "MEETINGID") + ",'" + title + "'"
                    + ",'" + description + "','" + roomID + "')";
            idb.insert(sql);
            return sql;
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    // Metod Lägger till nyckeltyp kopplat till tabell i HashMap primeKeys;
    private void addPrimeKeys() {
        primeKeys.put("MEETING", "MEETINGID");
        primeKeys.put("MEETING_TIME", "MEETING_TIMEID");
       System.out.println(primeKeys);
    }
    
    public void addMeetingTimeToMeeting (String meetingID, String meetingTimeID){
        String sql = "UPDATE MEETING SET meeting_timeID =" + meetingTimeID + " where meetingID =" + meetingID;
        try {
            
            idb.update(sql);
            
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
           
        }
    
    }
    
    public boolean logIn(String user, String pass) {
            
        String sqlDbPassword = "Select PASSWORD1 from PERSON where username ='" + user + "'";
        
        
        try {
            String dbPassword = idb.fetchSingle(sqlDbPassword);
            if (dbPassword != null && dbPassword.equals(pass)){
                return true;
            }
            else {
                return false;
            }
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
    //METOD FÖR ATT HÄMTA ANSTÄLLDS PERSONID MED MOTSVARANDE NAMN
    public String hamtaAnstalldPid(String namnIn) {
        String namn = "";
        String sqlFraga = "SELECT PERSONID FROM PERSON WHERE NAME = "
                + "'" + namnIn + "'";

        System.out.println("hamtaAnstalldAid() ger " + namn);

        try {
            namn = idb.fetchSingle(sqlFraga);
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }

        return namn;
    }
    
    public void insertTimeChoice (String sql) {
        try {
            idb.insert(sql);
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Method for creating posts. Gets info through parameters and uses these
     * in sql queries.
     * @param title
     * @param text
     * @param correctForum
     * @param ResearchGroup 
     */
    public void createPost(String title, String text, int correctForum, String ResearchGroup)
    {
        try {
            //Inserts the post into the main post table and assigns the post an incremented value.
            String sql = "INSERT INTO POST (POSTID, TITLE, TEXT) VALUES (" + idb.getAutoIncrement("POST", "POSTID") + ",'" + title + "','" + text + "')";
            idb.insert(sql);
            
            //Fetches the incremented value to be used in other post tables.
            Integer idHolder = 0;
            String lastID ="";
            ArrayList<String> allIDs = new ArrayList<String>();
            //Fetches the incremented value to be used in other post tables.
            sql = "SELECT POSTID FROM POST";
            
            //Fetches all the IDs and puts them inside of an ArrayList.
            allIDs = idb.fetchColumn(sql);

            for (String currentId : allIDs)
            {   //Compares if the currentId is bigger then the idHolder.  
                if(Integer.parseInt(currentId) > idHolder)
                {   
                    idHolder = Integer.parseInt(currentId); //Sets the idHolder to the found value.
                }
            }
            
            //Sets the lastID variable to the biggest number found.
            lastID = idHolder.toString();
            
            int personID = CurrentLogin.getId();
            String forum = "";
            
            //Checks which forum that the post will be inserted to.
            if (correctForum == 0)
            {
                //This has it's own method,  due to having an extra column in its table.
                forum = "POST_FORSKNING";
                sql = "INSERT INTO "+forum+" (POSTID, PERSONID, DATE_TIMEID, RESEARCHGROUP) "
                        + "VALUES ("+lastID+", "+personID+", '"+1+"','"+ResearchGroup+"')";
                idb.insert(sql);               
                return;
            }
            else if(correctForum == 1)
                    {
                        forum = "POST_UTBILDNING";
                    }
            else if (correctForum == 2)
            {
                forum = "POST_INFORMAL";
            }
            
            //Inserts the post into it's catigorized table.
            sql = "INSERT INTO "+forum+" (POSTID, PERSONID, DATE_TIMEID) VALUES ("+lastID+", " +personID+", NOW())";
            idb.insert(sql);
        }
        catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /**
     * Method for filling the text boxes with forum posts.
     * @return 
     */
    private ArrayList<String> fillForums()//ADD PARAMETER FOR CHANGING WHAT FORUM TO POST IN.
    {
        
        String sqlResearch = "SELECT POSTID FROM POST_FORSKNING";
        String sql= "SELECT POSTID FROM POST";
        
        ArrayList<String> postIDs = new ArrayList<>(); //Holds the research forum post IDs.
        ArrayList<String> researchPostIDs = new ArrayList<>(); //Holds the forum post ID.
        ArrayList<String> printOutIDs = new ArrayList<>();
        ArrayList<String> posts = new ArrayList<>();
        
        //Loops through all the IDs in both of the lists, compares them, and if they match, they 
        // get added to the printOutIDs, which will fetch the post data.
        try { 
            postIDs = idb.fetchColumn(sql);
            researchPostIDs = idb.fetchColumn(sqlResearch);
            
            for(int i = 0; i < postIDs.size(); i++)
            {
                String currentPostID = postIDs.get(i); //holds the forum current ID in the list.
                
                for(int x = 0; x < researchPostIDs.size(); x++)
                {
                    String currentResearchID = researchPostIDs.get(x); //holds the current ID in the list.
                    
                    if (currentPostID.equals(currentResearchID))
                    {
                        printOutIDs.add(currentResearchID); //adds a matching ID in to the printOutID list.
                    }   
                }    
            }
        
            for (int i = printOutIDs.size(); i < printOutIDs.size(); i--) //Lägg till -1 på size() ifall out of bounds.
            {
                String sqlTitle = "SELECT TITLE FROM POST WHERE POSTID = "+printOutIDs.get(i);
                String sqlText = "SELECT TEXT FROM POST WHERE POSTID = "+printOutIDs.get(i);
                String sqlName = "SELECT NAME\n" +
                                 "FROM PERSON JOIN POST_FORSKNING on POST_FORSKNING.PERSONID = PERSON.PERSONID \n" +
                                 "WHERE POST_FORSKNING.POSTID = " +printOutIDs.get(i)+ "";
                sql = "SELECT RESEARCHGROUP FROM POST_FORSKNING WHERE POSTID = "+printOutIDs.get(i);
                
                String postTitle = idb.fetchSingle(sqlTitle);
                String postText = idb.fetchSingle(sqlText);
                String postResearch = idb.fetchSingle(sql);
                String authorName = idb.fetchSingle(sqlName);
                
                //Orkar inte jobba mer idag. 22/04/2016
                
                //Puts together all the post info into one string.
                String currentPostLayout = "================================================ \n"
                        + "Titel: " + postTitle
                        + "\n Forskningsgrupp: " +postResearch
                        + "Författare: " +authorName+" Datum: ÅÅÅÅ-MM-DD"
                        + "\n" + postText
                        + "\n ================================================";
 
                //Adds the string in to the post arrayList.
                posts.add(currentPostLayout);  
            }
            
            return posts;
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
            return posts;
        }
    }
    
    
    
    
    
    
    
    
    //METOD FÖR ATT HÄMTA ALLA ANSTÄLLDAS NAMN OCH PID 
    public ArrayList<HashMap<String, String>> hamtaAllNamnPid() {
        ArrayList<HashMap<String, String>> lista = new ArrayList<HashMap<String, String>>();
        String sqlFraga = "Select PERSONID,NAME FROM PERSON";

        try {
            ArrayList<HashMap<String, String>> anstalldLista = idb.fetchRows(sqlFraga);
            lista = anstalldLista;
            System.out.println(lista);
        } catch (InfException e) {
            System.out.println("Något gick fel");
        }
        return lista;
    }
    
 // Lägger till nya värden i tabeller
    public boolean insertIntoTable(String table, String query) {
        String wholeQuery = "";
        try {
            wholeQuery = "INSERT INTO " + table + " VALUES("
                    + query + ")";
            idb.insert(wholeQuery);
            System.out.println("lyckades uppdatera");
      
            System.out.println("whole query i try är " + wholeQuery);
            return true;
        } catch (InfException e) {

           
            System.out.println("whole query är " + wholeQuery);
            return false;
        }
        
    }
    
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
    
        //Selects the ID of the person logged in.
        public int fetchLoggedInDB(String userNameIn)
        {
            String strPersonID;
            int intPersonID = 0;
            
        String sqlFraga = "SELECT PERSONID FROM PERSON WHERE USERNAME = "
                + "'" + userNameIn + "'";


        try {
            strPersonID = idb.fetchSingle(sqlFraga);
            
            intPersonID = Integer.parseInt(strPersonID);

            System.out.println("Lyckades att hämta ID");
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }

        return intPersonID;
    }

        
    /*
        Checks the users access.
        @userID = The users id.
        @department = What we want to check agianst.
        */
    public boolean checkAccess(int userID, String department) 
    {
        String sqlFraga = "SELECT PERSONID from " + department + " where PERSONID = " + userID;
        String access = "";

        try {
            access = idb.fetchSingle(sqlFraga);

        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
        
        if(access == null)
            access = "";
            
        //If the user has access, the method returns true, else the method returns false.
        if (access.equals("")) {
            return false;
        } else {
            return true;
        } 
    }
    
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
    
    
    
}
    
        
                 

