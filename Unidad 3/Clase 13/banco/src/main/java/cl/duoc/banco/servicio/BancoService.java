package cl.duoc.banco.servicio;

import cl.duoc.banco.model.CuentaBancaria;
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
            //listaCuenta.add(cuenta);
        }
    }

    @Override
    public void realizarGiro(String rut, int tipoCuenta, int monto) {
        CuentaBancaria cuenta = buscarCuenta(rut, tipoCuenta);
        // 5000 
        cuenta.setMovimiento(monto*-1);
        //listaCuenta.add(cuenta);
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
            if(cuenta.getRut() == rut && cuenta.getTipoCuenta() == tipoCuenta)
            {
                finder = cuenta;
                break;
            }
        }
        return finder;
    }
    
    
}
