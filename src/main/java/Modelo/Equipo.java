
package Modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

/**
 * 
 * @author André Mujica 
 */
public class Equipo implements Serializable, Comparable<Equipo> {

    private String idEquipo;
    private String nombre;
    private String fundacion;
    private String categoria;
    private boolean participacion;
    private TreeSet<Jugador> jugadores;
    
    public Equipo(){
        this.idEquipo = "000";
        this.nombre = "No Definido";
        this.fundacion = "";
        this.categoria = "";
        this.participacion = true;
        this.jugadores = new TreeSet<>();
    }

    public TreeSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(TreeSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public String getIdEquipo() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFundacion() {
        return fundacion;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public boolean getParticipacion() {
        return participacion;
    }
    
    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setParticipacion(boolean participacion) {
        this.participacion = participacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idEquipo);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.jugadores);
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.idEquipo, other.idEquipo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.jugadores, other.jugadores)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return idEquipo + " - " + nombre;
    }

    @Override
    public int compareTo(Equipo o) {

        return this.idEquipo.compareTo(o.getIdEquipo());
    }
}
