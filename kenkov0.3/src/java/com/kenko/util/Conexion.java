
package com.kenko.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/kenko";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection xcon= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //JOptionPane.showMessageDialog(null, "se establecio la conexion");
            return xcon;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: "+ ex.getMessage());
            return null;
        }
        
    }
    public static void close(Connection xcon) {
        try {
            xcon.close();
        } catch (Exception ex) {
          
        }
    }
}