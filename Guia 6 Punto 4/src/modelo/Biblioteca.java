package modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    //atributos

    private ArrayList<Elemento> arrayBiblioteca; //array de revistas y/o libros

    //constructores

    public Biblioteca() {
        arrayBiblioteca= new ArrayList<>();
    }
//getters
    public ArrayList<Elemento> getArrayBiblioteca() {
        return arrayBiblioteca;
    }

   //metodos

   public void agregarElemento(Elemento elemento) {
        arrayBiblioteca.add(elemento);
   }

   public void eliminarElemento(Elemento elemento) {
        arrayBiblioteca.remove(elemento);
   }

    @Override
    public String toString() {
        String texto="";
        for(int i=0; i<arrayBiblioteca.size(); i++){
            texto+="\n"+arrayBiblioteca.get(i).toString();
        }


        return texto;
    }



    @Override
    public int hashCode() {
        return 1;
    }

    public String prestarLibro(String titulo) {
        String texto="Libro no prestado/encontrado";

        for(int i=0; i<arrayBiblioteca.size(); i++){
            if(arrayBiblioteca.get(i) instanceof Libro){
               Libro librito = (Libro) arrayBiblioteca.get(i);
               if(librito.getTitulo().equals(titulo) && (!librito.isPrestado())){
                   librito.prestar();
                   texto="libro encontrado y prestado";
                }
            }

        }

        return texto;

    }


    public String devolverLibro(String titulo) {
        String texto="Libro no devuelto/encontrado";
        for(int i=0; i< arrayBiblioteca.size(); i++){
            if(arrayBiblioteca.get(i)instanceof Libro){
                Libro aBuscar = (Libro) arrayBiblioteca.get(i);
                if(aBuscar.getTitulo().equalsIgnoreCase(titulo) && aBuscar.isPrestado()){
                    aBuscar.devolver();
                    texto="libro encontrado y devuelto";
                }
            }
        }



        return texto;
    }

}
