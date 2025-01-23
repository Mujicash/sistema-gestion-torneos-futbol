
package Modelo;

import java.io.Serializable;

/**
 * 
 * @author André Mujica 
 */
public class Posiciones implements Serializable {

    private String nombEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int puntos;

    public Posiciones(String nombEquipo) {
        this.nombEquipo = nombEquipo;
        this.partidosJugados = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.puntos = 0;
    }   

    public String getNombEquipo() {
        return nombEquipo;
    }

    public void setNombEquipo(String nombEquipo) {
        this.nombEquipo = nombEquipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados() {
        this.partidosJugados++;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados() {
        this.partidosGanados++;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos() {
        this.partidosPerdidos++;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados() {
        this.partidosEmpatados++;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    /**
    * Se acumula los goles a favor
    * @param golesFavor -- goles a acumular
    */
    public void setGolesFavor(int golesFavor) {
        this.golesFavor += golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    /**
    * Se acumulan los goles en contra
    * @param golesContra -- goles a acumular
    */
    public void setGolesContra(int golesContra) {
        this.golesContra += golesContra;
    }

    public int getDiferenciaGoles() {
        return golesFavor - golesContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }
}
