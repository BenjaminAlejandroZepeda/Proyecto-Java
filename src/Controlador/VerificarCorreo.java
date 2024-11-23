
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
public class VerificarCorreo {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 

    public static boolean correoExiste(String correo) {
        String query = "SELECT COUNT(*) FROM Usuario WHERE correo = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, correo);
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
