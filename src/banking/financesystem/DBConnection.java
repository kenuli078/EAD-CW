/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.financesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author hp
 */
 public class DBConnection {

    public static Connection getConnection() {
          try{

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Trustbankdb",
                "root",
                ""
            );

            return con;

        }
        catch(Exception e){

            System.out.println(e);

            return null;

        }

    }

}
        
    
       
    
    

