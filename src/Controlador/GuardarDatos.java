
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class GuardarDatos {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root"; 
    private static final String password = "pandaazul"; 
    
    //Registra los datos de usuario
public static void guardarUsuario(String nombre, String apellido, String telefono, String correo, String contrasenia) 
{ String query = "INSERT INTO Usuario (nombre, apellido, telefono, correo, contrasenia) VALUES (?, ?, ?, ?, ?)"; 

try (Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement statement = connection.prepareStatement(query)) {
        
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, telefono);
        statement.setString(4, correo); 
        statement.setString(5, contrasenia); 
        
    int filasInsertadas = statement.executeUpdate(); 

        if (filasInsertadas > 0)
        {  
            System.out.println("Un nuevo usuario fue insertado exitosamente"); 
        } 
} 
    catch (SQLException e) 
    { 
        e.printStackTrace(); 
    }

}

}
