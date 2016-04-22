/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

/**
 *
 * @author David Nyqvist
 */
public class ValidateClassOne {
    
      //Metod 2 som kollar om man skrivit in något lösenord   

    public static boolean kollaOmTomt(String inText) {
        boolean test;
        if (inText.isEmpty()) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
    
     //Metod 5 som kollar om längden är mindre än 30 tecken
    public static boolean kollaLangdNamn(String inText) {
        boolean test = false;
        if (inText.length() < 30) {
            test = true;
        } else {
            test = false;
        }
        return test;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
