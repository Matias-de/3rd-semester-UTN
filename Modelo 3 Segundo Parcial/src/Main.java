import Modelo.*;

public class Main {
    public static void main(String[] args) {
        Federacion federacion = new Federacion("AFA", "17/5/1910", 3);
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new Futbolista("Matias", "Antonelli", 19, 23, Puesto.ARQUERO)));
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new AyudanteDeCampo("Roberto", "asas", 45, "tactico")));
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new Entrenador("Lionel", "Scaloni", 46, "4-4-3", "contraataque")));
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new Futbolista("Lionel", "Messi", 36, 10, Puesto.DELANTERO)));
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new Entrenador("Marcelo", "Gallardo", 43, "4-3-1-2", "defensiva")));
        System.out.println(federacion.getListaDeIntegrantes().agregarElemento(new Masajista("Nose", "aaaa", 43, "Masajista Experimentado", 3)));

        System.out.println(federacion);

        federacion.javaToJson();


    }

}






