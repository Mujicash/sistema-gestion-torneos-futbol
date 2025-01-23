package Vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuArbitro extends javax.swing.JPanel {
   
    //creamos un buscador para filtrar el id
    public TableRowSorter buscador;
    
    //declaramos e inicializamos el modelo de la tabla de arbitros
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public MenuArbitro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuArbitro = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        txtRegresar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        txtNuevo = new javax.swing.JLabel();
        txtIdBuscar = new javax.swing.JLabel();
        scroolTabla = new javax.swing.JScrollPane();
        jtblArbitros = new javax.swing.JTable();
        boxIdBucar = new javax.swing.JTextField();
        jbtnDetalle = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoArbitro.png"));

        txtMenuArbitro.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuArbitro.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuArbitro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuArbitro.setText("MENÚ ÁRBITRO");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMenuArbitro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMenuArbitro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        txtRegistro.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtRegistro.setForeground(new java.awt.Color(255, 153, 0));
        txtRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistro.setText("REGISTRO DE ÁRBITROS");

        btnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetroceder.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoRetroceder.png"));
        btnRetroceder.setToolTipText("");
        btnRetroceder.setBorder(null);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEliminar.png"));
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAgregar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAgregar.png"));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRegresar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegresar.setText("REGRESAR AL MENÚ");

        txtEliminar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(153, 153, 153));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR REGISTRO");

        txtNuevo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtNuevo.setForeground(new java.awt.Color(153, 153, 153));
        txtNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNuevo.setText("NUEVO REGISTRO");

        txtIdBuscar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIdBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtIdBuscar.setText("FILTRAR ID");

        jtblArbitros.setModel(modeloTabla);
        scroolTabla.setViewportView(jtblArbitros);

        boxIdBucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxIdBucarKeyTyped(evt);
            }
        });

        jbtnDetalle.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jbtnDetalle.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\miniArbitro.png"));
        jbtnDetalle.setText("DETALLE ARBITRO");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addComponent(separador2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(boxIdBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(boxIdBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scroolTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jtblArbitros.setRowSorter(buscador);
    }//GEN-LAST:event_boxIdBucarKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxIdBucar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel iconPrincipal;
    public javax.swing.JButton jbtnDetalle;
    public javax.swing.JTable jtblArbitros;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scroolTabla;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtIdBuscar;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuArbitro;
    private javax.swing.JLabel txtNuevo;
    private javax.swing.JLabel txtRegistro;
    private javax.swing.JLabel txtRegresar;
    // End of variables declaration//GEN-END:variables

}
