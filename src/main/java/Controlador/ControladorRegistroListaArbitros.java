
package Controlador;

import Modelo.Arbitro;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Vista.RegistroListaArbitros;
import Vista.RegistroTorneo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroListaArbitros implements ActionListener {
    
    private RegistroListaArbitros vista;
    private OperacionesMenuTorneo modelo;
    private String torneo;

    public ControladorRegistroListaArbitros(RegistroListaArbitros vista, OperacionesMenuTorneo modelo, String torneo) {
        this.vista = vista;
        this.modelo = modelo;
        this.torneo = torneo;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnRevertir.addActionListener(this);
        vista.jbtnTransferir.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtTorneo.setText(torneo);
        cargarTransferibles();
    }
    
    private void cargarTransferibles(){
        ArrayList<Arbitro> transferibles = modelo.obtenerArbitros();
        
        for(Arbitro arb : transferibles){
            vista.modeloTransferibles.addElemento(arb);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnTransferir){
            
            try {
                vista.modeloTransferidos.addElemento((Arbitro) vista.modeloTransferibles.getElementAt(vista.listaTranferibles.getSelectedIndex()));
                vista.modeloTransferibles.eliminarElemento(vista.listaTranferibles.getSelectedIndex());
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un arbitro de la Lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRevertir){
            
            try{
                vista.modeloTransferibles.addElemento((Arbitro) vista.modeloTransferidos.getElementAt(vista.listaTransferidos.getSelectedIndex()));
                vista.modeloTransferidos.eliminarElemento(vista.listaTransferidos.getSelectedIndex());
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un arbitro de la Lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRegistrar){
            
            if(vista.modeloTransferidos.getSize()>=2){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de registrar a estos arbitros al torneo?", "Cargar Datos");
                if(eleccion == JOptionPane.YES_OPTION){
                    ArrayList<Arbitro> listaTranferidos = vista.modeloTransferidos.getLista();
                    RegistroTorneo.cArbitros = listaTranferidos;
                    RegistroTorneo.jtxtArbitros.setText("Arbitros asignados");
                    vista.setVisible(false);
                }
            } else{
                ModeladoBase.mostrarError("DEBE TRANSFERRIR COMO MINIMO 5 ARBITROS "); 
            }
        }

    }

}
