package modelo;

import java.util.ArrayList;

public class ArrayNumeros {
    //atributos

    private ArrayList<Numero> listaNumeros;

    //constructores
    public ArrayNumeros() {
        listaNumeros = new ArrayList<>();
    }

    //getters


    public ArrayList<Numero> getListaNumeros() {
        return listaNumeros;
    }

    //metodos

    public void agregarNumero(Numero n) {
        listaNumeros.add(n);
    }

    public void eliminarNumero(Numero n) {
        listaNumeros.remove(n);
    }

    @Override
    public String toString() {
       String texto="";
        for(Numero n : listaNumeros){
           texto+="NUMERO: "+n.getNumero()+"\n";
       }
        return texto;
    }


}
