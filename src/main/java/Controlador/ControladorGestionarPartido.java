

package Controlador;

import Modelo.Arbitro;
import Modelo.Fixture;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuTorneo;
import Modelo.Partido;
import Modelo.Torneo;
import Vista.MenuGestionPartido;
import static Vista.MenuGestionPartido.partSelec;
import static Vista.MenuGestionPartido.partidoJugado;
import Vista.MenuTorneo;
import Vista.RegistroPartido;
import Vista.RegistroSeleccionArbitro;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author André Mujica 
 */
public class ControladorGestionarPartido implements ActionListener {
    
    private Fixture fixture;
    private MenuGestionPartido vista;
    private OperacionesMenuTorneo modelo;
    private String torneo;

    public ControladorGestionarPartido(Fixture fixture, MenuGestionPartido vista, OperacionesMenuTorneo modelo, String torneo) {
        this.fixture = fixture;
        this.vista = vista;
        this.modelo = modelo;
        this.torneo = torneo;
        vista.btnAsignarArbitro.addActionListener(this);
        vista.btnJugar.addActionListener(this);
        vista.btnRegresar.addActionListener(this);
    }
    
    public void iniciar(){
        
        vista.jtxtNombreTorneo.setText("FIXTURE OFICIAL DEL TORNEO " + torneo);
        
        vista.modeloTabla.addColumn("CODIGO");
        vista.modeloTabla.addColumn("EQUIPO LOCAL");
        vista.modeloTabla.addColumn("EQUIPO VISITANTE");
        vista.modeloTabla.addColumn("ESTADO"); 
        //agregamos filas
        agregarFilas();
    }
    
    private void agregarFilas(){
        
        String[][] partidos = modelo.cargarPartidos(fixture);
        
        for(String[] tbl : partidos){
            vista.modeloTabla.addRow(tbl);
        }
    }
    
    private void refrescarTablas(){
        MenuGestionPartido mgPartido = new MenuGestionPartido();
        ControladorGestionarPartido controlador = new ControladorGestionarPartido(fixture, mgPartido, modelo, torneo);
        controlador.iniciar();
        ModeladoBase.nuevoPanel(mgPartido);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.btnAsignarArbitro){
            
            try{
                int filaVista = vista.jtblPartidos.getSelectedRow();
                if(filaVista < 0){
                    ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
                }
                else{
                    int filaModelo = vista.jtblPartidos.convertRowIndexToModel(filaVista);
                    Partido partido = modelo.obtenerPartido((String) vista.modeloTabla.getValueAt(filaModelo, 0), fixture);

                    if(partido.getArbitro() == null){
                        RegistroSeleccionArbitro rsAerbitro = new RegistroSeleccionArbitro(null, true);
                        ControladorRegistroSeleccionArbitro controlador = new ControladorRegistroSeleccionArbitro(rsAerbitro, partido, fixture.getCodFixture(), modelo);
                        controlador.iniciar();
                        rsAerbitro.setVisible(true);

                        modelo.setPartido(partSelec, fixture);
                        modelo.reestablecerFichero(fixture);     
                    }
                    else{
                        ModeladoBase.mostrarMensaje("EL PARTIDO YA TIENE REGISTRADO UN ARBITRO");
                    }
                }
            } catch (HeadlessException ex) {
                ModeladoBase.mostrarError("NO SE PUDO SELECCIONAR\n"+e);
            } 
            
        }
        if(e.getSource() == vista.btnJugar){
            
            int filaVista = vista.jtblPartidos.getSelectedRow();
            
            if(filaVista < 0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA");
            }
            else{
                
                int filaModelo = vista.jtblPartidos.convertRowIndexToModel(filaVista);
                Partido partido = modelo.obtenerPartido((String) vista.modeloTabla.getValueAt(filaModelo, 0), fixture);
                
                try{
                    Arbitro arb = partido.getArbitro(); //Saca un excepcion en caso el partido no tenga un arbitro asignado

                    if(partido.getEstado()){
                        RegistroPartido rPartido = new RegistroPartido(null, true);
                        ControladorRegistroPartido controlador = new ControladorRegistroPartido(rPartido, modelo, partido);
                        controlador.iniciar();
                        rPartido.setVisible(true);

                        modelo.setPartido(partidoJugado, fixture);
                        modelo.reestablecerFichero(fixture);
                    }
                    else{
                        ModeladoBase.mostrarMensaje("El partido ha finalizado, no se pueden realizar mas cambios.");
                    }
                } catch(NullPointerException ex){
                    ModeladoBase.mostrarError("El partido seleccionado no tiene un arbitro asignado\n" + "por favor presione el boton de asignar arbitro para asignarle uno al partido");
                }
            }  

            refrescarTablas();
            
        }
        if(e.getSource() == vista.btnRegresar){
            
            MenuTorneo mTorneo = new MenuTorneo();
            Torneo torneo = new Torneo();
            OperacionesMenuTorneo operaciones = new OperacionesMenuTorneo();
            ControladorMenuTorneo controlador = new ControladorMenuTorneo(mTorneo, torneo, operaciones);
            controlador.iniciar();
            ModeladoBase.nuevoPanel(mTorneo);
        }

    }
    
    

}
