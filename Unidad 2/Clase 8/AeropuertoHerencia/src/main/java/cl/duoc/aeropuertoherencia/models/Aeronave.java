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
public class Aeronave {
    private int id;
    private String nombre;
    private LocalDate ultimoVuelo;
    protected int idOculto;

    public Aeronave(int id, String nombre, LocalDate ultimoVuelo) {
        this.id = id;
        this.nombre = nombre;
        this.ultimoVuelo = ultimoVuelo;
    }
    
    public Aeronave() {
        this.id = 0;
        this.nombre = "";
        this.ultimoVuelo = LocalDate.of(1999,1,1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if((id+"").length() > 4)
            this.id = id;
        else
            System.out.println("error al ingresar el id");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getUltimoVuelo() {
        return ultimoVuelo;
    }

    public void setUltimoVuelo(LocalDate ultimoVuelo) {
        this.ultimoVuelo = ultimoVuelo;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "id=" + id + ", nombre=" + nombre + ", ultimoVuelo=" + ultimoVuelo + '}';
    }
}
