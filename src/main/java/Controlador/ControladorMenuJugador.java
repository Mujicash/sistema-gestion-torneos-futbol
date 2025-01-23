
package Controlador;

import Modelo.Jugador;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuJugador;
import Vista.DetalleJugador;
import Vista.MenuJugador;
import Vista.MenuPrincipal;
import Vista.RegistroJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorMenuJugador implements ActionListener {
    
    private MenuJugador mjugador;
    private Jugador jugador;
    private OperacionesMenuJugador modelo;

    public ControladorMenuJugador(MenuJugador mjugador, Jugador jugador, OperacionesMenuJugador modelo) {
        this.mjugador = mjugador;
        this.jugador = jugador;
        this.modelo = modelo;
        mjugador.btnAgregar.addActionListener(this);
        mjugador.btnEliminar.addActionListener(this);
        mjugador.btnRetroceder.addActionListener(this);
        mjugador.jbtnDetalle.addActionListener(this);
    }
    
    public void iniciar(){
        
        //agregamos columnas
        mjugador.modeloTabla.addColumn("ID");
        mjugador.modeloTabla.addColumn("DNI");
        mjugador.modeloTabla.addColumn("NOMBRES");
        mjugador.modeloTabla.addColumn("APELLIDOS");
        mjugador.modeloTabla.addColumn("F.NAC");
        mjugador.modeloTabla.addColumn("PAIS");
        mjugador.modeloTabla.addColumn("TRANFERIBLE");
        
        //agregamos filas
        agregarFilas();
    }
    
    private void agregarFilas(){
                
        String[][] tabla = modelo.cargarTabla();
        
        for (String[] tabla1 : tabla) {
            mjugador.modeloTabla.addRow(tabla1);
        }
    }
    
    public void refrescarTabla(){
        MenuJugador mJugador = new MenuJugador();
        Jugador jugador = new Jugador();
        OperacionesMenuJugador operaciones = new OperacionesMenuJugador();
        ControladorMenuJugador controlador = new ControladorMenuJugador(mJugador, jugador, operaciones);
        controlador.iniciar();
        ModeladoBase.nuevoPanel(mJugador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == mjugador.btnAgregar){
            RegistroJugador vista = new RegistroJugador(null, true);
            jugador = new Jugador();
            ControladorRegistroJugador controlador = new ControladorRegistroJugador(vista, jugador, modelo);
            controlador.iniciar();
            vista.setVisible(true);
            refrescarTabla();
        }
        if(e.getSource() == mjugador.btnEliminar){
            int filaVista = mjugador.jtblJugadores.getSelectedRow();
            int filaModelo = mjugador.jtblJugadores.convertRowIndexToModel(filaVista);
            
            if(modelo.eliminarJugador(filaVista, (String) mjugador.modeloTabla.getValueAt(filaModelo, 0))){
                refrescarTabla();
            }    
        }
        if(e.getSource() == mjugador.jbtnDetalle){
            
            int filaSelec = mjugador.jtblJugadores.getSelectedRow();
            if(filaSelec < 0){
                ModeladoBase.mostrarError("SELECCIONE EL CODIGO DE UN JUGADOR DE LA TABLA");
            }
            else{
                int filaModelo = mjugador.jtblJugadores.convertRowIndexToModel(filaSelec);
                jugador = modelo.ObtenerJugador((String) mjugador.modeloTabla.getValueAt(filaModelo, 0));
                DetalleJugador dtJugador = new DetalleJugador();
                ControladorDetalleJugador controlador = new ControladorDetalleJugador(jugador, dtJugador, modelo);
                controlador.iniciar();
                ModeladoBase.nuevoPanel(dtJugador);
            }            
        }
        if(e.getSource() == mjugador.btnRetroceder){
            //mostramos el Menu Principal
            MenuPrincipal mPrincipal = new MenuPrincipal();
            ModeladoBase.nuevoPanel(mPrincipal);
        }
    }
}
