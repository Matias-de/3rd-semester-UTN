package modelo;

import Interfaces.IRelaciones;

public class Numero implements IRelaciones, Comparable{

   //atributos
    private int numero;

    //constructores

    public Numero() {
        numero = 0;
    }

    public Numero(int numero){
        this.numero = numero;

    }
//getters
    public int getNumero() {
        return numero;
    }


    @Override
    public boolean esMayor(Object b) {
        boolean rta=false;
        if(b!=null && b instanceof Numero){}
        Numero aux = (Numero)b;
        if(numero > aux.getNumero()){
            rta=true;
        }
        return rta;
    }

    @Override
    public boolean esMenor(Object b) {
      boolean rta=false;
        if(b!=null && b instanceof Numero){
            Numero aux= (Numero)b;
            if(numero < aux.getNumero()){
                rta=true;
            }
        }

        return rta;
    }

    @Override
    public boolean esIgual(Object b) {
        boolean rta=false;
        if(b!=null && b instanceof Numero){
            Numero aux= (Numero)b;
            if(aux.getNumero()== numero){
                rta=true;
            }
        }


        return rta;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj !=null){
            if(obj instanceof Numero){
                Numero aux=(Numero)obj;
                if(aux.getNumero() == numero){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }


    @Override
    public int compareTo(Object o) {
        int rta = 0;
        if(o!=null && o instanceof Numero){
            Numero aux= (Numero)o;
            if(aux.getNumero() > numero){
                rta=1;
            }else if(aux.getNumero() < numero){
                rta=-1;
            }
        }

        return rta;
    }
}
