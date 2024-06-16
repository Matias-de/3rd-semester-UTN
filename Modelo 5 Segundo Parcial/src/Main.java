import Modelo.Aeropuerto;
import Modelo.Avion;
import Modelo.JsonUtiles;
import Modelo.Piloto;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.jsonToJava();
        System.out.println(aeropuerto);
        aeropuerto.javaAJson();

        Piloto aux = aeropuerto.getAviones().getFirst().getPilotos().getFirst();
        Piloto aux2 = aeropuerto.getAviones().getLast().getPilotos().getLast();
        ArrayList<String> etiquetas = aeropuerto.getAviones().getFirst().getEtiquetas();
        aeropuerto.getCaja().agregarElemento(aux);
        aeropuerto.getCaja().agregarElemento(etiquetas);
        aeropuerto.getCaja().agregarElemento(aux2);
        System.out.println(aeropuerto.getCaja());

        HashSet<Piloto> pilotos = aeropuerto.pasarPilotosAHashSet();
        System.out.println("Set pilotos: "+pilotos);

        Aeropuerto auxArchivo = new Aeropuerto();
        System.out.println("\n----------------PRUEBA ARCHIVOS--------------\n");
        aeropuerto.javaToArchivo();
        auxArchivo.archivoToJava();
        System.out.println(auxArchivo);
        System.out.println("---------------------------------------------------\n");


        ArrayList<Avion> listaMayores = aeropuerto.crearListaXCapacidad(1050);
        System.out.println("lista mayores: "+listaMayores);




    }
}