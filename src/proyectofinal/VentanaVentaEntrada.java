package proyectofinal;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class VentanaVentaEntrada extends javax.swing.JFrame {
    static Object[] objetoEntradas                   = new Object[4];
    static Object[] objetoPrecios                    = new Object[5];
    static ListaEntradasRegistradas registroEntradas = new ListaEntradasRegistradas();
    static ListaRestaurante registroRestaurante      = new ListaRestaurante();
    static ListaEspectaculo registroEspectaculo      = new ListaEspectaculo();
    static ListaAtraccion registroAtraccion          = new ListaAtraccion();
    SpinnerNumberModel modeloSpnGeneral              = new SpinnerNumberModel(0,0,1000,1);
    SpinnerNumberModel modeloSpnNinoAdulto           = new SpinnerNumberModel(0,0,1000,1);
    SpinnerNumberModel modeloSpnRestaurante          = new SpinnerNumberModel(0,0,1000,1);
    SpinnerNumberModel modeloSpnEspectaculo;
    SpinnerNumberModel modeloSpnAtraccion            = new SpinnerNumberModel(0,0,1000,1);
    static DecimalFormat decimal = new DecimalFormat("#.##");
    static DefaultTableModel modeloEntradas;
    static DefaultTableModel modeloPrecios;
    EntradasRegistrados entrada;
    Double entradaGeneral = 10.0;
    Double entradaNinoAdultos = 6.0;
    boolean validadorDescuento = false;
    double descuento = 0;
    public VentanaVentaEntrada() {
        initComponents();
        modeloEntradas = (DefaultTableModel) tablaRegistro.getModel();
        modeloPrecios  = (DefaultTableModel) tablaPrecios.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmpDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JLabel();
        cmpApellido = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        cmpFecha = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmbZonaTematica = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        cmbRestaurante = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        spnRestaurante = new javax.swing.JSpinner();
        btnAnadirRestaurante = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        cmbEspectaculo = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        spnEspectaculo = new javax.swing.JSpinner();
        btnAnadirEspectaculo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        cmbAtraccion = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        spnAtraccion = new javax.swing.JSpinner();
        btnAgregarAtraccion = new javax.swing.JButton();
        btnCargarInfo = new javax.swing.JButton();
        btnCargarEspectaculo = new javax.swing.JButton();
        lblAsientosDisponibles = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        spnNinoAdulto = new javax.swing.JSpinner();
        spnEntradaGeneral = new javax.swing.JSpinner();
        btnComprar = new javax.swing.JButton();
        lblMensajeEntrada = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel10.setText("Oficio");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(893, 664));
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));
        jPanel1.setMaximumSize(new java.awt.Dimension(893, 664));
        jPanel1.setMinimumSize(new java.awt.Dimension(893, 664));
        jPanel1.setPreferredSize(new java.awt.Dimension(893, 664));

        jPanel2.setBackground(new java.awt.Color(0, 119, 119));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("VENTA DE ENTRADAS");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), "Cliente", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel2.setText("DNI");

        cmpDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmpDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpDNIKeyReleased(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        lblApellido.setText("Apellido");

        cmpNombre.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N

        cmpApellido.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N

        lblFecha.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        lblFecha.setText("Fecha Nacimiento");

        cmpFecha.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addGap(18, 18, 18)
                        .addComponent(cmpApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmpDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblFecha)
                        .addGap(18, 18, 18)
                        .addComponent(cmpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(lblFecha)
                        .addComponent(cmpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmpNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido)
                    .addComponent(cmpApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), "Pases", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel15.setText("Zona Temática");

        cmbZonaTematica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbZonaTematica.setEnabled(false);
        cmbZonaTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbZonaTematicaMousePressed(evt);
            }
        });
        cmbZonaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZonaTematicaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel16.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel16.setText("Restaurantes");

        cmbRestaurante.setEnabled(false);
        cmbRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbRestauranteMouseClicked(evt);
            }
        });
        cmbRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRestauranteActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel17.setText("Cantidad");

        spnRestaurante.setEnabled(false);

        btnAnadirRestaurante.setText("Añadir");
        btnAnadirRestaurante.setEnabled(false);
        btnAnadirRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirRestauranteActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel18.setText("Espectáculos");

        cmbEspectaculo.setEnabled(false);
        cmbEspectaculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspectaculoItemStateChanged(evt);
            }
        });
        cmbEspectaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbEspectaculoMousePressed(evt);
            }
        });
        cmbEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspectaculoActionPerformed(evt);
            }
        });
        cmbEspectaculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbEspectaculoKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel19.setText("Cantidad");

        spnEspectaculo.setEnabled(false);

        btnAnadirEspectaculo.setText("Añadir");
        btnAnadirEspectaculo.setEnabled(false);
        btnAnadirEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirEspectaculoActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel20.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel20.setText("Atracción");

        cmbAtraccion.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel21.setText("Cantidad");

        spnAtraccion.setEnabled(false);

        btnAgregarAtraccion.setText("Añadir");
        btnAgregarAtraccion.setEnabled(false);
        btnAgregarAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAtraccionActionPerformed(evt);
            }
        });

        btnCargarInfo.setText("Cargar");
        btnCargarInfo.setEnabled(false);
        btnCargarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarInfoActionPerformed(evt);
            }
        });

        btnCargarEspectaculo.setText("Cargar");
        btnCargarEspectaculo.setEnabled(false);
        btnCargarEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEspectaculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(cmbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCargarInfo)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAnadirRestaurante)
                        .addGap(61, 61, 61)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCargarEspectaculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEspectaculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnadirEspectaculo))
                    .addComponent(lblAsientosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarAtraccion)
                            .addComponent(spnAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(spnAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarAtraccion))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cmbEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCargarEspectaculo))
                            .addComponent(lblAsientosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnadirEspectaculo)
                            .addComponent(spnEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(spnRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnadirRestaurante))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Precio Unitario", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRegistro);

        tablaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUB-TOTAL", "IGV", "OP AGRAVADA", "TOTAL DSCTO", "IMPORTE TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaPrecios);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), "Entrada", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Corbel", 0, 18))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel13.setText("General");

        jLabel14.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        jLabel14.setText("Niños y adultos mayores");

        spnNinoAdulto.setEnabled(false);

        spnEntradaGeneral.setEnabled(false);

        btnComprar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setEnabled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnComprar)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnNinoAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(spnEntradaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGap(18, 18, 18)
                .addComponent(lblMensajeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(spnEntradaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(spnNinoAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblMensajeEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void habilitarCamposEspectaculos(boolean validador){
        cmbEspectaculo.setEnabled(validador);
        spnEspectaculo.setEnabled(validador);
        btnCargarEspectaculo.setEnabled(validador);
        if(validador == false)  spnEspectaculo.setValue(0);
    }
    
    public void habilitarCamposRestaurantes(boolean validador){
        cmbRestaurante.setEnabled(validador);
        spnRestaurante.setEnabled(validador);
        btnAnadirRestaurante.setEnabled(validador);
        if(validador==true)   spnRestaurante.setModel(modeloSpnRestaurante);
        if(validador == false)  spnRestaurante.setValue(0);
    }
    
    public void habilitarCamposAtraccion(boolean validador){
        cmbAtraccion.setEnabled(validador);
        spnAtraccion.setEnabled(validador);
        btnAgregarAtraccion.setEnabled(validador);
        if(validador==true)   spnAtraccion.setModel(modeloSpnAtraccion);
        if(validador == false)  spnAtraccion.setValue(0);
    }
    
    public void habilitarVentaEntradas(boolean validador){
        spnEntradaGeneral.setEnabled(validador);
        spnNinoAdulto.setEnabled(validador);
        btnComprar.setEnabled(validador);
        if(validador){
            spnEntradaGeneral.setModel(modeloSpnGeneral);
            spnNinoAdulto.setModel(modeloSpnNinoAdulto);
        }
    }
    public void habilitarBotonesPago(){
        btnPagar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
    public void actualizarTablas(){
        registroEntradas.insertarTabla();
        modeloPrecios.setRowCount(0);
        double total = registroEntradas.precioTotal();
        objetoPrecios[0] = decimal.format(total*0.82);
        objetoPrecios[1]=decimal.format(total*0.18);
        objetoPrecios[2]=total;
        if(validadorDescuento){
            descuento=total*0.1;
            objetoPrecios[3]=decimal.format(descuento);
        }else{
            objetoPrecios[3] = descuento;
        }
        objetoPrecios[4]=decimal.format(total-descuento);
        modeloPrecios.addRow(objetoPrecios);
    }
    
    public void habilitarEntradasZonas(){
        habilitarVentaEntradas(true);
        cmbZonaTematica.setEnabled(true);
        cmbZonaTematica.removeAllItems();
        cmbZonaTematica.addItem("");
        for (int i = 0; i < VentanaZonaTematica.registroZonas.getTamano(); i++) {
            cmbZonaTematica.addItem(VentanaZonaTematica.registroZonas.elementoPorIndice(i).getNombre());
        }
        btnCargarInfo.setEnabled(true);
    }
    public void validarEspectaculo(ListaEspectaculo registroespectaculo,String ZonaTematica){
        if(!registroespectaculo.existeZonaEspectaculo(ZonaTematica)){
            cmbEspectaculo.setEnabled(false);
            spnEspectaculo.setEnabled(false);
            btnCargarEspectaculo.setEnabled(false);
            btnAnadirEspectaculo.setEnabled(false);
            lblAsientosDisponibles.setText("");
            return;
        }
        cmbEspectaculo.setEnabled(true);
        btnCargarEspectaculo.setEnabled(true);
        registroespectaculo.anadirEspectaculosCombo(ZonaTematica);
    }
    public void validarRestaurante(ListaRestaurante registrorestaurante,String ZonaTematica){
        if(!registrorestaurante.existeZonaRestaurante(ZonaTematica)){
            habilitarCamposRestaurantes(false);
            return;
        }
        habilitarCamposRestaurantes(true);
        registrorestaurante.anadirRestauranteCombo(ZonaTematica);
    }
    public void validarAtraccion(ListaAtraccion registroAtraccion,String ZonaTematica){
        if(!registroAtraccion.existeZonaAtraccion(ZonaTematica)){
            habilitarCamposAtraccion(false);
            return;
        }
        habilitarCamposAtraccion(true);
        registroAtraccion.anadirAtraccionCombo(ZonaTematica);
    }
    public boolean encontrarCliente(ListaCliente cliente){
        cliente = VentanaCliente.registroCliente;
        boolean validador=false;
        for (int i = 0; i < cliente.getTamaño(); i++) {
            if(cliente.elementoPorIndice(i).getDNI().equals(cmpDNI.getText())){
                validador = true;
                break;
            }
        }
        return validador;
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!VentanaCliente.registroCliente.existeCliente(cmpDNI.getText())){
            int result = JOptionPane.showConfirmDialog(null, "No existe el cliente. ¿Desea registrarlo?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(result==1){
                return;
            }
            VentanaCliente cliente = new VentanaCliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
            VentanaCliente.cmpDNI.setText(cmpDNI.getText());
            VentanaCliente.habilitarCampos(true);
            VentanaCliente.validarBotones(true);
            VentanaCliente.validarNuevo = true;
            return;
        }
        validadorDescuento = VentanaCliente.registroCliente.cumpleanosCliente(cmpDNI.getText());
        NodoCLiente cliente = VentanaCliente.registroCliente.encontrarCliente(cmpDNI.getText());
        cmpNombre.setText(cliente.getNombre());
        cmpApellido.setText(cliente.getApellidos());
        cmpFecha.setText(cliente.getFechaNacimiento()+"");
        cmpDNI.setText("");
        btnBuscar.setEnabled(false);
        habilitarEntradasZonas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbZonaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZonaTematicaActionPerformed

    }//GEN-LAST:event_cmbZonaTematicaActionPerformed

    private void cmbZonaTematicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbZonaTematicaMousePressed

    }//GEN-LAST:event_cmbZonaTematicaMousePressed

    private void btnCargarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarInfoActionPerformed
        lblAsientosDisponibles.setText("");
        if(cmbZonaTematica.getSelectedIndex()==0){
            habilitarCamposRestaurantes(false);
            habilitarCamposAtraccion(false);
            habilitarCamposEspectaculos(false);
            JOptionPane.showMessageDialog(null, "Escoja una zona temática para cargar.");
            return;
        }
        validarEspectaculo(VentanaEspectaculo.registroEspectaculo, cmbZonaTematica.getSelectedItem()+"");
        validarAtraccion(VentanaAtraccion.registroAtraccion, cmbZonaTematica.getSelectedItem()+"");
        validarRestaurante(VentanaRestaurante.registroRestaurante, cmbZonaTematica.getSelectedItem()+"");
    }//GEN-LAST:event_btnCargarInfoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if((int) spnEntradaGeneral.getValue()==0 && (int) spnNinoAdulto.getValue()==0){
            JOptionPane.showMessageDialog(null, "Seleccione una entrada para comprar");
            return;
        }
        if((int)spnEntradaGeneral.getValue()>0){
            entrada = new EntradasRegistrados("Entrada General", entradaGeneral, (int)spnEntradaGeneral.getValue());
            registroEntradas.insertarFinal(entrada);
            spnEntradaGeneral.setValue(0);
            actualizarTablas();
        }
        if((int)spnNinoAdulto.getValue()>0){
            entrada = new EntradasRegistrados("Entrada Niño y adulto mayor", entradaNinoAdultos, (int)spnNinoAdulto.getValue());
            registroEntradas.insertarFinal(entrada);
            spnNinoAdulto.setValue(0);
            actualizarTablas();
        }
        habilitarBotonesPago();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnAnadirRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirRestauranteActionPerformed
        if(cmbRestaurante.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione el restaurante para registrar la compra");
            return;
        }
        if((int)spnRestaurante.getValue()==0){
            JOptionPane.showMessageDialog(null, "Seleccione la cantidad de pases");
            return;
        }
        ListaRestaurante restaurantes  = VentanaRestaurante.registroRestaurante;
        double precioRestaurante = 0;
        for (int i = 0; i < restaurantes.getTamaño(); i++) {
            if(restaurantes.elementoPorIndice(i).getZonaTematica().equals(cmbZonaTematica.getSelectedItem()) &&
                    restaurantes.elementoPorIndice(i).getNombre().equals(cmbRestaurante.getSelectedItem())){
                precioRestaurante = restaurantes.elementoPorIndice(i).getPrecioMedio();
                break;
            }
        }
        entrada = new EntradasRegistrados("Pase de restaurante "+cmbRestaurante.getSelectedItem(), precioRestaurante, (int)spnRestaurante.getValue());
        registroEntradas.insertarFinal(entrada);
        actualizarTablas();
        spnRestaurante.setValue(0);
        cmbRestaurante.setSelectedIndex(0);
        habilitarBotonesPago();
    }//GEN-LAST:event_btnAnadirRestauranteActionPerformed

    private void btnAnadirEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirEspectaculoActionPerformed
        if(cmbEspectaculo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione el Espectaculo para registrar la compra");
            return;
        }
        if((int)spnEspectaculo.getValue()==0){
            JOptionPane.showMessageDialog(null, "Seleccione la cantidad de pases");
            return;
        }
        ListaEspectaculo espectaculos = VentanaEspectaculo.registroEspectaculo;
        double precioEspectaculo = 0;
        int indiceEspectaculo = 0;
        for (int i = 0; i < espectaculos.getTamaño(); i++) {
            if(espectaculos.elementoPorIndice(i).getZonaTematica().equals(cmbZonaTematica.getSelectedItem()) &&
                    espectaculos.elementoPorIndice(i).getNombre().equals(cmbEspectaculo.getSelectedItem())){
                precioEspectaculo = espectaculos.elementoPorIndice(i).getPrecio();
                indiceEspectaculo = i;
                break;
            }
        }
        entrada = new EntradasRegistrados("espectaculo"/*cmbEspectaculo.getSelectedItem()+""*/, precioEspectaculo, (int)spnEspectaculo.getValue());
        espectaculos.elementoPorIndice(indiceEspectaculo).setAforoMax(espectaculos.elementoPorIndice(indiceEspectaculo).getAforoMax()-(int)spnEspectaculo.getValue());
        registroEntradas.insertarFinal(entrada);
        actualizarTablas();
        spnEspectaculo.setValue(0);
        cmbEspectaculo.setSelectedIndex(0);
        lblAsientosDisponibles.setText("");
        habilitarBotonesPago();
    }//GEN-LAST:event_btnAnadirEspectaculoActionPerformed

    private void btnAgregarAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAtraccionActionPerformed
        if(cmbAtraccion.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione la atraccion para registrar la compra");
            return;
        }
        if((int)spnAtraccion.getValue()==0){
            JOptionPane.showMessageDialog(null, "Seleccione la cantidad de pases");
            return;
        }
        ListaAtraccion atracciones = VentanaAtraccion.registroAtraccion;
        double precioAtraccion = 0;
        for (int i = 0; i < atracciones.getTamano(); i++) {
            if(atracciones.elementoPorIndice(i).getZonaTematica().equals(cmbZonaTematica.getSelectedItem()) &&
                    atracciones.elementoPorIndice(i).getNombre().equals(cmbAtraccion.getSelectedItem())){
                precioAtraccion = atracciones.elementoPorIndice(i).getPrecio();
                break;
            }
        }
        entrada = new EntradasRegistrados("Pase de atraccion "+cmbAtraccion.getSelectedItem(), precioAtraccion, (int)spnAtraccion.getValue());
        registroEntradas.insertarFinal(entrada);
        actualizarTablas();
        spnAtraccion.setValue(0);
        cmbAtraccion.setSelectedIndex(0);
        habilitarBotonesPago();
    }//GEN-LAST:event_btnAgregarAtraccionActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        JOptionPane.showMessageDialog(null, "Se ha completado el pago exitosamente, con un monto total de S/."+objetoPrecios[4]);
        VentanaTicket ve = new VentanaTicket();
        ve.setVisible(true);
        ve.setLocationRelativeTo(null);
        limpiarTodosCampos();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(!registroEntradas.esVacia()){
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cancelar la compra?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(result == 0){
                limpiarTodosCampos();
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmpDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDNIKeyReleased
        if(cmpDNI.getText().length()==8){
            btnBuscar.setEnabled(true);
        }else{
            btnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_cmpDNIKeyReleased

    private void cmbRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRestauranteActionPerformed

    private void cmbRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbRestauranteMouseClicked

    }//GEN-LAST:event_cmbRestauranteMouseClicked

    private void cmbEspectaculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEspectaculoKeyTyped
        
    }//GEN-LAST:event_cmbEspectaculoKeyTyped

    private void cmbEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspectaculoActionPerformed

    }//GEN-LAST:event_cmbEspectaculoActionPerformed

    private void cmbEspectaculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEspectaculoMousePressed

    }//GEN-LAST:event_cmbEspectaculoMousePressed

    private void cmbEspectaculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspectaculoItemStateChanged
        
    }//GEN-LAST:event_cmbEspectaculoItemStateChanged

    private void btnCargarEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEspectaculoActionPerformed
        if(cmbEspectaculo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione un espectáculo para comprar.");
            return;
        }
        int capacidad = 0;
        ListaEspectaculo espectaculos = VentanaEspectaculo.registroEspectaculo;
        for (int i = 0; i < espectaculos.getTamaño(); i++) {
            if(espectaculos.elementoPorIndice(i).getZonaTematica().equals(cmbZonaTematica.getSelectedItem()) &&
                    espectaculos.elementoPorIndice(i).getNombre().equals(cmbEspectaculo.getSelectedItem())){
                capacidad = VentanaEspectaculo.registroEspectaculo.elementoPorIndice(i).getAforoMax();
                break;
            }
        }
        if(capacidad==0){
            spnEspectaculo.setEnabled(false);
            btnAnadirEspectaculo.setEnabled(false);
            lblAsientosDisponibles.setText("<html>No hay asientos disponibles.</html>");
            return;
        }
        spnEspectaculo.setEnabled(true);
        btnAnadirEspectaculo.setEnabled(true);
        lblAsientosDisponibles.setText("<html>Hay "+capacidad+" asientos disponibles.</html>");
        modeloSpnEspectaculo = new SpinnerNumberModel(0,0,capacidad,1);
        spnEspectaculo.setModel(modeloSpnEspectaculo);
    }//GEN-LAST:event_btnCargarEspectaculoActionPerformed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        if(!registroEntradas.esVacia()){
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?. No se realizara la compra.", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(result == 0){
                this.setVisible(false);
                limpiarTodosCampos();
            }
        }else{
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jLabel12MousePressed
    
    public void limpiarTodosCampos(){
        registroEntradas.eliminarTodo();
        modeloEntradas.setRowCount(0);
        modeloPrecios.setRowCount(0);
        cmpNombre.setText("");
        cmpApellido.setText("");
        cmpFecha.setText("");
        cmpDNI.setText("");
        habilitarVentaEntradas(false);
        cmbZonaTematica.setEnabled(false);
        cmbZonaTematica.removeAllItems();
        btnCargarInfo.setEnabled(false);
        descuento = 0.0;
        lblMensajeEntrada.setText("");
        btnCancelar.setEnabled(false);
        btnPagar.setEnabled(false);
        habilitarCamposRestaurantes(false);
        cmbRestaurante.removeAllItems();
        habilitarCamposAtraccion(false);
        cmbAtraccion.removeAllItems();
        habilitarCamposEspectaculos(false);
        cmbEspectaculo.removeAllItems();
        validadorDescuento = false;
        lblAsientosDisponibles.setText("");
        btnAnadirEspectaculo.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregarAtraccion;
    public static javax.swing.JButton btnAnadirEspectaculo;
    public static javax.swing.JButton btnAnadirRestaurante;
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCargarEspectaculo;
    private javax.swing.JButton btnCargarInfo;
    public static javax.swing.JButton btnComprar;
    public static javax.swing.JButton btnPagar;
    public static javax.swing.JComboBox cmbAtraccion;
    public static javax.swing.JComboBox cmbEspectaculo;
    public static javax.swing.JComboBox cmbRestaurante;
    public static javax.swing.JComboBox cmbZonaTematica;
    public static javax.swing.JLabel cmpApellido;
    public static javax.swing.JTextField cmpDNI;
    public static javax.swing.JLabel cmpFecha;
    public static javax.swing.JLabel cmpNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblAsientosDisponibles;
    private javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblMensajeEntrada;
    private javax.swing.JLabel lblNombre;
    public static javax.swing.JSpinner spnAtraccion;
    public static javax.swing.JSpinner spnEntradaGeneral;
    public static javax.swing.JSpinner spnEspectaculo;
    public static javax.swing.JSpinner spnNinoAdulto;
    public static javax.swing.JSpinner spnRestaurante;
    public static javax.swing.JTable tablaPrecios;
    public static javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}