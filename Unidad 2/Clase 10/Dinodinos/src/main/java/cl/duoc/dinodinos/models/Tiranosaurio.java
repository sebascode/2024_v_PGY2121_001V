/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.dinodinos.models;

/**
 *
 * @author Cetecom
 */
public class Tiranosaurio extends Dinosaurio {
    private int cantColmillos;

    public Tiranosaurio(int cantColmillos, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantColmillos = cantColmillos;
    }

    public Tiranosaurio(int cantColmillos) {
        super();
        this.cantColmillos = cantColmillos;
    }

    public Tiranosaurio() {
        super();
        this.cantColmillos = 0;
    }

    public int getCantColmillos() {
        return cantColmillos;
    }

    public void setCantColmillos(int cantColmillos) {
        this.cantColmillos = cantColmillos;
    }

    @Override
    public String toString() {
        return "Tiranosaurio{" + "id=" + super.getId() + ", nombre=" + super.getNombre() + ", periodo=" + super.getPeriodo() + ", cantPatas=" + super.getCantPatas() + ",cantColmillos="+ this.cantColmillos + '}';
    }

    @Override
    public void Rugir() {
        System.out.println(this.getNombre()+": raaaaAAAAAAarrrw");
    }
    
    
}
