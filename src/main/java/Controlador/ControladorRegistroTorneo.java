

package Controlador;

import Modelo.Equipo;
import Modelo.Fixture;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Temporada;
import Modelo.Torneo;
import Vista.RegistroListaArbitros;
import Vista.RegistroListaEquipos;
import Vista.RegistroTorneo;
import static Vista.RegistroTorneo.cPlantilla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroTorneo implements ActionListener {
    
    private RegistroTorneo vista;
    private Torneo torneo;
    private OperacionesMenuTorneo modelo;

    public ControladorRegistroTorneo(RegistroTorneo vista, Torneo torneo, OperacionesMenuTorneo modelo) {
        this.vista = vista;
        this.torneo = torneo;
        this.modelo = modelo;
        vista.jbtnArbitros.addActionListener(this);
        vista.jbtnAsignarEquipos.addActionListener(this);
        vista.jbtnAgregar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtID.setText(modelo.generadorID());        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnAgregar){
            
            try{
                if(modelo.validacion(vista.jtxtNombre.getText(), vista.jtxtEquipos.getText(), vista.jtxtArbitros.getText()) == true){
                    int eleccion = ModeladoBase.preguntar("¿Esta seguro de guardar los datos del torneo?", "Cargar Datos");
                    if(eleccion == JOptionPane.YES_OPTION){

                        //generamos un objeto de temporada
                        Temporada temporada = new Temporada();
                        //registramos las fechas
                        temporada.setFechaInicio(ModeladoBase.fechaCompleta(vista.jdcFechaInicio.getCalendar()));
                        temporada.setFechaFinal(ModeladoBase.fechaCompleta(vista.jdcFechaFin.getCalendar()));
                        
                        torneo.setIdTorneo(vista.jtxtID.getText());
                        torneo.setNombre(vista.jtxtNombre.getText());
                        torneo.setCategoria((String) vista.jcbCategoria.getSelectedItem());
                        torneo.setFechas(temporada);
                        torneo.setListaEquipos(RegistroTorneo.cPlantilla);
                        torneo.setListaArbitros(RegistroTorneo.cArbitros);
                        
                        Fixture fixture = new Fixture(vista.jtxtID.getText(), RegistroTorneo.cPlantilla);
                        
                        modelo.registrarTorneo(torneo, fixture);
                        ModeladoBase.mostrarMensaje("Datos del torneo registrados correctamente");
                        vista.setVisible(false);
                    }
                }
            } catch(NullPointerException ex){
                ModeladoBase.mostrarMensaje("Error 4: Caja de fecha vacia\n" + " por favor ingresar una fecha");
            }
            
        }
        if(e.getSource() == vista.jbtnArbitros){
            
            RegistroListaArbitros rjArbitros = new RegistroListaArbitros(null, true);
            ControladorRegistroListaArbitros controlador = new ControladorRegistroListaArbitros(rjArbitros, modelo, vista.jtxtNombre.getText());
            controlador.iniciar();
            rjArbitros.setVisible(true);
            
        }
        if(e.getSource() == vista.jbtnAsignarEquipos){
            
            RegistroListaEquipos rjEquipos = new RegistroListaEquipos(null, true);
            ControladorRegistroListaEquipos controlador = new ControladorRegistroListaEquipos(rjEquipos, modelo, vista.jtxtNombre.getText(), (String) vista.jcbCategoria.getSelectedItem());
            controlador.iniciar();
            rjEquipos.setVisible(true);
        }


    }
    
    

}
