package proyectofinal;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class VentanaCliente extends javax.swing.JFrame {
    static ListaCliente registroCliente = new ListaCliente();
    static Object[] objeto       = new Object[5];
    static boolean validarNuevo         = false;
    boolean validarEditar        = false;
    int indice                   = 0;
    Cliente persona;
    static DefaultTableModel modelo;
    
    public VentanaCliente() {
        initComponents();
        modelo = (DefaultTableModel) tablaCliente.getModel();
        registroCliente.insertarTabla();
        listaRegistroVacia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmpApellido = new javax.swing.JTextField();
        cmpDNI = new javax.swing.JTextField();
        cmpNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdbHombre = new javax.swing.JRadioButton();
        rdbMujer = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cmpFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Datos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel2.setText("Nombre *");

        jLabel3.setText("Apellidos *");

        jLabel4.setText("DNI *");

        cmpApellido.setEnabled(false);
        cmpApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpApellidoKeyTyped(evt);
            }
        });

        cmpDNI.setEnabled(false);
        cmpDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpDNIKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpDNIKeyTyped(evt);
            }
        });

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

        jLabel1.setText("Sexo *");

        rdbHombre.setText("Hombre");
        rdbHombre.setEnabled(false);
        rdbHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbHombreActionPerformed(evt);
            }
        });

        rdbMujer.setText("Mujer");
        rdbMujer.setEnabled(false);
        rdbMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMujerActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha Nacimiento (dd/MM/yyyy) *");

        cmpFecha.setEnabled(false);
        cmpFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpFechaActionPerformed(evt);
            }
        });
        cmpFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpFechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbHombre)
                            .addComponent(cmpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbMujer))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rdbHombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbMujer)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Sexo", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(3).setPreferredWidth(35);
        }

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 119, 119));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("REGISTRO CLIENTES");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNombreActionPerformed
    public static void habilitarCampos(boolean validador){
        cmpNombre.setEnabled(validador);
        cmpApellido.setEnabled(validador);
        cmpDNI.setEnabled(validador);
        cmpFecha.setEnabled(validador);
        rdbHombre.setEnabled(validador);
        rdbMujer.setEnabled(validador);
        if(validador) cmpNombre.requestFocus();
    }
    
    public void limpiarCampos(){
        cmpNombre.setText("");
        cmpApellido.setText("");
        cmpDNI.setText("");
        cmpFecha.setText("");
        rdbHombre.setSelected(false);
        rdbMujer.setSelected(false);
    }
    
    public void listaRegistroVacia(){
        if(registroCliente.esVacia()){
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnGuardar.setEnabled(false);
        }
    }
    
    public static void validarBotones(boolean validador){
        btnGuardar.setEnabled(validador);
        btnNuevo.setEnabled(!validador);
        btnEditar.setEnabled(!validador);
        btnEliminar.setEnabled(!validador);
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarCampos(true);
        validarBotones(true);
        validarNuevo = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String sexo = "";
        if(rdbHombre.isSelected())  sexo = rdbHombre.getText();
        if(rdbMujer.isSelected())   sexo = rdbMujer.getText();
        if(cmpNombre.getText().equals("") || cmpApellido.getText().equals("") || cmpDNI.getText().equals("") || sexo.equals("") || cmpFecha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todo el formulario");
                 return;
        }
        if(registroCliente.validarLongitudDNI(cmpDNI.getText())){
            JOptionPane.showMessageDialog(null, "Longitud del DNI debe ser de 8 digitos.");
            return;
        }
        if(validarNuevo){
            if(registroCliente.validarDNI(cmpDNI.getText())){
                JOptionPane.showMessageDialog(null, "Ya existe un cliente con ese DNI registrado.");
                return;
            }
            persona = new Cliente(cmpNombre.getText(), cmpApellido.getText(), cmpDNI.getText(), sexo,cmpFecha.getText());
            registroCliente.insertarFinal(persona);
            validarNuevo = false;
        }
        if(validarEditar){
            if(registroCliente.validarDNI(cmpDNI.getText()) && registroCliente.elementoPorIndice(indice)!=registroCliente.encontrarCliente(cmpDNI.getText())){
                JOptionPane.showMessageDialog(null, "Ya existe un cliente con ese DNI registrado.");
                return;
            }
            registroCliente.elementoPorIndice(indice).setNombre(cmpNombre.getText());
            registroCliente.elementoPorIndice(indice).setApellidos(cmpApellido.getText());
            registroCliente.elementoPorIndice(indice).setDNI(cmpDNI.getText());
            registroCliente.elementoPorIndice(indice).setSexo(sexo);
            registroCliente.elementoPorIndice(indice).setFechaNacimiento(LocalDate.parse(cmpFecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            cmpDNI.setEnabled(true);
            cmpDNI.setEditable(true);
            validarEditar = false;
        }
        validarBotones(false);
        habilitarCampos(false);
        limpiarCampos();
        modelo.setRowCount(0);
        registroCliente.insertarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        indice = tablaCliente.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un cliente para editar.");
            return;
        }
        NodoCLiente datosPersona = registroCliente.elementoPorIndice(indice);
        cmpNombre.setText(datosPersona.getNombre());
        cmpApellido.setText(datosPersona.getApellidos());
        cmpDNI.setText(datosPersona.getDNI());
        String fecha = datosPersona.getFechaNacimiento()+"";
        fecha = fecha.substring(8)+"/"+fecha.substring(5,7)+"/"+fecha.substring(0, 4);
        cmpFecha.setText(fecha);
        if(datosPersona.getSexo().equals(rdbHombre.getText()))  rdbHombre.setSelected(true);
        if(datosPersona.getSexo().equals(rdbMujer.getText()))   rdbMujer.setSelected(true);
        habilitarCampos(true);
        validarEditar = true;
        validarBotones(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        indice = tablaCliente.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un cliente para eliminar.");
            return;
        }
        
        registroCliente.EliminarNodo(indice);
        JOptionPane.showMessageDialog(null, "Cliente eliminado");
        modelo.setRowCount(0);
        registroCliente.insertarTabla();
        listaRegistroVacia();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rdbHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbHombreActionPerformed
        if(rdbHombre.isSelected())  rdbMujer.setSelected(false);
    }//GEN-LAST:event_rdbHombreActionPerformed

    private void rdbMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMujerActionPerformed
        if(rdbMujer.isSelected())  rdbHombre.setSelected(false);
    }//GEN-LAST:event_rdbMujerActionPerformed

    private void cmpFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpFechaActionPerformed

    private void cmpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpNombreKeyTyped

    private void cmpApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpApellidoKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!='ñ' && c!='Ñ' && (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_cmpApellidoKeyTyped

    private void cmpDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDNIKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE) evt.consume();
        
    }//GEN-LAST:event_cmpDNIKeyTyped

    private void cmpFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpFechaKeyTyped
        char c=evt.getKeyChar();
        if((c<'0' || c>'9') && c!=KeyEvent.VK_BACK_SPACE && !!(c!='/')) evt.consume();
    }//GEN-LAST:event_cmpFechaKeyTyped

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        if(validarEditar || validarNuevo){
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sin guardar los cambios? ", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(result==0){
                this.setVisible(false);
                validarEditar = false;
                validarNuevo  = false;
            }
        }else{
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void cmpDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDNIKeyPressed

    }//GEN-LAST:event_cmpDNIKeyPressed

    private void cmpDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDNIKeyReleased
        
    }//GEN-LAST:event_cmpDNIKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JTextField cmpApellido;
    public static javax.swing.JTextField cmpDNI;
    public static javax.swing.JTextField cmpFecha;
    public static javax.swing.JTextField cmpNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JRadioButton rdbHombre;
    public static javax.swing.JRadioButton rdbMujer;
    public static javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}