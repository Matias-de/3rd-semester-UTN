package modelo;

import Interfaces.IPlayer;

public class Ellie extends Personajes implements IPlayer {
//atributos
    private int gradoHumor;
    private int cantChistes;

    //constructores

    public Ellie(){
        super();
        gradoHumor=0;
        cantChistes=0;

    }

    public Ellie(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas, int gradoHumor, int cantChistes){
        super(posX, posY,nombre, skin, nivelDeVida, armas);
        this.cantChistes=cantChistes;
        setGradoHumor(gradoHumor);

    }


    //getters

    public int getCantChistes() {
        return cantChistes;
    }

    public int getGradoHumor() {
        return gradoHumor;
    }

    //setters


    private void setGradoHumor(int gradoHumor) {
        if(gradoHumor >100){
            this.gradoHumor=100;
        }else if(gradoHumor <0){
            this.gradoHumor=0;
        }else{
            this.gradoHumor = gradoHumor;
        }


    }

    @Override
    public String atacar() {
        return "Ellie ha atacado!";
    }

    @Override
    public String defenderse() {
        return "Ellie se defiende con un salto hacia atras";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Ellie ha muerto..";
    }

    @Override
    public String cargarEnergia() {
        return "Ellie ha cargado su energia!";
    }

    @Override
    public String curarse() {
        String texto="";
        if(nivelDeVida==0){
            texto="no se puede curar lo que esta muerto (como riber)";
        }else{
            texto="Ellie se ha curado un 50%";
        }
        nivelDeVida+=nivelDeVida*0.50;
        if(nivelDeVida>100){
            nivelDeVida=100;
        }
        return texto;
    }

    @Override
    public String recargarArma() {

        return "Ellie ha recargado sus armas";
    }

    @Override
    public String toString() {
        return super.toString()+"Ellie{" +
                "gradoHumor=" + gradoHumor +
                ", cantChistes=" + cantChistes +
                '}';
    }
}
