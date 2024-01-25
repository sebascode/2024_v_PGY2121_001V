/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.banco.exceptions;

import java.time.LocalDateTime;

public class CuentaBancoException extends Exception {
    private LocalDateTime time;
    private String mensaje;

    public CuentaBancoException(String mensaje) {
        this.time = LocalDateTime.now();
        this.mensaje = mensaje;
    }

    public CuentaBancoException(String mensaje, String string) {
        super(string);
        this.time = LocalDateTime.now();
        this.mensaje = mensaje;
    }

    public CuentaBancoException(String mensaje, String string, Throwable thrwbl) {
        super(string, thrwbl);
        this.time = LocalDateTime.now();
        this.mensaje = mensaje;
    }

    public CuentaBancoException(String mensaje, Throwable thrwbl) {
        super(thrwbl);
        this.time = LocalDateTime.now();
        this.mensaje = mensaje;
    }

    public CuentaBancoException(String mensaje, String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
        this.time = LocalDateTime.now();
        this.mensaje = mensaje;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString(){
        return "ERROR: "+ this.time.toString() + " - "+ this.mensaje;
    }
}
