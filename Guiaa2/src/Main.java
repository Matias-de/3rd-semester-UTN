import modelo.Cuenta;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Cuenta cuentita;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        
       menu();


        scanner.close();
    }

    public static void opMenu(){
        System.out.println("1. Crear cuenta vacía\n" +
                "2. Crear cuenta saldo inicial\n" +
                "3. Ingresar dinero\n" +
                "4. Sacar dinero\n" +
                "5. Ver saldo\n" +
                "6. Salir\n");
    }

    public static void menu(){
        ;
        String opSwitch="si";
        int eleccionSwitch=0, claveAux=0;
        float saldoAux=0;
        do {
            opMenu();
            System.out.println("Ingrese la opcion: ");
            eleccionSwitch=scanner.nextInt();
            switch (eleccionSwitch){
                case 1:
                  cuentita= new Cuenta();
                   break;
                case 2:
                    System.out.println("Ingrese la clave bancaria: ");
                    claveAux= scanner.nextInt();
                    System.out.println("Ingrese el saldo inicial: ");
                    saldoAux=scanner.nextFloat();
                    cuentita=new Cuenta(saldoAux, claveAux);
                    break;
                case 3:
                    if(cuentita!=null){

                        System.out.println("Ingrese la clave bancaria: ");
                        claveAux=scanner.nextInt();
                        if(claveAux == cuentita.getClaveBancaria() || cuentita.getClaveBancaria()==0){
                            System.out.println("Ingrese el dinero a ingresar: ");
                            saldoAux=scanner.nextFloat();
                            cuentita.ingresar(saldoAux);
                        }else{
                            System.out.println("ERROR, clave no corresponde..");
                        }
                    }else{
                        System.out.println("ERROR, primero pase por las opciones 1 o 2..");
                    }
                    break;
                case 4:
                    if(cuentita!=null) {
                        System.out.println("Ingrese la clave bancaria: ");
                        claveAux=scanner.nextInt();
                        if (claveAux == cuentita.getClaveBancaria() || cuentita.getClaveBancaria() == 0) {
                            System.out.println(cuentita);
                            System.out.println("Ingrese el saldo a retirar: ");
                            saldoAux = scanner.nextFloat();
                            cuentita.extraer(saldoAux);
                        } else {
                            System.out.println("ERROR, primero pase por las opciones 1 o 2..");

                        }
                    }
                    break;
                case 5:
                    System.out.println(cuentita+"\n");
                    break;
                case 6:
                    cuentita=null;
                    opSwitch="no";
                    break;



            }


            opSwitch=opSwitch.toLowerCase();
        }while(opSwitch.equals("si"));

    }



}