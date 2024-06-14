package Modelo;

import Interfaces.IIntegrante;

public abstract class Integrante implements IIntegrante {
    //atributos
    private String nombre;
    private String apellido;
    private int edad;


    //constructores


    public Integrante() {
        nombre="";
        apellido="";
        edad=0;
    }

    public Integrante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //getters


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //metodos


    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Integrante){
                Integrante aux= (Integrante) obj;
                if(aux.nombre.equalsIgnoreCase(nombre) && aux.apellido.equalsIgnoreCase(apellido)&& aux.edad==edad){
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
