/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.dinodinos.models;

/**
 *
 * @author Cetecom
 */
public abstract class Dinosaurio {
    private int id;
    private String nombre;
    private String periodo;
    private int cantPatas;

    public Dinosaurio(int id, String nombre, String periodo, int cantPatas) {
        this.id = id;
        this.nombre = nombre;
        this.periodo = periodo;
        this.cantPatas = cantPatas;
    }
    
    public Dinosaurio() {
        this.id = 0;
        this.nombre = "";
        this.periodo = "";
        this.cantPatas = 0;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "id=" + id + ", nombre=" + nombre + ", periodo=" + periodo + ", cantPatas=" + cantPatas + '}';
    }    
    /*
    public void Rugir(){
        System.out.println("********");
        System.out.println(this.nombre + " dijo 'Raaawrrr'");
        System.out.println("********");
    }*/
    
    public abstract void Rugir();
}
