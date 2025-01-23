
package Controlador;

import Modelo.Equipo;
import Modelo.GestorFicheroSerializado;
import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuJugador;
import Vista.DetalleJugador;
import Vista.MenuJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorDetalleJugador implements ActionListener {
    
    private Jugador jugador;
    private DetalleJugador vista;
    private OperacionesMenuJugador modelo;

    public ControladorDetalleJugador(Jugador jugador, DetalleJugador vista, OperacionesMenuJugador modelo) {
        this.jugador = jugador;
        this.vista = vista;
        this.modelo = modelo;
        vista.jbtnModificar.addActionListener(this);
        vista.btnRetroceder.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtID.setText(jugador.getIdJugador());
        vista.jtxtDNI.setText(jugador.getDni());
        vista.jtxtNombres.setText(jugador.getNombres());
        vista.jtxtApellidos.setText(jugador.getApellidos());
        vista.jtxtPais.setText(jugador.getPaisOrigen());
        vista.jtxtSexo.setText(jugador.getSexo());
        vista.jdcFechaNacimiento.setCalendar(ModeladoBase.fechaToCalendar(jugador.getFechaNacimiento()));
        asignarEquipo();
    }
    
    private void asignarEquipo(){
        if(jugador.getTransferible()==true){
            vista.jtxtEquipo.setText("No Asignado");
        }else{
            vista.jtxtEquipo.setText(modelo.buscarEquipoJugador(jugador.getIdJugador()));          
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.btnRetroceder){
            MenuJugador mJugador = new MenuJugador();
            Jugador jugador = new Jugador();
            OperacionesMenuJugador op = new OperacionesMenuJugador();
            ControladorMenuJugador controlador = new ControladorMenuJugador(mJugador, jugador, op);
            controlador.iniciar();
            
            ModeladoBase.nuevoPanel(mJugador);
        }
        if(e.getSource() == vista.jbtnModificar){
            
            if(ModeladoBase.validacion("N.A", vista.jtxtNombres.getText(), vista.jtxtApellidos.getText(), String.valueOf(vista.jdcFechaNacimiento.getCalendar().get(Calendar.YEAR)), vista.jtxtPais.getText()) == true){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de guardar los cambios del jugador?", "Modificar Datos");
                if(eleccion == JOptionPane.YES_OPTION){
                    //Creamos un nuevo Jugador para la modificacion    
                    Jugador nuevo = new Jugador();
        
                    nuevo.setIdJugador(vista.jtxtID.getText());
                    nuevo.setDni(vista.jtxtDNI.getText());
                    nuevo.setNombres(vista.jtxtNombres.getText());
                    nuevo.setApellidos(vista.jtxtApellidos.getText());
                    nuevo.setPaisOrigen(vista.jtxtPais.getText());
                    nuevo.setSexo(vista.jtxtSexo.getText());
                    nuevo.setFechaNacimiento(ModeladoBase.fechaCompleta(vista.jdcFechaNacimiento.getCalendar()));
                    nuevo.setTransferible(jugador.getTransferible());
                    
                    //Reemplazamos el jugador actual por el nuevo con las modificaciones
                    modelo.modificarJugador(jugador, nuevo);

                    ModeladoBase.mostrarMensaje("Datos del formulario modificados correctamente.");
                }
            }
        }
    }

}
