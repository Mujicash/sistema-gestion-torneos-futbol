
package Controlador;

import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuJugador;
import Vista.RegistroJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroJugador implements ActionListener {
    
    private RegistroJugador vista;
    private Jugador jugador;
    private OperacionesMenuJugador modelo;

    public ControladorRegistroJugador(RegistroJugador vista, Jugador jugador, OperacionesMenuJugador modelo) {
        this.vista = vista;
        this.jugador = jugador;
        this.modelo = modelo;
        vista.jbtnRegistrar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.boxId.setText(modelo.generadorID());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.jbtnRegistrar){
            
            if(ModeladoBase.validacion(vista.boxDni.getText(), vista.boxNombres.getText(), vista.boxApellidos.getText(), String.valueOf(vista.jdcNacimiento.getCalendar().get(Calendar.YEAR)), vista.boxPais.getText()) == true){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de guardar estos datos del jugador?", "Cargar Datos");
                if(eleccion == JOptionPane.YES_OPTION){

                    //almacenamos los atributos ingresados
                    jugador.setIdJugador(vista.boxId.getText());
                    jugador.setDni(vista.boxDni.getText());
                    jugador.setNombres(vista.boxNombres.getText());
                    jugador.setApellidos(vista.boxApellidos.getText());
                    jugador.setFechaNacimiento(ModeladoBase.fechaCompleta(vista.jdcNacimiento.getCalendar()));
                    jugador.setPaisOrigen(vista.boxPais.getText());
                    jugador.setSexo((String) vista.comboSexo.getSelectedItem());
                    jugador.setTransferible(true);

                    //guardamos el jugador el fichero
                    modelo.registrarJugador(jugador);

                    ModeladoBase.mostrarMensaje("Datos del formulario registrados correctamente.");
                    vista.setVisible(false);
                }
            }                
        }
    }
}
