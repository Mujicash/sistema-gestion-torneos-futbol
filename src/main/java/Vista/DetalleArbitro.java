
package Vista;

import Modelo.ListModelPersonalizado;
import Modelo.Torneo;




public class DetalleArbitro extends javax.swing.JPanel {
    
    //private final Arbitro arbitro;
    public ListModelPersonalizado <Torneo> lista;
   
    public DetalleArbitro() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        txtRegistroJugador = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtIDNI = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        txtIDNI1 = new javax.swing.JLabel();
        jtxtPais = new javax.swing.JTextField();
        txtPais = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        txtFec = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtSexo = new javax.swing.JTextField();
        jbtnRetroceder = new javax.swing.JButton();
        txtRegistrar = new javax.swing.JLabel();
        txtTorneo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistTorneoArbitro = new javax.swing.JList<>();
        encabezadoClub = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtRegistrar1 = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        txtRegistroJugador.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        txtRegistroJugador.setForeground(new java.awt.Color(255, 255, 0));
        txtRegistroJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistroJugador.setText("DETALLE ÁRBITRO");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\detalleArbitro.png"));

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistroJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtRegistroJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        jtxtID.setEditable(false);
        jtxtID.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtID.setPreferredSize(new java.awt.Dimension(72, 26));

        txtID.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("ID");

        txtSexo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(102, 102, 102));
        txtSexo.setText("SEXO");
        txtSexo.setPreferredSize(new java.awt.Dimension(43, 26));

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("NOMBRES");

        txtIDNI.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIDNI.setForeground(new java.awt.Color(102, 102, 102));
        txtIDNI.setText("DNI");

        jtxtDNI.setEditable(false);
        jtxtDNI.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtDNI.setPreferredSize(new java.awt.Dimension(72, 26));

        txtIDNI1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIDNI1.setForeground(new java.awt.Color(102, 102, 102));
        txtIDNI1.setText("APELLIDOS");

        jtxtPais.setMinimumSize(new java.awt.Dimension(6, 26));
        jtxtPais.setPreferredSize(new java.awt.Dimension(72, 26));

        txtPais.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(102, 102, 102));
        txtPais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPais.setText("PAIS");
        txtPais.setPreferredSize(new java.awt.Dimension(43, 26));

        jtxtNombre.setPreferredSize(new java.awt.Dimension(72, 26));

        txtFec.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtFec.setForeground(new java.awt.Color(102, 102, 102));
        txtFec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtFec.setText("F. DE NACIMIENTO");
        txtFec.setPreferredSize(new java.awt.Dimension(43, 26));

        jtxtApellidos.setPreferredSize(new java.awt.Dimension(72, 26));

        jtxtSexo.setPreferredSize(new java.awt.Dimension(72, 26));

        jbtnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRetroceder.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        jbtnRetroceder.setToolTipText("");
        jbtnRetroceder.setBorder(null);
        jbtnRetroceder.setContentAreaFilled(false);
        jbtnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar.setText("REGRESAR AL MENÚ");

        txtTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtTorneo.setForeground(new java.awt.Color(153, 153, 153));
        txtTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTorneo.setText("TORNEOS REGISTRADO");
        txtTorneo.setPreferredSize(new java.awt.Dimension(43, 26));

        jlistTorneoArbitro.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        jlistTorneoArbitro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NO SE ENCUENTRA REGISTRADO A NINGUN TORNEO" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistTorneoArbitro.setVisibleRowCount(3);
        jScrollPane1.setViewportView(jlistTorneoArbitro);

        encabezadoClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        encabezadoClub.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoClub.setText("DETALLE ARBITRO");

        txtRegistrar1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar1.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar1.setText("MODIFICAR");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encabezadoClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFec, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jtxtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jtxtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jtxtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 67, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encabezadoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFec, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegistrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encabezadoClub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JButton jbtnModificar;
    public javax.swing.JButton jbtnRetroceder;
    public com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    public javax.swing.JList<String> jlistTorneoArbitro;
    public javax.swing.JTextField jtxtApellidos;
    public javax.swing.JTextField jtxtDNI;
    public javax.swing.JTextField jtxtID;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtPais;
    public javax.swing.JTextField jtxtSexo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JLabel txtFec;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtIDNI;
    private javax.swing.JLabel txtIDNI1;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtRegistrar1;
    private javax.swing.JLabel txtRegistroJugador;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTorneo;
    // End of variables declaration//GEN-END:variables
}
