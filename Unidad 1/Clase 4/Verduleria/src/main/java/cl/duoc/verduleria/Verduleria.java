package cl.duoc.verduleria;

import cl.duoc.verduleria.models.Cliente;
import cl.duoc.verduleria.models.Producto;
import cl.duoc.verduleria.models.Solicitud;
import cl.duoc.verduleria.models.UnidadMedida;
import cl.duoc.verduleria.utils.Validaciones;
import java.time.LocalDate;

public class Verduleria {

    public static void main(String[] args) {
        
        Producto zanahoria = new Producto();
        zanahoria.setCodigo(900);
        zanahoria.setDescripcion("Zanahoria");
        zanahoria.setPrecio(890);
        zanahoria.setMedida(UnidadMedida.Unidad);
        zanahoria.setCantidad(1000);
        
        System.out.println(zanahoria);
        
        Cliente juanito = new Cliente();
        juanito.setRun(18745443);
        juanito.setDv('3');
        juanito.setMail("juanito@starchannel.cl");
        juanito.setNombre("Juan Juan");
        juanito.setTelefono(123423132);
        
        System.out.println(juanito);
        
        // Solicitud(LocalDate fecha, Cliente cliente, float total, String productos)
        Solicitud compra = 
                new Solicitud(
                        LocalDate.of(2024, 1, 8), 
                        juanito, 
                        890, 
                        zanahoria.toString()
                );
        Solicitud compra2 = 
                new Solicitud(
                        LocalDate.of(2024, 1, 9), 
                        juanito, 
                        1890, 
                        zanahoria.toString()
                );
        
        System.out.println(compra.ObtenerDetallePedido());
        System.out.println(compra2.ObtenerDetallePedido());
        
        System.out.println("Validacion: "+Validaciones.validaPrecio(100));
    }
}
