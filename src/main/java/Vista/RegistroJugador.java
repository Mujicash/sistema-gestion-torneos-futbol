package Vista;

import Modelo.ModeladoBase;

public class RegistroJugador extends javax.swing.JDialog{     
    
    public RegistroJugador(java.awt.Frame parent, boolean modal) {
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
        txtDatos = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        boxId = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        boxNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JLabel();
        boxApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JLabel();
        boxDni = new javax.swing.JTextField();
        txtFNac = new javax.swing.JLabel();
        txtPais = new javax.swing.JLabel();
        boxPais = new javax.swing.JTextField();
        txtSexo = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        txtRegistrarD = new javax.swing.JLabel();
        jdcNacimiento = new com.toedter.calendar.JDateChooser();

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
        logoPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEntrenador.png"));

        txtDatos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtDatos.setForeground(new java.awt.Color(0, 51, 112));
        txtDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDatos.setText("Datos del Jugador");

        jbtnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        jbtnRegistrar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRegistrar.png"));
        jbtnRegistrar.setContentAreaFilled(false);

        boxId.setEditable(false);
        boxId.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        boxId.setFocusable(false);

        txtId.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setText("ID");

        txtNombres.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(153, 153, 153));
        txtNombres.setText("NOMBRES");

        boxNombres.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        boxNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNombresKeyTyped(evt);
            }
        });

        txtApellidos.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidos.setText("APELLIDOS");

        boxApellidos.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        boxApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxApellidosKeyTyped(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(153, 153, 153));
        txtDni.setText("DNI");

        boxDni.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        boxDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxDniKeyTyped(evt);
            }
        });

        txtFNac.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtFNac.setForeground(new java.awt.Color(153, 153, 153));
        txtFNac.setText("F. NACIMIENTO");

        txtPais.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(153, 153, 153));
        txtPais.setText("PAIS DE ORIGEN");

        boxPais.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        boxPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxPaisKeyTyped(evt);
            }
        });

        txtSexo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(153, 153, 153));
        txtSexo.setText("SEXO");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        txtRegistrarD.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrarD.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrarD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRegistrarD.setText("REGISTRAR");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(logoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNac)
                                    .addComponent(txtPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxPais, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(boxApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(comboSexo, 0, 154, Short.MAX_VALUE)
                            .addComponent(jdcNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(boxDni, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(boxId, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtRegistrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDatos)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxDni, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(boxApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    public javax.swing.JComboBox<String> comboSexo;
    public javax.swing.JButton jbtnRegistrar;
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
