/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnection;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author Naveen Rajasekara
 */
public class mongoDB {
    public static void main(String[] args) throws Exception {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to Database");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Server is ready");
    }
}
