import modelo.Pila;

public class Main {
    public static void main(String[] args) {

        Pila pilita = new Pila<>();
        System.out.println(pilita.pilavacia());
        pilita.agregar(2);
        pilita.agregar("chau");
        pilita.agregar(2314.2);
        System.out.println(pilita.pilavacia());
        System.out.println(pilita);
        System.out.println(pilita.borrar());
        System.out.println(pilita);

    }

}