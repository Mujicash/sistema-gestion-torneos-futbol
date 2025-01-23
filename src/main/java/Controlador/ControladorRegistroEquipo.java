
package Controlador;

import Modelo.Equipo;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuEquipo;
import Vista.RegistroEquipo;
import Vista.RegistroListaJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroEquipo implements ActionListener {
    
    private RegistroEquipo vista;
    private Equipo equipo;
    private OperacionesMenuEquipo modelo;

    public ControladorRegistroEquipo(RegistroEquipo vista, Equipo equipo, OperacionesMenuEquipo modelo) {
        this.vista = vista;
        this.equipo = equipo;
        this.modelo = modelo;
        vista.jbnAgregarPlantilla.addActionListener(this);
        vista.jbtnRegistrar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtId.setText(modelo.generadorID());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnRegistrar){
            
            try{
                if(modelo.validacion(vista.jtxtNombre.getText(), vista.jtxtPlantilla.getText(), vista.jdcFundacion.getCalendar()) == true){
                    int eleccion = ModeladoBase.preguntar("¿Esta seguro de guardar los datos del equipo?", "Cargar datos");
                    if(eleccion == JOptionPane.YES_OPTION){
                        
                        //almacenamos atributos del equipo
                        equipo.setIdEquipo(vista.jtxtId.getText());
                        equipo.setNombre(vista.jtxtNombre.getText());
                        equipo.setCategoria((String) vista.jcbCategoria.getSelectedItem());
                        equipo.setParticipacion(true);
                        equipo.setFundacion(ModeladoBase.fechaCompleta(vista.jdcFundacion.getCalendar()));
                        //equipo.setPlantillaJugadores(RegistroEquipo.plantilla); //posible error
                        equipo.setJugadores(RegistroEquipo.listaJugadores);
                        //cambiamos la disponibilidad de los jugadores
                        modelo.actualizarPlantilla(equipo.getJugadores());
                        //guardamos el objeto equipo en el fichero
                        modelo.registrarEquipo(equipo);
                        ModeladoBase.mostrarMensaje("Datos del equipo registrados correctamente");
                        vista.setVisible(false);
                    }
                }
            } catch(NullPointerException ex){
                ModeladoBase.mostrarAdvertencia("No ha ingresado la fecha de fundacion\n" + "debe ingresar una", "0");
                vista.jdcFundacion.grabFocus();
            }
            
        }
        if(e.getSource() == vista.jbnAgregarPlantilla){
            
            RegistroListaJugadores rjJugador = new RegistroListaJugadores(null, true);
            ControladorRegistroListaJugadores controlador = new ControladorRegistroListaJugadores(rjJugador, modelo, vista.jtxtNombre.getText());
            controlador.iniciar();
            rjJugador.setVisible(true);
        }

    }

}
