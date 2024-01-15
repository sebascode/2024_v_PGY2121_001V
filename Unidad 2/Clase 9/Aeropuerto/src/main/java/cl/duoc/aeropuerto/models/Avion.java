package cl.duoc.aeropuerto.models;

import java.time.LocalDate;

public class Avion extends Aeronave {
    private String datosExtra;

    public Avion(){
        super();
        this.datosExtra = "";
    }
    
    public Avion(String datosExtra) {
        super();
        this.datosExtra = datosExtra;
    }

    public Avion(String datosExtra, int id, String nombre, int cantHoras, LocalDate fechaUltimoVuelo) {
        super(id, nombre, cantHoras, fechaUltimoVuelo);
        this.datosExtra = datosExtra;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }
    
    @Override
    public void setId(int id){
        //this.setId(Integer.parseInt("10"+id));
    }

    @Override
    public String toString() {
        return "Avion{" + "id=" + this.getId() + ", nombre=" + super.getId() + ", cantHoras=" + super.getCantHoras() + ", fechaUltimoVuelo=" + this.getFechaUltimoVuelo() + '}';
    }
    
}
