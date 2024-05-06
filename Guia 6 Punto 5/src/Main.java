import modelo.Pila;

public class Main {
    public static void main(String[] args) {
        Pila pila= new Pila();
        System.out.println(pila.estaVacia());
        System.out.println(pila.extraer()); //devuelve -1 si esta vacia
        System.out.println(pila.añadir(5));
        System.out.println(pila.añadir(3));
        System.out.println(pila.añadir(1));
        System.out.println(pila);
        System.out.println("PRIMERO: "+pila.primero());
        System.out.println("BORRADO: "+pila.extraer());
        System.out.println(pila);



    }
}