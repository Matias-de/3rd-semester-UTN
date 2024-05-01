package modelo;

public abstract class Empleado{

    private String dni;

    private String nombre;

    private String apellido;

    private int anioIngreso;

    private double salarioBase;

    public Empleado(){
        dni="";
        nombre="";
        apellido="";
        anioIngreso =0;
        salarioBase =0;

    }

    public Empleado(String dni, String nombre, String apellido, int anioIngreso, double salarioBase){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.anioIngreso = anioIngreso;
        this.salarioBase =salarioBase;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public abstract void obtenerSalario(double salarioBase);

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", anioIngreso=" + anioIngreso +
                '}';
    }


    @Override
    public int hashCode() {
        return 1;
    }
}
