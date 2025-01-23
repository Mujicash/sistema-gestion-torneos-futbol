

package Controlador;

import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Partido;
import Vista.MenuGestionPartido;
import Vista.RegistroPartido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroPartido implements ActionListener {
    
    private RegistroPartido vista;
    private OperacionesMenuTorneo modelo;
    private Partido partido;

    public ControladorRegistroPartido(RegistroPartido vista, OperacionesMenuTorneo modelo, Partido partido) {
        this.vista = vista;
        this.modelo = modelo;
        this.partido = partido;
        vista.jbtnRegistrar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.jtxtArbitro.setText(partido.getArbitro().getNombres().toUpperCase() + partido.getArbitro().getApellidos().toUpperCase());
        vista.jlblLocal.setText(partido.getLocal().getNombre());
        vista.jlblVisitante.setText(partido.getVisitante().getNombre());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnRegistrar){
            
            if(modelo.validarMarcadores(vista.jtxtGolesLocal.getText(), vista.jtxtGolesVisitante.getText()) == true){
                int eleccion = ModeladoBase.preguntar("¿Está seguro de guardar el resultado del partido?\n" + "Luego no se podra modificar", "Cargar datos del partido");
                if(eleccion == JOptionPane.YES_OPTION){
                    partido.setGolLocal(Integer.parseInt(vista.jtxtGolesLocal.getText()));
                    partido.setGolVisitante(Integer.parseInt(vista.jtxtGolesVisitante.getText()));
                    partido.setPuntos();
                    partido.setEstado(false);
                    MenuGestionPartido.partidoJugado = partido;
                    vista.setVisible(false);
                }
            }           
        }

    }

}
