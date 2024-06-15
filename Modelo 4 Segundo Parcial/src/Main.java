import Modelo.GestorAutores;
import Modelo.NoIDEnMapaException;

public class Main {
    public static void main(String[] args) {
        GestorAutores gestorAutores = new GestorAutores();
        gestorAutores.jsonToJava("archivo");
        System.out.println(gestorAutores);
        gestorAutores.cargarMapaEtiquetas();
        System.out.println(gestorAutores);
        gestorAutores.javaToJson();
        int cantEtiquetas = 0;
        try {
            cantEtiquetas = gestorAutores.devolverCantidadEtiquetasPorId("649233e6fd52b92412cb24cd");
            System.out.println("cantEtiquetas: "+cantEtiquetas);
        } catch (NoIDEnMapaException e) {
            System.out.println(e.getMessage());
        }
        try {
            cantEtiquetas = gestorAutores.devolverCantidadEtiquetasPorId("sdfdsfsdfdsf");
            System.out.println("cantEtiquetas: "+cantEtiquetas);
        } catch (NoIDEnMapaException e) {
            System.out.println(e.getMessage());
        }

        gestorAutores.javaToarchivo();
        GestorAutores gestorAutoresPruebaArchivo = new GestorAutores();
        gestorAutoresPruebaArchivo.archivoToJava("autores.dat");
        System.out.println(gestorAutoresPruebaArchivo);


    }
}