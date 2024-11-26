
package Vista;

import Controlador.VerificarUsuario;
import javax.swing.JOptionPane;

/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class Ingreso extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        setTitle("MotorSports");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vrrvrv = new javax.swing.JLabel();
        BorrarCeuinta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vrtevr = new javax.swing.JLabel();
        PassText = new javax.swing.JPasswordField();
        Correo2Text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Legendary_Motorsport_Actual-_1_.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        vrrvrv.setForeground(new java.awt.Color(255, 255, 255));
        vrrvrv.setText("Contraseña:");
        jPanel1.add(vrrvrv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        BorrarCeuinta.setForeground(new java.awt.Color(0, 0, 0));
        BorrarCeuinta.setText("Eliminar Cuenta");
        BorrarCeuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCeuintaActionPerformed(evt);
            }
        });
        jPanel1.add(BorrarCeuinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 160, -1));

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        vrtevr.setForeground(new java.awt.Color(255, 255, 255));
        vrtevr.setText("Correo:");
        jPanel1.add(vrtevr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, -1));
        jPanel1.add(PassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, -1));

        Correo2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correo2TextActionPerformed(evt);
            }
        });
        jPanel1.add(Correo2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, -1));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ntytvnv.JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                         
    String correo = Correo2Text.getText();
    String contrasenia = PassText.getText();
    

    if (correo.isEmpty() || contrasenia.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el correo y la contraseña.");
        return;
    }
    if (!correo.contains("@")) {
        JOptionPane.showMessageDialog(this, "El correo electrónico debe contener '@'.");
        return;
    }
    if (VerificarUsuario.autenticarUsuario(correo, contrasenia)) {
        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
        ListaV ventana = new ListaV();
        ventana.Cosa(Correo2Text.getText());
        ventana.setVisible(true);
        this.setVisible(false);    
    } else {
        JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos. Intente nuevamente.");
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BorrarCeuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCeuintaActionPerformed
        
        BorrarUsuario ventana = new BorrarUsuario();
        ventana.setVisible(true);
        this.setVisible(false);    

       
    }//GEN-LAST:event_BorrarCeuintaActionPerformed

    private void Correo2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correo2TextActionPerformed
       
    }//GEN-LAST:event_Correo2TextActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarCeuinta;
    private javax.swing.JTextField Correo2Text;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel vrrvrv;
    private javax.swing.JLabel vrtevr;
    // End of variables declaration//GEN-END:variables
}
