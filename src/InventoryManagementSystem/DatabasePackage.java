/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagementSystem;
import java.sql.*;
/**
 *
 * @author amrit
 */
public class DatabasePackage {
 public static Connection getConnection () {

            try {
          Class.forName ("com.mysql.cj.jdbc.Driver"); 
          Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/salesberry","root","");
          return con;
 }
            catch (Exception e) {
System.err.println("Connection error");
return null;
            }
        }
}
