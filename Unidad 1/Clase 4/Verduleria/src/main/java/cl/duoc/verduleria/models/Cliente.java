package cl.duoc.verduleria.models;

public class Cliente {
    // su run, dv, nombre, mail, dirección y teléfono
    private int run; // 18.742.228 - 18742228
    private char dv;
    private String nombre;
    private String mail;
    private String direccion;
    private long telefono;

    public Cliente(int run, char dv, String nombre, String mail, String direccion, long telefono) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public Cliente(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
    }
    
    public Cliente() {
        run = 1;
        dv = '0';
        nombre = "olakeaze";
        mail = "";
        direccion = "";
        telefono = 0L;
    }

    public int getRun() {
        return run;
    }

    public char getDv() {
        return dv;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.run;
    }
}
