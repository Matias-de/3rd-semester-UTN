import modelo.Conjunto;

public class Main {
    public static void main(String[] args) {
        Conjunto<Integer> integerConjunto = new Conjunto<>();
        integerConjunto.agregar(5);
        integerConjunto.agregar(3);
        integerConjunto.agregar(1);
        integerConjunto.agregar(1);
        System.out.println(integerConjunto.toString());
        integerConjunto.eliminar(3);
        System.out.println(integerConjunto.toString());
        System.out.println(integerConjunto.contiene(1));
        Conjunto<String> stringConjunto = new Conjunto<>();
        stringConjunto.agregar("hola");
        stringConjunto.agregar("chau");
        stringConjunto.agregar("chau");
        stringConjunto.agregar("OSO PARDO");
        System.out.println(stringConjunto.toString());
        stringConjunto.eliminar("chau");
        System.out.println(stringConjunto.toString());
        System.out.println(stringConjunto.contiene("chau"));
    }
}