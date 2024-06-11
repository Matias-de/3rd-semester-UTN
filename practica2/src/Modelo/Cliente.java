package Modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

   //atributos
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private int edad;


    //constructores
    public Cliente(String nombre, String apellido, String telefono, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }



    public Cliente(){
        nombre="";
        apellido="";
        telefono="";
        edad=0;
        correo="";
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //metodos


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta=false;

        if(obj!=null){
            if(obj instanceof Cliente){
                Cliente cliente=(Cliente)obj;
                if(cliente.getNombre().equalsIgnoreCase(this.getNombre()) && cliente.getApellido().equalsIgnoreCase(this.getApellido())){
                    rta=true;
                }
            }
        }

        return rta;

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
