package Vista;

import Controlador.ControladorMenuArbitro;
import Controlador.ControladorMenuEquipo;
import Controlador.ControladorMenuJugador;
import Controlador.ControladorMenuTorneo;
import Modelo.Arbitro;
import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuArbitro;
import Modelo.OperacionesMenuEquipo;
import Modelo.OperacionesMenuJugador;
import Modelo.OperacionesMenuTorneo;
import Modelo.Torneo;



public class MenuPrincipal extends javax.swing.JPanel {

    public MenuPrincipal() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuPrincipal = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        botonMenuEquipo = new javax.swing.JButton();
        txtMenuEquipo = new javax.swing.JLabel();
        botonMenuTorneo = new javax.swing.JButton();
        txtMenuTorneo = new javax.swing.JLabel();
        botonMenuJugador = new javax.swing.JButton();
        txtMenuJugador = new javax.swing.JLabel();
        botonMenuArbitro = new javax.swing.JButton();
        txtMenuArbitro = new javax.swing.JLabel();
        encabezadoClub = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 500));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoPrincipal.png"));

        txtMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuPrincipal.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuPrincipal.setText("MENÚ PRINCIPAL");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        botonMenuEquipo.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuEquipo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEquipo.png"));
        botonMenuEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMenuEquipo.setFocusCycleRoot(true);
        botonMenuEquipo.setFocusable(false);
        botonMenuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuEquipoActionPerformed(evt);
            }
        });

        txtMenuEquipo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtMenuEquipo.setForeground(new java.awt.Color(102, 102, 102));
        txtMenuEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuEquipo.setText("EQUIPOS");

        botonMenuTorneo.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuTorneo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoTorneo.png"));
        botonMenuTorneo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMenuTorneo.setFocusCycleRoot(true);
        botonMenuTorneo.setFocusable(false);
        botonMenuTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuTorneoActionPerformed(evt);
            }
        });

        txtMenuTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtMenuTorneo.setForeground(new java.awt.Color(102, 102, 102));
        txtMenuTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuTorneo.setText("TORNEOS");

        botonMenuJugador.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuJugador.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoJugador.png"));
        botonMenuJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMenuJugador.setFocusCycleRoot(true);
        botonMenuJugador.setFocusable(false);
        botonMenuJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuJugadorActionPerformed(evt);
            }
        });

        txtMenuJugador.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtMenuJugador.setForeground(new java.awt.Color(102, 102, 102));
        txtMenuJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuJugador.setText("JUGADORES");

        botonMenuArbitro.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuArbitro.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoArbitro.png"));
        botonMenuArbitro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMenuArbitro.setFocusCycleRoot(true);
        botonMenuArbitro.setFocusable(false);
        botonMenuArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuArbitroActionPerformed(evt);
            }
        });

        txtMenuArbitro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtMenuArbitro.setForeground(new java.awt.Color(102, 102, 102));
        txtMenuArbitro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuArbitro.setText("ARBITROS");

        encabezadoClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        encabezadoClub.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoClub.setText("SISTEMA DE GESTIÓN DE TORNEOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenuEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(301, 301, 301)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMenuArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(encabezadoClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(encabezadoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMenuJugador)
                        .addGap(18, 18, 18)
                        .addComponent(botonMenuArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMenuArbitro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMenuEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMenuEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(botonMenuTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMenuTorneo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuEquipoActionPerformed
        MenuEquipo mEquipo = new MenuEquipo();
        Equipo equipo = new Equipo();
        OperacionesMenuEquipo operaciones = new OperacionesMenuEquipo();
        ControladorMenuEquipo controlador = new ControladorMenuEquipo(mEquipo, equipo, operaciones);
        controlador.iniciar();
        
        ModeladoBase.nuevoPanel(mEquipo);
    }//GEN-LAST:event_botonMenuEquipoActionPerformed

    private void botonMenuTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuTorneoActionPerformed
        MenuTorneo mTorneo = new MenuTorneo();
        Torneo torneo = new Torneo();
        OperacionesMenuTorneo operaciones = new OperacionesMenuTorneo();
        ControladorMenuTorneo controlador = new ControladorMenuTorneo(mTorneo, torneo, operaciones);
        controlador.iniciar();
        
        ModeladoBase.nuevoPanel(mTorneo);
    }//GEN-LAST:event_botonMenuTorneoActionPerformed

    private void botonMenuJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuJugadorActionPerformed
        MenuJugador mJugador = new MenuJugador();
        Jugador jugador = new Jugador();
        OperacionesMenuJugador operaciones = new OperacionesMenuJugador();
        ControladorMenuJugador controlador = new ControladorMenuJugador(mJugador, jugador, operaciones);
        controlador.iniciar();
        
        ModeladoBase.nuevoPanel(mJugador);
    }//GEN-LAST:event_botonMenuJugadorActionPerformed

    private void botonMenuArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuArbitroActionPerformed
        MenuArbitro mArbitro = new MenuArbitro();
        Arbitro arbitro = new Arbitro();
        OperacionesMenuArbitro operaciones = new OperacionesMenuArbitro();
        ControladorMenuArbitro controlador = new ControladorMenuArbitro(mArbitro, operaciones, arbitro);
        controlador.iniciar();        
        
        ModeladoBase.nuevoPanel(mArbitro);
    }//GEN-LAST:event_botonMenuArbitroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuArbitro;
    private javax.swing.JButton botonMenuEquipo;
    private javax.swing.JButton botonMenuJugador;
    private javax.swing.JButton botonMenuTorneo;
    private javax.swing.JLabel encabezadoClub;
    private javax.swing.JLabel iconPrincipal;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuArbitro;
    private javax.swing.JLabel txtMenuEquipo;
    private javax.swing.JLabel txtMenuJugador;
    private javax.swing.JLabel txtMenuPrincipal;
    private javax.swing.JLabel txtMenuTorneo;
    // End of variables declaration//GEN-END:variables
}
