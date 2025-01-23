package Vista;

import Modelo.Jugador;
import Modelo.ListModelPersonalizado;
import java.util.TreeSet;

public class RegistroListaJugadores extends javax.swing.JDialog {
    
    public ListModelPersonalizado<Jugador> modeloTransferibles = new ListModelPersonalizado();
    public ListModelPersonalizado<Jugador> modeloTransferidos = new ListModelPersonalizado();
    public TreeSet<Jugador> plantilla;
    
    public RegistroListaJugadores(java.awt.Frame parent, boolean modal) {
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
        listaTransferidos = new javax.swing.JList<>();
        jbtnTransferir = new javax.swing.JButton();
        scroolTransferibles = new javax.swing.JScrollPane();
        listaTranferibles = new javax.swing.JList<>();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnRevertir = new javax.swing.JButton();
        txtTranferencia = new javax.swing.JLabel();
        txtElegirClub = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelSuperior.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
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
        txtTranferencia.setText("TRANFERENCIA DE JUGADORES A EQUIPO");

        txtElegirClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtElegirClub.setForeground(new java.awt.Color(255, 102, 0));
        txtElegirClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtElegirClub.setText("EQUIPOS1");
        txtElegirClub.setToolTipText("");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTranferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtElegirClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(scroolTransferibles, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnRevertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scroolTranferidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))))
                .addGap(22, 22, 22))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtTranferencia)
                .addGap(18, 18, 18)
                .addComponent(txtElegirClub)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jbtnTransferir)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRevertir)
                        .addGap(21, 21, 21)
                        .addComponent(jbtnRegistrar))
                    .addComponent(scroolTranferidos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroolTransferibles, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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
    public javax.swing.JList<String> listaTranferibles;
    public javax.swing.JList<String> listaTransferidos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JScrollPane scroolTranferidos;
    private javax.swing.JScrollPane scroolTransferibles;
    public javax.swing.JLabel txtElegirClub;
    private javax.swing.JLabel txtTranferencia;
    // End of variables declaration//GEN-END:variables
}
