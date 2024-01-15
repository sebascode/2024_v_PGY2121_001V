/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.aeropuerto.models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Carguero extends Aeronave {
    private int tonelaje;

    public Carguero() {
        super();
        this.tonelaje = 0;
    }
    
    public Carguero(int tonelaje) {
        super();
        this.tonelaje = tonelaje;
    }

    public Carguero(int tonelaje, int id, String nombre, int cantHoras, LocalDate fechaUltimoVuelo) {
        super(id, nombre, cantHoras, fechaUltimoVuelo);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Carguero{" + "id=" + this.getId() + ", nombre=" + super.getId() + ", cantHoras=" + super.getCantHoras() + ", fechaUltimoVuelo=" + this.getFechaUltimoVuelo() + '}';
    }
    
    
}
