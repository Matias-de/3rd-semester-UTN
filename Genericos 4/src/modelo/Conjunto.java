package modelo;

import java.util.HashSet;

public class Conjunto <E>{
    //atributos
    private HashSet<E> hashSet;
   //constructor
    public Conjunto() {
        this.hashSet = new HashSet<>();
    }
    //getters

    public HashSet<E> getHashSet() {
        return hashSet;
    }

    //setters

    public void setHashSet(HashSet<E> hashSet) {
        this.hashSet = hashSet;
    }

    //metodos


    @Override
    public String toString() {
        return "Conjunto{" +
                "hashSet=" + hashSet +
                '}';
    }

    public void agregar(E elemento) {
        hashSet.add(elemento);
    }

    public void eliminar(E elemento) {
        hashSet.remove(elemento);
    }

    public boolean contiene(E elemento) {
        return hashSet.contains(elemento);
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
