import modelo.GestorPaquetes;
import modelo.PaqueteAereo;
import modelo.PaqueteTerrestre;

public class Main {
    public static void main(String[] args) {
        GestorPaquetes paquetes= new GestorPaquetes();
        paquetes.agregarPaquetes(new PaqueteTerrestre(20,"Jamaica", true, true, 105,"camion"));
        paquetes.agregarPaquetes(new PaqueteAereo(30, "Japon", true, true, "AA", "express"));
        System.out.println(paquetes);
        System.out.println(paquetes.cantPaquetes());

    }
    
}