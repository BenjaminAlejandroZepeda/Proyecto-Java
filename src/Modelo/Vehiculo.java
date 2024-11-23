/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author benja
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int capacidad;
    private double precio;
    private int kilometrosHora;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int capacidad, double precio, int kilometrosHora) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.precio = precio;
        this.kilometrosHora = kilometrosHora;
       
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKilometrosHora() {
        return kilometrosHora;
    }

    public void setKilometrosHora(int kilometrosHora) {
        this.kilometrosHora = kilometrosHora;
    }

 
      
}
