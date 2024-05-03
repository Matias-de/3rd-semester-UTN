package modelo;

import Interfaces.IPrestable;

public class Libro extends Elemento implements IPrestable {
    //atributos
    boolean prestado;

    //constructores

    public Libro(){
        super();
        prestado=false;
    }

    public Libro(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        prestado=false;
    }

    //getters


    public boolean isPrestado() {
        return prestado;
    }


    @Override
    public void prestar() {
        prestado=true;    //se presta el libro

    }

    @Override
    public void devolver() { //se devuelve el libro
        prestado=false;
    }

    @Override
    public String toString() { //Cadena de caracteres con llamada a los metodos del padre
       String texto=super.toString()+"Libro{" +
               "prestado= ";

       if(prestado){
           texto+= "Si"+
           '}';
       }else {
           texto+="No"+
           '}';
       }

        return texto;


    }


}
