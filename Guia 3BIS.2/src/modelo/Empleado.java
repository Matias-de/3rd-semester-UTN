package modelo;

public class Empleado {
    //atributos
    private int DNI;

    private String nombre;

    private String apellido;

    private double salario;

    //constructores
    public Empleado() {
        DNI=0;
        nombre="";
        apellido="";
        salario=0;

    }
    public Empleado(int DNI, String nombre, String apellido, double salario) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
//getters
    public double getSalario() {
        return salario;
    }

    public int getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }

    //metodos

    public double calcularSalarioAnual(){
        return salario*12;
    }

    public void incrementarSalario(double porcentaje){
        salario+=salario*porcentaje;
    }



}
