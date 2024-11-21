/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * @author Benjamin zepeda
 * version 20-11-2024
 */
public class ConectorBD {
    
    public static class DataBaseConnector {
    
    private static final String url = "jdbc:mysql://localhost:3306/MotorSportsData";
    private static final String user = "root"; 
    private static final String passwords = "pandaazul"; 
    
    public static Connection conectar(){
    
        Connection conectar = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url, user, passwords);
            System.out.println("Conexion Exitosa");
            
        } catch (Exception e) {
            System.out.println("NO Conecto");
        }
        return conectar;
    }
}
   
    
    
}
