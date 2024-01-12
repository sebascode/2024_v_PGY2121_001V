/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.aeropuertoherencia.models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Carguero extends Aeronave {
    private int tonelaje;

    public Carguero(int tonelaje, int id, String nombre, LocalDate ultimoVuelo) {
        super(id, nombre, ultimoVuelo);
        this.tonelaje = tonelaje;
    }

    public Carguero(int tonelaje) {
        super();
        this.tonelaje = tonelaje;
    }
    
    public Carguero() {
        super();
        this.tonelaje = 0;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public int getIdOculto() {
        return idOculto;
    }

    public void setIdOculto(int idOculto) {
        this.idOculto = idOculto;
    }

    @Override
    public String toString() {
        return "Carguero{" + "id=" + this.getId() + ", nombre=" + this.getNombre() + ", ultimoVuelo=" + this.getUltimoVuelo() + ", tonelaje="+ this.tonelaje + '}';
    }
    
    
}
