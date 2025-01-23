
package Modelo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class OperacionesMenuEquipo implements Identificacion {
    
    public String[][] cargarTabla(){
        //abrimos archivo "Equipo"
        GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin");

        //ingresamos objetos del archivo en el arrayList "listaEquipos"
        ArrayList<Equipo> listaEquipos = gestorEquipo.getDatos();
    
        //declaramos las variables que componen la fila
        String id, nombres, fecha, categoria;
        String[][] tabla = new String[listaEquipos.size()][4];
        int i = 0;
        
        //recorremos el arrayList y guardamos los atributos de cada equipo
        for (Equipo eq : listaEquipos){
            
            id = eq.getIdEquipo();
            nombres = eq.getNombre();
            fecha = eq.getFundacion();
            categoria = eq.getCategoria();
            
            //formamos una vector cuyos campos componen la fila
            String [] fila = {id, nombres, fecha, categoria};
            
            tabla[i] = fila;
            i++;
        }
        
        return tabla;
    }
    
    /**
    * Se obtiene el equipo que tenga el id pasado por parametro
    * @param id -- codigo del equipo.
    * @return jugador que tenga el id pasado por parametro, null en caso no exista.
    */
    public Equipo obtenerEquipo(String id){        
        //abrimos archivo "Equipo"
        GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin");

        //ingresamos objetos del archivo en el arrayList "listaEquipos"
        ArrayList<Equipo> listaEquipos = gestorEquipo.getDatos();
    
        //creamos objeto del equipo buscado
        Equipo eqSelec = null;
        
        Iterator<Equipo> it = listaEquipos.iterator();
        boolean encontrado = false;
        
        while(it.hasNext() && !encontrado){
            eqSelec = it.next();
            
            if(id.equals(eqSelec.getIdEquipo())){
                encontrado = true;
            }
        }
        
        //retornamos el equipo Buscado
        return eqSelec;
    }
    
    /**
    * Se elimina al equipo seleccionado. 
    * @param filaVista -- Indice de la fila seleccionada en la tabla.
    * @param id -- id del equipo a eliminar.
    * @return true si la eliminacion fue exitosa, false en caso contrario.
    */
    public boolean eliminarEquipo(int filaVista, String id){
        boolean band = false;
        
        try {
            
            if(filaVista<0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }else{
                                    
                //obtenemos y almacenamos al Equipo seleccionado
                Equipo eqSelec = obtenerEquipo(id);

                    
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de eliminar el equipo seleccionado?", "Eliminacion");
                if(eleccion == JOptionPane.YES_OPTION){
                    //abrimos archivo "Equipo"
                    GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin");
                    //borramos el Equipo del archivo
                    gestorEquipo.borrarDatos(eqSelec);
                    band = true;
                }
                else{
                    System.out.println("Eliminacion de equipo cancelada");
                }
        }
        } catch (HeadlessException e) {
            ModeladoBase.mostrarMensaje("ERROR: NO SE PUDO ELIMINAR"+e);
        }
        
        return band;
    }
    
    /**
     * Se guarda el equipo en el fichero
     * @param x -- equipo a guardar
     */
    public void registrarEquipo(Equipo x){
        
        GestorFicheroSerializado<Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin");
        gestorEquipo.guardarDato(x);

    }
    
    /**
     * Se cambia la disponibilidad a false de los jugadores seleccionados para un nuevo equipo
     * @param jugadores -- arbol de jugadores seleccionados para un nuevo equipo
     */
    public void actualizarPlantilla(TreeSet<Jugador> jugadores){
        
        //abrimos archivo "Jugadores.bin"
        GestorFicheroSerializado<Jugador> gestorJugadores = new GestorFicheroSerializado("Ficheros\\Jugadores.bin");
        
        //Obtenemos el fichero jugadores
        ArrayList<Jugador> listJugadores = gestorJugadores.getDatos();
        
        //Cambiamos la disponibilidad de los jugadores seleccionados
        for(Jugador i : jugadores){
            System.out.println(i);
            for(int j = 0; j < listJugadores.size(); j++){
                if(i.getIdJugador().equalsIgnoreCase(listJugadores.get(j).getIdJugador())){
                    listJugadores.get(j).setTransferible(false);
                }
            }
        }
        
        //eliminamos el fichero existente
        gestorJugadores.eliminar();
        //guardamos nuevamente los jugadores con los cambios respectivos
        for(Jugador i : listJugadores){
            gestorJugadores.guardarDato(i);
        }
    }
    
    /**
     * 
     * @return retorna una lista con los jugadores que estan disponibles para jugar en un equipo
     */
    public ArrayList<Jugador> obtenerJugadoresTransferibles(){
        //abrimos archivo "Jugador"
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin"); 
        
        //ingresamos objetos del archivo en el arrayList "listaJugadores"
        ArrayList<Jugador> listaJugadores = gestorJugador.getDatos();
        ArrayList<Jugador> transferibles = new ArrayList<>();
        
        for (Jugador lJugador : listaJugadores) {
            if(lJugador.getTransferible()){
                transferibles.add(lJugador);
            }
        }
        
        return transferibles;
    }
    
    /**
     * Pasa un arraylist a un TreeSet
     * @param lista -- lista de jugadores
     * @return arbol de jugadores
     */
    public TreeSet<Jugador> arbolJugadores(ArrayList<Jugador> lista){
        
        TreeSet<Jugador> jugadores = new TreeSet<>();
        
        for(Jugador i : lista){
            System.out.println(i);
            jugadores.add(i);
        }
        
        return jugadores;
    }
    
    public boolean validacion(String nombre, String plantilla, Calendar fundacion){
        
        if(ModeladoBase.campoVacio(nombre) == false){
            ModeladoBase.mostrarMensaje("Error 1: El campo de nombres esta vacio\n" + "por favor digite la informacion de este campo");
            return false;
        }
        if(ModeladoBase.campoVacio(plantilla) == false){
            ModeladoBase.mostrarMensaje("Error 3: No se ha registrado ningun jugador para el equipo\n" + "por favor presione el boton de PLANTILLA para registrar uno");
            return false;
        }
        if(fundacion == null){
            ModeladoBase.mostrarAdvertencia("No ha ingresado la fecha de fundacion\n" + "debe ingresar una", "0");
            return false;
        }
        
        return true;
    }

    @Override
    public String generadorID() {

        String idCopia;
        String id = "Sin Asignar";
        boolean  verificacion;  
        GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin"); 
        ArrayList<Equipo> listaEquipo = gestorEquipo.getDatos();
        int contador=1;
        do{
            verificacion=true;
            if(contador<10)
                id= "EQU"+"00"+String.valueOf(contador);
            else if(contador<100)
                id= "EQU"+"0"+String.valueOf(contador); 
            else
                id= "EQU"+String.valueOf(contador);  
            for (Equipo eq : listaEquipo){
                idCopia=eq.getIdEquipo();
                if(idCopia.equals(id)){
                    verificacion=false;
                    contador++;
                    break;
                }
            }
        }while(verificacion==false);
        
        return id;
    }
    

}
