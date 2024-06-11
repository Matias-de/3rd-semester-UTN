package Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GHashMap<E> {
    //atributos

    HashMap<E, HashSet<Jugador>> nuevoHashmap;


    //constructor
    public GHashMap(HashMap<E, HashSet<Jugador>> nuevoHashmap) {
        this.nuevoHashmap = nuevoHashmap;
    }

    public GHashMap() {
        nuevoHashmap= new HashMap<>();
    }
    //getters y setters


    public HashMap<E, HashSet<Jugador>> getNuevoHashmap() {
        return nuevoHashmap;
    }

    public void setNuevoHashmap(HashMap<E, HashSet<Jugador>> nuevoHashmap) {
        this.nuevoHashmap = nuevoHashmap;
    }



    //metodos


    @Override
    public String toString() {
        return "GHashMap{" +
                "nuevoHashmap=" + nuevoHashmap +
                '}';
    }

    public  void agregarElemento(E clave, Jugador valor){
        HashSet<Jugador> aux; //creo un aux

        if(nuevoHashmap.containsKey(clave)){ //si el mapa contiene esa clave
            aux=nuevoHashmap.get(clave); // el set aux guarda esa clave
        }else{
            aux= new HashSet<Jugador>(); //sino crea un nuevo set y coloca en el mapa esa clave y valor
            nuevoHashmap.put(clave, aux);
        }
        aux.add(valor); //añade al set
    }

    public HashSet<Jugador> devolverElementoXClave(E clave){
        HashSet<Jugador> aux= null;


        if(nuevoHashmap.containsKey(clave)){
            aux=nuevoHashmap.get(clave);
        }



        return aux;
    }

    public String listar(){
        return " VALORES: "+ "\n" + nuevoHashmap;


    }

    public int contarCantidadElementos(){

        return nuevoHashmap.size();

    }




    public Iterator<Map.Entry<E, HashSet<Jugador>>> entrySetIterator(){
        return nuevoHashmap.entrySet().iterator();
    }
}
