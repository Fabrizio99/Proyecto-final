package proyectofinal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaRestaurante extends javax.swing.JFrame {
    static ListaRestaurante registroRestaurante = new ListaRestaurante();
    static Object[] objeto                      = new Object[5];
    boolean validarNuevo                        = false;
    boolean validarEditar                       = false;
    int indice                                  = 0;
    Restaurante restaur;
    static DefaultTableModel modelo;
    public VentanaRestaurante() {
        initComponents();
        modelo = (DefaultTableModel) tablaRegistro.getModel();
        registroRestaurante.insertarTabla();
        listaRegistroVacia();
        actualizarRegistroZonas();
    }
    @SuppressWarnings("unchecked")
    public static boolean verificarExistenciaElementos(String nombreZona){
        boolean validar=false;
        for (int i = 0; i < registroRestaurante.getTamaño(); i++) {
            if(registroRestaurante.elementoPorIndice(i).getZonaTematica().equals(nombreZona)){
                validar=true;
                break;
            }
        }
        return validar;
    }
    public void actualizarRegistroZonas(){
        cmbZona.removeAllItems();
        cmbZona.addItem("");
        for (int i = 0; i < VentanaZonaTematica.registroZonas.getTamano(); i++) {
            cmbZona.addItem(VentanaZonaTematica.registroZonas.elementoPorIndice(i).getNombre());
        }
    }
    public void habilitarCampos(boolean validador){
        cmpNombre.setEnabled(validador);
        cmpHorario.setEnabled(validador);
        cmpHoraCierre.setEnabled(validador);
        cmpPrecio.setEnabled(validador);
        cmbZona.setEnabled(validador);
        if(validador) cmpNombre.requestFocus();
    }
    
    public void limpiarCampos(){
        cmpNombre.setText("");
        cmpHorario.setText("");
        cmpHoraCierre.setText("");
        cmpPrecio.setText("");
        cmbZona.setSelectedIndex(0);
    }
    
    public void listaRegistroVacia(){
        if(registroRestaurante.esVacia()){
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnGuardar.setEnabled(false);
        }
    }
    
    public void validarBotones(boolean validador){
        btnGuardar.setEnabled(validador);
        btnNuevo.setEnabled(!validador);
        btnEditar.setEnabled(!validador);
        btnEliminar.setEnabled(!validador);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmpHorario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmpPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmpHoraCierre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel2.setText("Nombre *");

        cmpNombre.setEnabled(false);
        cmpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Hora Inicio *");

        cmpHorario.setEnabled(false);
        cmpHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpHorarioKeyTyped(evt);
            }
        });

        jLabel4.setText("Precio Medio *");

        cmpPrecio.setEnabled(false);
        cmpPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpPrecioKeyTyped(evt);
            }
        });

        jLabel5.setText("Zona Temática *");

        cmbZona.setEnabled(false);

        jLabel6.setText("Hora Cierre * ");

        cmpHoraCierre.setEnabled(false);
        cmpHoraCierre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpHoraCierreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbZona, 0, 97, Short.MAX_VALUE)
                            .addComponent(cmpPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpHorario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmpHoraCierre)
                            .addComponent(cmpNombre))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        tablaRegistro.setAutoCreateRowSorter(true);
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Hora Inicio", "Hora Cierre", "Precio Medio", "Zona Temática"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistro);

        jPanel2.setBackground(new java.awt.Color(0, 119, 119));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("REGISTRO RESTAURANTES");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if(VentanaZonaTematica.registroZonas.esVacia()){
            JOptionPane.showMessageDialog(null, "Debe registrar zonas temáticas para poder registrar un Restaurante");
            return;
        }
        habilitarCampos(true);
        validarBotones(true);
        validarNuevo = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cmbZona.getSelectedIndex()==0 || cmpNombre.getText().equals("") || cmpHorario.getText().equals("") || cmpPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todo el formulario");
            return;
        }
        if(validarNuevo){
            restaur = new Restaurante(cmpNombre.getText(), cmpHorario.getText(),cmpHoraCierre.getText(),Double.parseDouble(cmpPrecio.getText()),cmbZona.getSelectedItem()+"");
            registroRestaurante.insertarFinal(restaur);
            validarNuevo = false;
        }
        if(validarEditar){
            registroRestaurante.elementoPorIndice(indice).setNombre(cmpNombre.getText());
            registroRestaurante.elementoPorIndice(indice).setHorarioInicio(cmpHorario.getText());
            registroRestaurante.elementoPorIndice(indice).setHorarioCierre(cmpHoraCierre.getText());
            registroRestaurante.elementoPorIndice(indice).setPrecioMedio(Double.parseDouble(cmpPrecio.getText()));
            registroRestaurante.elementoPorIndice(indice).setZonaTematica(cmbZona.getSelectedItem()+"");
            validarEditar = false;
        }
        validarBotones(false);
        habilitarCampos(false);
        limpiarCampos();
        modelo.setRowCount(0);
        registroRestaurante.insertarTabla();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        indice = tablaRegistro.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un espectaculo para editar.");
            return;
        }
        
        NodoRestaurante datosRestaurante = registroRestaurante.elementoPorIndice(indice);
        cmpNombre.setText(datosRestaurante.getNombre());
        cmpHorario.setText(datosRestaurante.getHorarioInicio());
        cmpHoraCierre.setText(datosRestaurante.getHorarioCierre());
        cmpPrecio.setText(datosRestaurante.getPrecioMedio()+"");
        for (int i = 0; i < cmbZona.getItemCount(); i++) {
            if(datosRestaurante.getZonaTematica().equals(cmbZona.getItemAt(i))) cmbZona.setSelectedIndex(i);
        }
        habilitarCampos(true);
        validarEditar = true;
        validarBotones(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        indice = tablaRegistro.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un Restaurante para eliminar.");
            return;
        }
        
        registroRestaurante.EliminarNodo(indice);
        JOptionPane.showMessageDialog(null, "Espectaculo eliminado");
        modelo.setRowCount(0);
        registroRestaurante.insertarTabla();
        listaRegistroVacia();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpNombreKeyTyped

    private void cmpPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpPrecioKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!='.') evt.consume();
    }//GEN-LAST:event_cmpPrecioKeyTyped

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
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
    }//GEN-LAST:event_jLabel10MousePressed

    private void cmpHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpHorarioKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!=':') evt.consume();
    }//GEN-LAST:event_cmpHorarioKeyTyped

    private void cmpHoraCierreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpHoraCierreKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!=':') evt.consume();
    }//GEN-LAST:event_cmpHoraCierreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JComboBox cmbZona;
    public static javax.swing.JTextField cmpHoraCierre;
    public static javax.swing.JTextField cmpHorario;
    public static javax.swing.JTextField cmpNombre;
    public static javax.swing.JTextField cmpPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
