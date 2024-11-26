
package Modelo;
import java.time.LocalDate;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class Venta {
    private Usuario comprador;
    private Vehiculo vehiculo;
    private double precioVenta;
    private LocalDate fechaVenta;
    private String formaPago;

    public Venta() {
    }

    public Venta(Usuario comprador, Vehiculo vehiculo, double precioVenta, LocalDate fechaVenta, String formaPago) {
        this.comprador = comprador;
        this.vehiculo = vehiculo;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.formaPago = formaPago;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    } 
}
