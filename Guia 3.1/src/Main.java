import modelo.Autor;
import modelo.Libro;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
    scanner= new Scanner(System.in);
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Autor joshua = new Autor("Joshua", "Bloch", "joshua@email.com", "M");
        //b. Imprima por pantalla al autor previamente instanciado.
        System.out.println(joshua);
        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.
        Libro librito = new Libro("Effective Java", 450, 150, joshua);
        //d. Imprima por pantalla el libro instanciado.
        System.out.println(librito);
        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        librito.aumentarCopias(50);
        librito.modificarPrecio(500);
        System.out.println("\n"+librito);
        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
       // Libro “Effective Java”.

        System.out.println("\n"+librito.getAutorcito().toString());
        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        System.out.println(librito.mensajeEspecial());
    }
}