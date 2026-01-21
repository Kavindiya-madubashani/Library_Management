/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author HK smart
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JDBC {
    
    private Connection con;
    
    public Connection  getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library_db",
                    "root",
                    "Minsadi@123"
            );
            
            System.out.println("Database connected Successfully");
            
            }
        
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database Connection Failed: "+ e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        
    }
    
    
}

