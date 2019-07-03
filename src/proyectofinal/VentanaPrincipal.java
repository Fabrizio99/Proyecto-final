package proyectofinal;

import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnZonaTematica = new javax.swing.JMenu();
        mnAtraccion = new javax.swing.JMenuItem();
        mnRestaurante = new javax.swing.JMenuItem();
        mnEspectaculo = new javax.swing.JMenuItem();
        mnEntrada = new javax.swing.JMenu();
        mnAyuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parquediversiones.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 119, 119));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("SISTEMA DE REGISTRO DEL PARQUE DE DIVERSIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        jLabel3.setText("jLabel3");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Mantenimiento");

        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnCliente);

        validarZonas();
        mnZonaTematica.setText("Zona Temática");
        mnZonaTematica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mnZonaTematicaFocusGained(evt);
            }
        });
        mnZonaTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnZonaTematicaMousePressed(evt);
            }
        });

        mnAtraccion.setText("Atracción");
        mnAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAtraccionActionPerformed(evt);
            }
        });
        mnZonaTematica.add(mnAtraccion);

        mnRestaurante.setText("Restaurante");
        mnRestaurante.setToolTipText("");
        mnRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRestauranteActionPerformed(evt);
            }
        });
        mnZonaTematica.add(mnRestaurante);

        mnEspectaculo.setText("Espectaculo");
        mnEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEspectaculoActionPerformed(evt);
            }
        });
        mnZonaTematica.add(mnEspectaculo);

        jMenu1.add(mnZonaTematica);

        jMenuBar1.add(jMenu1);

        mnEntrada.setText("Entradas");
        mnEntrada.setEnabled(false);
        mnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnEntradaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnEntradaMousePressed(evt);
            }
        });
        mnEntrada.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mnEntradaPropertyChange(evt);
            }
        });
        jMenuBar1.add(mnEntrada);

        mnAyuda.setText("Ayuda");
        mnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnAyudaMousePressed(evt);
            }
        });
        jMenuBar1.add(mnAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void habilitarMenus(boolean valor){
            mnAtraccion.setEnabled(valor);
            mnRestaurante.setEnabled(valor);
            mnEspectaculo.setEnabled(valor);
            mnEntrada.setEnabled(false);
    }
    public static boolean validarVentaEntradas(){
        if(VentanaRestaurante.registroRestaurante.getTamaño()==0 ||
           VentanaAtraccion.registroAtraccion.getTamano()==0 ||
           VentanaEspectaculo.registroEspectaculo.getTamaño()==0){
            return true;
        }
        return false;
    }
    public static void validarZonas(){
        if(VentanaZonaTematica.registroZonas.getTamano()==0){
            habilitarMenus(false);
            return;
        }
        habilitarMenus(true);
        if(!validarVentaEntradas()){
            mnEntrada.setEnabled(true);
        }
    }
    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        VentanaCliente ventana = new VentanaCliente();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnEntradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnEntradaMousePressed
        if(mnEntrada.isEnabled()){
            VentanaVentaEntrada ventana = new VentanaVentaEntrada();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_mnEntradaMousePressed

    private void mnZonaTematicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnZonaTematicaMousePressed
        VentanaZonaTematica ventana = new VentanaZonaTematica();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnZonaTematicaMousePressed

    private void mnAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAtraccionActionPerformed
            VentanaAtraccion ventana = new VentanaAtraccion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnAtraccionActionPerformed

    private void mnRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRestauranteActionPerformed
        VentanaRestaurante ventana = new VentanaRestaurante();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnRestauranteActionPerformed

    private void mnEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEspectaculoActionPerformed
        VentanaEspectaculo ventana = new VentanaEspectaculo();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnEspectaculoActionPerformed

    private void mnZonaTematicaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mnZonaTematicaFocusGained

    }//GEN-LAST:event_mnZonaTematicaFocusGained

    private void mnEntradaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mnEntradaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_mnEntradaPropertyChange

    private void mnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnEntradaMouseClicked

    }//GEN-LAST:event_mnEntradaMouseClicked

    private void mnAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAyudaMousePressed
        VentanaIntegrantes ventana = new VentanaIntegrantes();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnAyudaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JMenuItem mnAtraccion;
    public static javax.swing.JMenu mnAyuda;
    private javax.swing.JMenuItem mnCliente;
    public static javax.swing.JMenu mnEntrada;
    public static javax.swing.JMenuItem mnEspectaculo;
    public static javax.swing.JMenuItem mnRestaurante;
    private javax.swing.JMenu mnZonaTematica;
    // End of variables declaration//GEN-END:variables
}