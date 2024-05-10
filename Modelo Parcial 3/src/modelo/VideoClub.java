package modelo;

import javax.swing.text.Element;
import java.util.*;

public class VideoClub {

    //atributos

    private HashMap<Integer, ArrayList<Elemento>> hashMap;

    //constructores

    public VideoClub() {
        hashMap = new HashMap<>();
    }
    public HashMap<Integer, ArrayList<Elemento>> getHashMap() {
        return hashMap;
    }


    @Override
    public String toString() {
       String texto="";
        Iterator<Map.Entry<Integer, ArrayList<Elemento>>> it = hashMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer, ArrayList<Elemento>> entry= it.next();
            texto+= "\nClAVE: "+entry.getKey()+"VALOR: "+entry.getValue();
        }


       return texto;
    }

    public void agregarElemento(Elemento elemento) {
        int id = elemento.getId();
        if (hashMap.containsKey(id)) {
            hashMap.get(id).add(elemento);
        } else {
            ArrayList<Elemento> lista = new ArrayList<>();
            lista.add(elemento);
            hashMap.put(id, lista);
        }
    }
    public void eliminarElemento(Elemento elemento) {
       if(hashMap.containsKey(elemento.getId()) && !elemento.isEntregado()){
           hashMap.remove(elemento.getId(), elemento);
       }
    }



    @Override
    public int hashCode() {
        return 1;
    }





}
