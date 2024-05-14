package modelo;

import Interfaces.ICalculoSueldo;

public abstract class Empleado implements ICalculoSueldo {
    //atributos
    private String legajo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String fechaNacimiento;
    private double sueldo;
    //constructores
    public Empleado(){
        legajo="";
        nombre="";
        apellido="";
        direccion="";
        fechaNacimiento="";
        sueldo=0;
    }

    public Empleado(String nombre, String legajo, String apellido, String direccion, String fechaNacimiento){
        this.nombre=nombre;
        this.legajo=legajo;
        this.apellido=apellido;
        this.direccion=direccion;
        this.fechaNacimiento=fechaNacimiento;
        sueldo=0;
    }

    //getters


    public double getSueldo() {
        return sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getLegajo() {
        return legajo;
    }

    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "legajo='" + legajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Empleado){
                Empleado aux=(Empleado)obj;
                if(aux.legajo.equalsIgnoreCase(legajo)&& aux.nombre.equalsIgnoreCase(nombre)){
                    sonIguales = true;
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
