
package Vista;

import Controlador.JpanelImage;
import Controlador.VehiculoDatos;
import Controlador.VentaConsultar;
import Modelo.Vehiculo;
import javax.swing.JOptionPane;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class ListaV extends javax.swing.JFrame {

 String datoX = "Disponible";
    private String Cosa, dato;
    
 public void Cosa(String Cosa){
        this.Cosa = Cosa;
        Correo3.setText(Cosa);
    }
 
public void dato(String nuevoDato) {
        dato = nuevoDato;
        Correo3.setText(nuevoDato);
    }
 
private void mostrarDatosVehiculo(int idVehiculo) {
    Vehiculo vehiculo = VehiculoDatos.obtenerVehiculoPorId(idVehiculo);
    
    if (vehiculo != null) {
        PrecioText.setText(String.valueOf(vehiculo.getPrecio()));
        KmText.setText(String.valueOf(vehiculo.getKilometrosHora()));
        CapacidadText.setText(String.valueOf(vehiculo.getCapacidad()));
        MarcaText.setText(vehiculo.getMarca());
        ModeloText.setText(vehiculo.getModelo());
        EstadoText.setText("Disponible"); // Actualizar a "Disponible"
    } else {
        JOptionPane.showMessageDialog(this, "El vehículo con ID " + idVehiculo + " no fue encontrado.");
        EstadoText.setText("No disponible"); // Actualizar a "No disponible"
    }
}
    public ListaV() {
        setTitle("MotorSports");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        PrecioText = new javax.swing.JLabel();
        ModeloText = new javax.swing.JLabel();
        chhec = new javax.swing.JLabel();
        MarcaText = new javax.swing.JLabel();
        EstadoText = new javax.swing.JLabel();
        KmText = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CapacidadText = new javax.swing.JLabel();
        Correo3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 280, 140));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Marca:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 40, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Modelo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, 20));

        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Comprar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        PrecioText.setForeground(new java.awt.Color(0, 0, 0));
        PrecioText.setText("----------");
        jPanel1.add(PrecioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        ModeloText.setForeground(new java.awt.Color(0, 0, 0));
        ModeloText.setText("----------");
        jPanel1.add(ModeloText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        chhec.setForeground(new java.awt.Color(0, 0, 0));
        chhec.setText("Precio:");
        jPanel1.add(chhec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        MarcaText.setForeground(new java.awt.Color(0, 0, 0));
        MarcaText.setText("----------");
        jPanel1.add(MarcaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, -1));

        EstadoText.setForeground(new java.awt.Color(0, 0, 0));
        EstadoText.setText("----------");
        jPanel1.add(EstadoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        KmText.setForeground(new java.awt.Color(0, 0, 0));
        KmText.setText("----------");
        jPanel1.add(KmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Ver Compras");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Km/H:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        CapacidadText.setForeground(new java.awt.Color(0, 0, 0));
        CapacidadText.setText("----------");
        jPanel1.add(CapacidadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        Correo3.setText("-------");
        jPanel1.add(Correo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Estado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Capacidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseno-fondo-abstracto-hd-color-verde-oliva_851755-74064.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 280, 340));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-truffade-thrax-gtao-823054.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 190, 100));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Ver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Ver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Ver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Ver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Ver");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Ver");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-Krieger-762810 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-overflod-entity-xxr-gtao-762500 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 190, 100));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-benefactor-br8-gtao-223952 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Legendary_Motorsport_Actual-_1_.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-progen-t20-gtao-764591 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autos/gta-mag-X80Proto-934566 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/negro1200(1).JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Pantalla.removeAll();  
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-benefactor-br8-gtao-223952.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(1);   

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Pantalla.removeAll();
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-Krieger-762810.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(2);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pantalla.removeAll();  
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-X80Proto-934566.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(3);   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

         if (datoX.equals(EstadoText.getText()))
            {
                RegistrarVenta ventana = new RegistrarVenta();     
                ventana.dato(ModeloText.getText(), PrecioText.getText());
                ventana.Cosa(Correo3.getText());
                ventana.setVisible(true);
                this.setVisible(false); 
            }
         
         else 
         {
            JOptionPane.showMessageDialog(this, "El estado actual no permite la operación.");
         }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Pantalla.removeAll();  
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-overflod-entity-xxr-gtao-762500.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(4);   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        ListaCompra ventana = new ListaCompra();
        VentaConsultar vent = new VentaConsultar();
        ventana.dato(Correo3.getText());
        ventana.setLista(vent.obtenerVentasPorCorreo(Correo3.getText()));
        ventana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Pantalla.removeAll();  
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-progen-t20-gtao-764591.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(5);  
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Pantalla.removeAll();  
        JpanelImage miImagen = new JpanelImage(Pantalla, "/Imagenes/gta-mag-truffade-thrax-gtao-823054.jpg");
        Pantalla.add(miImagen).repaint();
        mostrarDatosVehiculo(6);  
    }//GEN-LAST:event_jButton9ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapacidadText;
    private javax.swing.JLabel Correo3;
    private javax.swing.JLabel EstadoText;
    private javax.swing.JLabel KmText;
    private javax.swing.JLabel MarcaText;
    private javax.swing.JLabel ModeloText;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JLabel PrecioText;
    private javax.swing.JLabel chhec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
