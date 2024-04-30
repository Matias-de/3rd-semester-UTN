import modelo.Empleado;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000.
        Empleado carlitos= new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        //27500.
        Empleado anita= new Empleado(34234123, "Ana", "Sanchez", 27500);
        //c. Imprima ambos objetos por pantalla.
        System.out.println(carlitos);
        System.out.println(anita);
       // d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        // salario anual del mismo.
        carlitos.incrementarSalario(0.15);
        System.out.println(carlitos);
        System.out.println("SALARIO ANUAL DE CARLOS: "+carlitos.calcularSalarioAnual());


    }
}