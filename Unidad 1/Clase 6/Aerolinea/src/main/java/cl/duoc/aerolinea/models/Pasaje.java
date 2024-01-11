package cl.duoc.aerolinea.models;

import java.time.LocalDate;

public class Pasaje {
    private int id;
    private LocalDate fecha;
    private Pasajero pasajero;
    private String codigoVuelo;
    private float valor;

    public Pasaje(int id, LocalDate fecha, Pasajero pasajero, String codigoVuelo, float valor) {
        this.id = id;
        this.fecha = fecha;
        this.pasajero = pasajero;
        this.codigoVuelo = codigoVuelo;
        this.valor = valor;
    }
    
    public Pasaje() {
        this.id = -1;
        this.fecha = LocalDate.now();
        this.pasajero = new Pasajero();
        this.codigoVuelo = "LE-01";
        this.valor = 0f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "id=" + id + ", fecha=" + fecha + ", pasajero=" + pasajero + ", codigoVuelo=" + codigoVuelo + ", valor=" + valor + '}';
    }
    
}
