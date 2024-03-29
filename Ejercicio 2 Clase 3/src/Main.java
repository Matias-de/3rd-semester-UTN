import modelo.Libro;
import modelo.Tienda;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int cantLibros=0;
        System.out.println("Ingrese la cantidad de libros que desea cargar: ");
        cantLibros= scanner.nextInt();
        Libro[] arregloLibros= new Libro[cantLibros];
        Tienda tienda = new Tienda();

        inicializarArregloLibros(arregloLibros);
        cargarArregloLibros(arregloLibros);
        mostrarArregloLibros(arregloLibros);
        agregarProductoArreglo(arregloLibros, tienda);
        System.out.println(""+tienda.mostrarInfo());



        scanner.close();


    }

    public static void inicializarArregloLibros(Libro[] arreglo){

        for(int i=0; i< arreglo.length; i++){
            arreglo[i] = new Libro();

        }


    }
    public static void mostrarArregloLibros(Libro[] arreglo){
        for(int i=0; i< arreglo.length; i++){
            System.out.println(""+arreglo[i].getInfo());

        }


    }
    public static void cargarArregloLibros(Libro[] arregloLibros){
        for(int i=0; i< arregloLibros.length; i++){
            scanner.nextLine();
            System.out.println("Ingrese el titulo: ");
            arregloLibros[i].setTitulo(scanner.nextLine());
            System.out.println("Ingrese el autor: ");
            arregloLibros[i].setAutor(scanner.nextLine());
            System.out.println("Ingrese el año de publicacion: ");
            arregloLibros[i].setAnioPublicacion(scanner.nextInt());
            scanner.nextLine();
        }


    }

    public static void agregarProductoArreglo(Libro[] arreglo, Tienda tiendita) {
       boolean flag=false;
        String libroBuscar;
        System.out.println("Ingrese el titulo del libro a buscar: ");
        libroBuscar = scanner.nextLine();
        for(int i=0;i<arreglo.length;i++)
        {
            if (arreglo[i].getTitulo().equals(libroBuscar))
            {
                tiendita.agregarProducto(libroBuscar);
                flag = true;
            }
        }

        if(flag)
        {
            System.out.println("El libro fue agregado correctamente");
        }else{
        System.out.println("El libro no se encontro..");
        }

    }



}