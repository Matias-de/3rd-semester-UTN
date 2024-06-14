package Modelo;

import Interfaces.IBrindarAsistencia;

public class Masajista extends Integrante implements IBrindarAsistencia {

    //atributos

    private String titulo;
    private int añosDeExperiencia;

    //constructores


    public Masajista(String nombre, String apellido, int edad, String titulo, int añosDeExperiencia){
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public Masajista(){
        super();
        titulo="";
        añosDeExperiencia=0;
    }

    //Getters


    public String getTitulo() {
        return titulo;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }


    //setters


    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Masajista{" +
                "titulo='" + titulo + '\'' +
                ", añosDeExperiencia=" + añosDeExperiencia +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(obj!=null && obj instanceof Masajista){
            Masajista aux= (Masajista) obj;
            if(aux.añosDeExperiencia!=añosDeExperiencia && !aux.titulo.equalsIgnoreCase(titulo)){
                sonIguales=false;
            }
        }
        return sonIguales;
    }


    @Override
    public String asistir() {
        return getNombre()+" "+getApellido()+" brindara la asistencia necesaria..";
    }

    @Override
    public String viajar() {
        return getNombre()+" "+getApellido()+" viajara a maimee";

    }

    @Override
    public String concentrar() {
        return getNombre()+" "+getApellido()+" se encuentra en la concentracion de la seleccion.";

    }
}
