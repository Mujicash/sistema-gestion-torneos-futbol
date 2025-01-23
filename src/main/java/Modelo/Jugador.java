
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Jugador extends Persona implements Serializable, Comparable<Jugador>{

    private String idJugador;
    private boolean transferible;
    
    public Jugador(){
        super("00000000", "No Definido", "No Definido", "No definido", "No Definido", "No Definido");
        this.idJugador = "";
        this.transferible = true;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public boolean getTransferible() {
        return transferible;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public void setTransferible(boolean transferible) {
        this.transferible = transferible;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return idJugador +" - " +getApellidos()+", "+getNombres();
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Jugador other = (Jugador) obj;
        if (this.transferible != other.transferible) {
            return false;
        }
        if (!Objects.equals(this.idJugador, other.idJugador)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Jugador o) {
        
        return this.idJugador.compareTo(o.getIdJugador());
    }
}
