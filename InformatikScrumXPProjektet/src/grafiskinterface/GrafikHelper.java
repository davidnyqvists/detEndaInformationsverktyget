 
package grafiskinterface;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
/**jj
 *
 * @author Simon Jonas
 */
public class GrafikHelper {
    
    private static JFrame nuvarande;
    private static Main nuvarandeMain;
    
    
    public static void GrafikHelper() {
    
        
}
    public static void InitieraMain() {
        
        nuvarandeMain = new Main();
        nuvarandeMain.setVisible(true);  
    }
    
    public static void InitieraLogIn() {
        
        nuvarande = new LoginScreen();
        nuvarande.setVisible(true);
    }
    
    public static void InitieraAccountManagement() {
        
        nuvarande = new AccountManagement();
        nuvarande.setVisible(true);  
    }
    
    public static void InitieraSkapaMote() {
        
        nuvarande = new SkapaMote();
        nuvarande.setVisible(true);  
    }
    
    public static void InitieraSeMoten() {
        
        nuvarande = new SeMoten();
        nuvarande.setVisible(true);  
    }
    
    public static void DisposeFrame()
    {
        nuvarande.dispose();
    }
    
    public static void DisposeMain()
    {
        nuvarandeMain.dispose();
    }
    
    public static void InitieraCreateNewPost(String param, String forum) {
        new CreateNewPostFrame(param, forum).setVisible(true);
    }
    
    
    public static void fillMainPost()
    {
        nuvarandeMain.fillForumWithPost();
    }
   
    
    
}
