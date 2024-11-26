
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class EliminarUsuario {
    
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 
       
    //Recibe un correo y elimina la fila 
public void eliminar(String correo) {
        String eliminarUsuarioSQL = "DELETE FROM Usuario WHERE correo = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement eliminarStatement = connection.prepareStatement(eliminarUsuarioSQL)) {

            // Asignar el correo a la consulta
            eliminarStatement.setString(1, correo);
            int filasAfectadas = eliminarStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Usuario eliminado con éxito.");
            }

        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
}


       

