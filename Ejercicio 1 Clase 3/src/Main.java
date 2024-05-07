import modelo.Curso;
import modelo.Estudiante;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        Curso cursito=new Curso();
        Estudiante[] arregloEstudiantes = new Estudiante[cursito.getArregloEstudiantes().length];

        cargarCurso(arregloEstudiantes, cursito);
        System.out.println(cursito.imprimirEstudiantes());






        scanner.close();

    }

    public static void cargarCurso(Estudiante[] arreglo, Curso pCurso) {
        double[] notasAux = new double[3];
        int i=0;
        System.out.println("Ingrese un nombre para el curso; ");
        pCurso.setNombreCurso(scanner.nextLine());
        while (i< pCurso.getArregloEstudiantes().length)
        {
            arreglo[i] = new Estudiante();
            System.out.println("Ingrese el nombre del estudiante: ");   //carga del estudiante
            arreglo[i].setNombre(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            arreglo[i].setEdad(scanner.nextInt());
            for(int j = 0; j < arreglo[i].getCalificaciones().length; j++) {
                System.out.println("Ingrese las notas: ");
                notasAux[j] = scanner.nextDouble();
            }
            arreglo[i].setCalificaciones(notasAux.clone());
            scanner.nextLine();
            pCurso.agregarEstudiante(arreglo[i]);
            i++;

        }



    }



}

