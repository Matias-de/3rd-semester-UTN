package modelo;

public class Auto {

    //atributos

    private String marca; // almacena la marca del coche.

    private String modelo; //almacena el modelo del coche.

    private int añoFabricacion; //almacena el año de fabricación del coche.

    private double velocidadActual; //almacena la velocidad actual del coche en
                                    // kilómetros por hora.



    //constructores

    public Auto(){

        marca = "INDEFINIDO";

        modelo= "INDEFINIDO";

        añoFabricacion=0;

        velocidadActual=0;


    }

    public Auto(String pModelo, String pMarca, int pAñoFabricacion, double pVelocidad){

        marca=pMarca;
        modelo=pModelo;
        añoFabricacion=pAñoFabricacion;
        velocidadActual=pVelocidad;


    }


    //getters


    public double getVelocidadActual() {
        return velocidadActual;
    }


    public int getAñoFabricacion() {
        return añoFabricacion;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    //setters


    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    //metodos

    public void acelerar(double incremento)//incrementa la velocidad actual del coche en función del incremento dado.
    {
        setVelocidadActual(velocidadActual+incremento);
    }

    public void frenar(double decremento) //reduce la velocidad actual del coche en función del decremento dado.
    {
        setVelocidadActual(velocidadActual-decremento);

    }

    //muestra por pantalla la marca, modelo,
    // año de fabricación y velocidad actual del coche.
   public String obtenerInformacion()
    {
        return "\nMARCA: "+marca+"\nMODELO: "+modelo+"\nAÑO DE FABRICACION: "+añoFabricacion+"\nVELOCIDAD ACTUAL: "+velocidadActual;


    }



}
