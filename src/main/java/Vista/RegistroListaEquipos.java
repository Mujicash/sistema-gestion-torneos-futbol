package Vista;


import Modelo.Equipo;
import Modelo.ListModelPersonalizado;

public class RegistroListaEquipos extends javax.swing.JDialog {
    
    public ListModelPersonalizado<Equipo> modeloTransferibles = new ListModelPersonalizado();
    public ListModelPersonalizado<Equipo> modeloTransferidos = new ListModelPersonalizado();
    
    public RegistroListaEquipos(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        scroolTranferidos = new javax.swing.JScrollPane();
        listaTransferidos = new javax.swing.JList();
        jbtnTransferir = new javax.swing.JButton();
        scroolTransferibles = new javax.swing.JScrollPane();
        listaTranferibles = new javax.swing.JList();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnRevertir = new javax.swing.JButton();
        txtTranferencia = new javax.swing.JLabel();
        jtxtTorneo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelSuperior.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        listaTransferidos.setModel(modeloTransferidos);
        scroolTranferidos.setViewportView(listaTransferidos);

        jbtnTransferir.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnTransferir.setText("TRANSFERIR >>");

        listaTranferibles.setModel(modeloTransferibles);
        scroolTransferibles.setViewportView(listaTranferibles);

        jbtnRegistrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnRegistrar.setText("REGISTRAR");

        jbtnRevertir.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jbtnRevertir.setText("<< REVERTIR");

        txtTranferencia.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtTranferencia.setForeground(new java.awt.Color(0, 51, 112));
        txtTranferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTranferencia.setText("TRANFERENCIA DE  EQUIPOS AL TORNEO");

        jtxtTorneo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jtxtTorneo.setForeground(new java.awt.Color(255, 102, 0));
        jtxtTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtxtTorneo.setText("TORNEO S1");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTranferencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(scroolTransferibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtnRevertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scroolTranferidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTranferencia)
                .addGap(18, 18, 18)
                .addComponent(jtxtTorneo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbtnTransferir)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRevertir)
                        .addGap(21, 21, 21)
                        .addComponent(jbtnRegistrar))
                    .addComponent(scroolTranferidos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroolTransferibles, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnRevertir;
    public javax.swing.JButton jbtnTransferir;
    public javax.swing.JLabel jtxtTorneo;
    public javax.swing.JList listaTranferibles;
    public javax.swing.JList listaTransferidos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JScrollPane scroolTranferidos;
    private javax.swing.JScrollPane scroolTransferibles;
    private javax.swing.JLabel txtTranferencia;
    // End of variables declaration//GEN-END:variables
}
