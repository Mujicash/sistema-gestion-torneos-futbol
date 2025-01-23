
package Modelo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class OperacionesMenuTorneo implements Identificacion {
    
    /**
    * Metodo que se encarga de leer los torneos del fichero "Torneos.bin" y pasarlos a una matriz
    * @return una matriz que contiene los atributos de cada torneo del fichero
    */
    public String[][] cargarTabla(){
        //abrimos archivo "Equipo"
        GestorFicheroSerializado <Torneo> gestorTorneos = new GestorFicheroSerializado("Ficheros\\Torneos.bin");

        //ingresamos objetos del archivo en el arrayList "listaEquipos"
        ArrayList<Torneo> listaTorneos = gestorTorneos.getDatos();
    
        //declaramos las variables que componen la fila
        String id, nombre,categoria, fechaInicio, fechaFin;
        String[][] tabla = new String[listaTorneos.size()][5];
        int i = 0;
        
        //recorremos el arrayList y guardamos los atributos de cada equipo
        for (Torneo tor : listaTorneos){
            
            id = tor.getIdTorneo();
            nombre = tor.getNombre();
            categoria = tor.getCategoria();
            fechaInicio = tor.getFechas().getFechaInicio();
            fechaFin = tor.getFechas().getFechaFinal();
            
            //formamos una vector cuyos campos componen la fila
            String [] fila = {id, nombre, categoria, fechaInicio, fechaFin};
            tabla[i] = fila;
            i++;
        }
        
        return tabla;
    }
    
    /**
     * Genera una matriz con los atributos de las posiciones asociada al fixture
     * @param fixture -- objeto que tiene asociada una lista de posiciones
     * @return una matriz con los atributos de cada posicion del Fixture
     */
    public String[][] generarPosiciones(Fixture fixture){
        
        ArrayList<Posiciones> tablaPosiciones = fixture.getTablaPosiciones();
        
        String equipo, PJ,PG, PE, PP, GF, GC, DF, puntos;
        String[][] posiciones = new String[tablaPosiciones.size()][9];
        int i = 0;
        
        //recorremos el arrayList y guardamos los atributos de cada equipo
        for (Posiciones pos : tablaPosiciones){
            
            equipo = pos.getNombEquipo();
            PJ = String.valueOf(pos.getPartidosJugados());
            PG = String.valueOf(pos.getPartidosGanados());
            PE = String.valueOf(pos.getPartidosEmpatados());
            PP = String.valueOf(pos.getPartidosPerdidos());
            GF = String.valueOf(pos.getGolesFavor());
            GC = String.valueOf(pos.getGolesContra());
            DF = String.valueOf(pos.getDiferenciaGoles());
            puntos = String.valueOf(pos.getPuntos());
            
            //formamos una vector cuyos campos componen la fila
            String [] fila = {equipo, PJ, PG, PE, PP, GF, GC, DF, puntos};
            posiciones[i] = fila;
            i++;
        }
        
        return posiciones;
    }
    
    /**
     * Genera una matriz con los atributos de cada partido asociado al fixture
     * @param fixture -- objeto que tiene asociado una lista de partidos
     * @return una matriz con los atributos de cada partido del fixture
     */
    public String[][] cargarPartidos(Fixture fixture){
        
        ArrayList<Partido> listaPartidos = fixture.getListaPartidos();
        String codigo, equipoLocal, equipoVisitante, estado;
        String[][] tabla =  new String[listaPartidos.size()][4];
        int i = 0;
        
        //recorremos el arrayList y guardamos los atributos de cada partido
        for (Partido part : listaPartidos){
            
            codigo = part.getCodPartido();
            equipoLocal = part.getLocal().getNombre();
            equipoVisitante = part.getVisitante().getNombre();
            estado = ModeladoBase.estadoPartido(part.getEstado());
            
            //formamos una vector cuyos campos componen la fila
            String [] fila = {codigo, equipoLocal, equipoVisitante, estado};
            tabla[i] = fila;
            i++;
        }
        
        return tabla;
    }
    
    /**
     * Obtiene el torneo que tiene el id pasado por paramentro
     * @param id -- codigo del torneo a encontrar
     * @return torneo que tiene el id pasado por parametro, null en caso de no existir.
     */
    public Torneo obtenerTorneo(String id){
        GestorFicheroSerializado <Torneo> gestorTorneos = new GestorFicheroSerializado("Ficheros\\Torneos.bin");

        //ingresamos objetos del archivo en el arrayList "listaTorneos"
        ArrayList<Torneo> listaTorneos = gestorTorneos.getDatos();
    
        //creamos objeto del torneo buscado
        Torneo torSelec = null;
        
        Iterator<Torneo> it = listaTorneos.iterator();
        boolean encontrado = false;
        
        //iteramos la lista hasta encontrar al arbitro
        while(it.hasNext() && !encontrado){
            torSelec = it.next();
            
            if(id.equals(torSelec.getIdTorneo())){
                encontrado = true;
            }
        }
        
        //retornamos el torneo Buscado
        return torSelec;
    }
    
    /**
     * Obtiene el fixture que tiene el id pasado por parametro
     * @param id -- codigo del fixture a encontrar
     * @return fixture que tiene el id pasado por parametro, null en caso de no existir.
     */
    public Fixture obtenerFixture(String id){
        GestorFicheroSerializado<Fixture> gestorFixture = new GestorFicheroSerializado("Ficheros\\Fixtures.bin");
        
        ArrayList<Fixture> listaFixtures = gestorFixture.getDatos();
        
        Fixture fixSelec = null;
        
        Iterator<Fixture> it = listaFixtures.iterator();
        boolean encontrado = false;
        
        //iteramos la lista hasta encontrar al arbitro
        while(it.hasNext() && !encontrado){
            fixSelec = it.next();
            
            if(id.equals(fixSelec.getCodFixture())){
                encontrado = true;
            }
        }
        
        return fixSelec;
        
    }
    
    /**
     * Obtiene el partido que tiene el id en el fixture
     * @param id -- codigo del partido a encontrar
     * @param fixture -- objeto que tiene asociada una lista de partidos
     * @return partido que tiene el id pasado por parametro, null en caso contrario.
     */
    public Partido obtenerPartido(String id, Fixture fixture){
        
        ArrayList<Partido> listaPartidos = fixture.getListaPartidos();
        Partido partido = null;
        
        Iterator<Partido> it = listaPartidos.iterator();
        boolean encontrado = false;
        
        while(it.hasNext() && !encontrado){
            partido = it.next();
            
            if(id.equals(partido.getCodPartido())){
                encontrado = true;
            }
        }
        
        return partido;
        
    }
    
    /**
     * Obtiene la lista de arbitros asociada a un torneo
     * @param codTorneo -- codigo del torneo 
     * @return lista de arbitros
     */
    public ArrayList<Arbitro> cargarListaArbitros(String codTorneo){
        GestorFicheroSerializado<Torneo> gestorTorneos = new GestorFicheroSerializado("Ficheros\\Torneos.bin");
        ArrayList<Torneo> listaTorneos = gestorTorneos.getDatos();
        Torneo torneo = null;
        ArrayList<Arbitro> arbTorneo = null;
        
        for(Torneo tor : listaTorneos){
            if(codTorneo.equalsIgnoreCase(tor.getIdTorneo())){
                torneo = tor;
            }
        }
        
        arbTorneo = torneo.getListaArbitros();
        
        return arbTorneo;
    }
    
    /**
     * Inserta un partido en la lista de partidos asociada al fixture
     * @param part -- partido a insertar
     * @param fixture -- objeto que tiene una lista de partidos asociada.
     */
    public void setPartido(Partido part, Fixture fixture){
        
        ArrayList<Partido> listaPartidos = fixture.getListaPartidos();
        
        for(int i = 0; i < listaPartidos.size(); i++){
            if(part.getCodPartido().equalsIgnoreCase(listaPartidos.get(i).getCodPartido())){
                listaPartidos.set(i, part);
                break;
            }
        }
        
        fixture.setListaPartidos(listaPartidos); 
    }
    
    /**
     * Reestablece el fichero 'Fixture.bin' con los cambios realizados
     * @param fixture -- fixture a modificar en el dfichero
     */
    public void reestablecerFichero(Fixture fixture){
        
        GestorFicheroSerializado<Fixture> gestorFixture = new GestorFicheroSerializado("Ficheros\\Fixtures.bin");
        ArrayList<Fixture> listaFixture = gestorFixture.getDatos();
        
        for(int i = 0; i < listaFixture.size(); i++){
            if(fixture.getCodFixture().equalsIgnoreCase(listaFixture.get(i).getCodFixture())){
                listaFixture.set(i, fixture);
                break;
            }
        }
        
        gestorFixture.eliminar();
        
        for(Fixture i : listaFixture){
            gestorFixture.guardarDato(i);
        }
    }
    
    /**
    * Se elimina al torneo seleccionado. 
    * @param filaVista -- Indice de la fila seleccionada en la tabla.
    * @param id -- id del torneo a eliminar.
    * @return true si la eliminacion fue exitosa, false en caso contrario.
    */
    public boolean eliminarTorneo(int filaVista, String id){
        boolean band = false;
        
        try {
            //abrimos archivo "Equipo"
            GestorFicheroSerializado <Torneo> gestorTorneos = new GestorFicheroSerializado("Ficheros\\Torneos.bin");
            GestorFicheroSerializado <Fixture> gestorFixture = new GestorFicheroSerializado("Ficheros\\Fixtures.bin");
            
            if(filaVista<0){
                ModeladoBase.mostrarMensaje("ERROR: SELECCIONE UNA FILA");
            }else{
                
                int eleccion = ModeladoBase.preguntar("¿Esta seguro de eliminar el torneo seleccionado?", "Eliminacion");
                if(eleccion == JOptionPane.YES_OPTION){
                    //obtenemos y almacenamos al Torneo seleccionado
                    Torneo torSelec = obtenerTorneo(id);
                    Fixture fixSelec = obtenerFixture(id);
                  
                    //borramos el Torneo del archivo
                    gestorTorneos.borrarDatos(torSelec);
                    //borramos el fixture asociado al torneo del fichero fixture
                    gestorFixture.borrarDatos(fixSelec);
                        
                    band = true;
                }
                else{
                    System.out.println("Eliminacion de torneo cancelada");
                }
            }
        } catch (HeadlessException e) {
            ModeladoBase.mostrarError("ERROR: NO SE PUDO ELIMINAR\n"+e);
        }
        
        return band;
    }
    
    /**
     * Obtiene una lista de equipos que tengan la categoria dada
     * @param categoria -- categoria que debe tener el equipo
     * @return lista de quipos
     */
    public ArrayList<Equipo> obtenerEquipos(String categoria){
        //abrimos archivo "Equipos"
        GestorFicheroSerializado <Equipo> gestorEquipo = new GestorFicheroSerializado("Ficheros\\Equipos.bin"); 
        
        //ingresamos objetos del archivo en el arrayList "listaEquipos"
        ArrayList<Equipo> listaEquipos = gestorEquipo.getDatos();
        ArrayList<Equipo> transferibles = new ArrayList<>();
        
        for (Equipo eq : listaEquipos) {
            if(eq.getCategoria().equalsIgnoreCase(categoria)){
                transferibles.add(eq);
            }
        }
        
        return transferibles;
    }
    
    /**
     * Obtiene un lista de arbitros disponibles
     * @return 
     */
    public ArrayList<Arbitro> obtenerArbitros(){
        //abrimos archivo "Arbitro"
        GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin"); 
        
        //ingresamos objetos del archivo en el arrayList "listaArbitros"
        ArrayList<Arbitro> listaArbitros = gestorArbitro.getDatos();
        ArrayList<Arbitro> transferibles = new ArrayList<>();
        
        for (Arbitro arb : listaArbitros) {
            if(arb.getDisponibilidad()){
                transferibles.add(arb);
            }
        }
        
        return transferibles;
    }
    
    /**
     * Guarda en el fichero el torneo y fixture pasados como parametro.
     * @param torneo -- torneo a guardar en el fichero
     * @param fixture -- fixture a guardar en el fixture
     */
    public void registrarTorneo(Torneo torneo, Fixture fixture){
        GestorFicheroSerializado<Torneo> gestorTorneo = new GestorFicheroSerializado("Ficheros\\Torneos.bin");
        GestorFicheroSerializado<Fixture> gestorFixture = new GestorFicheroSerializado("Ficheros\\Fixtures.bin");
        
        gestorTorneo.guardarDato(torneo);
        gestorFixture.guardarDato(fixture);
        
    }
    
    /**
     * Obtiene el nombre del torneo segun su codigo
     * @param codigo -- codigo del torneo
     * @return nombre del torneo
     */
    public String nombreTorneo(String codigo){
        
        GestorFicheroSerializado<Torneo> gestorTorneo = new GestorFicheroSerializado("Ficheros\\Torneos.bin");
        ArrayList<Torneo> listaTorneos = gestorTorneo.getDatos();
        
        Iterator<Torneo> it = listaTorneos.iterator();
        boolean encontrado = false;
        Torneo tor = null;
        
        while(it.hasNext() && !encontrado){
            tor = it.next();
            
            if(codigo.equals(tor.getIdTorneo())){
                encontrado = true;
            }
        }
        
        return tor.getNombre();
    }   
    
    public boolean validacion(String nombre, String equipos, String arbitros){
        
        if(ModeladoBase.campoVacio(nombre) == false){
            ModeladoBase.mostrarMensaje("Error 1: El campo de nombres esta vacio\n" + "por favor digite la informacion de este campo");
            return false;
        }
        
        if(ModeladoBase.campoVacio(equipos) == false){
            ModeladoBase.mostrarMensaje("Error 2: No se ha registrado ningun equipo para el torneo\n" + "por favor presione el boton de EQUIPOS para registrar uno");
            return false;
        }
        
        if(ModeladoBase.campoVacio(arbitros) == false){
            ModeladoBase.mostrarMensaje("Error 3: No se ha registrado ningun arbitro para el torneo\n" + "por favor presione el boton de ARBITROS para registrar uno.");
            return false;
        }
        
        return true;
    }
    
    public boolean validarMarcadores(String golesLocal, String golesVisitante){
        
        if(ModeladoBase.campoVacio(golesLocal) == false){
            ModeladoBase.mostrarMensaje("Error: La casilla de goles local esta vacia");
            return false;
        }
        
        if(ModeladoBase.campoVacio(golesVisitante) == false){
            ModeladoBase.mostrarMensaje("Error: La casilla de goles visitante esta vacia");
            return false;
        }
        
        if(ModeladoBase.numeroEntero(golesLocal) == false){
            ModeladoBase.mostrarMensaje("Error: Los goles anotados del equipo local deben ser numeros enteros");
            return false;
        }
        
        if(ModeladoBase.numeroEntero(golesVisitante) == false){
            ModeladoBase.mostrarMensaje("Error: Los goles anotados del equipo visitante deben ser numeros enteros");
            return false;
        }
        
        if(Integer.parseInt(golesLocal) < 0){
            ModeladoBase.mostrarError("Error: Los goles anotados del equipo local deben ser numeros enteros positivos.");
            return false;
        }
        
        if(Integer.parseInt(golesVisitante) < 0){
            ModeladoBase.mostrarError("Error: Los goles anotados del equipo visitante deben ser numeros enteros positivos.");
            return false;
        }
        
        return true;
    }

    @Override
    public String generadorID() {

        String idCopia;
        String id = "Sin Asignar";
        boolean  verificacion;  
        GestorFicheroSerializado <Torneo> gestorTorneo = new GestorFicheroSerializado("Ficheros\\Torneos.bin"); 
        ArrayList<Torneo> listaTorneo = gestorTorneo.getDatos();
        int contador=1;
        do{
            verificacion=true;
            if(contador<10)
                id= "TOR"+"00"+String.valueOf(contador);
            else if(contador<100)
                id= "TOR"+"0"+String.valueOf(contador); 
            else
                id= "TOR"+String.valueOf(contador);  
            for (Torneo tor : listaTorneo){
                idCopia=tor.getIdTorneo();
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
