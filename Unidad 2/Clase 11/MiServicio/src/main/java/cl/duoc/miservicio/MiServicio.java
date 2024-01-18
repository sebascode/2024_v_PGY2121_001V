/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.miservicio;

import cl.duoc.miservicio.models.Persona;
import cl.duoc.miservicio.service.IPersonaService;
import cl.duoc.miservicio.service.PersonaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class MiServicio {

    public static void main(String[] args) {
        Persona p = new Persona(1, "Sebastian", "Contreras");
        Persona p2 = new Persona(2, "David", "Bisbal");
        System.out.println(p);
        System.out.println(p2);
        
        IPersonaService app = new PersonaService();
        app.Guardar(p);
        app.Guardar(p2);
        
        app.ImprimirListado();
        
        app.Borrar(1);
        app.ImprimirListado();

        // ejemplo de llamado de constantes declaras en interface
        int valorIVA = IPersonaService.IVA;
    }
}
