
package Vista;


public class DetalleJugador extends javax.swing.JPanel {
        
    public DetalleJugador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtID = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtIDNI = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        txtIDNI1 = new javax.swing.JLabel();
        jtxtPais = new javax.swing.JTextField();
        txtPais = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        txtFec = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtSexo = new javax.swing.JTextField();
        jtxtEquipo = new javax.swing.JTextField();
        panelLateral = new javax.swing.JPanel();
        txtRegistroJugador = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        btnRetroceder = new javax.swing.JButton();
        txtModificar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        encabezadoClub = new javax.swing.JLabel();
        txtRegistrar1 = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));

        jtxtID.setEditable(false);
        jtxtID.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtID.setPreferredSize(new java.awt.Dimension(72, 26));

        txtID.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("ID");

        txtSexo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(102, 102, 102));
        txtSexo.setText("Sexo");
        txtSexo.setPreferredSize(new java.awt.Dimension(43, 26));

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Nombres");

        txtIDNI.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIDNI.setForeground(new java.awt.Color(102, 102, 102));
        txtIDNI.setText("DNI");

        jtxtNombres.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtNombres.setPreferredSize(new java.awt.Dimension(72, 26));

        txtIDNI1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIDNI1.setForeground(new java.awt.Color(102, 102, 102));
        txtIDNI1.setText("Apellidos");

        jtxtPais.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtPais.setPreferredSize(new java.awt.Dimension(72, 26));

        txtPais.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(102, 102, 102));
        txtPais.setText("País");
        txtPais.setPreferredSize(new java.awt.Dimension(43, 26));

        txtEquipo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtEquipo.setForeground(new java.awt.Color(102, 102, 102));
        txtEquipo.setText("Equipo");
        txtEquipo.setPreferredSize(new java.awt.Dimension(43, 26));

        jtxtDNI.setEditable(false);
        jtxtDNI.setPreferredSize(new java.awt.Dimension(72, 26));

        txtFec.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtFec.setForeground(new java.awt.Color(102, 102, 102));
        txtFec.setText("F. de Nacimiento");
        txtFec.setPreferredSize(new java.awt.Dimension(43, 26));

        jtxtApellidos.setPreferredSize(new java.awt.Dimension(72, 26));

        jtxtSexo.setPreferredSize(new java.awt.Dimension(72, 26));

        jtxtEquipo.setEditable(false);
        jtxtEquipo.setPreferredSize(new java.awt.Dimension(72, 26));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        txtRegistroJugador.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        txtRegistroJugador.setForeground(new java.awt.Color(255, 255, 0));
        txtRegistroJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistroJugador.setText("DETALLE JUGADOR");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\detalleEquipo.png"));

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistroJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtRegistroJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetroceder.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        btnRetroceder.setToolTipText("");
        btnRetroceder.setBorder(null);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtModificar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtModificar.setForeground(new java.awt.Color(153, 153, 153));
        txtModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificar.setText("MODIFICAR ");

        encabezadoClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        encabezadoClub.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoClub.setText("DETALLE JUGADOR");

        txtRegistrar1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar1.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar1.setText("REGRESAR AL MENÚ");

        jbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEditar.png"));
        jbtnModificar.setToolTipText("");
        jbtnModificar.setBorder(null);
        jbtnModificar.setContentAreaFilled(false);
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encabezadoClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txtRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtIDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(encabezadoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFec, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(txtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(txtRegistrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel encabezadoClub;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JButton jbtnModificar;
    public com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    public javax.swing.JTextField jtxtApellidos;
    public javax.swing.JTextField jtxtDNI;
    public javax.swing.JTextField jtxtEquipo;
    public javax.swing.JTextField jtxtID;
    public javax.swing.JTextField jtxtNombres;
    public javax.swing.JTextField jtxtPais;
    public javax.swing.JTextField jtxtSexo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JLabel txtEquipo;
    private javax.swing.JLabel txtFec;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtIDNI;
    private javax.swing.JLabel txtIDNI1;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtRegistrar1;
    private javax.swing.JLabel txtRegistroJugador;
    private javax.swing.JLabel txtSexo;
    // End of variables declaration//GEN-END:variables


}

