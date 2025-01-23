
package Modelo;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 * 
 * @author André Mujica  
 * @param <T> 
 */
public class ListModelPersonalizado<T> extends AbstractListModel {

    private ArrayList<T> lista;

    public ListModelPersonalizado() {
        lista = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Object element = lista.get(index);
        return element;
    }
    
    public void addElemento(T p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
    
    public void eliminarElemento(int index){
        lista.remove(index);
        this.fireIntervalRemoved(this, getSize(), getSize() + 1);
    }

    public ArrayList<T> getLista() {
        return lista;
    }
}
