/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VentanaPrincipal;
import javax.swing.SwingUtilities;

/**
 *
 * @author benja
 */
public class Principal {
 
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
              
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);  });
        
        
        
    }
}
