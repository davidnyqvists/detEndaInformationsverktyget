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
    
    int userID;
    
    //Fetch the ID of the logged in person.
    public void fetchIDofLogIn(String username)
    {
        userID = infDB.fetchLoggedInDB(username);
    }
    
}

