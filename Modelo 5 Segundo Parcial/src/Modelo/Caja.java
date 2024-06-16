package Modelo;

import java.util.ArrayList;

public class Caja<E> {//guarda pilotos y tags

    private ArrayList<E> arrayList;

    public Caja(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    public Caja(){
        arrayList= new ArrayList<>();

    }

    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    public int size(){
        return arrayList.size();

    }

    public ArrayList<E> getArrayList() {
        return arrayList;
    }

    public E get(int indice){
        return arrayList.get(indice);
    }

    public void agregarElemento(E elemento){
        arrayList.add(elemento);
    }

    public void eliminarElemento(E elemento){
        arrayList.remove(elemento);
    }

    public void eliminarXIndice(int indice){
        arrayList.remove(indice);
    }


    @Override
    public String toString() {
        return "Caja{" +
                "arrayList=" + arrayList +
                '}';
    }





}
