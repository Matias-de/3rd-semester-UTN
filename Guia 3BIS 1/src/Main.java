import modelo.Rectangulo;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Rectangulo rectangulo;
    public static void main(String[] args) {

    menu();

    }


    public static void opMenu(){
        System.out.println("a. Inicializar un objeto Rectangulo estableciendo ancho y alto. \n" +
                "b. Imprimir por pantalla el alto y ancho. \n" +
                "c. Imprimir por pantalla el area y perimetro. \n" +
                "d. Modificar el alto y el ancho de la instancia. \n" +
                "f. Inicializar un objeto Rectángulo con los valores por defecto y verificar. \n" +
                "g. Salir.\n");

    }

    public static void menu(){
        String opSwitch = "";
        int altura=0, ancho=0;
        float perimetro=0, area=0;
        do{

            opMenu();
            System.out.println("Ingrese la opcion a realizar: ");
            opSwitch = scanner.nextLine();
            opSwitch=opSwitch.toLowerCase();
            switch (opSwitch){
                case "a":
                    System.out.println("Ingrese la altura: ");
                    altura = scanner.nextInt();
                    System.out.println("Ingrese el ancho: ");
                    ancho = scanner.nextInt();
                    scanner.nextLine();
                    rectangulo = new Rectangulo(altura, ancho);

                    break;
                case "b":
                    System.out.println(rectangulo);
                    break;
                case "c":
                    if(rectangulo!=null){

                        area= rectangulo.calcularArea();
                        perimetro= rectangulo.calcularPerimetro();
                        System.out.println("AREA: "+area+"\nPERIMETRO: "+perimetro);
                    }else{
                        System.out.println("ERROR, primero indique valores de altura y ancho (op a)");
                    }
                    break;
                case "d":
                    if(rectangulo!=null){
                            System.out.println("Ingrese la nueva altura: ");
                            rectangulo.modificarAlto(scanner.nextInt());
                            System.out.println("Ingrese el nuevo ancho: ");
                            rectangulo.modificarAncho(scanner.nextInt());

                    }else{
                        System.out.println("realice primero la opcion a.");
                    }
                    break;
                    
                case "f":
                    Rectangulo rectangulo1 = new Rectangulo();
                    System.out.println(rectangulo1);
                    break;
                default:
                    if(!opSwitch.equals("g")){

                        System.out.println("ERROR, DATO INGRESADO INVALIDO");
                    }
                    break;


            }




        }while(!opSwitch.equals("g"));


    }


}