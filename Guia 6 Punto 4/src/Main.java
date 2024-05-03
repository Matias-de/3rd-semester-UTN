import modelo.Biblioteca;
import modelo.Elemento;
import modelo.Libro;
import modelo.Revista;

public class Main {
    public static void main(String[] args) {
        Biblioteca arrayBiblioteca = new Biblioteca();
        arrayBiblioteca.agregarElemento(new Libro(123456, "La casita Robada", 2020));
        arrayBiblioteca.agregarElemento(new Revista(432411,"PRONTO!", 2024, 520));
        arrayBiblioteca.agregarElemento(new Revista(451212, "Magazine", 2019, 47));
        arrayBiblioteca.agregarElemento(new Libro(144351, "Gaturro n10", 2005));
        System.out.println(arrayBiblioteca.toString());
        System.out.println(arrayBiblioteca.prestarLibro("Gaturro n10"));
        System.out.println(arrayBiblioteca.prestarLibro("La casita Robada"));
        System.out.println(arrayBiblioteca.devolverLibro("Gaturro n10"));
        System.out.println(arrayBiblioteca.toString());
    }
}