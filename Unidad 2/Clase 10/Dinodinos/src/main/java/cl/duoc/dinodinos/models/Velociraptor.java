/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.dinodinos.models;

/**
 *
 * @author Cetecom
 */
public class Velociraptor extends Dinosaurio {
    private float velocidadCorriendo;

    public Velociraptor(float velocidadCorriendo, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.velocidadCorriendo = velocidadCorriendo;
    }

    public Velociraptor(float velocidadCorriendo) {
        super();
        this.velocidadCorriendo = velocidadCorriendo;
    }
    
    public Velociraptor() {
        super();
        this.velocidadCorriendo = 0f;
    }

    public float getVelocidadCorriendo() {
        return velocidadCorriendo;
    }

    public void setVelocidadCorriendo(float velocidadCorriendo) {
        this.velocidadCorriendo = velocidadCorriendo;
    }

    @Override
    public String toString() {
        return "Velociraptor{" + "id=" + super.getId() + ", nombre=" + super.getNombre() + ", periodo=" + super.getPeriodo() + ", cantPatas=" + super.getCantPatas() + ",velocidadCorriendo="+ this.velocidadCorriendo + '}';
    }

    @Override
    public void Rugir() {
        System.out.println(this.getNombre()+" dijo que: auuu auuuuu");
    }
    
}
