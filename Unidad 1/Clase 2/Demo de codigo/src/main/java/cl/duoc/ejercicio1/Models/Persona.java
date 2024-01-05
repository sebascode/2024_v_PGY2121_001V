package cl.duoc.ejercicio1.Models;

import java.time.LocalDate;

public class Persona {
    // atributos
    // ACCESO - ESTATICO - TIPO - NOMBRE;
    // public        String    nombre;
    // private   
    // protected
    
    private String nombre;
    private LocalDate fechanacimiento;
    private String rut;
    private String apellido;
    private int telefono;
    private String correo;
    
    // métodos
    
    // constructores
    public Persona(){
        nombre = "sebastian";
        apellido = "contreras";
        rut = "18991453-2";
        telefono = 123456789;
        correo = "tupapi@peluchelandia.cl";
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = "1-9";
    }
    
    public Persona(int telefono){
        this.telefono = telefono;
    }
    
    
    
    // accesadores
    // accesadores permiten mostrar la informaciòn devolviendola.
    // atributo por atributo.
    // ACCESO - ESTATICO - retorno - NOMBRE;
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getRut(){
        return this.rut;
    }
    public int getTelefono(){
        return this.telefono;
    }
    
    // mutadores
    // nos ayudan a modificar la información de un objeto.
    // ACCESO - ESTATICO - void - NOMBRE;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}
