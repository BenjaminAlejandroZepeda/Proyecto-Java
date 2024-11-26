/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author benja
 */
import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehiculoDatos {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 

    public static Vehiculo obtenerVehiculoPorId(int idVehiculo) {
        
        String query = "SELECT * FROM Vehiculo WHERE id_vehiculo = ?";
        Vehiculo vehiculo = null;
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            statement.setInt(1, idVehiculo); 
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                double precio = rs.getDouble("precio");
                int kilometrosHora = rs.getInt("kilometros_hora");
                          
                vehiculo = new Vehiculo(marca, modelo, capacidad, precio, kilometrosHora); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehiculo;
    }
    
    
    
}
