
package Vista;
import java.util.ArrayList;
/**
 * @author Benjamin
 * Version 26-11-2024
 */
public class ListaCompra extends javax.swing.JFrame {
    static String dato, nuevoDato;
    ArrayList<String> list;
    
public void dato(String nuevoDato) {
        dato = nuevoDato;
        CorreoText.setText(nuevoDato);
    }

public void setLista(ArrayList<String> list) {
        this.list = list;
        ListaCompras.setListData(list.toArray(new String[0]));
    }

    
    public ListaCompra() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCompras = new javax.swing.JList<>();
        CorreoText = new javax.swing.JLabel();
        rvrev = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ListaCompras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--------------" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 570, 360));

        CorreoText.setForeground(new java.awt.Color(0, 0, 0));
        CorreoText.setText("-------");
        jPanel1.add(CorreoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        rvrev.setForeground(new java.awt.Color(0, 0, 0));
        rvrev.setText("Marca       ||       Modelo       ||         Fecha de Venta       ||      Precio de Venta        ||       Forma de Pago");
        jPanel1.add(rvrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 560, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseno-fondo-abstracto-hd-color-verde-oliva_851755-74064.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 570, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/negro1200(1).JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaV ventana = new ListaV();
        String dat;
        
        dat = CorreoText.getText();
        
        ventana.Cosa(dat);
        
        ventana.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoText;
    private javax.swing.JList<String> ListaCompras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rvrev;
    // End of variables declaration//GEN-END:variables
}
