
package Controlador;

import Modelo.Equipo;
import Modelo.GestorFicheroSerializado;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Vista.RegistroListaEquipos;
import Vista.RegistroTorneo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroListaEquipos implements ActionListener {
    
    private RegistroListaEquipos vista;
    private OperacionesMenuTorneo modelo;
    private String torneo;
    private String categoria;

    public ControladorRegistroListaEquipos(RegistroListaEquipos vista, OperacionesMenuTorneo modelo, String torneo, String categoria) {
        this.vista = vista;
        this.modelo = modelo;
        this.torneo = torneo;
        this.categoria = categoria;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnRevertir.addActionListener(this);
        vista.jbtnTransferir.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtTorneo.setText(torneo);
        cargarEquipos();
    }
    
    private void cargarEquipos(){
        ArrayList<Equipo> transferibles = modelo.obtenerEquipos(categoria);
        
        for (Equipo eq : transferibles) {
            vista.modeloTransferibles.addElemento(eq);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnTransferir){
            
            try {
                vista.modeloTransferidos.addElemento((Equipo) vista.modeloTransferibles.getElementAt(vista.listaTranferibles.getSelectedIndex()));
                vista.modeloTransferibles.eliminarElemento(vista.listaTranferibles.getSelectedIndex());    
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un equipo de la Lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRevertir){
            
            try{
                vista.modeloTransferibles.addElemento((Equipo) vista.modeloTransferidos.getElementAt(vista.listaTransferidos.getSelectedIndex()));
                vista.modeloTransferidos.eliminarElemento(vista.listaTransferidos.getSelectedIndex());
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un equipo de la Lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRegistrar){
            
            if(vista.modeloTransferidos.getSize()>=4){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de registrar a estos equipos en el torneo?", "Cargar Datos");
                if(eleccion == JOptionPane.YES_OPTION){
                    ArrayList<Equipo> listaEquipos = vista.modeloTransferidos.getLista();
                    RegistroTorneo.cPlantilla = listaEquipos;
                    RegistroTorneo.jtxtEquipos.setText("Equipos asignados");
                    vista.setVisible(false);
                }
            } else{ 
                ModeladoBase.mostrarError("DEBE TRANSFERRIR COMO MINIMO 4 EQUIPOS ");  
            }
        }

    }
    
    

}
