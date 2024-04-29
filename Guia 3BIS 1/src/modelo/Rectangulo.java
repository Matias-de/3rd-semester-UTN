package modelo;

public class Rectangulo {
//atributos
    private int ancho;

    private int alto;

    //constructores

    public Rectangulo(){
        ancho=0;
        alto=0;
    }

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
//getters
    public int getAncho() {
        return ancho;
    }

    public int getAlto(){
        return alto;
    }

    //metodos

    public float calcularArea(){
        return ancho*alto;
    }

    public float calcularPerimetro(){
        return 2*ancho+2*alto;
    }

    public void modificarAncho(int a){
        ancho=a;
    }

    public void modificarAlto(int a){
        alto=a;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
