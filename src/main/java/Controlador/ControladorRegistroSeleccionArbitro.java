

package Controlador;

import Modelo.Arbitro;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Partido;
import Vista.MenuGestionPartido;
import Vista.RegistroSeleccionArbitro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroSeleccionArbitro implements ActionListener {
    
    private RegistroSeleccionArbitro vista;
    private Partido part;
    private String codTorneo;
    private OperacionesMenuTorneo modelo;

    public ControladorRegistroSeleccionArbitro(RegistroSeleccionArbitro vista, Partido part, String codTorneo, OperacionesMenuTorneo modelo) {
        this.vista = vista;
        this.part = part;
        this.codTorneo = codTorneo;
        this.modelo = modelo;
        vista.jbtnAsignar.addActionListener(this);
    }
    
    public void iniciar(){
        
        vista.jlblEquipoLocal.setText(part.getLocal().getNombre());
        vista.jlblEquipoVisitante.setText(part.getVisitante().getNombre());
        ArrayList<Arbitro> arbTorneo = modelo.cargarListaArbitros(codTorneo);
        
        for(Arbitro arb : arbTorneo){
            vista.listaArbitros.addElemento(arb);
        }
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnAsignar){
            
            try{
                Arbitro arbAsignado = (Arbitro) vista.listaArbitros.getElementAt(vista.jlistArbitros.getSelectedIndex());

                int eleccion = ModeladoBase.preguntar("¿Esta seguro de asignar este arbitro al partido?", "Asignacion de arbitro");
                if(eleccion == JOptionPane.YES_OPTION){
                    part.setArbitro(arbAsignado);
                    MenuGestionPartido.partSelec = part;
                    vista.setVisible(false);
                }
            } catch(IndexOutOfBoundsException ex){
                ModeladoBase.mostrarError("Debes seleccionar un arbitro de la lista");
            }            
        }


    }

}
