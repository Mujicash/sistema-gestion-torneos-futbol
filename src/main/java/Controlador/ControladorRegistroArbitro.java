
package Controlador;

import Modelo.Arbitro;
import Modelo.ModeladoBase;
import Modelo.OperacionesMenuArbitro;
import Vista.RegistroArbitro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class ControladorRegistroArbitro implements ActionListener {
    
    private RegistroArbitro vista;
    private Arbitro arbitro;
    private OperacionesMenuArbitro modelo;

    public ControladorRegistroArbitro(RegistroArbitro vista, Arbitro arbitro, OperacionesMenuArbitro modelo) {
        this.vista = vista;
        this.arbitro = arbitro;
        this.modelo = modelo;
        vista.btnRegistrar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.boxId.setText(modelo.generadorID());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.btnRegistrar){
            try {
                if(ModeladoBase.validacion(vista.boxDni.getText(), vista.boxNombres.getText(), vista.boxApellidos.getText(), String.valueOf(vista.jdcNacimiento.getCalendar().get(Calendar.YEAR)), vista.boxPais.getText()) == true){
                    int eleccion = ModeladoBase.preguntar("¿Esta seguro de de guardar los datos?", "Cargar Datos");
                    if(eleccion == JOptionPane.YES_OPTION){

                        //almacenamos atributos de arbitro
                        arbitro.setIdArbitro(vista.boxId.getText());
                        arbitro.setDni(vista.boxDni.getText());
                        arbitro.setNombres(vista.boxNombres.getText());
                        arbitro.setApellidos(vista.boxApellidos.getText());   
                        arbitro.setFechaNacimiento(ModeladoBase.fechaCompleta(vista.jdcNacimiento.getCalendar()));
                        arbitro.setSexo((String) vista.comboSexo.getSelectedItem());
                        arbitro.setPaisOrigen(vista.boxPais.getText());
                        arbitro.setDisponibilidad(true);

                        //guardamos el objeto arbrito en el archivo
                        modelo.registrarArbitro(arbitro);
                        
                        ModeladoBase.mostrarMensaje("Datos del formularios registrados correctamente");
                        vista.setVisible(false);
                    }
                }
            } catch (NullPointerException ex) {
                ModeladoBase.mostrarAdvertencia("No ha ingresado la fecha de nacimiento\n" + "debe ingresar una", "0");
                vista.jdcNacimiento.grabFocus();
            }
        }
    }
}
