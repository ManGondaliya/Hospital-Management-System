/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsyatem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnect {
    
    Connection con;
    static  Statement stmt;
    
    public DBConnect() throws ClassNotFoundException
    {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","man2815");
             
             stmt = con.createStatement();
             
             System.out.println(con);
             
         }      
         catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public static void main(String [] args) throws ClassNotFoundException 
    {
       DBConnect obj =  new DBConnect();
    }
    
}
