import modelo.Auto;
import modelo.Concesionario;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        Auto[] autitoo= new Auto[3];
        Concesionario concesionaria= new Concesionario();
        inicializarArregloAutps(autitoo);
        cargarArregloAutos(autitoo);
        modificarVelocidad(autitoo);
        //mostrarArregloAutos(autitoo);
        agregarAutoConsecionaria(autitoo, concesionaria);
        System.out.println(""+concesionaria.mostrarCochesDisponibles());





        scanner.close();
    }



    public static void inicializarArregloAutps(Auto[] arreglo){

        for(int i=0; i< arreglo.length; i++){
            arreglo[i] = new Auto();

        }


    }

    public static void mostrarArregloAutos(Auto[] arreglo){
        for(int i=0; i< arreglo.length; i++){
            System.out.println(""+arreglo[i].obtenerInformacion());

        }


    }

    public static void cargarArregloAutos(Auto[] arregloAutos){
        for(int i=0; i< arregloAutos.length; i++){
            scanner.nextLine();
            System.out.println("Ingrese la marca: ");
            arregloAutos[i].setMarca(scanner.nextLine());
            System.out.println("Ingrese el modelo: ");
            arregloAutos[i].setModelo(scanner.nextLine());
            System.out.println("Ingrese el año de fabricacion: ");
            arregloAutos[i].setAñoFabricacion(scanner.nextInt());
            scanner.nextLine();
        }


    }

    public static void modificarVelocidad(Auto[] arregloAutos){
        String op="si";
        int opSwitch=0;
        int añoAux=0;
        String modeloAux;
        boolean flag=false;
        double velAux=0;
        do{
            int i=0, j=0;
            System.out.println("COCHES DISPONIBLES: ");
            mostrarArregloAutos(arregloAutos);
            System.out.println("Ingrese el modelo del auto a buscar: ");
            modeloAux= scanner.nextLine();
            System.out.println("Ingrese el año de fabricacion del mismo: ");
            añoAux= scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente
            while(i<arregloAutos.length)
            {
                if(arregloAutos[i].getModelo().equals(modeloAux) && arregloAutos[i].getAñoFabricacion() == añoAux)
                {
                    j=i;
                    flag=true;

                }
                i++;
            }

            if(flag)
            {
                System.out.println("Ingrese 1 para incrementar la velocidad del vehiculo, 2 para disminuirla: ");
                opSwitch= scanner.nextInt();
                switch (opSwitch){
                    case 1:
                        System.out.println("Ingrese cuantos km suma a la velocidad actual: ");
                        velAux= scanner.nextDouble();
                        arregloAutos[j].acelerar(velAux);
                        break;

                    case 2:
                        System.out.println("Ingrese cuantos km desea decrementar la velocidad actual: ");
                        velAux= scanner.nextDouble();
                        if(velAux > arregloAutos[j].getVelocidadActual()){
                            System.out.println("ERROR, la velocidad seleccionada es mayor a la que tiene el vehiculo");
                        }else{

                            arregloAutos[j].frenar(velAux);
                        }
                        break;
                    default:
                        System.out.println("ERROR, asignacion invalida, REINTENTAR.");
                        break;

                }
            }else {
                System.out.println("ERROR, no se encontro el vehiculo");
            }

            scanner.nextLine();
            System.out.println("Desea continuar(si/no)");
            op=scanner.nextLine();
            op=op.toLowerCase();

        }while(op.equals("si"));

    }
    public static void agregarAutoConsecionaria(Auto[] arregloAutos, Concesionario consecionaria){

        boolean flag=false;
        String modeloAux, continuar;
        int añoAux=0;
        do{

            System.out.println("Ingrese el modelo del auto a buscar: ");
            modeloAux= scanner.nextLine();
            System.out.println("Ingrese el año de fabricacion del mismo: ");
            añoAux= scanner.nextInt();
            scanner.nextLine();
            for(int i=0; i< arregloAutos.length; i++){

                if(arregloAutos[i].getModelo().equals(modeloAux) && arregloAutos[i].getAñoFabricacion() == añoAux){
                    flag=true;
                    consecionaria.agregarAuto(arregloAutos[i]);
                }


            }
            if(flag){
                System.out.println("El auto se agrego correctamente");
            }else{
                System.out.println("Error, el auto no se pudo agregar (inexistente)");
            }
            System.out.println("¿Desea agregar otro auto? (si/no)");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));


    }


}