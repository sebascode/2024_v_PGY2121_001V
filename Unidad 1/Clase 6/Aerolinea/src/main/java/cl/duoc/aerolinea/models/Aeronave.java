package cl.duoc.aerolinea.models;

import cl.duoc.aerolinea.utils.TipoAeronave;
import java.time.LocalDate;

public class Aeronave {
    private static int idprivado = 10;
    
    private int id;
    private String nombre;
    private int horasVoladas;
    private boolean listoParaVolar;
    private LocalDate fechaUltimoVuelo;
    private TipoAeronave tipoNave;
    
    private int tonelaje;
    private boolean ultrasonico;
    private String datosExtras;

    public Aeronave(String nombre, int horasVoladas, boolean listoParaVolar, LocalDate fechaUltimoVuelo, TipoAeronave tipoNave, int tonelaje, boolean ultrasonico, String datosExtras) {
        this.id = idprivado;
        idprivado++;
        this.nombre = nombre;
        this.horasVoladas = horasVoladas;
        this.listoParaVolar = listoParaVolar;
        this.fechaUltimoVuelo = fechaUltimoVuelo;
        this.tipoNave = tipoNave;
        this.tonelaje = tonelaje;
        this.ultrasonico = ultrasonico;
        this.datosExtras = datosExtras;
    }
     public Aeronave() {
        this.id = idprivado;
        idprivado++;
        this.nombre = "";
        this.horasVoladas = 0;
        this.listoParaVolar = false;
        this.fechaUltimoVuelo = LocalDate.of(2000,1,1);
        this.tipoNave = TipoAeronave.SinTipo;
        this.tonelaje = 0;
        this.ultrasonico = false;
        this.datosExtras = "";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasVoladas() {
        return horasVoladas;
    }

    public void setHorasVoladas(int horasVoladas) {
        this.horasVoladas = horasVoladas;
    }

    public boolean isListoParaVolar() {
        return listoParaVolar;
    }

    public void setListoParaVolar(boolean listoParaVolar) {
        this.listoParaVolar = listoParaVolar;
    }

    public LocalDate getFechaUltimoVuelo() {
        return fechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate fechaUltimoVuelo) {
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }
    
    public void setFechaUltimoVuelo(int anio, int mes, int dia) {
        this.fechaUltimoVuelo = LocalDate.of(anio, mes, dia);
    }

    public TipoAeronave getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(TipoAeronave tipoNave) {
        this.tipoNave = tipoNave;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public boolean isUltrasonico() {
        return ultrasonico;
    }

    public void setUltrasonico(boolean ultrasonico) {
        this.ultrasonico = ultrasonico;
    }

    public String getDatosExtras() {
        return datosExtras;
    }

    public void setDatosExtras(String datosExtras) {
        this.datosExtras = datosExtras;
    }

    @Override
    public String toString() {        
        String mensaje = "Aeronave{" + "id=" + id + ", nombre=" + nombre + ", horasVoladas=" + horasVoladas + ", listoParaVolar=" + listoParaVolar + ", fechaUltimoVuelo=" + fechaUltimoVuelo + ", tipoNave=" + tipoNave;
        
        if(this.tipoNave == TipoAeronave.Avion){
            mensaje +=  ", datosExtras=" + datosExtras + '}';
        }
        else if(this.tipoNave == TipoAeronave.Carguero){
            mensaje += ", tonelaje=" + tonelaje +"}";
        }
        else if(this.tipoNave == TipoAeronave.Avioneta){
            mensaje +=  ", ultrasonico=" + ultrasonico + "}";
        }
        
        /*
        // alternativa con switch
        switch (this.tipoNave) {
            case Avion:
                mensaje +=  ", datosExtras=" + datosExtras + '}';
                break;
            case Carguero:
                mensaje += ", tonelaje=" + tonelaje +"}";
                break;
            case Avioneta:
                mensaje +=  ", ultrasonico=" + ultrasonico + "}";
                break;
            default:
                break;
        }
        */
        
        return mensaje;
    }
    
}
