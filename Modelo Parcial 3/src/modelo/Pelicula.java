package modelo;

import java.util.ArrayList;

public class Pelicula extends Elemento{
//atributos
    private double duracion;
    private String creador;

    //constructores
    public Pelicula(){
        super(0,"","","");
        duracion = 60;
        creador="";
    }

    public Pelicula(String titulo, String creador, String fechaRenta){
        super(0,titulo,"",fechaRenta);
        duracion = 60;
        this.creador=creador;

    }

    public Pelicula(int id, String titulo, String genero, String fechaRenta, String creador, double duracion){
        super(id,titulo,genero,fechaRenta);
        this.duracion=duracion;
        this.creador=creador;
    }

//getters


    public double getDuracion() {
        return duracion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Pelicula{" +
                "duracion=" + duracion +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = super.equals(obj);
        if(sonIguales){
            if(obj instanceof Pelicula){
                Pelicula peli = (Pelicula) obj;
                if(!peli.getCreador().equalsIgnoreCase(creador)){

                    sonIguales= false;
                }
            }
        }


        return sonIguales;
    }



    @Override
    public int compareTo(Object obj) {
        int rta=0;
        if(obj!=null && obj instanceof Pelicula){
            Pelicula peli= (Pelicula)obj;
            if(peli.getDuracion() > duracion){
                rta=1;
            }else if(peli.getDuracion() < duracion){
                rta=-1;
            }
        }


        return rta;
    }

    @Override
    public void entregar() {
        super.entregar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }

    @Override
    public boolean isEntregado() {
        return super.isEntregado();
    }

    @Override
    public void agregarFechaDeRenta(String fechaRenta) {
        super.setFechasDeRenta(fechaRenta);
    }


}
