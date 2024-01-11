package cl.duoc.aerolinea.models;

import cl.duoc.aerolinea.utils.Validacion;
import java.time.LocalDate;

public class Pasajero {
    private int id;
    private String nombre;
    private int rut;
    private char dv;
    private LocalDate fechaNacimiento;
    private long telefono;
    private String email;
    private boolean vetado;

    public Pasajero(int id, String nombre, int rut, char dv, LocalDate fechaNacimiento, long telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
    }
   
    public Pasajero() {
        this.id = -1;
        this.nombre = "Sin nombre";
        this.rut = 0;
        this.dv = 'a';
        this.fechaNacimiento = LocalDate.now();
        this.telefono = 0L;
        this.email = "";
        this.vetado = false;
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

    public int getRut() {
        return rut;
    }
    
    public void setRut(int rut, char dv){
        if(Validacion.ValidaRut(rut, dv))
        {
            this.rut = rut;
            this.dv = dv;
        }
        else{
            System.out.println("No se almaceno rut.");
        }
    }

    public char getDv() {
        return dv;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if(Validacion.ValidaFecha(fechaNacimiento))
            this.fechaNacimiento = fechaNacimiento;
        else
            System.out.println("No se almaceno fecha.");
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if(Validacion.ValidaTelefono(telefono)){
            this.telefono = telefono;
        }
        else {
            System.out.println("No se almaceno telefono.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(Validacion.ValidaEmail(email)){
            this.email = email;
        }
        else{
            System.out.println("No se guardó correo.");
        }
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }
    
    
    @Override
    public String toString() {
        return "Pasajero{" + "id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", dv=" + dv + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", vetado=" + vetado + '}';
    }
}
