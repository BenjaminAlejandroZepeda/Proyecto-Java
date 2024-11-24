/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author benja
 */
public class VentaGuardar {
    private static final String url = "jdbc:mysql://localhost:3306/motorsportsdata";
    private static final String user = "root";
    private static final String password = "pandaazul";

    public void insertarVenta(int idVehiculo, int idUsuario, String fechaVenta, double precioVenta, String formaPago) {
        String sql = "INSERT INTO Venta (id_vehiculo, id_usuario, fecha_venta, precio_venta, forma_pago) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, idVehiculo);
            statement.setInt(2, idUsuario);
            statement.setDate(3, java.sql.Date.valueOf(fechaVenta));
            statement.setDouble(4, precioVenta);
            statement.setString(5, formaPago);

            statement.executeUpdate();
            System.out.println("Venta insertada correctamente.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }}
}
