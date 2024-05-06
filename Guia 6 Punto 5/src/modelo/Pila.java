package modelo;

import interfaces.IColeccionInterfaz;

import java.util.ArrayList;

public class Pila implements IColeccionInterfaz {

    //atributos

    private ArrayList<Integer> arrayList;
    private int contadorObjetos;

    //constructores

    public Pila(){
        arrayList= new ArrayList<>();
        contadorObjetos=0;
    }


    //getters

    public int getContadorObjetos() {
        return contadorObjetos;
    }


    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }


    //Metodos


    @Override
    public String toString() {
        return "Pila{" +
                "arrayList=" + arrayList +
                ", contadorObjetos=" + contadorObjetos +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Pila){
                Pila p = (Pila) obj;
                if(p.arrayList.equals(arrayList) && p.contadorObjetos==contadorObjetos){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }

    @Override
    public boolean estaVacia() {
       boolean rta=false;

        if(arrayList.isEmpty()){
            rta=true;
        }

        return rta;

    }

    @Override
    public int extraer() {
        int aux = -1; //devuelve -1 si esta vacia
        if(!estaVacia()){
           aux=arrayList.getFirst();
            arrayList.removeFirst();
            contadorObjetos--;
        }

        return aux;
    }

    @Override
    public int primero() {
        int rta=-1; //devuelve -1 si esta vacia
        if(!estaVacia()){
            rta=arrayList.getFirst();
        }

        return rta;
    }

    @Override
    public boolean añadir(Object object) {
        boolean rta = false;

        if(object!=null){
            int aux=(int)object;
            arrayList.addFirst(aux);
            rta=true;
            contadorObjetos++;
        }



        return rta;
    }


}
