package Vista;

import Modelo.ModeladoBase;

public class RegistroArbitro extends javax.swing.JDialog {    
    
    public RegistroArbitro(java.awt.Frame parent, boolean modal) {
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
        boxDni = new javax.swing.JTextField();
        txtFNac = new javax.swing.JLabel();
        txtDatos = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        boxId = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        txtPais = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        boxPais = new javax.swing.JTextField();
        boxNombres = new javax.swing.JTextField();
        txtSexo = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        boxApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JLabel();
        jdcNacimiento = new com.toedter.calendar.JDateChooser();
        txtRegistrarD = new javax.swing.JLabel();

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
        panelPrincipal.setPreferredSize(new java.awt.Dimension(380, 465));

        logoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\registroArbitro.png"));

        boxDni.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        boxDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        boxDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxDniKeyTyped(evt);
            }
        });

        txtFNac.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtFNac.setForeground(new java.awt.Color(153, 153, 153));
        txtFNac.setText("F. NACIMIENTO");

        txtDatos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtDatos.setForeground(new java.awt.Color(0, 51, 112));
        txtDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDatos.setText("Datos del Árbitro");

        btnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        btnRegistrar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRegistrar.png"));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boxId.setEditable(false);
        boxId.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        boxId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        boxId.setFocusable(false);

        txtId.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setText("ID");

        txtPais.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(153, 153, 153));
        txtPais.setText("PAIS DE ORIGEN");

        txtNombres.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(153, 153, 153));
        txtNombres.setText("NOMBRES");

        boxPais.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        boxPais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        boxPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxPaisKeyTyped(evt);
            }
        });

        boxNombres.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        boxNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        boxNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNombresKeyTyped(evt);
            }
        });

        txtSexo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(153, 153, 153));
        txtSexo.setText("SEXO");

        txtApellidos.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidos.setText("APELLIDOS");

        comboSexo.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        boxApellidos.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        boxApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        boxApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxApellidosKeyTyped(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(153, 153, 153));
        txtDni.setText("DNI");

        jdcNacimiento.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        txtRegistrarD.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrarD.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrarD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRegistrarD.setText("REGISTRAR ARBITRO");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)))
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxApellidos)
                            .addComponent(boxPais)
                            .addComponent(comboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxNombres)
                            .addComponent(boxDni)
                            .addComponent(jdcNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtRegistrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDatos)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(boxDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxDniKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){  //Solo numeros         
            evt.consume();
        }  
        if(boxDni.getText().length() >= 8){
            evt.consume();
            getToolkit().beep();
            ModeladoBase.mostrarAdvertencia("Solo puede ingresar 8 dígitos","DNI");
            boxDni.setCursor(null); 
        } 
    }//GEN-LAST:event_boxDniKeyTyped

    private void boxNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNombresKeyTyped
        char n = evt.getKeyChar();
        if(Character.isDigit(n)){  //Solo letras        
            evt.consume();
        }  
        if(boxNombres.getText().length() >= 30){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_boxNombresKeyTyped

    private void boxApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxApellidosKeyTyped
        char l = evt.getKeyChar();
        if(Character.isDigit(l)){  //Solo letras         
            evt.consume();
        }  
        if(boxApellidos.getText().length() >= 30){
            evt.consume();
            getToolkit().beep();
        } 
    }//GEN-LAST:event_boxApellidosKeyTyped

    private void boxPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxPaisKeyTyped
        char p = evt.getKeyChar();
        if(Character.isDigit(p)){  //Solo letras         
            evt.consume();
        }  
        if(boxPais.getText().length() >= 20){
            evt.consume();
            getToolkit().beep();
        } 
    }//GEN-LAST:event_boxPaisKeyTyped
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField boxApellidos;
    public javax.swing.JTextField boxDni;
    public javax.swing.JTextField boxId;
    public javax.swing.JTextField boxNombres;
    public javax.swing.JTextField boxPais;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> comboSexo;
    public com.toedter.calendar.JDateChooser jdcNacimiento;
    private javax.swing.JLabel logoPrincipal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel txtApellidos;
    private javax.swing.JLabel txtDatos;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtFNac;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNombres;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtRegistrarD;
    private javax.swing.JLabel txtSexo;
    // End of variables declaration//GEN-END:variables

}
