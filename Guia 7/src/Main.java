import modelo.CEVector;
import modelo.CeHashMap;
import modelo.CeHashset;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("VECTOR: ");
        CEVector vector= new CEVector();
        vector.agregar(5);
        vector.agregar(3);
        vector.agregar(1);
        System.out.println(vector.listar());
        System.out.println("CANT ELEMENTOS: "+vector.contar());
        vector.eliminar(3);
        System.out.println(vector.listar());
        System.out.println(vector.buscar(1));
        System.out.println(vector.buscar(3));
        System.out.println("--------------------------------------------------------");

        System.out.println("\nHASHSET: ");

        CeHashset hashset= new CeHashset();
        hashset.agregar(5);
        hashset.agregar(3);
        hashset.agregar(1);
        System.out.println(hashset.listar());
        hashset.eliminar(5);
        System.out.println(hashset.listar());
        System.out.println(hashset.buscar(3));
        System.out.println(hashset.buscar(4));
        System.out.println("CANT ELEMENTOS: "+hashset.contar());
        System.out.println("--------------------------------------------------------");
        System.out.println("\nHASHMAP: ");
        
        CeHashMap hashMap = new CeHashMap();

        hashMap.agregar(5); //num= valor
        hashMap.agregar(7);
        hashMap.agregar(1);
        System.out.println(hashMap.listar());
        hashMap.eliminar(5); //num= clave
        System.out.println(hashMap.buscar(3)); //Clave
        System.out.println("CANT ELEMENTOS: "+hashMap.contar());



    }
}