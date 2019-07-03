package proyectofinal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaAtraccion extends javax.swing.JFrame {
    static ListaAtraccion registroAtraccion = new ListaAtraccion();
    static Object[] objeto                      = new Object[6];
    boolean validarNuevo                        = false;
    boolean validarEditar                       = false;
    int indice                                  = 0;
    Atraccion atrac ;
    static DefaultTableModel modelo;
    public VentanaAtraccion() {
        initComponents();
        modelo = (DefaultTableModel) tablaRegistro.getModel();
        registroAtraccion.insertarTabla();
        listaRegistroVacia();
        actualizarRegistroZonas();
    }
    @SuppressWarnings("unchecked")
    public void actualizarRegistroZonas(){
        cmbZona.removeAllItems();
        cmbZona.addItem("");
        for (int i = 0; i < VentanaZonaTematica.registroZonas.getTamano(); i++) {
            cmbZona.addItem(VentanaZonaTematica.registroZonas.elementoPorIndice(i).getNombre());
        }
    }
    public static boolean verificarExistenciaElementos(String nombreZona){
        boolean validar=false;
        for (int i = 0; i < registroAtraccion.getTamano(); i++) {
            if(registroAtraccion.elementoPorIndice(i).getZonaTematica().equals(nombreZona)){
                validar=true;
                break;
            }
        }
        return validar;
    }
    public void habilitarCampos(boolean validador){
        cmpNombre.setEnabled(validador);
        cmpEstatura.setEnabled(validador);
        cmpCapacidad.setEnabled(validador);
        cmpDuracion.setEnabled(validador);
        cmbZona.setEnabled(validador);
        cmpPrecio.setEnabled(validador);
        if(validador) cmpNombre.requestFocus();
    }
    
    public void limpiarCampos(){
        cmpNombre.setText("");
        cmpEstatura.setText("");
        cmpCapacidad.setText("");
        cmpDuracion.setText("");
        cmpPrecio.setText("");
        cmbZona.setSelectedIndex(0);
    }
    
    public void listaRegistroVacia(){
        if(registroAtraccion.esVacia()){
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpEstatura = new javax.swing.JTextField();
        cmpCapacidad = new javax.swing.JTextField();
        cmpDuracion = new javax.swing.JTextField();
        cmbZona = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmpPrecio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel2.setText("Nombre *");

        jLabel3.setText("Estatura Mínima *");

        jLabel4.setText("Capacidad *");

        jLabel5.setText("Duración (Minutos) *");

        jLabel6.setText("Zona Temática *");

        cmpNombre.setEnabled(false);
        cmpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpNombreKeyTyped(evt);
            }
        });

        cmpEstatura.setEnabled(false);
        cmpEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpEstaturaKeyTyped(evt);
            }
        });

        cmpCapacidad.setEnabled(false);
        cmpCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpCapacidadKeyTyped(evt);
            }
        });

        cmpDuracion.setEnabled(false);
        cmpDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpDuracionKeyTyped(evt);
            }
        });

        cmbZona.setEnabled(false);

        jLabel1.setText("Precio *");

        cmpPrecio.setEnabled(false);
        cmpPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpPrecioKeyTyped(evt);
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmpEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(cmpNombre))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpCapacidad)
                            .addComponent(cmpPrecio))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmpCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmpPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmpDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Capacidad", "Estatura Mínima", "Precio", "Duración", "Zona Temática"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(3).setMinWidth(50);
            tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaRegistro.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel2.setBackground(new java.awt.Color(0, 119, 119));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("REGISTRO ATRACCIONES");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if(VentanaZonaTematica.registroZonas.esVacia()){
            JOptionPane.showMessageDialog(null, "Debe registrar zonas temáticas para poder registrar una Atracción");
            return;
        }
        habilitarCampos(true);
        validarBotones(true);
        validarNuevo = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cmbZona.getSelectedIndex()==0 || cmpNombre.getText().equals("") || cmpEstatura.getText().equals("") || cmpDuracion.getText().equals("") || cmpCapacidad.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Llene todo el formulario");
                 return;
        }
        if(validarNuevo){
            atrac = new Atraccion(cmpNombre.getText(),Double.parseDouble(cmpEstatura.getText()),Integer.parseInt(cmpCapacidad.getText()),cmpDuracion.getText(),cmbZona.getSelectedItem()+"",Double.parseDouble(cmpPrecio.getText()));
            registroAtraccion.insertarFinal(atrac);
            validarNuevo = false;
        }
        if(validarEditar){
            registroAtraccion.elementoPorIndice(indice).setNombre(cmpNombre.getText());
            registroAtraccion.elementoPorIndice(indice).setEstatura(Double.parseDouble(cmpEstatura.getText()));
            registroAtraccion.elementoPorIndice(indice).setCapacidad(Integer.parseInt(cmpCapacidad.getText()));
            registroAtraccion.elementoPorIndice(indice).setDuracion(cmpDuracion.getText());
            registroAtraccion.elementoPorIndice(indice).setZonaTematica(cmbZona.getSelectedItem()+"");
            registroAtraccion.elementoPorIndice(indice).setPrecio(Double.parseDouble(cmpPrecio.getText()));
            validarEditar = false;
        }
        VentanaPrincipal.validarZonas();
        validarBotones(false);
        habilitarCampos(false);
        limpiarCampos();
        modelo.setRowCount(0);
        registroAtraccion.insertarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        indice = tablaRegistro.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un espectaculo para editar.");
            return;
        }
        
        NodoAtraccion datosAtraccion = registroAtraccion.elementoPorIndice(indice);
        cmpNombre.setText(datosAtraccion.getNombre());
        cmpEstatura.setText(datosAtraccion.getEstatura()+"");
        cmpDuracion.setText(datosAtraccion.getDuracion());
        cmpCapacidad.setText(datosAtraccion.getCapacidad()+"");
        cmpPrecio.setText(datosAtraccion.getPrecio()+"");
        for (int i = 0; i < cmbZona.getItemCount(); i++) {
            if(datosAtraccion.getZonaTematica().equals(cmbZona.getItemAt(i))) cmbZona.setSelectedIndex(i);
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
        
        registroAtraccion.EliminarNodo(indice);
        JOptionPane.showMessageDialog(null, "Espectaculo eliminado");
        modelo.setRowCount(0);
        registroAtraccion.insertarTabla();
        listaRegistroVacia();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpNombreKeyTyped

    private void cmpDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDuracionKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE) evt.consume();
    }//GEN-LAST:event_cmpDuracionKeyTyped

    private void cmpEstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpEstaturaKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!='.') evt.consume();
    }//GEN-LAST:event_cmpEstaturaKeyTyped

    private void cmpCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpCapacidadKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE) evt.consume();
    }//GEN-LAST:event_cmpCapacidadKeyTyped

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

    private void cmpPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpPrecioKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!='.') evt.consume();
    }//GEN-LAST:event_cmpPrecioKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JComboBox cmbZona;
    public static javax.swing.JTextField cmpCapacidad;
    public static javax.swing.JTextField cmpDuracion;
    public static javax.swing.JTextField cmpEstatura;
    public static javax.swing.JTextField cmpNombre;
    public static javax.swing.JTextField cmpPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
