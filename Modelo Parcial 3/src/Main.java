import modelo.Elemento;
import modelo.Juego;
import modelo.Pelicula;
import modelo.VideoClub;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VideoClub videoClub = new VideoClub();
        videoClub.agregarElemento(new Pelicula(1,"Hola", "ficcion", "1/12/2001", "Yo", 120));
        videoClub.agregarElemento(new Pelicula(1,"Hola", "ficcion", "1/12/2001", "Yo", 121));
        videoClub.agregarElemento(new Juego(2,"Hola", "ficcion", "1/12/2001", 90, "EA SPORTS"));
        System.out.println(videoClub.toString());


    }
}