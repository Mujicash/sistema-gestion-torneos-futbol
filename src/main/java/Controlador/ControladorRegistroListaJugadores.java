
package Controlador;

import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuEquipo;
import Vista.RegistroEquipo;
import Vista.RegistroListaJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroListaJugadores implements ActionListener {

    private RegistroListaJugadores vista;
    private OperacionesMenuEquipo modelo;
    private String equipo;

    public ControladorRegistroListaJugadores(RegistroListaJugadores vista, OperacionesMenuEquipo modelo, String equipo) {
        this.vista = vista;
        this.modelo = modelo;
        this.equipo = equipo;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnRevertir.addActionListener(this);
        vista.jbtnTransferir.addActionListener(this);
    }
    
    public void iniciar(){
        vista.txtElegirClub.setText(equipo);
        cargarTransferibles();
    }
    
    private void cargarTransferibles(){
        ArrayList<Jugador> transferibles = modelo.obtenerJugadoresTransferibles();
        
        for(Jugador jug : transferibles){
            vista.modeloTransferibles.addElemento(jug);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnTransferir){
            
            try{
                vista.modeloTransferidos.addElemento((Jugador) vista.modeloTransferibles.getElementAt(vista.listaTranferibles.getSelectedIndex()));
                vista.modeloTransferibles.eliminarElemento(vista.listaTranferibles.getSelectedIndex());
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un jugador de la lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRevertir){
            
            try{
                vista.modeloTransferibles.addElemento((Jugador) vista.modeloTransferidos.getElementAt(vista.listaTransferidos.getSelectedIndex()));
                vista.modeloTransferidos.eliminarElemento(vista.listaTransferidos.getSelectedIndex());
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un jugador de la Lista");
            }
            
        }
        if(e.getSource() == vista.jbtnRegistrar){
            
            if(vista.modeloTransferidos.getSize()>=1){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de registrar a estos jugadores en el equipo?", "Cargar Datos");
                if(eleccion == JOptionPane.YES_OPTION){
                    //vista.jugadores = modelo.arbolJugadores(vista.modeloTransferidos.getLista());
                    vista.plantilla = modelo.arbolJugadores(vista.modeloTransferidos.getLista());
                    System.out.println("Jugadores en el arbol:");
                    for(Jugador i : vista.plantilla){
                        System.out.println(i);
                    }
                    RegistroEquipo.jtxtPlantilla.setText("Asignado");
                    //RegistroEquipo.plantilla = vista.jugadores;
                    RegistroEquipo.listaJugadores = vista.plantilla;
                    vista.setVisible(false);
                }
            } else{
                ModeladoBase.mostrarError("DEBE TRANSFERRIR COMO MINIMO 15 JUGADORES ");   
            }
        }

    }
    
}
