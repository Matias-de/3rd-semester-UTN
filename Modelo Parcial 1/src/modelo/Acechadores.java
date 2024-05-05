package modelo;

import Interfaces.IZombie;

public class Acechadores extends Personajes implements IZombie {
   //atributos
   private boolean acechar;

    //constructor
    public Acechadores() {
        super();
        acechar = false;
    }

    public Acechadores(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas) {
        super(posX, posY, nombre, skin, nivelDeVida, armas);
        acechar = false;
    }

    //getters


    public boolean isAcechando() {
        return acechar;
    }

    //metodos
    public void acechar(){
        acechar=true;
    }

    @Override
    public String morder() {
        return "Acechador uso morder";
    }

    @Override
    public String atacar() {
        return "Acechador lo tenia en la mira y ha atacado";
    }

    @Override
    public String defenderse() {
        return "Acechador se escondio en la oscuridad, a seguir acechando";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Acechador ha muerto";
    }

    @Override
    public String cargarEnergia() {
        return "Acechador ha cargado su energia mirando a su victima";
    }

    @Override
    public String toString() {
        return super.toString()+"Acechadores:{" +
                "acechar=" + acechar +
                '}';
    }
}
