import modelo.*;

public class Main {
    public static void main(String[] args) {
        GestorNG naughtyDogs= new GestorNG();
        System.out.println(naughtyDogs.toString());
        naughtyDogs.agregarPersonaje(new Joel(1,3,"Joel", "sin camisa", 50, "Pistola 9mm", 40, 120));
        naughtyDogs.agregarObjeto(new Muro(1,5,40.5, 10.4, 300));
        naughtyDogs.agregarObjeto(new Plataforma(3,10, 50.6, 10.9,"hormigon", "Que es un soporte?"));
        naughtyDogs.agregarPersonaje(new Chasqueadores(3,1,"Infectado n°39000", "Chasqueadorv1", 100, "Ninguna",200 ));
        System.out.println(naughtyDogs.toString());
        Joel aux= new Joel();
        if(naughtyDogs.getArrayPersonajes().getFirst() instanceof Joel){

            aux= (Joel) naughtyDogs.getArrayPersonajes().getFirst();
        }
        System.out.println(aux.curarse());
        System.out.println(aux);
        System.out.println(aux.atacar());
        System.out.println(aux.morir());
        System.out.println(aux);
        System.out.println(aux.curarse());

    }
}