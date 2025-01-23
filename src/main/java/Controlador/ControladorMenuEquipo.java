
package Controlador;

import Modelo.Equipo;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuEquipo;
import Vista.DetalleEquipo;
import Vista.MenuEquipo;
import Vista.MenuPrincipal;
import Vista.RegistroEquipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorMenuEquipo implements ActionListener {
    
    private MenuEquipo vista;
    private Equipo equipo;
    private OperacionesMenuEquipo modelo;

    public ControladorMenuEquipo(MenuEquipo vista, Equipo equipo, OperacionesMenuEquipo modelo) {
        this.vista = vista;
        this.equipo = equipo;
        this.modelo = modelo;
        vista.btnEliminar.addActionListener(this);
        vista.btnRegistrar.addActionListener(this);
        vista.btnRetroceder.addActionListener(this);
        vista.jbtnDetalle.addActionListener(this);
    }
    
    public void iniciar(){
        //agregamos columnas
        vista.modeloTabla.addColumn("ID");
        vista.modeloTabla.addColumn("NOMBRES");
        vista.modeloTabla.addColumn("FECHA FUNDACION");
        vista.modeloTabla.addColumn("CATEGORIA"); 
        //agregamos filas
        agregarFilas();
    }
    
    private void agregarFilas(){
        
        String[][] tabla = modelo.cargarTabla();
        
        for(String[] tabla1 : tabla){
            vista.modeloTabla.addRow(tabla1);
        }        
    }
    
    public void refrescarTabla(){
        MenuEquipo mEquipo = new MenuEquipo();
        Equipo equipo = new Equipo();
        OperacionesMenuEquipo operaciones =  new OperacionesMenuEquipo();
        ControladorMenuEquipo controlador = new ControladorMenuEquipo(mEquipo, equipo, operaciones);
        controlador.iniciar();
        ModeladoBase.nuevoPanel(mEquipo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.btnRegistrar){
            RegistroEquipo vista = new RegistroEquipo(null, true);
            equipo = new Equipo();
            ControladorRegistroEquipo controlador = new ControladorRegistroEquipo(vista, equipo, modelo);
            controlador.iniciar();
            vista.setVisible(true);
            refrescarTabla();
        }
        if(e.getSource() == vista.btnEliminar){
            int filaVista = vista.jtblEquipos.getSelectedRow();
            int filaModelo = vista.jtblEquipos.convertRowIndexToModel(filaVista);
            
            if(modelo.eliminarEquipo(filaVista, (String) vista.modeloTabla.getValueAt(filaModelo, 0))){
                refrescarTabla();
            }
        }
        if(e.getSource() == vista.jbtnDetalle){
            int filaSelec = vista.jtblEquipos.getSelectedRow();
            int filaModelo = vista.jtblEquipos.convertRowIndexToModel(filaSelec);
            
            if(filaSelec < 0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }
            else{
                equipo = modelo.obtenerEquipo((String) vista.modeloTabla.getValueAt(filaModelo, 0));
                DetalleEquipo dtEquipo = new DetalleEquipo();
                ControladorDetalleEquipo controlador = new ControladorDetalleEquipo(dtEquipo, equipo, modelo);
                controlador.iniciar();
                ModeladoBase.nuevoPanel(dtEquipo);
            }            
        }
        if(e.getSource() == vista.btnRetroceder){
            //mostramos el Menu Principal
            MenuPrincipal mPrincipal = new MenuPrincipal();
            ModeladoBase.nuevoPanel(mPrincipal);
        }

    }

}
