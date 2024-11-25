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

public class UsuarioContrasenia {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 

    public boolean cambiarContrasenia(String correo, String nuevaContrasenia) {
        String queryActualizar = "UPDATE Usuario SET contrasenia = ? WHERE correo = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement actualizarStmt = connection.prepareStatement(queryActualizar)) {

            // Actualizar la contraseña
            actualizarStmt.setString(1, nuevaContrasenia);
            actualizarStmt.setString(2, correo);
            int filasActualizadas = actualizarStmt.executeUpdate();

            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
}
}
