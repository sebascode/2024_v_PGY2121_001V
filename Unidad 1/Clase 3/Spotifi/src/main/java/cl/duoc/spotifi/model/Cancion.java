package cl.duoc.spotifi.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Cancion {
    
    private int id;
    private String titulo;
    private String artista;
    //private int duracion;
    private LocalTime duracion;
    private boolean favorito;
    private boolean descarga;
    
    // constructor
    public Cancion(){
        this.id = 0;
        this.titulo = "Nueva cancion";
        this.artista = "Nuevo artista";
        this.duracion = LocalTime.now();
        this.favorito = false;
        this.descarga = false;
    }
    
    public Cancion(String titulo, String artista,
            LocalTime duracion,
            boolean favorito,
            boolean descarga){
        this.id = 0;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorito = favorito;
        this.descarga = descarga;
    }
    
    // Accesadores / Getter
    // retornan valores
    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getArtista(){
        return this.artista;
    }
    public LocalTime getDuracion(){
        return this.duracion;
    }
    public boolean isFavorito(){
        return this.favorito;
    }
    public boolean isDescarga(){
        return this.descarga;
    }
    
    // Mutadores   / Setter
    // alteran valores
    public void setId(int id){
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setDuracion(LocalTime duracion){
        /*
        if(duracion > 30){
            this.duracion = duracion;
        }else{
            this.duracion = 0;
        }
        */
        this.duracion = duracion;
    }
    public void setDuracion(int minutos, int segundos){
        this.duracion = LocalTime.of(0, minutos, segundos);
    }
    
    public void setFavorito(boolean favorito){
        this.favorito = favorito;
    }
    public void setDescarga(boolean descarga){
        this.descarga = descarga;
    }
    
    // custom
    @Override
    public String toString(){
        return this.titulo + " - "+ this.artista + " ("+ this.getDuracionEnMinutos() +"s)";
    }
    
    // Que permita adelantar la canción en una cantidad
    // variable de segundos
    public void Adelantar(int segundosAdelantar){
        //this.duracion = this.duracion + segundosAdelantar;
        //this.duracion += segundosAdelantar;
        this.duracion = this.duracion.plusSeconds(segundosAdelantar);
    }
    public void Retroceder(int segundosRetroceder){
        //this.duracion = this.duracion - segundosRetroceder;
        //this.duracion -= segundosRetroceder;
        this.duracion = this.duracion.minusSeconds(segundosRetroceder);
    }
    
    private String getDuracionEnMinutos(){
        return this.duracion.toString();
    }
    
    public String isLarga(){
        /*
        if(this.duracion.getMinute() > 5){
            return "es Larga";
        }
        else{
            return "No es larga";
        }
        */
        return (this.duracion.getMinute() >= 5 ? "Es Larga" : "No es Larga" );
    }
}
