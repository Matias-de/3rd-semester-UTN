package modelo;

import Interfaces.IZombie;

public class Corredores extends Personajes implements IZombie {

   //atributos
    private int velocidad;

    //constructores

    public Corredores(){
        super();
        velocidad=0;
    }

    public Corredores(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas, int velocidad){
        super(posX, posY,nombre, skin, nivelDeVida, armas);
        setVelocidad(velocidad);
    }



   //getters


    public int getVelocidad() {
        return velocidad;
    }


    //setters

    private void setVelocidad(int velocidad) {
        if(velocidad >100){
            this.velocidad=100;
        }else if(velocidad <0){
            this.velocidad=0;
        }else{
            this.velocidad = velocidad;
        }


    }

    //metodos

    public String correr(){
        return "Corredor esta corriendo";
    }

    @Override
    public String atacar() {
        return "Corredor ha atacado";
    }

    @Override
    public String defenderse() {
        return "Corredor ha salido corriendo hacia el norte";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Corredor ha muerto";
    }

    @Override
    public String cargarEnergia() {
        return "Corredor ha recuperado su energia (corriendo obviamentee)";
    }

    @Override
    public String morder() {
        return "Corredor ha mordido";
    }

    @Override
    public String toString() {
        return super.toString()+"Corredores{" +
                "velocidad=" + velocidad +
                '}';
    }
}
