package Vista;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuJugador extends javax.swing.JPanel {
    
    //creamos un buscador para filtrar el id
    public TableRowSorter buscador;
    
    //declaramos e inicializamos el modelo de la tabla de jugadores
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public MenuJugador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuJugador = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        txtRegistro = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        txtNRegistro = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        txtRegistrar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        scroolTabla = new javax.swing.JScrollPane();
        jtblJugadores = new javax.swing.JTable();
        txtIdBuscar = new javax.swing.JLabel();
        boxIdBucar = new javax.swing.JTextField();
        jbtnDetalle = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(906, 500));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoJugador.png"));

        txtMenuJugador.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuJugador.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuJugador.setText("MENÚ JUGADOR");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMenuJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMenuJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        txtRegistro.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtRegistro.setForeground(new java.awt.Color(255, 153, 0));
        txtRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistro.setText("REGISTRO DE JUGADORES");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEliminar.png"));
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetroceder.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        btnRetroceder.setToolTipText("");
        btnRetroceder.setBorder(null);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNRegistro.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNRegistro.setForeground(new java.awt.Color(153, 153, 153));
        txtNRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNRegistro.setText("NUEVO REGISTRO");

        txtEliminar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(153, 153, 153));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR REGISTRO");

        txtRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar.setText("REGRESAR AL MENÚ");

        btnAgregar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAgregar.png"));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtblJugadores.setModel(modeloTabla);
        scroolTabla.setViewportView(jtblJugadores);

        txtIdBuscar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIdBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtIdBuscar.setText("FILTRAR ID");

        boxIdBucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxIdBucarKeyTyped(evt);
            }
        });

        jbtnDetalle.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jbtnDetalle.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\miniJugador.png"));
        jbtnDetalle.setText("DETALLE JUGADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(boxIdBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroolTabla))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxIdBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scroolTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxIdBucarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxIdBucarKeyTyped
        //implementamos nuestra oyente para filtrar
        boxIdBucar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke){
                //indicamos al buscador que se filtrara en la columna ID (0) por medio de la caja de texto
                buscador.setRowFilter(RowFilter.regexFilter(boxIdBucar.getText(), 0));
            }
        });

        buscador = new TableRowSorter(modeloTabla);
        jtblJugadores.setRowSorter(buscador);
    }//GEN-LAST:event_boxIdBucarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField boxIdBucar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel iconPrincipal;
    public javax.swing.JButton jbtnDetalle;
    public javax.swing.JTable jtblJugadores;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scroolTabla;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtIdBuscar;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuJugador;
    private javax.swing.JLabel txtNRegistro;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtRegistro;
    // End of variables declaration//GEN-END:variables

}
