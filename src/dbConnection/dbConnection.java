/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gceconelli
 */
public class dbConnection {
    
    public static Connection connect() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cervejaria","postgres", "pretocriolao"); 
            return con;
            
        }catch(SQLException error){
            System.out.print(error.getMessage());
            return null;
        }
    }
    
}
