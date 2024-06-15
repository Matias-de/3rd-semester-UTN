package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class ListaGenerica <E extends Autor> {

    private ArrayList<E> arrayList;

    public ListaGenerica(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }
    public ListaGenerica(){
        arrayList= new ArrayList<>();
    }

    public ArrayList<E> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }



    public void agregarElemento(E elemento){
        if(elemento!=null){

            if(elemento.getAge()<18){
                MiExcepcion ex = new MiExcepcion(elemento.getAge());
                ex.printStackTrace();
            }else{

                arrayList.add(elemento);

            }
        }

    }

    public int size(){
        return arrayList.size();
    }

    public void cargarMapaEtiquetas(HashMap<String, ArrayList<String>> mapaEtiqueta){

        for(int i=0; i<arrayList.size(); i++){
            mapaEtiqueta.put(arrayList.get(i).getId(), arrayList.get(i).getTags());
        }


    }



    @Override
    public String toString() {
        return "ListaGenerica{" +
                "arrayList=" + arrayList +
                '}';
    }

}
