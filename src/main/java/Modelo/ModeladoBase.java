
package Modelo;

import static Vista.Principal.panelPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author André Mujica 
 */
public class ModeladoBase {

    public static boolean aLogico(String selec){
        
        boolean logico;
        
        if(selec.equals("Sí"))
            logico = true;
        else
            logico = false;
        
        return logico;
    }
    
    public static String aCadena(boolean disp){
        String msj = "Ninguno";
        if(disp)
            msj = "SÍ";
        else
            msj = "NO";
        return msj;
    }
    
    public static String estadoPartido(boolean disp){
        if(disp){
            return "SIN JUGAR";
        }
        else{
            return "FINALIZADO";
        }
    }
    
    public static void nuevoPanel(JPanel panelActual){
        panelPrincipal.removeAll();
        panelPrincipal.add(panelActual);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
        
    }

    public static String fechaCompleta(Calendar calendario){
        
        String fecha, dia, mes, anio;
        
        dia = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
        mes = String.valueOf(calendario.get(Calendar.MONTH)+1);
        anio = String.valueOf(calendario.get(Calendar.YEAR));
        
        fecha = (dia+"/"+mes+"/"+anio);
        
        return fecha;
    }
    
    public static Calendar fechaToCalendar(String fecha){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            cal.setTime(sdf.parse(fecha));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
        return cal;
    }
    
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int preguntar(String mensaje, String encabezado){
       int rspt = JOptionPane.showConfirmDialog(null, mensaje, encabezado, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       return rspt;
    }
    
    public static void mostrarError(String msjError){
       JOptionPane.showMessageDialog(null, msjError, "¡ERROR!", JOptionPane.ERROR_MESSAGE); 
    }
    
    public static void mostrarAdvertencia(String msjAdvertencia,String nAdvertencia){
        JOptionPane.showMessageDialog(null, msjAdvertencia, "¡ADVERTENCIA! "+nAdvertencia , JOptionPane.WARNING_MESSAGE); 
    }
    
    public static boolean campoVacio(String campo){
        return !(campo.trim().isEmpty());
    }
    
    public static boolean tamDoc(String docIdentidad, int tam){
        return docIdentidad.length() == tam;
    }
    
    public static boolean numeroEntero(String campo){
        try{
            Long.parseLong(campo);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean numeroDouble(String campo){
        try{
            Double.parseDouble(campo);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean rangoEdad(String campo, int inf, int sup){
        Calendar c = Calendar.getInstance();
        int anio = c.get(Calendar.YEAR);
        
        try{
            int valor = anio - Integer.parseInt(campo);
            
            if(valor >= inf && valor <= sup){
                return true;
            }
        }catch(NumberFormatException e){
            
        }
        
        return false;
    }
    
    public static boolean validarIdentidad(String campo){
        
        GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin");
        ArrayList<Arbitro> listaArbitros = gestorArbitro.getDatos();
        
        for(Arbitro arb : listaArbitros){
            if(arb.getDni().equalsIgnoreCase(campo)){
                return false;
            }
        }
        
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin");
        ArrayList<Jugador> listaJugadores = gestorJugador.getDatos();
        
        for(Jugador jug : listaJugadores){
            if(jug.getDni().equalsIgnoreCase(campo)){
                return false;
            }
        }
        /*
        GestorFicheroSerializado <Entrenador> gestorEntrenador = new GestorFicheroSerializado("Ficheros\\Entrenadores.bin");
        ArrayList<Entrenador> listaEntrenadores = gestorEntrenador.getDatos();
        
        for(Entrenador ent : listaEntrenadores){
            if(ent.getDni().equalsIgnoreCase(campo)){
                return false;
            }
        }*/
        
        return true;
    }
    
    public static boolean validacion(String dni, String nombre, String apellidos, String edad, String pais){
        
        if(!dni.equalsIgnoreCase("N.A")){
            if(ModeladoBase.campoVacio(dni) == false){
                ModeladoBase.mostrarMensaje("Error 1: El campo de identidad esta vacio\n" + "por favor digite la informacion de este campo");
                return false;
            }
            if(ModeladoBase.numeroEntero(dni) == false){
                ModeladoBase.mostrarMensaje("Error 5: El campo de identidad no es valido\n" + "este campo debe contener solo digitos");
                return false;
            }

            if(ModeladoBase.tamDoc(dni, 8) == false){
                ModeladoBase.mostrarMensaje("Error 6: El campo de identidad no es valido\n" + "este campo debe estar compuesto por 8 digitos");
                return false;
            }

            if(ModeladoBase.validarIdentidad(dni) == false){
                ModeladoBase.mostrarMensaje("Error 7: El dni ingresado ya existe\n" + "no pueden existir dos personas con el mismo documento de identidad.");
                return false;
            }            
        }
        
        if(ModeladoBase.campoVacio(nombre) == false){
            ModeladoBase.mostrarMensaje("Error 2: El campo de nombres esta vacio\n" + "por favor digite la informacion de este campo");
            return false;
        }
        if(ModeladoBase.campoVacio(apellidos) == false){
            ModeladoBase.mostrarMensaje("Error 3: El campo de apellidos esta vacio\n" + "por favor digite la informacion de este campo");
            return false;
        }
        
        if(ModeladoBase.campoVacio(pais) == false){
            ModeladoBase.mostrarMensaje("Error 4: El campo de pais esta vacio\n" + "por favor digite la informacion de este campo");
            return false;
        }
        
        if(ModeladoBase.rangoEdad(edad, 10, 45) == false){
            ModeladoBase.mostrarMensaje("Error 8: El campo de fecha de nacimiento no es valido\n" + "La edad de un arbitro debe estar entre 10-45 años");
            return false;
        }
        
        return true;
    }
}
