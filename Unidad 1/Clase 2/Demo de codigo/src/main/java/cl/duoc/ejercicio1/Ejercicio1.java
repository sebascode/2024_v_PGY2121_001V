package cl.duoc.ejercicio1;

import cl.duoc.ejercicio1.Models.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        int edad;
        edad = 5;
        
        String nombre = "seba";
        */        
        Persona juanito;
        juanito = new Persona("Seba", "Contreras");
        
        String nombre = juanito.getRut();
        System.out.println(nombre);
    }
}
