package modelo;

import Interfaces.IMetodos;

import java.util.HashSet;
import java.util.Iterator;

public class CeHashset implements IMetodos{

    //atributos

    private HashSet<Integer> integerHashSet;

    //constructores
    public CeHashset() {
        integerHashSet= new HashSet<>();
    }

    public CeHashset(HashSet<Integer> a){
        integerHashSet= a;
    }

    public HashSet<Integer> getIntegerHashSet() {
        return integerHashSet;
    }

    //metodos


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof CeHashset){
                CeHashset aux = (CeHashset) obj;
                if(aux.integerHashSet.equals(integerHashSet)){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }

    @Override
    public void agregar(int num) {
        integerHashSet.add(num);
    }

    @Override
    public void eliminar(int num) {
        integerHashSet.remove(num);
    }

    @Override
    public String buscar(int num) {
        String texto="Numero no encontrado";
        Iterator<Integer> iterator = integerHashSet.iterator();

        while(iterator.hasNext()){
            if(iterator.next()==num){
                texto= "Numero encontrado";
            }
        }

        return texto;
    }

    @Override
    public String listar() {
        String texto="";
        Iterator<Integer> iterator = integerHashSet.iterator();
        while(iterator.hasNext()){
            texto +="\nN: "+iterator.next();
        }

        return texto;
    }

    @Override
    public int contar() {
        return integerHashSet.size();
    }


    @Override
    public int hashCode() {
        return 1;
    }



}
