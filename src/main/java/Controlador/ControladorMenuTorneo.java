

package Controlador;

import Modelo.Fixture;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Torneo;
import Vista.MenuGestionTorneo;
import Vista.MenuPrincipal;
import Vista.MenuTorneo;
import Vista.RegistroTorneo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorMenuTorneo implements ActionListener {
    
    private MenuTorneo vista;
    private Torneo torneo;
    private OperacionesMenuTorneo modelo;

    public ControladorMenuTorneo(MenuTorneo vista, Torneo torneo, OperacionesMenuTorneo modelo) {
        this.vista = vista;
        this.torneo = torneo;
        this.modelo = modelo;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnGestionarTorneo.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        vista.jbtnRetroceder.addActionListener(this);
    }

    public void iniciar(){
        
        //agregamos columnas
        vista.modeloTabla.addColumn("ID");
        vista.modeloTabla.addColumn("NOMBRE");
        vista.modeloTabla.addColumn("CATEGORIA"); 
        vista.modeloTabla.addColumn("FECHA INICIO");
        vista.modeloTabla.addColumn("FECHA FIN");
        //agregamos filas
        agregarFilas();        
    }
    
    private void agregarFilas(){
        
        String[][] tabla = modelo.cargarTabla();
        
        for(String[] tbl : tabla){
            vista.modeloTabla.addRow(tbl);
        }
    }
    
    public void refrescarTabla(){
        //mostramos nuevamente el panel Equipo
        MenuTorneo mt = new MenuTorneo();
        Torneo tor = new Torneo();
        OperacionesMenuTorneo op =  new OperacionesMenuTorneo();
        ControladorMenuTorneo controlador = new ControladorMenuTorneo(mt, tor, op);
        controlador.iniciar();
        ModeladoBase.nuevoPanel(mt);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jbtnRegistrar){            
            RegistroTorneo vista = new RegistroTorneo(null, true);
            torneo = new Torneo();
            ControladorRegistroTorneo controlador = new ControladorRegistroTorneo(vista, torneo, modelo);
            controlador.iniciar();
            vista.setVisible(true);
            refrescarTabla();
        }
        if(e.getSource() == vista.jbtnEliminar){
            int filaVista= vista.jtblTorneos.getSelectedRow();
            int filaModelo = vista.jtblTorneos.convertRowIndexToModel(filaVista);
            
            if(modelo.eliminarTorneo(filaVista, (String) vista.modeloTabla.getValueAt(filaModelo, 0))){
                refrescarTabla();
            }
            
        }
        if(e.getSource() == vista.jbtnGestionarTorneo){
            
            int filaSelec = vista.jtblTorneos.getSelectedRow();
            int filaModelo = vista.jtblTorneos.convertRowIndexToModel(filaSelec);
            if(filaSelec < 0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }
            else{
                Fixture fixture = modelo.obtenerFixture((String) vista.modeloTabla.getValueAt(filaModelo, 0));
                MenuGestionTorneo mgTorneo = new MenuGestionTorneo();
                ControladorGestionarTorneo controlador = new ControladorGestionarTorneo(mgTorneo, fixture, modelo);
                controlador.iniciar();
                ModeladoBase.nuevoPanel(mgTorneo); 
            }
            
        }
        if(e.getSource() == vista.jbtnRetroceder){
            //mostramos el Menu Principal
            MenuPrincipal mPrincipal = new MenuPrincipal();
            ModeladoBase.nuevoPanel(mPrincipal);
        }


    }
    
    
}
