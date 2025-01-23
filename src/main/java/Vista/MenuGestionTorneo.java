package Vista;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuGestionTorneo extends javax.swing.JPanel {

    //creamos un buscador para filtrar el id
    TableRowSorter buscador;
    //declaramos e inicializamos el modelo de la tabla de arbitros
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public MenuGestionTorneo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuTorneo = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        txtGestionTorneo = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        txtGestionarPartidos = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        jbtnGestionarPartidos = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        txtRegresar = new javax.swing.JLabel();
        jtxtNombreTorneo = new javax.swing.JLabel();
        scrool = new javax.swing.JScrollPane();
        jtblPosiciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoGestionTorneo.png"));

        txtMenuTorneo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuTorneo.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuTorneo.setText("Menú Gestión Torneos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtGestionTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtGestionTorneo.setForeground(new java.awt.Color(255, 153, 0));
        txtGestionTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGestionTorneo.setText("GESTIÓN DE TORNEOS");

        txtGestionarPartidos.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtGestionarPartidos.setForeground(new java.awt.Color(153, 153, 153));
        txtGestionarPartidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtGestionarPartidos.setText("GESTIONAR PARTIDOS");

        jbtnGestionarPartidos.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnGestionarPartidos.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAgregarGP.png"));
        jbtnGestionarPartidos.setContentAreaFilled(false);
        jbtnGestionarPartidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRegresar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        jbtnRegresar.setToolTipText("");
        jbtnRegresar.setBorder(null);
        jbtnRegresar.setContentAreaFilled(false);
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRegresar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegresar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRegresar.setText("REGRESAR AL MENÚ TORNEO");

        jtxtNombreTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jtxtNombreTorneo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombreTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtxtNombreTorneo.setText("TABLA DE POSICIONES DEL TORNEO");

        jtblPosiciones.setModel(modeloTabla);
        scrool.setViewportView(jtblPosiciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGestionTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNombreTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtGestionarPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnGestionarPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrool))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtGestionTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtGestionarPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnGestionarPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jbtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconPrincipal;
    public javax.swing.JButton jbtnGestionarPartidos;
    public javax.swing.JButton jbtnRegresar;
    public javax.swing.JTable jtblPosiciones;
    public javax.swing.JLabel jtxtNombreTorneo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtGestionTorneo;
    private javax.swing.JLabel txtGestionarPartidos;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuTorneo;
    private javax.swing.JLabel txtRegresar;
    // End of variables declaration//GEN-END:variables
}
