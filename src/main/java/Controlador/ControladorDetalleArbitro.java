
package Controlador;

import Modelo.Arbitro;
import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuArbitro;
import Modelo.OperacionesMenuJugador;
import Vista.DetalleArbitro;
import Vista.MenuArbitro;
import Vista.MenuJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorDetalleArbitro implements ActionListener {
    
    private Arbitro arbitro;
    private DetalleArbitro vista;
    private OperacionesMenuArbitro modelo;

    public ControladorDetalleArbitro(Arbitro arbitro, DetalleArbitro vista, OperacionesMenuArbitro modelo) {
        this.arbitro = arbitro;
        this.vista = vista;
        this.modelo = modelo;
        vista.jbtnModificar.addActionListener(this);
        vista.jbtnRetroceder.addActionListener(this);
    }
    
    public void iniciar(){
        
        vista.jtxtID.setText(arbitro.getIdArbitro());
        vista.jtxtApellidos.setText(arbitro.getApellidos());
        vista.jtxtNombre.setText(arbitro.getNombres());
        vista.jdcFechaNacimiento.setCalendar(ModeladoBase.fechaToCalendar(arbitro.getFechaNacimiento()));
        vista.jtxtDNI.setText(arbitro.getDni());
        vista.jtxtPais.setText(arbitro.getPaisOrigen());
        vista.jtxtSexo.setText(arbitro.getSexo());    
        mostrarTorneos();
    }
    
    private void mostrarTorneos(){
        
        vista.lista = modelo.buscarTorneos(arbitro.getIdArbitro());
        
        if(vista.lista != null){
            vista.jlistTorneoArbitro.setModel(vista.lista);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnRetroceder){
            MenuArbitro mArbitro = new MenuArbitro();
            Arbitro arbitro = new Arbitro();
            OperacionesMenuArbitro op = new OperacionesMenuArbitro();
            ControladorMenuArbitro controlador = new ControladorMenuArbitro(mArbitro, op, arbitro);
            controlador.iniciar();
            
            ModeladoBase.nuevoPanel(mArbitro);
        }
        if(e.getSource() == vista.jbtnModificar){
            
            if(ModeladoBase.validacion("N.A", vista.jtxtNombre.getText(), vista.jtxtApellidos.getText(), String.valueOf(vista.jdcFechaNacimiento.getCalendar().get(Calendar.YEAR)), vista.jtxtPais.getText()) == true){
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de guardar los cambios del jugador?", "Modificar Datos");
                if(eleccion == JOptionPane.YES_OPTION){
                    //Creamos un nuevo Arbitro para la modificacion    
                    Arbitro nuevo = new Arbitro();
                    
                    nuevo.setIdArbitro(vista.jtxtID.getText());
                    nuevo.setDni(vista.jtxtDNI.getText());
                    nuevo.setNombres(vista.jtxtNombre.getText());
                    nuevo.setApellidos(vista.jtxtApellidos.getText());
                    nuevo.setPaisOrigen(vista.jtxtPais.getText());
                    nuevo.setSexo(vista.jtxtSexo.getText());
                    nuevo.setFechaNacimiento(ModeladoBase.fechaCompleta(vista.jdcFechaNacimiento.getCalendar()));
                    nuevo.setDisponibilidad(arbitro.getDisponibilidad());
                    
                    //Reemplazamos el jugador actual por el nuevo con las modificaciones
                    modelo.modificarArbitro(arbitro, nuevo);

                    ModeladoBase.mostrarMensaje("Datos del formulario modificados correctamente.");
                }
            }
            
        }

    }

}
