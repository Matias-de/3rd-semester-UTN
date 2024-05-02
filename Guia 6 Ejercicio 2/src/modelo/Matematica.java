package modelo;

import Interfaces.IExtremos;

import java.util.LinkedList;

public class Matematica implements IExtremos {

    //atributos

    private LinkedList<Double> lista;
    //constructores
    public Matematica() {
        lista = new LinkedList<>();

    }

    public Matematica(LinkedList<Double> lista) {
        this.lista = lista;
    }

    public LinkedList<Double> getLista() {
        return lista;
    }

    //metodos

    @Override
    public String toString() {
       String texto="";
       for(int i=0; i<lista.size();i++){
           texto+="\nN= "+lista.get(i);
        }

       return texto;
    }

    public void agregarElementoRandom(){
        double aleatorio= Math.random()*10;
        lista.add(aleatorio);

    }
    public void agregarElemento(double n){
        lista.add(n);
    }

    public void eliminarElemento(double n){
        lista.remove(n);
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
       if(obj!=null){
           if(obj instanceof Matematica){
               Matematica aux = (Matematica)obj;
               if(aux.equals(lista)){
                   sonIguales=true;
               }
           }
       }

        return sonIguales;
    }

    @Override
    public double inicio() {
        return lista.getFirst();
    }

    @Override
    public double fin() {
        return lista.getLast();
    }
}
