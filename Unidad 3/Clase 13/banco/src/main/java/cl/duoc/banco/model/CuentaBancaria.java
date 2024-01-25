/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.banco.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class CuentaBancaria {
    private String rut;
    private List<Integer> movimientos;
    private int tipoCuenta;

    public CuentaBancaria(String rut, List<Integer> movimientos, int tipoCuenta) {
        this.rut = rut;
        this.movimientos = movimientos;
        this.tipoCuenta = tipoCuenta;
    }
    
    public CuentaBancaria(String rut, int tipoCuenta, int monto) {
        this.rut = rut;
        this.movimientos = new ArrayList();
        this.tipoCuenta = tipoCuenta;
        this.movimientos.add(monto);
    }
    
    public CuentaBancaria() {
        this.rut = "";
        this.movimientos = new ArrayList();
        this.tipoCuenta = -1;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public List<Integer> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Integer> movimientos) {
        this.movimientos = movimientos;
    }
    public void setMovimiento(int movimiento){
        this.movimientos.add(movimiento);
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public String getCartola(){
        String mensaje = "Cliente: " + this.rut;
        mensaje += "\nTipo de Cuenta: "+ (this.tipoCuenta == 1 ? "Ahorro" : "Corriente");
        
        int i = 0;
        for(Integer movimiento : this.movimientos){
            i++;
            mensaje +="\n "+ i + ": "+ movimiento.toString();
        }
        return mensaje;
    }
    
    public int getSaldoTotal(){
        int saldo = 0;
        for(Integer movimiento : this.movimientos){
            saldo += movimiento;
        }
        return saldo;
    }
}
