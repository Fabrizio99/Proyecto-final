package proyectofinal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEspectaculo extends javax.swing.JFrame {
    static ListaEspectaculo registroEspectaculo = new ListaEspectaculo();
    static Object[] objeto                      = new Object[6];
    boolean validarNuevo                        = false;
    boolean validarEditar                       = false;
    int indice                                  = 0;
    Espectaculo espec;
    static DefaultTableModel modelo;
    
    public VentanaEspectaculo() {
        initComponents();
        modelo = (DefaultTableModel) tablaRegistro.getModel();
        registroEspectaculo.insertarTabla();
        listaRegistroVacia();
        actualizarRegistroZonas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpDuracion = new javax.swing.JTextField();
        cmpAforo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmpPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel2.setText("Nombre *");

        jLabel3.setText("Tipo *");

        jLabel4.setText("Duración *");

        jLabel5.setText("Aforo Máximo *");

        cmpNombre.setEnabled(false);
        cmpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpNombreKeyTyped(evt);
            }
        });

        cmpDuracion.setEnabled(false);
        cmpDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpDuracionKeyTyped(evt);
            }
        });

        cmpAforo.setEnabled(false);
        cmpAforo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpAforoKeyTyped(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Musical", "Magia", "Danza", "Teatro" }));
        cmbTipo.setEnabled(false);

        jLabel6.setText("Zona Temática *");

        cmbZona.setEnabled(false);

        jLabel8.setText("Precio *");

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
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(cmpNombre)
                    .addComponent(cmpPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmpAforo, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(cmbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmpAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmpPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Duración", "Aforo", "Precio", "Zona Temática"
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

        jPanel2.setBackground(new java.awt.Color(0, 119, 119));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("REGISTRO ESPECTÁCULOS");

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
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean verificarExistenciaElementos(String nombreZona){
        boolean validar=false;
        for (int i = 0; i < registroEspectaculo.getTamaño(); i++) {
            if(registroEspectaculo.elementoPorIndice(i).getZonaTematica().equals(nombreZona)){
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
        cmpAforo.setEnabled(validador);
        cmpDuracion.setEnabled(validador);
        cmbTipo.setEnabled(validador);
        cmbZona.setEnabled(validador);
        cmpPrecio.setEnabled(validador);
        if(validador) cmpNombre.requestFocus();
    }
    
    public void limpiarCampos(){
        cmpNombre.setText("");
        cmpAforo.setText("");
        cmpDuracion.setText("");
        cmpPrecio.setText("");
        cmbTipo.setSelectedIndex(0);
        cmbZona.setSelectedIndex(0);
    }
    
    public void listaRegistroVacia(){
        if(registroEspectaculo.esVacia()){
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
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if(VentanaZonaTematica.registroZonas.esVacia()){
            JOptionPane.showMessageDialog(null, "Debe registrar zonas temáticas para poder registrar un Espectáculo");
            return;
        }
        habilitarCampos(true);
        validarBotones(true);
        validarNuevo = true;
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        indice = tablaRegistro.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un espectaculo para editar.");
            return;
        }
        
        NodoEspectaculo datosEspectaculo = registroEspectaculo.elementoPorIndice(indice);
        cmpNombre.setText(datosEspectaculo.getNombre());
        cmpAforo.setText(datosEspectaculo.getAforoMax()+"");
        cmpDuracion.setText(datosEspectaculo.getDuracion()+"");
        cmpPrecio.setText(datosEspectaculo.getPrecio()+"");
        for (int i = 0; i < cmbZona.getItemCount(); i++) {
            if(datosEspectaculo.getZonaTematica().equals(cmbZona.getItemAt(i))) cmbZona.setSelectedIndex(i);
        }
        for (int i = 0; i < cmbTipo.getItemCount(); i++) {
            if(datosEspectaculo.getTipo().equals(cmbTipo.getItemAt(i))) cmbTipo.setSelectedIndex(i);
        }
        habilitarCampos(true);
        validarEditar = true;
        validarBotones(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        indice = tablaRegistro.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un Espectaculo para eliminar.");
            return;
        }
        
        registroEspectaculo.EliminarNodo(indice);
        JOptionPane.showMessageDialog(null, "Espectaculo eliminado");
        modelo.setRowCount(0);
        registroEspectaculo.insertarTabla();
        listaRegistroVacia();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cmbZona.getSelectedIndex()==0 || cmbTipo.getSelectedIndex()==0 || cmpNombre.getText().equals("") || cmpAforo.getText().equals("") || cmpDuracion.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Llene todo el formulario");
                 return;
        }
        if(validarNuevo){
            espec = new Espectaculo(cmpNombre.getText(), cmbTipo.getSelectedItem()+"", cmpDuracion.getText(), Integer.parseInt(cmpAforo.getText()), cmbZona.getSelectedItem()+"",Double.parseDouble(cmpPrecio.getText()));
            registroEspectaculo.insertarFinal(espec);
            validarNuevo = false;
        }
        if(validarEditar){
            registroEspectaculo.elementoPorIndice(indice).setNombre(cmpNombre.getText());
            registroEspectaculo.elementoPorIndice(indice).setTipo(cmbTipo.getSelectedItem()+"");
            registroEspectaculo.elementoPorIndice(indice).setDuracion(cmpDuracion.getText());
            registroEspectaculo.elementoPorIndice(indice).setAforoMax(Integer.parseInt(cmpAforo.getText()));
            registroEspectaculo.elementoPorIndice(indice).setZonaTematica(cmbZona.getSelectedItem()+"");
            registroEspectaculo.elementoPorIndice(indice).setPrecio(Double.parseDouble(cmpPrecio.getText()));
            validarEditar = false;
        }
        validarBotones(false);
        habilitarCampos(false);
        limpiarCampos();
        modelo.setRowCount(0);
        registroEspectaculo.insertarTabla();
        VentanaPrincipal.validarZonas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpNombreKeyTyped

    private void cmpAforoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpAforoKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE) evt.consume();
    }//GEN-LAST:event_cmpAforoKeyTyped

    private void cmpDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDuracionKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!=':') evt.consume();
    }//GEN-LAST:event_cmpDuracionKeyTyped

    private void cmpPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpPrecioKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && c!='.') evt.consume();
    }//GEN-LAST:event_cmpPrecioKeyTyped

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JComboBox cmbTipo;
    public static javax.swing.JComboBox cmbZona;
    public static javax.swing.JTextField cmpAforo;
    public static javax.swing.JTextField cmpDuracion;
    public static javax.swing.JTextField cmpNombre;
    public static javax.swing.JTextField cmpPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
