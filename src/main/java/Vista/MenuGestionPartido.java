package Vista;

import Modelo.Partido;
import javax.swing.table.DefaultTableModel;

public class MenuGestionPartido extends javax.swing.JPanel {


    //declaramos e inicializamos el modelo de la tabla de arbitros
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    public static Partido partSelec;
    public static Partido partidoJugado;
    
    public MenuGestionPartido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuTorneo = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        txtGestionPartido = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        txtRegistrar = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        btnAsignarArbitro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        txtRegresar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jtxtNombreTorneo = new javax.swing.JLabel();
        scrool = new javax.swing.JScrollPane();
        jtblPartidos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoGestionPartido.png"));

        txtMenuTorneo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuTorneo.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuTorneo.setText("Menú Gestion Partido");

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

        txtGestionPartido.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtGestionPartido.setForeground(new java.awt.Color(255, 153, 0));
        txtGestionPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGestionPartido.setText("GESTION DE PARTIDOS");

        txtRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar.setText("ASIGNAR ARBITROS");

        btnAsignarArbitro.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btnAsignarArbitro.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAsignarArbitro.png"));
        btnAsignarArbitro.setContentAreaFilled(false);
        btnAsignarArbitro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        btnRegresar.setToolTipText("");
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnJugar.setBackground(new java.awt.Color(255, 255, 255));
        btnJugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnJugar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoMarcador.png"));
        btnJugar.setToolTipText("");
        btnJugar.setBorder(null);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRegresar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegresar.setText("REGRESAR AL MENÚ");

        txtEliminar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(153, 153, 153));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("JUGAR PARTIDO");

        jtxtNombreTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jtxtNombreTorneo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombreTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtxtNombreTorneo.setText("FIXTURE OFICIAL TORNEO");

        jtblPartidos.setModel(modeloTabla);
        scrool.setViewportView(jtblPartidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGestionPartido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAsignarArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addComponent(separador2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtNombreTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrool))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtGestionPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAsignarArbitro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAsignarArbitro;
    public javax.swing.JButton btnJugar;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel iconPrincipal;
    public javax.swing.JTable jtblPartidos;
    public javax.swing.JLabel jtxtNombreTorneo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtGestionPartido;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuTorneo;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtRegresar;
    // End of variables declaration//GEN-END:variables
}
