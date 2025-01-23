package Vista;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuTorneo extends javax.swing.JPanel {

    //creamos un buscador para filtrar el id
    public TableRowSorter buscador;
    
    //declaramos e inicializamos el modelo de la tabla de torneo
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    
    public MenuTorneo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuTorneo = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        encabezadoClub = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnRetroceder = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtBuscarID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnGestionarTorneo = new javax.swing.JButton();
        scrool = new javax.swing.JScrollPane();
        jtblTorneos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoTorneo.png"));

        txtMenuTorneo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuTorneo.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuTorneo.setText("Menú Torneo");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMenuTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMenuTorneo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        encabezadoClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        encabezadoClub.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoClub.setText("REGISTRO DE TORNEOS");

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO TORNEO");

        jbtnRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAgregar.png"));
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRetroceder.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        jbtnRetroceder.setToolTipText("");
        jbtnRetroceder.setBorder(null);
        jbtnRetroceder.setContentAreaFilled(false);
        jbtnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEliminar.png"));
        jbtnEliminar.setToolTipText("");
        jbtnEliminar.setBorder(null);
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("FILTRAR ID");

        jtxtBuscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBuscarIDKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGRESAR AL MENÚ");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR TORNEO");

        jbtnGestionarTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnGestionarTorneo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\miniJugador.png"));
        jbtnGestionarTorneo.setText("GESTIONAR TORNEO");

        jtblTorneos.setModel(modeloTabla);
        scrool.setViewportView(jtblTorneos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encabezadoClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jbtnGestionarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrool))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(encabezadoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbtnGestionarTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jtxtBuscarIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarIDKeyTyped
        
        jtxtBuscarID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke){
                //indicamos al buscador que se filtrara en la columna ID (0) por medio de la caja de texto
                buscador.setRowFilter(RowFilter.regexFilter(jtxtBuscarID.getText(), 0));
            }
        });
            
        buscador = new TableRowSorter(modeloTabla);
        jtblTorneos.setRowSorter(buscador);
    }//GEN-LAST:event_jtxtBuscarIDKeyTyped
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encabezadoClub;
    private javax.swing.JLabel iconPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnGestionarTorneo;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnRetroceder;
    public javax.swing.JTable jtblTorneos;
    private javax.swing.JTextField jtxtBuscarID;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuTorneo;
    // End of variables declaration//GEN-END:variables

}
