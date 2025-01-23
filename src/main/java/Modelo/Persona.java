
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public abstract class Persona implements Serializable{
    
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String fechaNacimiento;
    protected String sexo;
    protected String paisOrigen;

    public Persona(String dni, String nombres, String apellidos, String fechaNacimiento, String sexo, String paisOrigen) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.paisOrigen = paisOrigen;
    }
    
    public abstract String getNombres();

    public abstract String getApellidos();
    
    public abstract String getFechaNacimiento();

    public abstract String getSexo();

    public abstract String getPaisOrigen();

    public abstract String getDni();

    public abstract void setNombres (String nombres);

    public abstract void setApellidos(String apellidos);

    public abstract void setFechaNacimiento(String fechaNacimiento);

    public abstract void setSexo(String sexo);

    public abstract void setPaisOrigen(String paisOrigen);

    public abstract void setDni(String dni);

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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.paisOrigen, other.paisOrigen)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.dni);
        hash = 59 * hash + Objects.hashCode(this.nombres);
        hash = 59 * hash + Objects.hashCode(this.apellidos);
        hash = 59 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + Objects.hashCode(this.paisOrigen);
        return hash;
    }
}
