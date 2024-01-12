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
public class Avion extends Aeronave {
    private String datosExtras;
    
    public Avion(){
        super();
        this.datosExtras = "";
    }
    
    public Avion(String datosExtras){
        super();
        this.datosExtras = datosExtras;
    }

    public Avion(String datosExtras, int id, String nombre, LocalDate ultimoVuelo) {
        super(id, nombre, ultimoVuelo);
        this.datosExtras = datosExtras;
    }

    public String getDatosExtras() {
        return datosExtras;
    }

    public void setDatosExtras(String datosExtras) {
        this.datosExtras = datosExtras;
    }

    public int getIdOculto() {
        return idOculto;
    }

    public void setIdOculto(int idOculto) {
        this.idOculto = idOculto;
    }

    @Override
    public String toString() {
        return "Avion{" + "id=" + this.getId() + ", nombre=" + this.getNombre() + ", ultimoVuelo=" + this.getUltimoVuelo() + ", datosExtras="+ this.datosExtras + '}';
    }
    
    
}
