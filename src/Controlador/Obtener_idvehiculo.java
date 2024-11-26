/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author benja
 */

// Recibe el modelo del vehiculo y busca en la tabla que id tiene
public class Obtener_idvehiculo {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root";
    private static final String password = "pandaazul";

    public static int obtenerIdVehiculoPorModelo(String modelo) {
        String query = "SELECT id_vehiculo FROM Vehiculo WHERE modelo = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, modelo);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("id_vehiculo");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Retorna -1 si no se encuentra el vehículo
    }
}
