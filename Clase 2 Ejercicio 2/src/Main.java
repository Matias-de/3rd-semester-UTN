import modelo.Tarea;

import java.util.Scanner;

public class Main {

    //Crea un programa que pida al usuario una lista de tareas pendientes
    // y muestre por pantalla las tareas más importantes y su fecha de vencimiento.
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int cantTareas=0, auxImportancia=0;
        System.out.println("Ingrese cuantas tareas desea ingresar: ");
        cantTareas=scanner.nextInt(); //le permite al usuario ingresar cuantas tareas agregar
        Tarea[] arregloTareas= new Tarea[cantTareas]; //se crea el arreglo de tareas
        for(int i=0; i< arregloTareas.length;i++){
            arregloTareas[i]= new Tarea(); // en cada posicion del arreglo se crea un objeto distinto
            System.out.println("Ingrese una descripcion sobre la tarea: ");
            scanner.nextLine();
            arregloTareas[i].setDescripcion(scanner.nextLine());
            System.out.println("Ingrese los dias restantes para su cumplimiento: ");
            arregloTareas[i].setVencimiento(scanner.nextInt());

            do{
               System.out.println("Ingrese la importancia de la tarea, donde 1 es la maxima importancia, 5 la minima: ");
               auxImportancia= scanner.nextInt();
               arregloTareas[i].setImportancia(auxImportancia);
               //se valida que lo ingresado sea coherente a lo que se pide (del 1 al 5)
           }while(auxImportancia<=0 || auxImportancia >=6);

        }

        mostrarTareasImportantes(arregloTareas);

        scanner.close();
    }


    public static void mostrarTareasImportantes(Tarea[] arreglo) {
        int auxImportancia=0;
        for (int i = 0; i < arreglo.length; i++) {
                    //supongamos que las tareas mas importantes son las que tienen importancia 1 y/o 2
            auxImportancia=arreglo[i].getImportancia();
            if(auxImportancia == 1 || auxImportancia == 2){

                System.out.println(arreglo[i].getInfo());

            }

        }
    }


    public static void mostrarArreglo(Tarea[] arreglo) { //muestra todas las tareas (PRUEBAS)

        for (int i = 0; i < arreglo.length; i++) {
            //supongamos que las tareas mas importantes son las que tienen importancia 1 y/o 2
            System.out.println(arreglo[i].getInfo());

        }
    }

}


