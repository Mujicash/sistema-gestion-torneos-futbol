
package Modelo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class OperacionesMenuJugador implements Identificacion {
    
    public String[][] cargarTabla(){
        //abrimos archivo "Jugador"
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin");
        
        //ingresamos objetos del archivo en el arrayList "listaJugadores"
        ArrayList<Jugador> listaJugadores = gestorJugador.getDatos();
        
        //declaramos las variables que componen la fila
        String id, dni, nombres, apellidos, fechaNacimiento, pais, transferible;
        String[][] tabla = new String[listaJugadores.size()][7];
        int i = 0;
        
        for(Jugador jdor : listaJugadores){
            id = jdor.getIdJugador();
            dni = jdor.getDni();
            nombres = jdor.getNombres();
            apellidos = jdor.getApellidos();
            fechaNacimiento = jdor.getFechaNacimiento();
            pais = jdor.getPaisOrigen();
            transferible = ModeladoBase.aCadena(jdor.getTransferible());
            
            //formamos una vector cuyos campos componen la fila
            String [] fila = {id, dni, nombres, apellidos, fechaNacimiento, pais, transferible};
            
            tabla[i] = fila;
            i++;
        }
        
        return tabla;        
    }
    
    /**
    * Se obtiene el jugador que tenga el id pasado por parametro
    * @param id -- codigo del jugador.
    * @return jugador que tenga el id pasado por parametro, null en caso no exista.
    */
    public Jugador ObtenerJugador(String id){
        //abrimos archivo "Jugador"
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin");

        //ingresamos objetos del archivo en el arrayList "listaJugadores"
        ArrayList<Jugador> listaJugadores = gestorJugador.getDatos();
        
        //creamos objeto del jugador buscado
        Jugador jdorSelec = null;
        
        Iterator<Jugador> it = listaJugadores.iterator();
        boolean encontrado = false;
        
        //iteramos la lista hasta encontrar al jugador
        while(it.hasNext() && !encontrado){
            jdorSelec = it.next();
            
            if(id.equals(jdorSelec.getIdJugador())){
                encontrado = true;
            }
        }
        
        return jdorSelec;
    }
    
    /**
    * Se elimina al jugador seleccionado. 
    * @param filaVista -- Indice de la fila seleccionada en la tabla.
    * @param id -- id del jugador a eliminar.
    * @return true si la eliminacion fue exitosa, false en caso contrario.
    */
    public boolean eliminarJugador(int filaVista, String id){
        boolean band = false;
        
        try {
            //abrimos archivo "Jugador"
            GestorFicheroSerializado <Jugador> gestorJugador= new GestorFicheroSerializado("Ficheros\\Jugadores.bin");
            
            if(filaVista<0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }else{
                    
                //obtenemos y almacenamos al arbitro seleccionado
                Jugador jdorSelec = ObtenerJugador(id);

                int eleccion = ModeladoBase.preguntar("¿Esta seguro de eliminar al jugador?", "Eliminacion");
                if(eleccion == JOptionPane.YES_OPTION){
                    //borramos el jugador del archivo
                    gestorJugador.borrarDatos(jdorSelec);

                    band = true;
                }
                else{
                    System.out.println("Eliminacion de Jugador cancelada.");
                }
            }
        } catch (HeadlessException e) {
            ModeladoBase.mostrarMensaje("ERROR: NO SE PUDO ELIMINAR"+e);
        }
        
        return band;
    }
    
    //se debe modificar la busqueda
    public String buscarEquipoJugador(String id){
        TreeSet<Jugador> listaJugadores;
        //abrimos archivo "Equipo"
        GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin");
        //ingresamos objetos del archivo en el arrayList "listaEquipos"
        ArrayList<Equipo> listaEquipos = gestorEquipo.getDatos();
        
        for(int i = 0; i < listaEquipos.size(); i++){
            listaJugadores = listaEquipos.get(i).getJugadores();
            for(Jugador j : listaJugadores){
                if(id == null ? j.getIdJugador() == null : id.equals(j.getIdJugador())){
                    return listaEquipos.get(i).getNombre();
                }
            }
        }
        
        return "Error al encontrar";
    }
    
    /**
    * Se reemplaza el jugador actual por el nuevo con las modificaciones correspondientes.
    * @param actual -- Jugador actual
    * @param nuevo  -- Jugador actual con las modificaciones correspondientes
    */
    public void modificarJugador(Jugador actual, Jugador nuevo){
        //abrimos archivo "Jugadores"
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin"); 
        
        //guardamos el objeto arbrito en el archivo
        gestorJugador.modificar(actual, nuevo);
    }
    
    /**
     * Se guarda el jugador en el fichero
     * @param jugador -- jugador a guardar
     */
    public void registrarJugador(Jugador jugador){
        GestorFicheroSerializado <Jugador> gestorJugador = new GestorFicheroSerializado("Ficheros\\Jugadores.bin");

        //guardamos el objeto jugador en el archivo
        gestorJugador.guardarDato(jugador);
    }

    @Override
    public String generadorID() {
        String idCopia;
        String id = "Sin Asignar";
        boolean  verificacion;  
        GestorFicheroSerializado <Jugador> gestorJugador= new GestorFicheroSerializado("Ficheros\\Jugadores.bin"); 
        ArrayList<Jugador> listaJugador = gestorJugador.getDatos();
        int contador=1;
        do{
            verificacion=true;
            if(contador<10)
                id= "JDR"+"00"+String.valueOf(contador);
            else if(contador<100)
                id= "JDR"+"0"+String.valueOf(contador); 
            else
                id= "JDR"+String.valueOf(contador);  
            for (Jugador jdor : listaJugador){
                idCopia=jdor.getIdJugador();
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
