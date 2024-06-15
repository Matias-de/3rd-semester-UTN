package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestorAutores {

    //Atributos
    private ListaGenerica<Autor> autores;
    private HashSet<Autor> autorHashSet;
    private HashMap<String, ArrayList<String>> mapaEtiquetas;
    //Constructor

    public GestorAutores(){
        autores=new ListaGenerica<>();
        autorHashSet=new HashSet<>();
        mapaEtiquetas= new HashMap<>();

    }

    public HashMap<String, ArrayList<String>> getMapaEtiquetas() {
        return mapaEtiquetas;
    }

    public HashSet<Autor> getAutorHashSet() {
        return autorHashSet;
    }

    public ListaGenerica<Autor> getAutores() {
        return autores;
    }


    public void setAutores(ListaGenerica<Autor> autores) {
        this.autores = autores;
    }

    public void setAutorHashSet(HashSet<Autor> autorHashSet) {
        this.autorHashSet = autorHashSet;
    }

    public void setMapaEtiquetas(HashMap<String, ArrayList<String>> mapaEtiquetas) {
        this.mapaEtiquetas = mapaEtiquetas;
    }


    @Override
    public String toString() {
        return "GestorAutores{" +
                "autores=" + autores +
                ",\n autorHashSet=" + autorHashSet +
                ",\n mapaEtiquetas=" + mapaEtiquetas +
                '}';
    }


    public void jsonToJava(String nombreArchivo){

        try {
            JSONArray jsonArray= new JSONArray(JsonUtiles.leer(nombreArchivo));
            for(int i=0; i< jsonArray.length(); i++){
                JSONObject joAutor = jsonArray.getJSONObject(i);
                JSONArray jaTags = joAutor.getJSONArray("tags");
                Autor aux= new Autor();
                for(int j=0; j<jaTags.length(); j++){
                    aux.agregarTag(jaTags.getString(j));
                }
                JSONArray jaFriends = joAutor.getJSONArray("friends");
                for(int w=0; w<jaFriends.length(); w++){
                    JSONObject joFriend = jaFriends.getJSONObject(w);
                    Friend auxFriend= new Friend();
                    auxFriend.setId(joFriend.getInt("id"));
                    auxFriend.setNombre(joFriend.getString("name"));
                    aux.agregarFriend(auxFriend);
                }
                aux.setId(joAutor.getString("_id"));
                aux.setActive(joAutor.getBoolean("isActive"));
                aux.setBalance(joAutor.getString("balance"));
                aux.setEyeColor(joAutor.getString("eyeColor"));
                aux.setName(joAutor.getString("name"));
                aux.setGender(joAutor.getString("gender"));
                aux.setAge(joAutor.getInt("age"));
                autores.agregarElemento(aux);
                autorHashSet.add(aux);
            }

        } catch(JSONException e){
           e.printStackTrace();

        }


    }
    public void cargarMapaEtiquetas() {
        autores.cargarMapaEtiquetas(mapaEtiquetas);
    }


    public void javaToJson() {
        JSONObject joAutor = null;
        JSONArray jaTotal = new JSONArray();
        for (int i = 0; i < autores.size(); i++) {
            joAutor = new JSONObject();
            JSONArray jaTags = new JSONArray();
            JSONArray jaFriends = new JSONArray();
            Autor aux = autores.getArrayList().get(i);
            try {
                joAutor.put("_id", aux.getId());
                joAutor.put("isActive", aux.isActive());
                joAutor.put("balance", aux.getBalance());
                joAutor.put("eyeColor", aux.getEyeColor());
                joAutor.put("name", aux.getName());
                joAutor.put("gender", aux.getGender());
                joAutor.put("age", aux.getAge());
                joAutor.put("tags", autores.getArrayList().get(i).getTags());

                for(int j=0; j<aux.getFriends().size(); j++){
                    JSONObject joFriend = new JSONObject();
                    joFriend.put("id", aux.getFriends().get(j).getId());
                    joFriend.put("nombre", aux.getFriends().get(j).getNombre());
                    jaFriends.put(joFriend);

                }
                joAutor.put("friends", jaFriends);
                jaTotal.put(joAutor);

            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

        JsonUtiles.grabar(jaTotal, "autores");


    }



    public int devolverCantidadEtiquetasPorId(String id)throws NoIDEnMapaException{
        int cantEtiquetasAux=0;
        if(mapaEtiquetas.containsKey(id)){
            ArrayList<String> aux= mapaEtiquetas.get(id);
            cantEtiquetasAux=aux.size();
        }else{

           throw new NoIDEnMapaException(id);

        }



        return cantEtiquetasAux;
    }


    //practica archivos


    public void javaToarchivo(){

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;


            try {
                fileOutputStream= new FileOutputStream("autores.dat");
                objectOutputStream= new ObjectOutputStream(fileOutputStream);
                for(int i=0; i<autores.size(); i++) {
                    Autor aux = autores.getArrayList().get(i);
                    objectOutputStream.writeObject(aux);

                }
            } catch (IOException e) {
               e.printStackTrace();
            }finally {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }




    }

        public void archivoToJava(String nombreArchivo){
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;

            try {
                fileInputStream= new FileInputStream(nombreArchivo);
                objectInputStream= new ObjectInputStream(fileInputStream);
                boolean finDeArchivo=false;
                while(!finDeArchivo){
                    try{
                        autores.agregarElemento((Autor) objectInputStream.readObject());
                    }catch (EOFException e){
                        finDeArchivo=true;
                    }
                    catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }



            } catch (IOException e) {
                e.printStackTrace();
            }


        }


}
