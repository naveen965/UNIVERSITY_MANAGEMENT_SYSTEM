/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityManagementSystem;

import DBconnection.DatabaseConnection;
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
        DatabaseConnection databaseconnection = new DatabaseConnection();
        DatabaseConnection.connection();
        Main welcome = new Main();
        welcome.setVisible(true);
    }
}
