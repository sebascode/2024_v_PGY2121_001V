package cl.duoc.aeropuertoherencia;

import cl.duoc.aeropuertoherencia.models.*;
import java.time.LocalDate;

public class AeropuertoHerencia {

    public static void main(String[] args) {
        Carguero minavecita = new Carguero();
        minavecita.setId(10);
        minavecita.setNombre("Azz del zzielo");
        minavecita.setUltimoVuelo(LocalDate.now());
        //minavecita.setDatosExtras("Datos extras muy choros");
        minavecita.setTonelaje(100);
        
        boolean resultado = isAvion(new Avioneta());
        
        System.out.println(minavecita);
    }
    
    public static boolean isAvion(Aeronave obj){
        return true;
    }
}
