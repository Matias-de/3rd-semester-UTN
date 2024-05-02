import modelo.Matematica;
/*CONSIGNA:
2) Construir una clase Matematicas  que declare una lista
(elija la que corresponda) como atributo y que implemente una interfaz llamada Extremos.
 Realizar un main para comprobar funcionamiento implementando todos los métodos.

public interface Extremos
{
    double inicio();
    double fin();
}

NOTA: Investigar uso de Math.random() para cargar las listas de manera automática
al construir las clases
*/
public class Main {
    public static void main(String[] args) {
    Matematica lista= new Matematica();
    lista.agregarElemento(4);
    lista.agregarElementoRandom();
    lista.agregarElementoRandom();
    lista.agregarElementoRandom();
        System.out.println(lista);
        System.out.println("PRIMERO: "+lista.inicio());
        System.out.println("ULTIMO: "+lista.fin());

    }
}