package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Aeropuerto {
    //Atributos

    private ArrayList<Avion> aviones;
    private Caja caja;

    //constructores

    public Aeropuerto(ArrayList<Avion> aviones, Caja caja) {
        this.aviones = aviones;
        this.caja = caja;
    }

    public Aeropuerto(){
        aviones= new ArrayList<>();
        caja= new Caja<>();
    }

    //getters


    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public Caja getCaja() {
        return caja;
    }

    //setters

    public void setAviones(ArrayList<Avion> aviones) {
        this.aviones = aviones;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }


    //metodos

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "aviones=" + aviones +
                ",\n caja=" + caja +
                '}';
    }


    public void jsonToJava(){

        try {
            JSONArray jsonArray = new JSONArray(JsonUtiles.leer("Aeropuerto"));
            JSONObject joAvion;
            JSONArray jaPilotos;
            for (int i=0; i<jsonArray.length(); i++){
                joAvion=jsonArray.getJSONObject(i);
                Avion aux= new Avion();
                jaPilotos = joAvion.getJSONArray("Pilot");

                for(int w=0; w<jaPilotos.length(); w++){
                    JSONObject joPiloto = jaPilotos.getJSONObject(w);
                    Piloto auxPiloto= new Piloto();
                    auxPiloto.setEdad(joPiloto.getInt("age"));
                    auxPiloto.setNombre(joPiloto.getString("name"));
                    auxPiloto.setGenero(joPiloto.getString("gender"));
                    auxPiloto.setDireccion(joPiloto.getString("address"));
                    auxPiloto.setEmail(joPiloto.getString("email"));
                    auxPiloto.setNroTelefono(joPiloto.getString("phone"));
                    aux.agregarPilotos(auxPiloto);
                }
                JSONArray jaTags = joAvion.getJSONArray("tags");

                for(int j=0; j<jaTags.length(); j++){
                    aux.agregarTags(jaTags.getString(j));
                }
                aux.setId(joAvion.getString("_id"));
                aux.setActivo(joAvion.getBoolean("isActive"));
                aux.setFoto(joAvion.getString("picture"));
                aux.setCapacidad(joAvion.getInt("capacity"));
                aux.setCompañia(joAvion.getString("company"));
                aux.setLatitud(joAvion.getDouble("latitude"));
                aux.setLongitud(joAvion.getDouble("longitude"));


                aviones.add(aux);
            }



        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    public void javaAJson(){

        JSONArray jaTotal= new JSONArray();
        for(int i=0; i<aviones.size(); i++){
            Avion aux = aviones.get(i);
            JSONObject joAvion = new JSONObject();
            JSONArray jaPiloto = new JSONArray();
            try {

                for(int j=0; j<aux.getPilotos().size(); j++){
                    JSONObject joPiloto = new JSONObject();
                    Piloto piloto = aux.getPilotos().get(j);
                    joPiloto.put("age", piloto.getEdad());
                    joPiloto.put("name", piloto.getNombre());
                    joPiloto.put("gender", piloto.getGenero());
                    joPiloto.put("address", piloto.getDireccion());
                    joPiloto.put("email", piloto.getEmail());
                    joPiloto.put("phone", piloto.getNroTelefono());
                    jaPiloto.put( joPiloto);

                }
                joAvion.put("tags", aux.getEtiquetas());
                joAvion.put("Pilot", jaPiloto);
                joAvion.put("_id", aux.getId());
                joAvion.put("isActive", aux.isActivo());
                joAvion.put("picture", aux.getFoto());
                joAvion.put("capacity", aux.getCapacidad());
                joAvion.put("company", aux.getCompañia());
                joAvion.put("latitude", aux.getLatitud());
                joAvion.put("longitude", aux.getLongitud());


                jaTotal.put(joAvion);


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        JsonUtiles.grabar(jaTotal, "Miaeropuerto");




    }




    //crear una lista de aviones por capacidad mayor a la enviada por parametro (con excepcion)

    public ArrayList<Avion> crearListaXCapacidad(int capacidadMin){

        ArrayList<Avion> listaXCapacidad = new ArrayList<>();
        for(int i=0; i<aviones.size(); i++){
            if(aviones.get(i).getCapacidad() > capacidadMin){
                listaXCapacidad.add(aviones.get(i));
            }else{
                CapacidadMenorException ex = new CapacidadMenorException(aviones.get(i).getCapacidad(), capacidadMin);
                ex.printStackTrace();
            }
        }




        return listaXCapacidad;
    }






    //pasar a hashset pilotos
    public HashSet<Piloto> pasarPilotosAHashSet(){
        HashSet<Piloto> pilotos =new HashSet<>();
        for(int i=0; i< caja.size(); i++){
            if(caja.get(i) instanceof Piloto){
                pilotos.add((Piloto) caja.get(i));
            }
        }



        return pilotos;
    }



    public void javaToArchivo(){


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Aeropuertos.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for(int i=0; i<aviones.size(); i++){

                Avion aux= aviones.get(i);
                objectOutputStream.writeObject(aux);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void archivoToJava(){

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Aeropuertos.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            boolean finDeArchivo= false;
            while(!finDeArchivo){
                try{
                    aviones.add((Avion) objectInputStream.readObject());

                }catch (EOFException e){
                    finDeArchivo=true;
                } catch (ClassNotFoundException e) {
                   e.printStackTrace();
                }

            }
        } catch (IOException e) {
             e.printStackTrace();
        }


    }





}
