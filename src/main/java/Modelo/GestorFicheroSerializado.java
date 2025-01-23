
package Modelo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author André Mujica 
 * @param <T> 
 */
public class GestorFicheroSerializado<T> {
    
    private File fichero;
    private ArrayList<T> datos;
    
    
    public GestorFicheroSerializado(String fichero){
        this.fichero = new File(fichero);
        this.datos = new ArrayList();
        obtenerDatos();
    }

    public GestorFicheroSerializado(File fichero) {
        this.fichero = fichero;
        obtenerDatos();
    }
    
    private void obtenerDatos(){
    
        if(fichero.exists()){

            T elemento;
            
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                
                while(true){
                    elemento = (T) ois.readObject();
                    datos.add(elemento);
                }    
            } catch(EOFException ex){  
                
            } catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 1");
            } catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 2");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 3");
            }
        }
    }
    
    public void guardarDato(T elemento){

        if(fichero.exists() && fichero.length()>0){
            //Uso MiObjectOutputStream para evitar problemas con el archivo
            try (MiObjectOutputStream oos = new MiObjectOutputStream (new FileOutputStream(fichero,true))) {
                
                //Almacenamos el elemento en el fichero
                oos.writeObject(elemento);
                
            } catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 4");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 5");
            }
        } else{
            //Uos ObjectOutputStream para crear la cabecera el archivo
            try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(fichero))) {
                
                oos.writeObject(elemento);
                
            } catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 6");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR 7");
            }
        }
        
        datos.add(elemento);

    }

    public ArrayList<T> getDatos() {
        return datos;
    }
        
    public void borrarDatos(T elemento){
        
        //eliminamos elemento del arrayList
        datos.remove(posElemento(elemento));
        
        //copiamos "datos" en "copia"
        ArrayList<T> copia = datos;
        
        //reiniciamos "datos"
        datos = new ArrayList<>();
        System.out.println("inicio eliminacion");
        fichero.delete();
        System.out.println("fin eliminacion");
        
        for (T e: copia) {
            guardarDato(e);
        }
    }
    
    public int posElemento(T elemento){
        int pos = 0;
        
        for(int i = 0; i < datos.size(); i++){
            if(datos.get(i).equals(elemento)){
                pos = i;
            }
        }
        
        return pos;
    }
    
    public void eliminar(){
        datos = new ArrayList<>();
        System.out.println("inicio eliminacion");
        fichero.delete();
        System.out.println("fin eliminacion");
    }
    
    public boolean exitenciaArchivo(){
        return fichero.exists() && fichero.length()>0;
    }
    
    public void modificar(T original, T modificado){
        int pos = 0;
        pos = posElemento(original);
        
        //eliminamos elemento del arrayList
        datos.set(pos, modificado);
        
        //copiamos "datos" en "copia"
        ArrayList<T> copia = datos;
        
        //reiniciamos "datos"
        datos = new ArrayList<>();
        System.out.println("inicio modifcacion");
        fichero.delete();
        System.out.println("fin modificacion");
        
        for (T e: copia) {
            guardarDato(e);
        }
    }
}
