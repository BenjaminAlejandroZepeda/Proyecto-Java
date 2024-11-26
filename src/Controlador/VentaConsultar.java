
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author benja
 */


// Busca por un Correo todas las compras y retorna una lista de estas
public class VentaConsultar {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root";
    private static final String password = "pandaazul";

    public ArrayList<String> obtenerVentasPorCorreo(String correo) {
        ArrayList<String> ventas = new ArrayList<>();
        String sql = "SELECT Vehiculo.marca, Vehiculo.modelo, Venta.fecha_venta, Venta.precio_venta, Venta.forma_pago " +
                     "FROM Venta " +
                     "JOIN Usuario ON Venta.id_usuario = Usuario.id_usuario " +
                     "JOIN Vehiculo ON Venta.id_vehiculo = Vehiculo.id_vehiculo " +
                     "WHERE Usuario.correo = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, correo);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                Date fechaVenta = resultSet.getDate("fecha_venta");
                double precioVenta = resultSet.getDouble("precio_venta");
                String formaPago = resultSet.getString("forma_pago");

                //ventas.add("Vehículo: " + marca + " " + modelo + ", Fecha: " + fechaVenta + 
                //          ", Precio: " + precioVenta + ", Forma de Pago: " + formaPago);
                
                ventas.add(marca + "         " + modelo + "          " + fechaVenta + "           " + precioVenta + "         " + formaPago);    
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ventas;
    }

}