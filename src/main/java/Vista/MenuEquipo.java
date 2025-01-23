package Vista;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuEquipo extends javax.swing.JPanel {
    
    //creamos un buscador para filtrar el id
    public TableRowSorter buscador;
    
    //declaramos e inicializamos el modelo de la tabla de equipo
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public MenuEquipo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        iconPrincipal = new javax.swing.JLabel();
        txtMenuEquipo = new javax.swing.JLabel();
        txtLigaFutbol = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        encabezadoClub = new javax.swing.JLabel();
        txtRegistrar = new javax.swing.JLabel();
        btnRetroceder = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtRetroceder = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        boxIdBucar = new javax.swing.JTextField();
        txtIdBuscar = new javax.swing.JLabel();
        jbtnDetalle = new javax.swing.JButton();
        scrool = new javax.swing.JScrollPane();
        jtblEquipos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(0, 51, 112));

        iconPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPrincipal.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoEquipo.png"));

        txtMenuEquipo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtMenuEquipo.setForeground(new java.awt.Color(255, 153, 0));
        txtMenuEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuEquipo.setText("MENÚ EQUIPO");

        txtLigaFutbol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLigaFutbol.setForeground(new java.awt.Color(255, 255, 255));
        txtLigaFutbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLigaFutbol.setText("LIGA DE FUTBOL");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMenuEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(txtLigaFutbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMenuEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLigaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        encabezadoClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        encabezadoClub.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoClub.setText("REGISTRO DE EQUIPOS");

        txtRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar.setText("NUEVO REGISTRO");

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

        btnRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\logoAgregar.png"));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRetroceder.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtRetroceder.setForeground(new java.awt.Color(153, 153, 153));
        txtRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRetroceder.setText("REGRESAR AL MENÚ");

        txtEliminar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(153, 153, 153));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR REGISTRO");

        boxIdBucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxIdBucarKeyTyped(evt);
            }
        });

        txtIdBuscar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtIdBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtIdBuscar.setText("FILTRAR ID");

        jbtnDetalle.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jbtnDetalle.setIcon(new javax.swing.ImageIcon("src\\main\\java\\Imagenes\\miniEquipos.png"));
        jbtnDetalle.setText("DETALLE EQUIPO");

        jtblEquipos.setModel(modeloTabla);
        scrool.setViewportView(jtblEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrool, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(encabezadoClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(separador2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(boxIdBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(encabezadoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnDetalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxIdBucar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
        jtblEquipos.setRowSorter(buscador);
    }//GEN-LAST:event_boxIdBucarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxIdBucar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel encabezadoClub;
    private javax.swing.JLabel iconPrincipal;
    public javax.swing.JButton jbtnDetalle;
    public javax.swing.JTable jtblEquipos;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtIdBuscar;
    private javax.swing.JLabel txtLigaFutbol;
    private javax.swing.JLabel txtMenuEquipo;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtRetroceder;
    // End of variables declaration//GEN-END:variables

}
