package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Avion implements Serializable {
        //atributos
    private String id;
    private boolean activo;
    private String foto;
    private int capacidad;
    private String compañia;
    private double latitud;
    private double longitud;
    private ArrayList<Piloto> pilotos;
    private ArrayList<String> etiquetas;

    //constructores


    public Avion(String id, boolean activo, String foto, int capacidad, String compañia, double latitud, double longitud) {
        this.id = id;
        this.activo = activo;
        this.foto = foto;
        this.capacidad = capacidad;
        this.compañia = compañia;
        this.latitud = latitud;
        this.longitud = longitud;
        pilotos= new ArrayList<>();
        etiquetas= new ArrayList<>();

    }

    public Avion() {
        id="";
        activo=false;
        foto="";
        capacidad=0;
        compañia="";
        latitud=0;
        longitud=0;
        pilotos= new ArrayList<>();
        etiquetas= new ArrayList<>();
    }

    //Getters


    public String getId() {
        return id;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getCompañia() {
        return compañia;
    }

    public String getFoto() {
        return foto;
    }

    public boolean isActivo() {
        return activo;
    }

    //setters


    public void setId(String id) {
        this.id = id;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    //metodos

    public void agregarTags(String tag){
        etiquetas.add(tag);
    }
    public void agregarPilotos(Piloto aux){
        pilotos.add(aux);
    }

    @Override
    public String toString() {
        return "\nAvion{" +
                "id='" + id + '\'' +
                ", activo=" + activo +
                ", foto='" + foto + '\'' +
                ", capacidad=" + capacidad +
                ", compañia='" + compañia + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", pilotos=" + pilotos +
                ", etiquetas=" + etiquetas +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales= false;
        if(obj!=null){
            if(obj instanceof Avion){
                Avion aux = (Avion) obj;
                if(aux.id.equals(id)){
                    sonIguales=true;
                }
            }
        }


        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }




}
