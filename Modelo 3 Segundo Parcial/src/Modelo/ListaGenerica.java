package Modelo;

import java.util.ArrayList;

public class ListaGenerica<E> {

    private ArrayList<E> arrayList;


    public ListaGenerica(ArrayList<E> arrayList) {
        this.arrayList = arrayList;

    }

    public ListaGenerica(){
        arrayList= new ArrayList<>();

    }


    @Override
    public String toString() {
        return "ListaDeIntegrantes{" +
                "arrayList=" + arrayList +
                '}';
    }

    public boolean verificarFutbolistas() throws TooMuchPlayersException {
        int contadorFutbolista = 0;
        boolean puedeAgregar = true;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Futbolista) {
                contadorFutbolista++;
            }
        }
        if (contadorFutbolista >= 1) { //este caso es para probar el funcionamiento, despues se pondra en >=23
            puedeAgregar = false;
            throw new TooMuchPlayersException("Los futbolistas exceden de 23");
        }

        return puedeAgregar;
    }

    public boolean verificarEntrenador() throws SecondTrainerExcepcion {
        boolean puedeAgregar = true;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Entrenador) {
                puedeAgregar = false;
                throw new SecondTrainerExcepcion("Ya hay un entrenador");
            }
        }

        return puedeAgregar;
    }

    public String agregarElemento(E elemento) {
        String rta = "agregado con exito";
        boolean esValido = false;

        if (elemento instanceof Futbolista) {
            try {
                esValido = verificarFutbolistas();
            } catch (TooMuchPlayersException e) {
                rta = e.getMessage();
            }
        } else if (elemento instanceof Entrenador) {
            try {
                esValido = verificarEntrenador();
            } catch (SecondTrainerExcepcion e) {
                rta = e.getMessage();
            }
        } else {
            esValido = true;
        }

        if (esValido) {
            arrayList.add(elemento);
        }

        return rta;
    }

    public boolean eliminarElemento(E elemento){
        return arrayList.remove(elemento);
    }

    public int lenght(){
        return arrayList.size();
    }


    public E get(int i){
        return arrayList.get(i);
    }
}
