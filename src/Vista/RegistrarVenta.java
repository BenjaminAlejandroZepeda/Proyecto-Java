
package Vista;
import static Controlador.Obtener_idUsuario.obtenerIdUsuarioPorCorreo;
import static Controlador.Obtener_idvehiculo.obtenerIdVehiculoPorModelo;
import Controlador.VentaGuardar;
import static Controlador.VerificarCorreo.correoExiste;
import javax.swing.JLabel;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class RegistrarVenta extends javax.swing.JFrame {
   String dato;
   String precio;
   
   
  private String Cosa;
    
 public void Cosa(String Cosa){
        this.Cosa = Cosa;
        Correo4.setText(Cosa);
    }

    public RegistrarVenta() {
        setTitle("MotorSports");
        initComponents();
        LocalDate fechaHoy = LocalDate.now();
        
        FechaVenta.setText(fechaHoy.toString());
    }
    public RegistrarVenta(JLabel ModeloVentaText) {
        this.ModeloVentaText = ModeloVentaText;
    }
   
 public void dato(String dato, String precio){
        this.dato = dato;
        this.precio = precio;
        ModeloVentaText.setText(dato);
        PrecioVentaText.setText(precio);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Compr = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PrecioVentaText = new javax.swing.JLabel();
        FormasPago = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Condiciones = new javax.swing.JCheckBox();
        ModeloVentaText = new javax.swing.JLabel();
        FechaVenta = new javax.swing.JLabel();
        Correo4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Compr.setForeground(new java.awt.Color(0, 0, 0));
        Compr.setText("Realizar Compra");
        Compr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprActionPerformed(evt);
            }
        });
        jPanel1.add(Compr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        PrecioVentaText.setForeground(new java.awt.Color(0, 0, 0));
        PrecioVentaText.setText("--------");
        jPanel1.add(PrecioVentaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        FormasPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Crédito", "Tarjeta de Débito", "Transferencia Bancaria", "PayPal", "Efectivo" }));
        FormasPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormasPagoActionPerformed(evt);
            }
        });
        jPanel1.add(FormasPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, -1));

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        Condiciones.setForeground(new java.awt.Color(0, 0, 0));
        Condiciones.setText("Terminos y Condiciones");
        Condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CondicionesActionPerformed(evt);
            }
        });
        jPanel1.add(Condiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 180, -1));

        ModeloVentaText.setForeground(new java.awt.Color(0, 0, 0));
        ModeloVentaText.setText("--------");
        jPanel1.add(ModeloVentaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        FechaVenta.setForeground(new java.awt.Color(0, 0, 0));
        FechaVenta.setText("--------");
        jPanel1.add(FechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        Correo4.setForeground(new java.awt.Color(0, 0, 0));
        Correo4.setText("---------------");
        jPanel1.add(Correo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Forma de pago:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Legendary_Motorsport_Actual-_1_.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseno-fondo-abstracto-hd-color-verde-oliva_851755-74064.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 310, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/negro1200(1).JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprActionPerformed
          if (Condiciones.isSelected()) {
                String modelo = ModeloVentaText.getText();
                String formaDePago = (String) FormasPago.getSelectedItem();
                String precio = PrecioVentaText.getText();
                double precio2 = Double.parseDouble(precio);
                String fechaVenta = FechaVenta.getText();
                String correo = Correo4.getText();
                
                if(correoExiste(correo))
                {
                        JOptionPane.showMessageDialog(this, "Compra confirmada:\n" +
                        modelo + "\n" +
                        "Forma de Pago: " + formaDePago + "\n" +
                        precio + "\n" +
                        fechaVenta);
                
                VentaGuardar Guardar = new VentaGuardar();
                Guardar.insertarVenta(obtenerIdVehiculoPorModelo(modelo), obtenerIdUsuarioPorCorreo(correo) , fechaVenta, precio2, formaDePago);          
                ListaV ventana = new ListaV();
                ventana.dato(Correo4.getText());
                ventana.setVisible(true);
                this.setVisible(false);
                    
                }
                else{
                     JOptionPane.showMessageDialog(this, "Debe Confirmar el Correo.");
                }  
            } else {
              JOptionPane.showMessageDialog(this, "Debe aceptar los términos y condiciones para continuar.");
          }               
    }//GEN-LAST:event_ComprActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ListaV ventana = new ListaV();
        ventana.setVisible(true);
        ventana.dato(Correo4.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FormasPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormasPagoActionPerformed

    }//GEN-LAST:event_FormasPagoActionPerformed

    private void CondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CondicionesActionPerformed

    }//GEN-LAST:event_CondicionesActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compr;
    private javax.swing.JCheckBox Condiciones;
    private javax.swing.JLabel Correo4;
    private javax.swing.JLabel FechaVenta;
    private javax.swing.JComboBox<String> FormasPago;
    private javax.swing.JLabel ModeloVentaText;
    private javax.swing.JLabel PrecioVentaText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
