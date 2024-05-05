package modelo;

public class Muro extends Objetos{

    //atributos
    private int resistencia;


    //constructores

    public Muro(){
        super();
        resistencia = 0;
    }

    public Muro(int posX, int posY, double ancho, double alto, int resistencia){
        super(posX, posY, ancho, alto);
        this.resistencia=resistencia;
    }

    //getters


    public int getResistencia() {
        return resistencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Muro{" +
                "resistencia=" + resistencia +
                '}';
    }

}
