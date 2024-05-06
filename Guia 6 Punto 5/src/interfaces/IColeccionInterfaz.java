package interfaces;

public interface IColeccionInterfaz {

    boolean estaVacia(); //devuelve true si la colección está vacía y false en caso contrario.
    int extraer(); //devuelve y elimina el primer elemento de la colección
    int primero(); //devuelve el primer elemento de la colección.
    boolean añadir(Object object); //añade un objeto por el extremo que corresponda,
    // devuelve true si se ha añadido y false en caso contrario.



}
