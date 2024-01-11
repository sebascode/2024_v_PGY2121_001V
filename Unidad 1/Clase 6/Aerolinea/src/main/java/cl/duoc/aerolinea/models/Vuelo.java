package cl.duoc.aerolinea.models;

import java.time.LocalDate;

public class Vuelo {
    // id origen destino fecha piloto
    private int id;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private String piloto;

    public Vuelo(int id, String origen, String destino, LocalDate fecha, String piloto) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }
    
    public Vuelo(int dia, int mes, int anio, String origen, String destino){
        this.id = -10;
        this.origen = origen;
        this.destino = destino;
        this.fecha = LocalDate.of(anio, mes, dia);
    }
        
    public Vuelo() {
        this.id = -1;
        this.origen = "Sin origen definido";
        this.destino = "Sin destino definido";
        this.fecha = LocalDate.now();
        this.piloto = "Sin piloto asignado";
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", piloto=" + piloto + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
}
