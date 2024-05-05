package modelo;

public abstract class Objetos extends Juego{

    //atributos
   private double ancho;
   private double alto;

   //constructores

    public Objetos(int posX, int posY, double ancho, double alto) {
        super(posX, posY);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Objetos(){
        super();
        ancho=0;
        alto=0;
    }

    //getters
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Objetos{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }


}
