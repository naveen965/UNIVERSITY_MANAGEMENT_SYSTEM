/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserStudent;

import DBconnection.DatabaseConnection;
import UserAdmin.AdminMain;
import static com.sun.glass.ui.Cursor.setVisible;

/**
 *
 * @author Naveen Rajasekara
 */
public class UniversityStudent {
    public static void main(String[] args) {
        DatabaseConnection databaseconnection = new DatabaseConnection();
        DatabaseConnection.connection();
        StudentMain welcome = new StudentMain();
        welcome.setVisible(true);
    }
}
