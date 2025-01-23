
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Partido implements Serializable {
    private String codPartido;
    private int golLocal;
    private int golVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private Equipo local;
    private Equipo visitante;
    //private Estadio estadio;
    private Arbitro arbitro;
    private boolean estado;

    //normalmente no se usará este constructor
    public Partido(String codPartido, Equipo local, Equipo visitante, /*Estadio estadio,*/ Arbitro arbitro) {
        this.codPartido = codPartido;
        this.local = local;
        this.visitante = visitante;
        //this.estadio = estadio;
        this.arbitro = arbitro;
        this.estado = true;
    }

    public Partido(String codPartido){
        this.codPartido = codPartido;
        this.estado = true;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
/*
    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
*/
    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    
    public void setPuntos(){
        if(golLocal > golVisitante){
            puntosLocal = 3;
            puntosVisitante = 0;
        }
        else if(golVisitante > golLocal){
            puntosLocal = 0;
            puntosVisitante = 3;
        }
        else{
            puntosLocal = 1;
            puntosVisitante = 1;
        }
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public String getCodPartido() {
        return codPartido;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setCodPartido(String codPartido) {
        this.codPartido = codPartido;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public void setLocal(Equipo local) {
        this.local = local;
        //setEstadio(this.local.getEstadio());        
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Partido{" + codPartido + ", local=" + local.getNombre() + " v.s visitante=" + visitante.getNombre() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codPartido);
        hash = 47 * hash + this.golLocal;
        hash = 47 * hash + this.golVisitante;
        hash = 47 * hash + this.puntosLocal;
        hash = 47 * hash + this.puntosVisitante;
        hash = 47 * hash + Objects.hashCode(this.local);
        hash = 47 * hash + Objects.hashCode(this.visitante);
        //hash = 47 * hash + Objects.hashCode(this.estadio);
        hash = 47 * hash + Objects.hashCode(this.arbitro);
        hash = 47 * hash + (this.estado ? 1 : 0);
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
        final Partido other = (Partido) obj;
        if (this.golLocal != other.golLocal) {
            return false;
        }
        if (this.golVisitante != other.golVisitante) {
            return false;
        }
        if (this.puntosLocal != other.puntosLocal) {
            return false;
        }
        if (this.puntosVisitante != other.puntosVisitante) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.codPartido, other.codPartido)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.visitante, other.visitante)) {
            return false;
        }
        /*if (!Objects.equals(this.estadio, other.estadio)) {
            return false;
        }*/
        if (!Objects.equals(this.arbitro, other.arbitro)) {
            return false;
        }
        return true;
    }
    
    
}
