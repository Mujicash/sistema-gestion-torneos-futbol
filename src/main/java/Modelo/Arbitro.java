
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Arbitro extends Persona implements Serializable, Comparable<Arbitro>{

    private String idArbitro;
    private boolean disponibilidad;

    public Arbitro(){
        super("00000000", "No Definido", "No Definido", "No definido", "No Definido", "No Definido");
        this.idArbitro = "9999";
        this.disponibilidad = true;
    }

    public String getIdArbitro() {
        return idArbitro;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
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

    public void setIdArbitro(String idArbitro) {
        this.idArbitro = idArbitro;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
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
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return idArbitro + " - " + nombres +" "+ apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idArbitro);
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
        final Arbitro other = (Arbitro) obj;
        if (!Objects.equals(this.idArbitro, other.idArbitro)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Arbitro o) {
        
        return this.idArbitro.compareTo(o.getIdArbitro());
    }
}
