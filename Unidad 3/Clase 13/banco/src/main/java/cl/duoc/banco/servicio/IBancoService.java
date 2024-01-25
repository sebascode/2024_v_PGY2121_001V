/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.banco.servicio;

import cl.duoc.banco.exceptions.CuentaBancoException;

/**
 *
 * @author Cetecom
 */
public interface IBancoService {
    // 0 cuenta corriente
    // 1 cuenta ahorro
    public void realizarDeposito(String rut, int tipoCuenta, int monto);
    public void realizarGiro(String rut, int tipoCuenta, int monto) throws CuentaBancoException;
    public int obtenerMonto(String rut, int tipoCuenta);
    public String obtenerCartola(String rut, int tipoCuenta);
    public int obtenerSaldoTotal(String rut, int tipoCuenta);
}
