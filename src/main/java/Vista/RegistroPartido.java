package Vista;



public class RegistroPartido extends javax.swing.JDialog {
    
    
    public RegistroPartido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        logoPrincipal = new javax.swing.JLabel();
        txtGestionar = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jtxtGolesLocal = new javax.swing.JTextField();
        jtxtGolesVisitante = new javax.swing.JTextField();
        jlblVisitante = new javax.swing.JLabel();
        jlblLocal = new javax.swing.JLabel();
        txtEstadio = new javax.swing.JLabel();
        jlblEquipoLocal = new javax.swing.JLabel();
        jlblEquipoVisitante = new javax.swing.JLabel();
        txtLista3 = new javax.swing.JLabel();
        jtxtArbitro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNuevo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelSuperior.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(380, 465));

        logoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoMarcador.png"));

        txtGestionar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtGestionar.setForeground(new java.awt.Color(0, 51, 112));
        txtGestionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGestionar.setText("GESTIONAR PARTIDO");

        jbtnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRegistrar.png"));
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtGolesLocal.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jtxtGolesLocal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtGolesLocal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jtxtGolesVisitante.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jtxtGolesVisitante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtGolesVisitante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jlblVisitante.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jlblVisitante.setForeground(new java.awt.Color(255, 102, 0));
        jlblVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVisitante.setText("ELEGIR EQ2");

        jlblLocal.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jlblLocal.setForeground(new java.awt.Color(255, 102, 0));
        jlblLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLocal.setText("ELEGIR EQ1");

        txtEstadio.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtEstadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEstadio.setText("ARBITRO");

        jlblEquipoLocal.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jlblEquipoLocal.setForeground(new java.awt.Color(0, 51, 112));
        jlblEquipoLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEquipoLocal.setText("EQUIPO LOCAL");

        jlblEquipoVisitante.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jlblEquipoVisitante.setForeground(new java.awt.Color(0, 51, 112));
        jlblEquipoVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEquipoVisitante.setText("EQUIPO VISITANTE");

        txtLista3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtLista3.setForeground(new java.awt.Color(0, 51, 112));
        txtLista3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLista3.setText("VS");

        jtxtArbitro.setEditable(false);
        jtxtArbitro.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        txtNuevo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNuevo.setForeground(new java.awt.Color(153, 153, 153));
        txtNuevo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNuevo.setText("REGISTRAR MARCADOR");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGestionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlblLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                                    .addGap(10, 10, 10)
                                    .addComponent(jtxtGolesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLista3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtGolesVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlblEquipoVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblVisitante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jtxtArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGestionar)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtGolesVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLista3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtGolesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JButton jbtnRegistrar;
    private javax.swing.JLabel jlblEquipoLocal;
    private javax.swing.JLabel jlblEquipoVisitante;
    public javax.swing.JLabel jlblLocal;
    public javax.swing.JLabel jlblVisitante;
    public javax.swing.JTextField jtxtArbitro;
    public javax.swing.JTextField jtxtGolesLocal;
    public javax.swing.JTextField jtxtGolesVisitante;
    private javax.swing.JLabel logoPrincipal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel txtEstadio;
    private javax.swing.JLabel txtGestionar;
    private javax.swing.JLabel txtLista3;
    private javax.swing.JLabel txtNuevo;
    // End of variables declaration//GEN-END:variables

}
