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
    

    private DBClass infDB;
    
    
    public CurrentLoginHolder()
            {
                infDB = new DBClass();
            }
    

    
    
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
        
        //Test prints
        System.out.print("ID of logged in person: " + CurrentLogin.getId() + "\n");
        System.out.print("Is system admin: "+ CurrentLogin.isSystemAmdmin() + "\n");
        System.out.print("Is Education admin: "+ CurrentLogin.isEducationAdmin() + "\n");
        System.out.print("Is Research admin: "+ CurrentLogin.isResearchAdmin() + "\n");
        System.out.print("Is Education employee: "+ CurrentLogin.isUtbildning() + "\n");
        System.out.print("Is Research employee: "+ CurrentLogin.isForskning() + "\n");
        }
        catch(Exception e)
                {
                    System.out.print(e);
                } 
        
        
    }

    
    
    
    
}

