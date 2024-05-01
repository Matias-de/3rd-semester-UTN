package modelo;

import java.util.ArrayList;

public class Gestora {

  //atributos
    private ArrayList<Empleado> empleados;

    //constructores}

    public Gestora() {
        empleados = new ArrayList<>();
    }

    public Gestora(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {

        return empleados;
    }

    //metodos

public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
}

public String sueldoMayor(){
        String texto="";
        double sueldoAux=0;
    EAsalariado asalariado;
    EComision comision;

        for (Empleado empleado : empleados) {
            if(empleado instanceof EAsalariado){
                asalariado=(EAsalariado)empleado;
                if(asalariado.getSalarioFinal()>sueldoAux){
                    sueldoAux=asalariado.getSalarioFinal();
                    texto="Nombre: "+asalariado.getNombre()+"Apellido: "+asalariado.getApellido()+"Sueldo: "+asalariado.getSalarioFinal();
                }
            }else if(empleado instanceof EComision){
                comision=(EComision)empleado;
                if(comision.getSalario()>sueldoAux){
                    sueldoAux=comision.getSalario();
                    texto="Nombre: "+comision.getNombre()+"\nApellido: "+comision.getApellido()+"\nSueldo: "+comision.getSalario();
                }
            }

        }
        return texto;
}

  public String mostrarEmpleados(){
        String texto="";
        for (Empleado empleado : empleados) {
           texto+=empleado.toString()+"\n";
        }
        return texto;
  }

}
