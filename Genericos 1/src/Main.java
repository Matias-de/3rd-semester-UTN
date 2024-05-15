import Modelo.Almacenamiento;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamiento = new Almacenamiento<>();
        almacenamiento.agregar(2);
        almacenamiento.agregar("hola");
        almacenamiento.agregar(23234.4);
        almacenamiento.agregar(null);
        System.out.println(almacenamiento);
        System.out.println(almacenamiento.borrar(2321));
        System.out.println(almacenamiento.buscar(23234.4));
    }

}