package modelo;

import java.util.ArrayList;

public class GestorNG {

    //atributos
    private ArrayList<Juego> arrayPersonajes;
    private ArrayList<Juego> arrayObjetos;
    //constructores
    public GestorNG(){
        arrayPersonajes = new ArrayList<>();
        arrayObjetos = new ArrayList<>();
    }

    public GestorNG(ArrayList<Juego> personajes, ArrayList<Juego> objetos){
        arrayPersonajes = personajes;
        arrayObjetos = objetos;
    }

    //getters
    public ArrayList<Juego> getArrayObjetos() {
        return arrayObjetos;
    }

    public ArrayList<Juego> getArrayPersonajes() {
        return arrayPersonajes;
    }

    //metodos

    public String agregarPersonaje(Juego personaje){
       String texto="Personaje o cosa no añadido";
        if(personaje instanceof Personajes){ //comprobacion de tipo maldito front
            Personajes aux= (Personajes) personaje;
            arrayPersonajes.add(aux);
            texto= "Personaje añadido";
        }
        return texto;
    }

    public String agregarObjeto(Juego objeto){
        String texto="Objeto o cosa no agregado";
        if(objeto instanceof Objetos){
            Objetos aux= (Objetos) objeto;
            arrayObjetos.add(aux);
            texto= "Objeto agregado";
        }

        return texto;
    }

    @Override
    public String toString() {
        String texto="";
        for(int i=0; i<arrayPersonajes.size(); i++){
            texto += arrayPersonajes.get(i).toString();
        }
        for(int i=0; i<arrayObjetos.size(); i++){
            texto += arrayObjetos.get(i).toString();
        }

        return texto;
    }

}
