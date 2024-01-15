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
public class Avioneta extends Aeronave {
    private boolean superSonico;

    public Avioneta() {
        super();
        this.superSonico = false;
    }

    public Avioneta(int id, String nombre, int cantHoras, LocalDate fechaUltimoVuelo, boolean superSonico) {
        super(id, nombre, cantHoras, fechaUltimoVuelo);
        this.superSonico = superSonico;
    }

    public boolean isSuperSonico() {
        return superSonico;
    }

    public void setSuperSonico(boolean superSonico) {
        this.superSonico = superSonico;
    }

    @Override
    public String toString() {
        return "Avioneta{" + "id=" + this.getId() + ", nombre=" + super.getId() + ", cantHoras=" + super.getCantHoras() + ", fechaUltimoVuelo=" + this.getFechaUltimoVuelo() + '}';
    }
    
    
    
}
