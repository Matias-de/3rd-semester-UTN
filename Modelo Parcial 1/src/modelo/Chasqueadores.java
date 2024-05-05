package modelo;

import Interfaces.IZombie;

public class Chasqueadores extends Personajes implements IZombie {

    //atributos

    private int capacidadChasqueo;
    //constructores

    public Chasqueadores() {
        super();
        capacidadChasqueo=0;

    }

    public Chasqueadores(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas, int capacidadChasqueo) {
        super(posX, posY, nombre, skin, nivelDeVida, armas);
        this.capacidadChasqueo = capacidadChasqueo;
    }


    //getters

    public int getCapacidadChasqueo() {
        return capacidadChasqueo;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+"Chasqueadores{" +
                "capacidadChasqueo=" + capacidadChasqueo +
                '}';
    }

    @Override
    public String atacar() {
        return "Chasqueador ha atacado";
    }

    @Override
    public String defenderse() {
        return "Chasqueador se ha defendido";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Chasqueador ha muerto";
    }

    @Override
    public String cargarEnergia() {
        return "Chasqueador chasqueando recupero su energia";
    }

    @Override
    public String morder() {
        return "Chasqueador ha mordido";
    }
}
