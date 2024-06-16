package Modelo;

import java.io.Serializable;


public class Piloto implements Serializable {
    //atributos
    private int edad;
    private String nombre;
    private String genero;
    private String direccion;
    private String email;
    private String nroTelefono;

    //constructores


    public Piloto(int edad, String nombre, String genero, String direccion, String email, String nroTelefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.nroTelefono = nroTelefono;
    }

    public Piloto() {
        edad=0;
        nombre="";
        genero="";
        direccion="";
        email="";
        nroTelefono="";

    }

    //getters


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }


    //metodos


    @Override
    public String toString() {
        return "Piloto{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", nroTelefono='" + nroTelefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Piloto){
                Piloto aux=(Piloto) obj;
                if(aux.nombre.equalsIgnoreCase(nombre) && aux.edad==edad && aux.nroTelefono.equalsIgnoreCase(nroTelefono)){
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
