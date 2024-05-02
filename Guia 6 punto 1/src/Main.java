import modelo.ArrayReales;
import modelo.Numero;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayReales arrayReales = new ArrayReales();
        arrayReales.cargarListaReales(new Numero(4));
        arrayReales.cargarListaReales(new Numero(1));
        arrayReales.cargarListaReales(new Numero(7));
        System.out.println(arrayReales);
        double minimo= arrayReales.minimo();
        System.out.println("MINIMO: "+minimo);
        double maximo= arrayReales.maximo();
        System.out.println("MAXIMO: "+maximo);
        double sumatoria= arrayReales.sumatoria();
        System.out.println("SUMATORIA: "+sumatoria);
    }
}