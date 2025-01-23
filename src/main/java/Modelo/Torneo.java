
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Torneo implements Serializable {
    
    private String idTorneo;
    private String nombre;
    private String categoria;
    private Temporada fechas;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Arbitro> listaArbitros;
    
    public String getIdTorneo() {
        return idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Temporada getFechas() {
        return fechas;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public ArrayList<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public void setIdTorneo(String idTorneo) {
        this.idTorneo = idTorneo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setFechas(Temporada fechas) {
        this.fechas = fechas;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public void setListaArbitros(ArrayList<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idTorneo);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.categoria);
        hash = 67 * hash + Objects.hashCode(this.fechas);
        hash = 67 * hash + Objects.hashCode(this.listaEquipos);
        hash = 67 * hash + Objects.hashCode(this.listaArbitros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Torneo other = (Torneo) obj;
        if (!Objects.equals(this.idTorneo, other.idTorneo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.fechas, other.fechas)) {
            return false;
        }
        if (!Objects.equals(this.listaEquipos, other.listaEquipos)) {
            return false;
        }
        if (!Objects.equals(this.listaArbitros, other.listaArbitros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idTorneo + nombre;
    }
    
}
