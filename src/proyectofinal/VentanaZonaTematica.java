package proyectofinal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaZonaTematica extends javax.swing.JFrame {
    static ListaZonaTematica registroZonas = new ListaZonaTematica();
    static Object[] objeto          = new Object[3];
    boolean validarNuevo            = false;
    boolean validarEditar           = false;
    int indice                      = 0;
    ZonaTematica zona;
    static DefaultTableModel modelo;
    public VentanaZonaTematica() {
        initComponents();
        modelo = (DefaultTableModel) tablaZona.getModel();
        listaRegistroVacia();
        registroZonas.insertarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        cmpColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaZona = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre *");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descripción *");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Color asociado *");

        cmpNombre.setEnabled(false);
        cmpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNombreActionPerformed(evt);
            }
        });
        cmpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpNombreKeyTyped(evt);
            }
        });

        cmpDescripcion.setEnabled(false);
        cmpDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpDescripcionKeyTyped(evt);
            }
        });

        cmpColor.setEnabled(false);
        cmpColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpColorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(cmpDescripcion)
                    .addComponent(cmpColor))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmpColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaZona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Color Asociado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaZona);
        if (tablaZona.getColumnModel().getColumnCount() > 0) {
            tablaZona.getColumnModel().getColumn(0).setMinWidth(90);
            tablaZona.getColumnModel().getColumn(0).setPreferredWidth(90);
            tablaZona.getColumnModel().getColumn(0).setMaxWidth(90);
            tablaZona.getColumnModel().getColumn(2).setMinWidth(100);
            tablaZona.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaZona.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 119, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("REGISTRO ZONAS TEMÁTICAS");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void habilitarCampos(boolean validador){
        cmpNombre.setEnabled(validador);
        cmpDescripcion.setEnabled(validador);
        cmpColor.setEnabled(validador);
        if(validador) cmpNombre.requestFocus();
    }
    public void limpiarCampos(){
        cmpNombre.setText("");
        cmpDescripcion.setText("");
        cmpColor.setText("");
    }
    
    public void listaRegistroVacia(){
        if(registroZonas.esVacia()){
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnGuardar.setEnabled(false);
            VentanaPrincipal.validarZonas();
        }
    }
    
    public void validarBotones(boolean validador){
        btnGuardar.setEnabled(validador);
        btnNuevo.setEnabled(!validador);
        btnEditar.setEnabled(!validador);
        btnEliminar.setEnabled(!validador);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cmpNombre.getText().equals("") || cmpDescripcion.getText().equals("") || cmpColor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todo el formulario");
            return;
        }
        if(validarNuevo){
            zona = new ZonaTematica(cmpNombre.getText(), cmpDescripcion.getText(), cmpColor.getText());
            registroZonas.insertarFinal(zona);
            validarNuevo = false;
        }
        if(validarEditar){
            registroZonas.elementoPorIndice(indice).setNombre(cmpNombre.getText());
            registroZonas.elementoPorIndice(indice).setDescripcion(cmpDescripcion.getText());
            registroZonas.elementoPorIndice(indice).setColorAsociado(cmpColor.getText());
            validarEditar = false;
        }
        validarBotones(false);
        habilitarCampos(false);
        limpiarCampos();
        modelo.setRowCount(0);
        registroZonas.insertarTabla();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarCampos(true);
        validarBotones(true);
        validarNuevo = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        indice = tablaZona.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un Zona para editar.");
            return;
        }
        NodoZonaTematica datosZona = registroZonas.elementoPorIndice(indice);
        cmpNombre.setText(datosZona.getNombre());
        cmpDescripcion.setText(datosZona.getDescripcion());
        cmpColor.setText(datosZona.getColorAsociado());
        habilitarCampos(true);
        validarEditar = true;
        validarBotones(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        indice = tablaZona.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Zona para eliminar.");
            return;
        }
        if(VentanaAtraccion.verificarExistenciaElementos(registroZonas.elementoPorIndice(indice).getNombre()) ||
                VentanaAtraccion.verificarExistenciaElementos(registroZonas.elementoPorIndice(indice).getNombre()) ||
                VentanaAtraccion.verificarExistenciaElementos(registroZonas.elementoPorIndice(indice).getNombre())){
            JOptionPane.showMessageDialog(null, "Existen restaurantes/espectuaculos/restaurantes registrados en esta zona");
            return;
        }
        registroZonas.EliminarNodo(indice);
        JOptionPane.showMessageDialog(null, "Zona eliminado");
        modelo.setRowCount(0);
        registroZonas.insertarTabla();
        listaRegistroVacia();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpNombreKeyTyped

    private void cmpDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDescripcionKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpDescripcionKeyTyped

    private void cmpColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpColorKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpColorKeyTyped

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if(validarEditar || validarNuevo){
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sin guardar los cambios? ", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(result==0){
                this.setVisible(false);
            }
        }else{
            this.setVisible(false);
            validarEditar = false;
            validarNuevo  = false;
        }
    }//GEN-LAST:event_jLabel9MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JTextField cmpColor;
    public static javax.swing.JTextField cmpDescripcion;
    public static javax.swing.JTextField cmpNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaZona;
    // End of variables declaration//GEN-END:variables
}
