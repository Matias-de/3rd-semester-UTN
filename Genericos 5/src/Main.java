import modelo.ListaOrdenada;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada listaOrdenada = new ListaOrdenada<>();
        listaOrdenada.agregar(3);
        listaOrdenada.agregar(5);
        listaOrdenada.agregar(1);
        System.out.println(listaOrdenada);
        System.out.println(listaOrdenada.borrar(3));
        System.out.println(listaOrdenada);
        System.out.println(listaOrdenada.obtenerElemento(4));
        System.out.println(listaOrdenada.obtenerElemento(0));

    }
}