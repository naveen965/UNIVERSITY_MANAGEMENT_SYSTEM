/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityManagementSystem;

import DBconnection.databaseConnection;
import static com.sun.glass.ui.Cursor.setVisible;

/**
 *
 * @author Naveen Rajasekara
 */

public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        databaseConnection databaseconnection = new databaseConnection();
        databaseConnection.connection();
        Main welcome = new Main();
        welcome.setVisible(true);
//        lg.loginActionPerformed(java.awt.event.ActionEvent evt);
    }

//    public static UMS signIn(){
//        setVisible(false);
//        Login object = new Login();
//        object.setVisible(true);
//        return new UMS();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    public static UMS exit(){
//        return exit();
//    }
}
