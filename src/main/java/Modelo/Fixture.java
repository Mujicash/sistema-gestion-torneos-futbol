
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 
 * @author André Mujica 
 */
public class Fixture implements Serializable {

    private String idFixture; //mismo codigo que el torneo 
    private ArrayList<Equipo> equiposTorneo;
    private ArrayList<Partido> listaPartidos;
    private ArrayList<Posiciones> tablaPosiciones;

    public Fixture(String codFixture, ArrayList<Equipo> equiposTorneo) {
        this.idFixture = codFixture;
        this.equiposTorneo = equiposTorneo;
        calcularPartidos();        
    }

    public ArrayList<Posiciones> getTablaPosiciones() {
        obtenerPosiciones();
        return tablaPosiciones;
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }    

    public String getCodFixture() {
        return idFixture;
    }

    public void setCodFixture(String codFixture) {
        this.idFixture = codFixture;
    }

    public ArrayList<Equipo> getEquiposTorneo() {
        return equiposTorneo;
    }

    public void setEquiposTorneo(ArrayList<Equipo> equiposTorneo) {
        this.equiposTorneo = equiposTorneo;
    }
    
    private void calcularPartidos(){
        
        if(equiposTorneo.size() % 2 == 0){
            calcularPartidosNumParEquipos();
        }
        else{
            calcularPartidosNumImparEquipos();
        }
    }
    
    private String cabeceraCodigo(){
        String codigo;
        
        if(equiposTorneo.size() < 6){
            codigo = "PT" + 0 + Integer.parseInt(idFixture.substring(idFixture.length() - 3));
        }
        else{
            codigo = "PT" + Integer.parseInt(idFixture.substring(idFixture.length() - 3));
        } 
        
        return codigo;
    }
    
    private void calcularPartidosNumParEquipos(){
        int numRondas = equiposTorneo.size() - 1;
        int numPartidosPorRonda = equiposTorneo.size() / 2;
                
        String cod = cabeceraCodigo();
        
        Partido[][] partidos = new Partido[(numRondas*2)][numPartidosPorRonda];
        
        for (int i = 0,k = 0; i < numRondas; i ++){
            for (int j = 0; j < numPartidosPorRonda; j ++){
                partidos[i][j] = new Partido(cod + i + j );
                
                partidos[i][j].setLocal(equiposTorneo.get(k));
                k ++;

                if (k == numRondas){
                    k = 0;
                }
            }
        }
        
        for (int i = 0; i < numRondas; i ++){
            if (i % 2 == 0){
                partidos[i][0].setVisitante(equiposTorneo.get(numRondas));
            }
            else{
                partidos[i][0].setVisitante(partidos[i][0].getLocal());
                partidos[i][0].setLocal(equiposTorneo.get(numRondas));
            }
        }
                
        int equipoImparMasAlto = numRondas - 1;
        
        for (int i = 0,k = equipoImparMasAlto; i < numRondas; i ++){
            for (int j = 1; j < numPartidosPorRonda; j ++){
                
                partidos[i][j].setVisitante(equiposTorneo.get(k));
                k --;

                if (k == -1){
                    k = equipoImparMasAlto;
                }
            }
        }
        
        //Generamos partidos de visita
        for(int i=numRondas, k=0; i<(numRondas*2); i++){
            for(int j=0; j<numPartidosPorRonda; j++){
                partidos[i][j] = new Partido(cod + i + j );
                
                partidos[i][j].setLocal(partidos[k][j].getVisitante());
                partidos[i][j].setVisitante(partidos[k][j].getLocal());                
            } 
            
            k++;
        } 
        
        listaPartidos = guardarPartidos(partidos);        
    }
    
    private void calcularPartidosNumImparEquipos(){
        
        int numRondas = equiposTorneo.size();
        int numPartidosPorRonda = equiposTorneo.size() / 2;
        String cod = cabeceraCodigo();
        
        Partido[][] partidos = new Partido[(numRondas*2)][numPartidosPorRonda];
        
        for (int i = 0, k = 0; i < numRondas; i ++){
            for (int j = -1; j < numPartidosPorRonda; j ++){
                if (j >= 0){
                    partidos[i][j] = new Partido(cod + i + j);
                    
                    partidos[i][j].setLocal(equiposTorneo.get(k));
                }
                
                k ++;

                if (k == numRondas){
                    k = 0;
                }    
            }
        }
        
        int equipoMasAlto = equiposTorneo.size() - 1;
        
        for (int i = 0, k = equipoMasAlto; i < numRondas; i ++) {
            for (int j = 0; j < numPartidosPorRonda; j ++){
                partidos[i][j].setVisitante(equiposTorneo.get(k));

                k --;

                if (k == -1){
                    k = equipoMasAlto;
                }    
            }
        }
        
        //Generamos partidos de visita
        for(int i=numRondas, k=0; i<(numRondas*2); i++){
            for(int j=0; j<numPartidosPorRonda; j++){
                partidos[i][j] = new Partido(cod + i + j );
                
                partidos[i][j].setLocal(partidos[k][j].getVisitante());
                partidos[i][j].setVisitante(partidos[k][j].getLocal());                
            } 
            
            k++;
        }
        
        listaPartidos = guardarPartidos(partidos);
    }
    
    
    private ArrayList<Partido> guardarPartidos(Partido[][] x){
        ArrayList<Partido> encuentros = new ArrayList();
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                //x[i][j].setEstadio(x[i][j].getLocal().getEstadio());
                encuentros.add(x[i][j]);
            }
        }       
        
        return encuentros;
    }
    
    private void obtenerPosiciones(){
        tablaPosiciones = new ArrayList<>();
        
        for(int i = 0; i < equiposTorneo.size(); i++){
            Posiciones k = new Posiciones(equiposTorneo.get(i).getNombre().toUpperCase());
            
            for(int j = 0; j < listaPartidos.size(); j++){
                
                if(listaPartidos.get(j).getEstado() == false){
                
                    if(equiposTorneo.get(i).getIdEquipo().equalsIgnoreCase(listaPartidos.get(j).getLocal().getIdEquipo())){
                        k.setPartidosJugados();
                        k.setGolesFavor(listaPartidos.get(j).getGolLocal());
                        k.setGolesContra(listaPartidos.get(j).getGolVisitante());  
                        k.setPuntos(listaPartidos.get(j).getPuntosLocal());
                        switch (listaPartidos.get(j).getPuntosLocal()) {
                            case 0: k.setPartidosPerdidos();
                                break;
                            case 1: k.setPartidosEmpatados();
                                break;
                            case 3: k.setPartidosGanados();
                                break;
                        }
                    }
                    else if(equiposTorneo.get(i).getIdEquipo().equalsIgnoreCase(listaPartidos.get(j).getVisitante().getIdEquipo())){
                        k.setPartidosJugados();
                        k.setGolesFavor(listaPartidos.get(j).getGolVisitante());
                        k.setGolesContra(listaPartidos.get(j).getGolLocal());
                        k.setPuntos(listaPartidos.get(j).getPuntosVisitante());
                        switch (listaPartidos.get(j).getPuntosVisitante()) {
                            case 0: k.setPartidosPerdidos();
                                break;
                            case 1: k.setPartidosEmpatados();
                                break;
                            case 3: k.setPartidosGanados();
                                break;
                        }
                    }
                    else{
                        System.out.println("El equipo no juega este partido.");
                    }
                }
            }
            
            tablaPosiciones.add(k);            
        }
        
        ordenarTabla();
    }
    
    private void ordenarTabla(){
        //ordenamos el ArrayList tabla posiciones de mayor a menor
        
        Posiciones aux;
        int max;
        
        for(int i = 0; i < tablaPosiciones.size(); i++){
            max = i;
            for(int j = i + 1; j < tablaPosiciones.size(); j++){
                if(tablaPosiciones.get(j).getPuntos() >= tablaPosiciones.get(max).getPuntos()){
                    if(tablaPosiciones.get(j).getPuntos() == tablaPosiciones.get(max).getPuntos()){
                        if(tablaPosiciones.get(j).getDiferenciaGoles() >= tablaPosiciones.get(max).getDiferenciaGoles()){
                            if(tablaPosiciones.get(j).getDiferenciaGoles() == tablaPosiciones.get(max).getDiferenciaGoles()){
                                if(tablaPosiciones.get(j).getGolesFavor() > tablaPosiciones.get(max).getGolesFavor()){
                                    max = j;
                                }                                
                            }
                            else{
                                max = j;
                            }                            
                        }                        
                    }
                    else{
                        max = j;
                    }
                }
            }
            aux = tablaPosiciones.get(i);
            tablaPosiciones.set(i, tablaPosiciones.get(max));
            tablaPosiciones.set(max, aux);            
        }
    }

    @Override
    public String toString() {
        return idFixture;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idFixture);
        hash = 61 * hash + Objects.hashCode(this.equiposTorneo);
        hash = 61 * hash + Objects.hashCode(this.listaPartidos);
        hash = 61 * hash + Objects.hashCode(this.tablaPosiciones);
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
        final Fixture other = (Fixture) obj;
        if (!Objects.equals(this.idFixture, other.idFixture)) {
            return false;
        }
        if (!Objects.equals(this.equiposTorneo, other.equiposTorneo)) {
            return false;
        }
        if (!Objects.equals(this.listaPartidos, other.listaPartidos)) {
            return false;
        }
        if (!Objects.equals(this.tablaPosiciones, other.tablaPosiciones)) {
            return false;
        }
        return true;
    }
    
}
