package Modelo;

import Interfaces.IJugarPartido;
import Interfaces.IPrepararEntrenamiento;

public class Entrenador extends Integrante implements IJugarPartido, IPrepararEntrenamiento {
    //atributos
    private String sistemaDeJuego;
    private String estiloDeJuego;

    //constructores
    public Entrenador(){
        super();
        sistemaDeJuego="";
        estiloDeJuego="";
    }

    public Entrenador(String nombre, String apellido, int edad, String sistemaDeJuego, String estiloDeJuego) {
        super(nombre, apellido, edad);
        this.sistemaDeJuego = sistemaDeJuego;
        this.estiloDeJuego = estiloDeJuego;
    }

    //getters


    public String getEstiloDeJuego() {
        return estiloDeJuego;
    }


    public String getSistemaDeJuego() {
        return sistemaDeJuego;
    }


    //setters


    public void setEstiloDeJuego(String estiloDeJuego) {
        this.estiloDeJuego = estiloDeJuego;
    }

    public void setSistemaDeJuego(String sistemaDeJuego) {
        this.sistemaDeJuego = sistemaDeJuego;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString() +"Entrenador{" +
                "sistemaDeJuego='" + sistemaDeJuego + '\'' +
                ", estiloDeJuego='" + estiloDeJuego + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales= super.equals(obj);
        if(obj!=null && obj instanceof Entrenador){
            Entrenador aux=(Entrenador) obj;
            if(!aux.estiloDeJuego.equalsIgnoreCase(estiloDeJuego) && !aux.sistemaDeJuego.equalsIgnoreCase(sistemaDeJuego)){
                sonIguales=false;
            }
        }

        return sonIguales;
    }


    @Override
    public String jugarPartido() {
        return getNombre()+" "+getApellido()+" se encuentra en partido..";
    }

    @Override
    public String prepararEntreno() {
        return getNombre()+" "+getApellido()+" preparara un entrenamiento";
    }

    @Override
    public String viajar() {
        return getNombre()+" "+getApellido()+" viajara al mundial";
    }

    @Override
    public String concentrar() {
        return getNombre()+" "+getApellido()+" se encuentra en la concentracion";

    }
}
