import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.MiExcepcion;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        try {
            JSONArray ja = new JSONArray(JsonUtiles.leer("jugadores"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        Equipo equipo = new Equipo();
        equipo.jsonToJava("jugadores");
        System.out.println(equipo);

        int cantMaxima = 0;
        try {
            cantMaxima = equipo.retornarCantElementos("posicion", "soporte", 2);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            System.out.println(cantMaxima);
        }

        equipo.tablaToArchivoPorSueldoPorParametro("archivoSalarios", 3000);

        HashSet<Jugador> aux= new HashSet<>();
        equipo.archiToColeccion("archivoSalarios", aux);
        System.out.println(aux);


    }












}