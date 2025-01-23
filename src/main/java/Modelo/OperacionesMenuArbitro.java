
package Modelo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 */
public class OperacionesMenuArbitro implements Identificacion {
    
    /**
    * Metodo que se encarga de leer los arbitros del fichero "Arbitros.bin" y pasarlos a una matriz
    * @return una matriz que contiene los atributos de cada arbitro del fichero
    */
    public String[][] cargarTabla(){
        //abrimos archivo "Arbitros"
        GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin");

        //ingresamos objetos del archivo en el arrayList "listaArbitros"
        ArrayList<Arbitro> listaArbitros = gestorArbitro.getDatos();
    
        //declaramos las variables que componen la fila
        String id, dni, nombres, apellidos, fechaNacimiento, sexo, pais, disp;
        String[][] tabla = new String[listaArbitros.size()][8];
        int i = 0;
        
        for(Arbitro arb : listaArbitros){
            id = arb.getIdArbitro();
            dni = arb.getDni();
            nombres = arb.getNombres();
            apellidos = arb.getApellidos();
            fechaNacimiento = arb.getFechaNacimiento();
            sexo = arb.getSexo();
            pais = arb.getPaisOrigen();
            disp = ModeladoBase.aCadena(arb.getDisponibilidad());
            
            //formamos un vector cuyos campos componen la fila
            String[] fila = {id, dni, nombres, apellidos, fechaNacimiento, sexo, pais, disp};
            tabla[i] = fila;
            i++;
        }       
        
        return tabla;
    }
    
    /**
     * Obtiene el arbitro que tenga el id especificado
     * @param id -- codigo del arbitro
     * @return arbitro encontrado, null en caso contrario
     */
    public Arbitro obtenerArbitro(String id){
        //abrimos archivo "Arbitros"
        GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin");

        //ingresamos objetos del archivo en el arrayList "listaArbitros"
        ArrayList<Arbitro> listaArbitros = gestorArbitro.getDatos();
    
        //creamos objeto del arbitro buscado
        Arbitro arbSelec = null;
        
        Iterator<Arbitro> it = listaArbitros.iterator();
        boolean encontrado = false;
        
        //iteramos la lista hasta encontrar al arbitro
        while(it.hasNext() && !encontrado){
            arbSelec = it.next();
            
            if(id.equals(arbSelec.getIdArbitro())){
                encontrado = true;
            }
        }
        
        //retornamos el arbitro Buscado
        return arbSelec;
    }
    
    /**
    * Se elimina al arbitro seleccionado. 
    * @param filaVista -- Indice de la fila seleccionada en la tabla.
    * @param id -- id del arbitro a eliminar.
    * @return true si la eliminacion fue exitosa, false en caso contrario.
    */
    public boolean eliminarArbitro(int filaVista, String id){
        boolean band = false;
        
        try {
            //abrimos archivo "Arbitros"
            GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin");
            
            if(filaVista < 0){
                ModeladoBase.mostrarError("SELECCIONE UNA FILA DE LA TABLA");
            }else{

                //obtenemos y almacenamos al arbitro seleccionado
                Arbitro arbSelec = obtenerArbitro(id);

                int eleccion = ModeladoBase.preguntar("¿Esta seguro de eliminar al arbitro?", "Eliminacion");
                if(eleccion == JOptionPane.YES_OPTION){
                    //borramos el arbitro del archivo
                    gestorArbitro.borrarDatos(arbSelec);

                    band = true;
                }
                else{
                    System.out.println("Eliminacion de Arbitro cancelada.");
                }
            }
        } catch (HeadlessException e) {
            ModeladoBase.mostrarMensaje("ERROR: NO SE PUDO ELIMINAR"+e);
        }
        
        return band;
    }
    
    /**
     * Se guarda un arbitro en el fichero
     * @param x -- arbitro a guardar
     */
    public void registrarArbitro(Arbitro x){
        
        GestorFicheroSerializado <Arbitro> gestorArbitro = new GestorFicheroSerializado("Ficheros\\Arbitros.bin"); 
        
        //guardamos el objeto jugador en el archivo
        gestorArbitro.guardarDato(x);
    }
    
    /**
     * Obtiene una lista con los nombres de los torneos en los que esta un arbitro
     * @param id -- codigo del arbitro
     * @return 
     */
    public ListModelPersonalizado<Torneo> buscarTorneos(String id){
        
        ListModelPersonalizado <Torneo> lista = new ListModelPersonalizado();
        boolean flag = false;
        GestorFicheroSerializado<Torneo> gestorTorneos = new GestorFicheroSerializado("Ficheros\\Torneos.bin");
        ArrayList<Torneo> listaTorneos = gestorTorneos.getDatos();
        
        for(Torneo tor : listaTorneos){
            ArrayList<Arbitro> listaArbitros = tor.getListaArbitros();
            //se debe modificar la busqueda
            for(int i = 0; i < listaArbitros.size(); i++){
                if(id.equals(listaArbitros.get(i).getIdArbitro())){
                    lista.addElemento(tor);
                    flag = true;
                }
            }
        }
        
        if(flag){
            return lista;
        }
        
        return null;
    }
    
    /**
     * Modifica un arbitro en el fichero
     * @param actual -- arbitro en el fichero
     * @param nuevo -- arbitro con los cambios aplicados
     */
    public void modificarArbitro(Arbitro actual, Arbitro nuevo){
        
        GestorFicheroSerializado <Arbitro> gestorArbitro= new GestorFicheroSerializado("Ficheros\\Arbitros.bin"); 
        gestorArbitro.modificar(actual, nuevo);
    }

    @Override
    public String generadorID() {
        String idCopia;
        String id = "Sin Asignar";
        boolean  verificacion;  
        GestorFicheroSerializado <Arbitro> gestorArbitro= new GestorFicheroSerializado("Ficheros\\Arbitros.bin"); 
        ArrayList<Arbitro> listaArbitro = gestorArbitro.getDatos();
        int contador=1;
        do{
            verificacion=true;
            if(contador<10)
                id= "ARB"+"00"+String.valueOf(contador);
            else if(contador<100)
                id= "ARB"+"0"+String.valueOf(contador); 
            else
                id= "ARB"+String.valueOf(contador);  
            for (Arbitro arb : listaArbitro){
                idCopia=arb.getIdArbitro();
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
