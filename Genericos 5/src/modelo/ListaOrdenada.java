package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada <E extends Comparable<E>>{

    private ArrayList<E> arrayList;

    public ListaOrdenada(){
        arrayList= new ArrayList<>();
    }

    public ArrayList<E> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    //metodos

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "arrayList=" + arrayList +
                '}';
    }

    public void agregar(E elemento){
        arrayList.add(elemento);
        Collections.sort(arrayList);
    }

    public boolean borrar(E elemento){
        return arrayList.remove(elemento);
    }

    public String obtenerElemento(int indice){
        String rta="";
        if(indice<0 || indice > arrayList.size()){
            rta="INDICE INCORRECTO";
        }else {
            rta="ENCONTRADO: "+arrayList.get(indice);
        }

        return rta;
    }


}
