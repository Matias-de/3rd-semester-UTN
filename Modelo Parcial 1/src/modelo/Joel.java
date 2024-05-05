package modelo;

import Interfaces.IPlayer;

public class Joel extends Personajes implements IPlayer {
    //atributos

    private int cuanMalaOnda;
    private int queTanTestarudo;

    //constructores

    public Joel(){
        super();
        cuanMalaOnda = 0;
        queTanTestarudo=0;
    }

    public Joel(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas, int cuanMalaOnda, int queTanTestarudo) {
        super(posX, posY,nombre, skin, nivelDeVida, armas);
        setCuanMalaOnda(cuanMalaOnda); //setea validado (0 a 100) y es privado
        setQueTanTestarudo(queTanTestarudo); //setea validado (0 a 100) y es privado
    }


    //getters

    public int getCuanMalaOnda() {
        return cuanMalaOnda;
    }

    public int getQueTanTestarudo() {
        return queTanTestarudo;
    }



    //setters


    private void setCuanMalaOnda(int cuanMalaOnda) {
        if(cuanMalaOnda >100){
            this.cuanMalaOnda=100;
        }else if(cuanMalaOnda <0){
            this.cuanMalaOnda=0;
        }else{
            this.cuanMalaOnda = cuanMalaOnda;
        }


    }

    private void setQueTanTestarudo(int queTanTestarudo) {

        if(queTanTestarudo >100){
            this.queTanTestarudo=100;
        }else if(queTanTestarudo <0){
            this.queTanTestarudo=0;
        }else{
            this.queTanTestarudo = queTanTestarudo;
        }


    }

    //metodos

    @Override
    public String atacar() {

        return "Joel Ataco!";
    }

    @Override
    public String defenderse() {
        return "Joel se ha defendido con sus manos!";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Joel a muerto...";
    }

    @Override
    public String cargarEnergia() {

        return "Joel a cargado su energia al maximo!";
    }

    @Override
    public String curarse() {
        String texto="";
        if(nivelDeVida==0){
            texto="no se puede curar lo que esta muerto (como riber)";
        }else{
            texto="Joel se ha curado un 35%";
        }
        nivelDeVida+=nivelDeVida*0.35;
        if(nivelDeVida>100){
            nivelDeVida=100;
        }
        return texto;
    }

    @Override
    public String recargarArma() {
        return "Joel a recargado su arma";
    }

    @Override
    public String toString() {
        return super.toString()+"Joel{" +
                "cuanMalaOnda=" + cuanMalaOnda +
                ", queTanTestarudo=" + queTanTestarudo +
                '}';
    }


}
