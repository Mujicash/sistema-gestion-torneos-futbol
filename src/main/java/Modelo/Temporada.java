
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Temporada implements Serializable {

    private String fechaInicio;
    private String fechaFinal;

    public Temporada() {
        this.fechaInicio = "00/00/0000";
        this.fechaFinal = "00/00/0000";
    }
    
    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.fechaInicio);
        hash = 67 * hash + Objects.hashCode(this.fechaFinal);
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
        final Temporada other = (Temporada) obj;
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFinal, other.fechaFinal)) {
            return false;
        }
        return true;
    }
}
