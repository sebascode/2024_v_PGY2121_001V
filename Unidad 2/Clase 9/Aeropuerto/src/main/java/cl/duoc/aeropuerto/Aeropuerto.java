package cl.duoc.aeropuerto;

import cl.duoc.aeropuerto.models.Aeronave;
import cl.duoc.aeropuerto.models.Carguero;
import java.time.LocalDate;

public class Aeropuerto {

    public static void main(String[] args) {
        Carguero minave = new Carguero();
        minave.setCantHoras(10);
        Aeronave minave2 = new Aeronave(22, "asasd", 322, LocalDate.now());
        
        System.out.println(minave); // avion
        System.out.println(minave2);// aeronave
    }
}