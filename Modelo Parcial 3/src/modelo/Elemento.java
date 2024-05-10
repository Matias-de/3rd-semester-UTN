package modelo;

import Interfaces.IAcciones;

import java.util.ArrayList;

public abstract class Elemento implements Comparable{
    //atributos
    private int id;
    private String titulo;
    private boolean entregado;
    private String genero;
    private ArrayList<String> fechasDeRenta;
    //constructores

    public Elemento(){
        id=0;
        titulo="";
        entregado=false;
        genero="";
        fechasDeRenta=new ArrayList<>();
    }

    public Elemento(String titulo){
        this.titulo=titulo;
        id=0;
        entregado=false;
        genero="";
        fechasDeRenta=new ArrayList<>();
    }

    public Elemento(int id, String titulo, String genero, String fechaRenta){
        this.titulo=titulo;
        this.genero=genero;
        fechasDeRenta =new ArrayList();
        fechasDeRenta.add(fechaRenta);
        this.id=id;
        entregado=false;
    }

    //getters


    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getFechasDeRenta() {
        return fechasDeRenta;
    }

   public int getId() {
        return id;
   }

    public String getGenero() {
        return genero;
    }

    //setters


    public void setFechasDeRenta(String fechaDeRenta) {
        fechasDeRenta.addLast(fechaDeRenta);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    //metodos


    @Override
    public String toString() {
       String texto= "Elemento{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                '}';
       for(int i=0; i<fechasDeRenta.size(); i++){
           texto += "FECHAS DE RENTA: "+fechasDeRenta.get(i);
       }
       return texto;
    }


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Elemento){
                Elemento aux= (Elemento)obj;
                if(aux.titulo.equals(this.titulo)){
                    sonIguales=true;
                }
            }
        }



        return sonIguales;
    }


    public void entregar() {
        entregado=true;
    }

    public void devolver(){
        entregado=false;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public abstract void agregarFechaDeRenta(String fechaRenta);

}


