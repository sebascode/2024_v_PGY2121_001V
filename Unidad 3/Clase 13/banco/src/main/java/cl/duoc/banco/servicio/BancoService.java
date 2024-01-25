package cl.duoc.banco.servicio;

import cl.duoc.banco.exceptions.CuentaBancoException;
import cl.duoc.banco.model.CuentaBancaria;
import cl.duoc.banco.utils.CuentaValidation;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Cetecom
 */
public class BancoService implements IBancoService {

    List<CuentaBancaria> listaCuenta;
    
    public BancoService(){
        listaCuenta = new ArrayList();
    }

    @Override
    public void realizarDeposito(String rut, int tipoCuenta, int monto) {
        CuentaBancaria busquedaCuenta = buscarCuenta(rut, tipoCuenta);
        CuentaBancaria cuenta;
        if(busquedaCuenta.getTipoCuenta() == -1){
            cuenta = new CuentaBancaria(rut, tipoCuenta, monto);
            listaCuenta.add(cuenta);
        }else{
            cuenta = busquedaCuenta;
            cuenta.setMovimiento(monto);
        }
    }

    @Override
    public void realizarGiro(String rut, int tipoCuenta, int monto) throws CuentaBancoException
    {
        CuentaBancaria cuenta = buscarCuenta(rut, tipoCuenta);
        
        if(CuentaValidation.validaOperacion(cuenta, monto*-1)){
            cuenta.setMovimiento(monto*-1);
        }
        else{
            throw new CuentaBancoException("No paso validación de operaciones.");
        }
    }

    @Override
    public int obtenerMonto(String rut, int tipoCuenta) {
        return buscarCuenta(rut, tipoCuenta).getSaldoTotal();
    }

    @Override
    public String obtenerCartola(String rut, int tipoCuenta) {
        return buscarCuenta(rut, tipoCuenta).getCartola();
    }
    
    private CuentaBancaria buscarCuenta(String rut, int tipoCuenta){
        CuentaBancaria finder = new CuentaBancaria();
        for(CuentaBancaria cuenta : this.listaCuenta){
            if((cuenta.getRut() == null ? rut == null : cuenta.getRut().equals(rut)) && cuenta.getTipoCuenta() == tipoCuenta)
            {
                finder = cuenta;
                break;
            }
        }
        return finder;
    }

    @Override
    public int obtenerSaldoTotal(String rut, int tipoCuenta) {
        return buscarCuenta(rut, tipoCuenta).getSaldoTotal();
    }
    
    
}
