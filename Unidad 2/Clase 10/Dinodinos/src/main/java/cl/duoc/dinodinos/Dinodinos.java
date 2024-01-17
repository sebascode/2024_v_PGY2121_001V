/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.dinodinos;

import cl.duoc.dinodinos.models.Dinosaurio;
import cl.duoc.dinodinos.models.Estegosaurio;
import cl.duoc.dinodinos.models.Tiranosaurio;
import cl.duoc.dinodinos.models.Velociraptor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Dinodinos {

    public static void main(String[] args) {
            
        Tiranosaurio dino = new Tiranosaurio();
        dino.setNombre("Alfonso");
        
        Velociraptor velo = new Velociraptor();
        velo.setNombre("Diego");
        
        Estegosaurio este = new Estegosaurio();
        este.setNombre("Don este");
        
        dino.Rugir();
        velo.Rugir();
        este.Rugir();
        
        // polimorfismo
        Dinosaurio din;
        din = new Tiranosaurio();
        
        din.Rugir();
        
        // Listas --> usa interfacedores
        List<String> misPalabras = new ArrayList();
        
        misPalabras.add("Hola");
        misPalabras.add("Como");
        misPalabras.add("estás");
        misPalabras.add("estás");
        misPalabras.add("estás");
        misPalabras.add("estás");
        misPalabras.add("estás");
        misPalabras.add("estás");
        misPalabras.add("estás");
        
        //System.out.println(misPalabras);
        //System.out.println(misPalabras.get(2));
        
        for(int contador = 0; contador < misPalabras.size(); contador++){
            System.out.println(misPalabras.get(contador));
        }
        
        for(String palabra : misPalabras){
            System.out.println(palabra);
        }
        
        
        
        // Caso dinosaurio
        List<Dinosaurio> lista = new ArrayList(); 
        lista.add(new Tiranosaurio());
        lista.add(new Velociraptor());
        lista.add(new Estegosaurio());
        lista.add(dino);
        lista.add(velo);
        
        for(Dinosaurio d : lista){
            System.out.println(d);
        }
    }
}
