import modelo.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        RrHh rrHh = new RrHh();
        rrHh.agregarEmpleado(new Vendedor("Matias", "606380", "Antonelli", "fulanito231", "23/04/04", 50));
        rrHh.agregarEmpleado(new Administrador("fulanito", "111111", "Tevez", "Casa de fulanito213","06/12/94","finanzas"));
        rrHh.agregarRepartidor(new Repartidor("Cocho", 30));
        rrHh.calcularTotalApagar();
        System.out.println(rrHh);
        System.out.println(rrHh.buscarEmpleadoXLegajo("111111"));
        System.out.println("Cant Empleados: "+rrHh.contarEmpleados());
        System.out.println(rrHh.eliminarEmpleadoXLegajo("111111"));
        System.out.println(rrHh);



    }
}