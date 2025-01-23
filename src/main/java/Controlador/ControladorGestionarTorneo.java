

package Controlador;

import Modelo.Fixture;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Torneo;
import Vista.MenuGestionPartido;
import Vista.MenuGestionTorneo;
import Vista.MenuTorneo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorGestionarTorneo implements ActionListener {
    
    private MenuGestionTorneo vista;
    private Fixture fixture;
    private OperacionesMenuTorneo modelo;
    private String torneo;

    public ControladorGestionarTorneo(MenuGestionTorneo vista, Fixture fixture, OperacionesMenuTorneo modelo) {
        this.vista = vista;
        this.fixture = fixture;
        this.modelo = modelo;
        this.torneo = modelo.nombreTorneo(fixture.getCodFixture()).toUpperCase();
        vista.jbtnGestionarPartidos.addActionListener(this);
        vista.jbtnRegresar.addActionListener(this);
    }
    
    public void iniciar(){
        
        vista.jtxtNombreTorneo.setText("TABLA DE POSICIONES DEL TORNEO " + torneo);
        //agregamos columnas
        vista.modeloTabla.addColumn("EQUIPO");
        vista.modeloTabla.addColumn("PJ");
        vista.modeloTabla.addColumn("PG");
        vista.modeloTabla.addColumn("PE"); 
        vista.modeloTabla.addColumn("PP");
        vista.modeloTabla.addColumn("GF");
        vista.modeloTabla.addColumn("GC");
        vista.modeloTabla.addColumn("DF");
        vista.modeloTabla.addColumn("PUNTOS");
        //agregamos filas
        agregarFilas();    
    }
    
    private void agregarFilas(){
        
        String[][] tabla = modelo.generarPosiciones(fixture);
        
        for(String[] tbl : tabla){
            vista.modeloTabla.addRow(tbl);
        }
        
    }
    
    public void refrescarTabla(){
        
        MenuGestionTorneo mgTorneo = new MenuGestionTorneo();
        ControladorGestionarTorneo controlador = new ControladorGestionarTorneo(mgTorneo, fixture, modelo);
        controlador.iniciar();
        ModeladoBase.nuevoPanel(mgTorneo); 
    }    

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnGestionarPartidos){
            
            MenuGestionPartido mgPartido = new MenuGestionPartido();
            ControladorGestionarPartido controlador = new ControladorGestionarPartido(fixture, mgPartido, modelo, torneo);
            controlador.iniciar();
            ModeladoBase.nuevoPanel(mgPartido);
            
        }
        if(e.getSource() == vista.jbtnRegresar){
            MenuTorneo mTorneo = new MenuTorneo();
            Torneo torneo = new Torneo();
            OperacionesMenuTorneo operaciones = new OperacionesMenuTorneo();
            ControladorMenuTorneo controlador = new ControladorMenuTorneo(mTorneo, torneo, operaciones);
            controlador.iniciar();
            ModeladoBase.nuevoPanel(mTorneo);
        }

    }
    
}
