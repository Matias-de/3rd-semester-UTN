import modelo.ArrayNumeros;
import modelo.Numero;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
       /* CONSIGNA
       3) Construir una interfaz Relaciones que incluya los siguientes métodos

// Devuelve verdadero si a es mayor que b
boolean esMayor(Object b) ;

 // Devuelve verdadero si a es menor que b
boolean esMenor(Object b) ;

 // Devuelve verdadero si a es igual que b
boolean esIgual(Object b) ;

Crear una clase Numero que tendrá un atributo entero
 e implementa dicha interfaz.
 Diseñar un Main que declare dos o más objetos del tipo Numero
  y usar los métodos correspondientes. Mostrar salida por pantalla.
        */


        scanner = new Scanner(System.in);
        ArrayNumeros arreglo = new ArrayNumeros();
       arreglo.agregarNumero(new Numero(5));
        arreglo.agregarNumero(new Numero(3));
        arreglo.agregarNumero(new Numero(1));
       System.out.println(arreglo);
        System.out.println(arreglo.getListaNumeros().getFirst().esMayor(new Numero(5)));
        System.out.println(arreglo.getListaNumeros().getFirst().esMenor(new Numero(5)));
        System.out.println(arreglo.getListaNumeros().getFirst().esIgual(new Numero(5)));

    }
}