package modelo;

import java.util.LinkedList;

public class Pila <E>{
    //atributos
    private LinkedList<E> pila;
    //constructor
    public Pila(){
        pila=new LinkedList<>();
    }
    //getters


    public LinkedList<E> getPila() {
        return pila;
    }

    //setters

    public void setPila(LinkedList<E> pila) {
        this.pila = pila;
    }

    //metodos


    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }

    public boolean pilavacia(){
        return pila.isEmpty();
    }

    public void agregar(E elemento){
        if(elemento!=null){
            pila.addFirst(elemento);
        }
    }

    public E borrar(){
       return pila.removeFirst();
    }


    public int cantElementos(){
        return pila.size();
    }


}

