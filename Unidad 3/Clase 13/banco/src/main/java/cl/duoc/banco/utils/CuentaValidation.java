package cl.duoc.banco.utils;

import cl.duoc.banco.model.CuentaBancaria;

public class CuentaValidation {
    private static int saldoTopeCC = -300000;
    public static boolean validaOperacion(CuentaBancaria obj, int nuevoMonto){
        
        if(obj.getTipoCuenta() == 0){
            // cuenta corriente
            int monto = obj.getSaldoTotal() + nuevoMonto;
            return monto >= saldoTopeCC;
        }
        else{
            // cuenta ahorro
            int monto = obj.getSaldoTotal() + nuevoMonto;
            return monto >= 0;
        }
    }
}
