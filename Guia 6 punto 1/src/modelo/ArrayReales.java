package modelo;

import Interfaces.Estadisticas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayReales implements Estadisticas{
   private ArrayList<Numero> listaReales;

    public ArrayReales(){
        listaReales= new ArrayList<Numero>();
    }

    public ArrayReales(ArrayList<Numero> listaReales){
        this.listaReales= listaReales;
    }

    public ArrayList<Numero> getListaReales() {
        return listaReales;
    }
public void cargarListaReales(Numero n){
        listaReales.add(n);
}
    @Override
    public double minimo() {
        double rta=listaReales.get(0).getNumero();
        for(Numero n: listaReales){
            if(n.getNumero()<rta){
                rta=n.getNumero();
            }
        }


        return rta;
    }

    @Override
    public double maximo() {
        double rta= listaReales.get(0).getNumero();
        for(int i=0; i< listaReales.size();i++){
            if(rta < listaReales.get(i).getNumero()){
                rta=listaReales.get(i).getNumero();
            }
        }

        return rta;
    }

    @Override
    public double sumatoria() {
        double rta=0;
        for(int i=0; i< listaReales.size();i++){
            rta+=listaReales.get(i).getNumero();
        }

        return rta;
    }


    @Override
    public String toString() {
       String rta="";
       for(int i=0; i<listaReales.size(); i++){
           rta+="NUMERO: "+listaReales.get(i).getNumero()+"\n";
       }
       return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta=false;
        if(obj!=null){
            if(obj instanceof ArrayReales){
                ArrayReales aComparar=(ArrayReales)obj;
                if(aComparar.listaReales.equals(listaReales)){
                    rta=true;
                }

            }
        }
        return rta;
    }


}


