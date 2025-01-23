
package Controlador;

import Modelo.Arbitro;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuArbitro;
import Vista.DetalleArbitro;
import Vista.MenuArbitro;
import Vista.MenuPrincipal;
import Vista.RegistroArbitro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorMenuArbitro implements ActionListener {
    
    private MenuArbitro vista;
    private OperacionesMenuArbitro modelo;
    private Arbitro arbitro;

    public ControladorMenuArbitro(MenuArbitro vista, OperacionesMenuArbitro modelo, Arbitro arbitro) {
        this.vista = vista;
        this.modelo = modelo;
        this.arbitro = arbitro;
        vista.btnAgregar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnRetroceder.addActionListener(this);
        vista.jbtnDetalle.addActionListener(this);
    }
    
    public void iniciar(){
        //agregamos columnas
        vista.modeloTabla.addColumn("ID");
        vista.modeloTabla.addColumn("DNI");
        vista.modeloTabla.addColumn("NOMBRES");
        vista.modeloTabla.addColumn("APELLIDOS");
        vista.modeloTabla.addColumn("F.NAC");
        vista.modeloTabla.addColumn("SEXO");
        vista.modeloTabla.addColumn("PAIS");
        vista.modeloTabla.addColumn("DISPONIBILIDAD");
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
        MenuArbitro mArbitro = new MenuArbitro();
        Arbitro arbitro = new Arbitro();
        OperacionesMenuArbitro operaciones = new OperacionesMenuArbitro();
        ControladorMenuArbitro controlador = new ControladorMenuArbitro(mArbitro, operaciones, arbitro);
        controlador.iniciar();        
        ModeladoBase.nuevoPanel(mArbitro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.btnAgregar){
            RegistroArbitro vista = new RegistroArbitro(null, true);
            arbitro = new Arbitro();
            ControladorRegistroArbitro controlador = new ControladorRegistroArbitro(vista, arbitro, modelo);
            controlador.iniciar();
            vista.setVisible(true);
            refrescarTabla();
        }
        if(e.getSource() == vista.btnEliminar){
            int filaVista = vista.jtblArbitros.getSelectedRow();
            int filaModelo = vista.jtblArbitros.convertRowIndexToModel(filaVista);
            
            if(modelo.eliminarArbitro(filaVista, (String) vista.modeloTabla.getValueAt(filaModelo, 0))){
                refrescarTabla();
            }            
        }
        if(e.getSource() == vista.jbtnDetalle){
            int filaSelec = vista.jtblArbitros.getSelectedRow();
            int filaModelo = vista.jtblArbitros.convertRowIndexToModel(filaSelec);
            
            if(filaSelec < 0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }
            else{
                arbitro = modelo.obtenerArbitro((String) vista.modeloTabla.getValueAt(filaModelo, 0));
                DetalleArbitro dtArbitro = new DetalleArbitro();
                ControladorDetalleArbitro controlador = new ControladorDetalleArbitro(arbitro, dtArbitro, modelo);
                controlador.iniciar();
                ModeladoBase.nuevoPanel(dtArbitro);
            }
        }
        if(e.getSource() == vista.btnRetroceder){
            //mostramos el Menu Principal
            MenuPrincipal mPrincipal = new MenuPrincipal();
            ModeladoBase.nuevoPanel(mPrincipal);
        }
    }
}
