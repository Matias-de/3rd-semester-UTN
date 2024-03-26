import modelo.CajaBanco;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner= new Scanner(System.in);

        String op="si";
        //Crea un programa que simule una cuenta bancaria,
        // permitiendo al usuario depositar y retirar dinero, y mostrar el saldo actual.

        CajaBanco cajaAhorro = new CajaBanco();

        realizarOperacion(cajaAhorro);




        scanner.close();
    }

    public static void realizarOperacion(CajaBanco cajita){
        int opSwitch=0;
        String op="si";
        double auxSaldo=0, saldoActual=0;
        System.out.println("Bienvenido, a continuacion, ingrese su contraseña: ");
        cajita.setContraseña(scanner.next());
        do{
            System.out.println(""+cajita.mostrarSaldo());
            System.out.println("Ingrese 1 para realizar un deposito, 2 para retirar dinero: ");
            opSwitch= scanner.nextInt();
            switch (opSwitch){
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    auxSaldo=scanner.nextDouble();
                    if(auxSaldo >=1) {
                        saldoActual=cajita.getSaldo();
                        cajita.setSaldo(saldoActual+auxSaldo);
                        System.out.println(""+cajita.mostrarSaldo());
                    }else {
                        System.out.println("ERROR, no se puede depositar valores negativos. REINTENTAR..");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    saldoActual=cajita.getSaldo();
                    auxSaldo= scanner.nextDouble();
                    if(auxSaldo > saldoActual){
                        System.out.println("ERROR, no se puede retirar mas de lo que tiene. REINTENTAR..");
                    }else if(auxSaldo<=0){
                        System.out.println("ERROR, no se pueden retirar valores negativos, REINTENTAR..");
                    }else{

                        cajita.setSaldo(saldoActual-auxSaldo);
                        System.out.println(""+cajita.mostrarSaldo());
                    }
                    break;
                default:
                    System.out.println("ERROR, eleccion invalida, REINTENTAR..");
                    break;

            }
            System.out.println("Desea seguir operando (si/no): ");
            op= scanner.next();

        }while(op.equals("si") || op.equals("SI"));
    }

}