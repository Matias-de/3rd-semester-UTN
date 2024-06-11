package Modelo;

import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Equipo {

    //atributos
    GHashMap<String> tablaXColorDeOjos;
    GHashMap<String> tablaXPosicion;

    //constructores


    public Equipo(GHashMap<String> tablaXColorDeOjos, GHashMap<String> tablaXPosicion) {
        this.tablaXColorDeOjos = tablaXColorDeOjos;
        this.tablaXPosicion = tablaXPosicion;
    }

    public Equipo() {
        tablaXColorDeOjos = new GHashMap<>();
        tablaXPosicion = new GHashMap<>();
    }


    //getters
    public GHashMap<String> getTablaXColorDeOjos() {
        return tablaXColorDeOjos;
    }

    public GHashMap<String> getTablaXPosicion() {
        return tablaXPosicion;
    }

    //setters
    public void setTablaXColorDeOjos(GHashMap<String> tablaXColorDeOjos) {
        this.tablaXColorDeOjos = tablaXColorDeOjos;
    }

    public void setTablaXPosicion(GHashMap<String> tablaXPosicion) {
        this.tablaXPosicion = tablaXPosicion;
    }

    //metodos


    @Override
    public String toString() {
        return "Equipo{" +
                "tablaXColorDeOjos=" + tablaXColorDeOjos.listar() +
                "\n tablaXPosicion=" + tablaXPosicion.listar() +
                '}';
    }


    public void jsonToJava(String nombreArchi) {

        try {
            JSONArray ja = new JSONArray(JsonUtiles.leer(nombreArchi));
            for (int i = 0; i < ja.length(); i++) {
                JSONObject jo = ja.getJSONObject(i);
                Jugador aux = new Jugador();
                aux.setId(jo.getString("_id"));
                aux.setGuid(jo.getString("guid"));
                aux.setActive(jo.getBoolean("isActive"));
                aux.setBalance(jo.getString("balance"));
                aux.setAge(jo.getInt("age"));
                aux.setEyeColor(jo.getString("eyeColor"));
                JSONObject joName = jo.getJSONObject("name");
                aux.setFirstName(joName.getString("first"));
                aux.setLastName(joName.getString("last"));
                aux.setEmail(jo.getString("email"));
                aux.setPhone(jo.getString("phone"));
                aux.setPosition(jo.getString("position"));

                tablaXPosicion.agregarElemento(aux.getPosition(), aux);
                tablaXColorDeOjos.agregarElemento(aux.getEyeColor(), aux);
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public int retornarCantElementos(String nombreTabla, String clave, int cantMaxima) throws MiExcepcion {
        int rta = 0;
        HashMap<String, HashSet<Jugador>> tabla = null;
        if (nombreTabla.equalsIgnoreCase("colores")) {
            tabla = tablaXColorDeOjos.getNuevoHashmap();
        } else if (nombreTabla.equalsIgnoreCase("posicion")) {
            tabla = tablaXPosicion.getNuevoHashmap();
        }
        if (tabla != null && tabla.containsKey(clave)) {

            HashSet<Jugador> auxSet = tabla.get(clave);
            // System.out.println(auxSet.size());
            rta = auxSet.size();

            if (auxSet.size() >= cantMaxima) {
                rta = auxSet.size() - cantMaxima;
                throw new MiExcepcion("Tabla: " + nombreTabla + ", clave: " + clave + ", cantidad: " + (auxSet.size() - cantMaxima));
            }


        }


        return rta;
    }


    public void tablaToArchivoPorSueldoPorParametro(String nombreArchi, double salarioAux) {

        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        Iterator<Map.Entry<String, HashSet<Jugador>>> entryIterator = tablaXPosicion.entrySetIterator();

        try {
            fileOutputStream = new FileOutputStream(nombreArchi);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            while (entryIterator.hasNext()) {
                Map.Entry<String, HashSet<Jugador>> hashSetEntry = entryIterator.next();
                HashSet<Jugador> auxSet = hashSetEntry.getValue();
                Iterator<Jugador> setIterator = auxSet.iterator();
                while (setIterator.hasNext()) {
                    Jugador aux = setIterator.next();
                    double salarioLimpio = salarioNormal(aux.getBalance());
                    if (salarioLimpio > salarioAux) {

                        objectOutputStream.writeObject(aux);
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public double salarioNormal(String salario) {

        String sueldoLimpio = salario.replace("$", "").replace(",", "");
        return Double.parseDouble(sueldoLimpio);
    }


    public void archiToColeccion(String nombreArchivo, HashSet<Jugador> auxSet) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;


        try {
            fileInputStream= new FileInputStream(nombreArchivo);
            objectInputStream= new ObjectInputStream(fileInputStream);

            boolean finDeArchivo=false;
            while(!finDeArchivo){
                try{
                    Jugador aux= (Jugador)objectInputStream.readObject();
                    auxSet.add(aux);
                }catch (EOFException e){
                    finDeArchivo=true;
                }
            }

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }


    }





}