package javafxapplication21;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    
     public static Connection connect(){
        
         try {      
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/rony1", "root", "");
            return connection;
             
           
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    }    
}