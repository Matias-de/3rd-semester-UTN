package modelo;

import Interfaces.IMetodos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CeHashMap implements IMetodos {
    //atributos
    private HashMap<Integer, Integer> integerHashMap;
    //constructores
    public CeHashMap() {
       integerHashMap = new HashMap<>();

    }

    public CeHashMap(HashMap<Integer, Integer> integerHashMap){
        this.integerHashMap = integerHashMap;
    }

    //getters


    public HashMap<Integer, Integer> getIntegerHashMap() {
        return integerHashMap;
    }

    //metodos

    @Override
    public void agregar(int num) {

       int random = (int) (Math.random() * 5);
       integerHashMap.put(random, num);

    }

    @Override
    public void eliminar(int num) {
        integerHashMap.remove(num);
    }

    @Override
    public String buscar(int num) {
        String texto="No encontrado";
        if (integerHashMap.containsKey(num)){
            texto = "NUMERO EN CLAVE : "+num+" = " +integerHashMap.get(num).toString();
        }

        return texto;
    }

    @Override
    public String listar() {
        String texto="";
        Iterator<Map.Entry<Integer, Integer>> it = integerHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            texto+="\nCLAVE: " +entry.getKey() + " VALOR: " + entry.getValue();
        }
        return texto;
    }

    @Override
    public int contar() {
        return integerHashMap.size();
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof CeHashMap){
                CeHashMap aux= (CeHashMap) obj;
                if(aux.integerHashMap.equals(integerHashMap)){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }
}
