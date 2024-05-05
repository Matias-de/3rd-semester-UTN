package modelo;

import Interfaces.IComportamientoPersonajes;
import Interfaces.IPlayer;

public abstract class Personajes extends Juego implements IComportamientoPersonajes{
    //atributos
    private String nombre;
    private String skin;
    double nivelDeVida;
    private String armas;
    //constructores
    public Personajes(){
        super();
        nombre="";
        skin="";
        nivelDeVida=0;
        armas="";
    }

    public Personajes(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas){
        super(posX, posY);
        this.nombre=nombre;
        this.skin=skin;
        this.nivelDeVida=nivelDeVida;
        this.armas=armas;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public double getNivelDeVida() {
        return nivelDeVida;
    }

    public String getArmas() {
        return armas;
    }

    public String getSkin() {
        return skin;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+"Personajes{" +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivelDeVida=" + nivelDeVida +
                ", armas='" + armas + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Personajes){
                Personajes p=(Personajes)obj;

                if(p.getNombre().equals(nombre) && (p.getSkin().equals(skin))){
                        sonIguales=true;
                }
            }
        }


        return sonIguales;
    }
}
