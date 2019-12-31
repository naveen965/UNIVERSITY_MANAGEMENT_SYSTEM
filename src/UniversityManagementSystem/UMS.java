/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityManagementSystem;

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
    }
    
}
