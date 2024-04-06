import modelo.Boleto;
import modelo.MaquinaExpendedora;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args)
    {

        scanner = new Scanner(System.in);
        MaquinaExpendedora maquinita = new MaquinaExpendedora();
        String op="si";
        Boleto boletito;
        do
        {
            System.out.println("Ingrese el dinero a depositar en la maquina: ");
            maquinita.ingresarDinero(scanner.nextInt());
            boletito = maquinita.imprimirBoletos();
            if(boletito!=null){
                System.out.println("El boleto se imprimio con exito\n");
                System.out.println(""+boletito.mostrarBoleto());

            }else {
                System.out.println("BOLETO NO IMPRESO");
            }
            System.out.println(("\n"+maquinita.mostrarSaldoYPrecio()));
            System.out.println(("\n"+maquinita.mostrarVuelto()));
            scanner.nextLine();
            System.out.println("Desea comprar mas boletos?(si/no)");
            op= scanner.nextLine();
            op=op.toLowerCase();
        }while(op.equals("si"));
        System.out.println(""+maquinita.mostrarDatosMaquina());





    }

}