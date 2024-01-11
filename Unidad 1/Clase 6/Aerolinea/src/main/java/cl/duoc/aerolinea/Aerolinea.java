package cl.duoc.aerolinea;

import cl.duoc.aerolinea.models.Vuelo;
import cl.duoc.aerolinea.models.Aeronave;
import cl.duoc.aerolinea.models.Pasaje;
import cl.duoc.aerolinea.models.Pasajero;
import cl.duoc.aerolinea.utils.TipoAeronave;
import cl.duoc.aerolinea.utils.Validacion;

public class Aerolinea {

    public static void main(String[] args) {
        Aeronave boing = new Aeronave();
        Aeronave boing2 = new Aeronave();
        
        boing.setNombre("El veloz del zielo");
        boing.setFechaUltimoVuelo(2023, 05, 31);
        boing.setHorasVoladas(500);
        boing.setTipoNave(TipoAeronave.SinTipo);
        boing.setListoParaVolar(true);
        boing.setDatosExtras("Nave reparada exitosamente. Solo fue un motor que explotó");
        boing.setTonelaje(300);
        boing.setUltrasonico(true);
        
        Pasajero juanito = new Pasajero();
        
        Pasaje pasaje1 = new Pasaje();
        
        
        Vuelo miamiBogota =
                new Vuelo(3,3,2024, "Miami", "Bogotá");
        
        System.out.println(miamiBogota);
        System.out.println(boing);
        System.out.println(boing2);
        System.out.println(juanito);
        System.out.println(pasaje1);
        
        
        System.out.println(Validacion.ValidaRut(18742228, 'K'));
    }
}
