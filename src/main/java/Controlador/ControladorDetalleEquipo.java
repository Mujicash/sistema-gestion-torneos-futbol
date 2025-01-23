
package Controlador;

import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuEquipo;
import Vista.DetalleEquipo;
import Vista.MenuEquipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

/**
 * 
 * @author André Mujica 
 */
public class ControladorDetalleEquipo implements ActionListener {
    
    private DetalleEquipo vista;
    private Equipo equipo;
    private OperacionesMenuEquipo modelo;

    public ControladorDetalleEquipo(DetalleEquipo vista, Equipo equipo, OperacionesMenuEquipo modelo) {
        this.vista = vista;
        this.equipo = equipo;
        this.modelo = modelo;
        vista.btnRetroceder.addActionListener(this);
    }

    public void iniciar(){
        vista.jtxtID.setText(equipo.getIdEquipo());
        vista.jtxtNombre.setText(equipo.getNombre());
        vista.jtxtCategoria.setText(equipo.getCategoria());
        vista.jdcFundacion.setCalendar(ModeladoBase.fechaToCalendar(equipo.getFundacion()));
        cargarListaJugadores();
    }
    
    private void cargarListaJugadores(){
        TreeSet<Jugador> list = equipo.getJugadores();
        
        for(Jugador i : list){
            vista.listaJugadores.addElemento(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.btnRetroceder){
            MenuEquipo mEquipo = new MenuEquipo();
            Equipo eq = new Equipo();
            OperacionesMenuEquipo op =  new OperacionesMenuEquipo();
            ControladorMenuEquipo controlador = new ControladorMenuEquipo(mEquipo, eq, op);
            controlador.iniciar();
            ModeladoBase.nuevoPanel(mEquipo);
        }

    }

}
