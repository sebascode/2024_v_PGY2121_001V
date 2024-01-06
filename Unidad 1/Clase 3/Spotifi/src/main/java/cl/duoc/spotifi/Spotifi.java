package cl.duoc.spotifi;

import cl.duoc.spotifi.model.Cancion;

public class Spotifi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cancion micancion = new Cancion();
        micancion.setId(10);
        micancion.setTitulo("Caballo homosexual de las montañas");
        micancion.setArtista("El caballo");
        micancion.setDuracion(3, 10);
        micancion.setFavorito(true);
        micancion.setDescarga(true);
        
        Cancion solylluvia = new Cancion();
        solylluvia.setArtista("Sol y LLuvia");
        solylluvia.setId(12);
        solylluvia.setDuracion(4,50);
        solylluvia.setTitulo("Adios Generalams");
        solylluvia.setFavorito(true);
        solylluvia.setDescarga(false);
        
        solylluvia.Adelantar(15);
        System.out.println(micancion);
        System.out.println(solylluvia);
        System.out.println(micancion.isLarga());
        System.out.println(solylluvia.isLarga());
    }
}
