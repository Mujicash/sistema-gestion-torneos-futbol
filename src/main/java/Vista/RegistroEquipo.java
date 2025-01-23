package Vista;


import Modelo.Jugador;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;

public class RegistroEquipo extends javax.swing.JDialog {   
        
    
    public static TreeSet<Jugador> listaJugadores = new TreeSet<>();
    
    //creamos el modelo de equipo
    public DefaultComboBoxModel modeloEquipo = new DefaultComboBoxModel();
    
    public RegistroEquipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelSuperior = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        logoPrincipal = new javax.swing.JLabel();
        txtDatos = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jbnAgregarPlantilla = new javax.swing.JButton();
        jtxtPlantilla = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        txtRegistrarD = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtId = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JLabel();
        jdcFundacion = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelSuperior.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        logoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\registroEquipo.png"));

        txtDatos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtDatos.setForeground(new java.awt.Color(0, 51, 112));
        txtDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDatos.setText("Datos del Equipo");

        jbtnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        jbtnRegistrar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRegistrar.png"));
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtId.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setText("ID");

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("NOMBRE");

        jbnAgregarPlantilla.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jbnAgregarPlantilla.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\miniPlantilla.png"));
        jbnAgregarPlantilla.setText("PLANTILLA");
        jbnAgregarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtPlantilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtNombre1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre1.setText("CATEGORIA");

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JUVENIL", "MAYOR" }));

        txtRegistrarD.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrarD.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrarD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRegistrarD.setText("REGISTRAR EQUIPO");

        jtxtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jtxtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jtxtId.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jtxtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtNombre2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre2.setText("FUNDACION");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtRegistrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbnAgregarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtPlantilla)
                                    .addComponent(jcbCategoria, 0, 220, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNombre)
                                    .addComponent(jdcFundacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtId, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDatos)
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnAgregarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrarD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    public javax.swing.JButton jbnAgregarPlantilla;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JComboBox<String> jcbCategoria;
    public com.toedter.calendar.JDateChooser jdcFundacion;
    public javax.swing.JTextField jtxtId;
    public javax.swing.JTextField jtxtNombre;
    public static javax.swing.JTextField jtxtPlantilla;
    private javax.swing.JLabel logoPrincipal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel txtDatos;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtRegistrarD;
    // End of variables declaration//GEN-END:variables

}
