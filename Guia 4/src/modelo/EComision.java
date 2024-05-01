package modelo;

public class EComision extends Empleado{

    public int clientesCaptados;
    public double montoCliente;
    public double salario;

    public EComision(){
        super();
        clientesCaptados=0;
        montoCliente=0;
        salario=0;
    }

    public EComision(String dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoCliente){
        super(dni, nombre, apellido, anioIngreso, 750);
        this.clientesCaptados=clientesCaptados;
        this.montoCliente=montoCliente;
        obtenerSalario(750);
    }


    public double getMontoCliente() {
        return montoCliente;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado por Comision{" +
                "clientesCaptados=" + clientesCaptados +
                ", montoCliente=" + montoCliente +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void obtenerSalario(double salarioBase) {
        double salAux=clientesCaptados*montoCliente;
        if(salAux>750){

            salario=salAux;
        }else{
            salario=750;
        }


    }
}
