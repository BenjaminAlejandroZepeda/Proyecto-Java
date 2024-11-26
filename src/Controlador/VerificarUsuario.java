
package Controlador;

/**
 * @author Benjamin
 * Version 26-11-2024
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Verifica que existe un Usuario para iniciar Sesion
public class VerificarUsuario {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 

    public static boolean autenticarUsuario(String correo, String contrasenia) {
        String query = "SELECT COUNT(*) FROM Usuario WHERE correo = ? AND contrasenia = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, correo);
            statement.setString(2, contrasenia);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
