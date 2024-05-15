package Modelo;

import java.util.ArrayList;

public class Almacenamiento <E>{
    //atributos
    private ArrayList<E> arrayList;

    //constructores

    public Almacenamiento(){
        arrayList= new ArrayList<>();

    }
//getters
    public ArrayList<E> getArrayList() {
        return arrayList;
    }
//setters
    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }


    //metodos
    @Override
    public String toString() {
        return "Almacenamiento{" +
                "arrayList=" + arrayList +
                '}';
    }


    public void agregar(E elemento){
        if(elemento != null){
            arrayList.add(elemento);
        }
    }

    public boolean borrar(E elemento){
       return arrayList.remove(elemento);
    }

    public String buscar(E elemento){
       String texto="no encontrado";
        if(elemento!=null){
            for(int i=0;i< arrayList.size();i++){
                if(arrayList.get(i).equals(elemento)){
                    texto="Encontrado: "+elemento;
                }
            }
        }
        return texto;

    }

}
