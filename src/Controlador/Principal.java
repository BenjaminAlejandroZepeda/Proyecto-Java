
package Controlador;

import Vista.VentanaPrincipal;
import javax.swing.SwingUtilities;
/**
 * ------------------
 * @author Benjamin
 * Version 26-11-2024
 * ------------------
 */
public class Principal {
    public static void main(String[] args) {
        //Ejecuta la ventana principal
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);  });
         
    }
}
