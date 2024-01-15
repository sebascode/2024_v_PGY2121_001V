package cl.duoc.aeropuerto.models;

import java.time.LocalDate;

public class Aeronave {
    private int id;
    private String nombre;
    private int cantHoras;
    private LocalDate fechaUltimoVuelo;
    
    public Aeronave(){
        this.id = -1;
        this.nombre = "";
        this.cantHoras = 0;
        this.fechaUltimoVuelo = LocalDate.of(1999, 1, 1);
    }
    
    public Aeronave(int id, String nombre, int cantHoras, LocalDate fechaUltimoVuelo){
        this.id = id;
        this.nombre = nombre;
        this.setCantHoras(cantHoras);
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        if(cantHoras > 20)
            this.cantHoras = cantHoras;
        else
            System.out.println("Error cantidad de horas no válidas");
    }

    public LocalDate getFechaUltimoVuelo() {
        return fechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate fechaUltimoVuelo) {
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "id=" + id + ", nombre=" + nombre + ", cantHoras=" + cantHoras + ", fechaUltimoVuelo=" + fechaUltimoVuelo + '}';
    }
    
    
}
