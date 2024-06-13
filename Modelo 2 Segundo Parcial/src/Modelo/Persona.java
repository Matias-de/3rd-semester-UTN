package Modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    //atributos
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String barrio;
    private String ocupacion;
    private int nroKit;

    //constructores


    public Persona(String nombre, String apellido, String dni, int edad, String barrio, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.barrio = barrio;
        this.ocupacion = ocupacion;
        nroKit=0;
    }

    public Persona() {
        nombre="";
        apellido="";
        dni="";
        edad=0;
        barrio="";
        ocupacion="";
        nroKit=0;

    }

    //getters


    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroKit() {
        return nroKit;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDni() {
        return dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    //setters


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNroKit(int nroKit) {
        this.nroKit = nroKit;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //metodos


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", nroKit=" + nroKit +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Persona){
                Persona aux=(Persona) obj;
                if(aux.dni.equalsIgnoreCase(dni)){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }
}
