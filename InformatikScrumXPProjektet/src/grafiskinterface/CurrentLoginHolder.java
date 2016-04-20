/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import databas.DBClass;


/**
 *
 * @author Simon
 */
public class CurrentLoginHolder {
    
   // private static CurrentLogin nuvarandeLogIn; "Behövs ej ddå den är statisk?"
    private static String user;
    private static String pass;
    private DBClass infDB;
    
    
    public CurrentLoginHolder()
            {
                infDB = new DBClass();
            }
    
   
/*
    public void InitieraHoldern(CurrentLogin currentUser, String username, String password) {
        //nuvarandeLogIn = currentUser; "Behövs ej då den är statisk?"
        user = username;
        pass = password;
        currentUser.setEducationAdmin(true);
        currentUser.setResearchAdmin(true);
        currentUser.setSystemAmdmin(true);
        currentUser.setUtbildning(true);
        currentUser.setForskning(true);
    }
    */
    
    
    //Variables that will hold the true/false values before assigning them to
    //the static CurrentLogin class.
    private int userID;
    private boolean isEducationAdmin;
    private boolean isResearchAdmin;
    private boolean isSystemAdmin;
    private boolean isEducation;
    private boolean isResearch;

    
    
    //Fetch the ID of the logged in person.
    public void fetchIDofLogIn(String username)
    {
        try{
            //Fetches the user ID and stores it in "userID".
        userID = infDB.fetchLoggedInDB(username);
        
        //Uses "userID" and a customized string to fetch the correct true/false
        //values with the checkAccess method and stores the value in respective variable.
        isSystemAdmin = infDB.checkAccess(userID, "PERSON_SYSTEM_ADMIN");
        isEducationAdmin = infDB.checkAccess(userID, "PERSON_UTBILDNING_ADMIN");
        isResearchAdmin = infDB.checkAccess(userID, "PERSON_FORSKNING_ADMIN");
        isEducation = infDB.checkAccess(userID, "PERSON_UTBILDNING");
        isResearch = infDB.checkAccess(userID, "PERSON_FORSKNING");
        
        //Sets the CurrentLogin static variables to true/false from the temporary variables.
        CurrentLogin.setSystemAmdmin(isSystemAdmin);
        CurrentLogin.setEducationAdmin(isEducationAdmin);
        CurrentLogin.setResearchAdmin(isResearchAdmin);
        CurrentLogin.setUtbildning(isEducation);
        CurrentLogin.setForskning(isResearch);
        }
        catch(Exception e)
                {
                    System.out.print(e);
                } 
        
        
    }
    
    
    public void test()
        {
            System.out.print("FUCK YOU, YOU STATIC PIECE OF SHIT");
        }
    
    
    
    
}

