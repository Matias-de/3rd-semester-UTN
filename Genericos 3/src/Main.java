import modelo.Decimal;
import modelo.Entero;
import modelo.operacionMatematica;

public class Main {
    public static void main(String[] args) {
        operacionMatematica opEntero = new Entero(2,4);
        System.out.println(opEntero.sumar(opEntero.getNumero1(), opEntero.getNumero2()));
        System.out.println(opEntero.restar(opEntero.getNumero1(), opEntero.getNumero2()));
        System.out.println(opEntero.multiplicar(opEntero.getNumero1(), opEntero.getNumero2()));
        System.out.println(opEntero.dividir(0, 12));
        System.out.println("DECIMALES");
        operacionMatematica opDouble = new Decimal(4.5, 6.8);
        System.out.println(opDouble.sumar(opDouble.getNumero1(), opDouble.getNumero2()));
        System.out.println(opDouble.restar(opDouble.getNumero1(), opDouble.getNumero2()));
        System.out.println(opDouble.multiplicar(opDouble.getNumero1(), opDouble.getNumero2()));
        System.out.println(opDouble.dividir(opDouble.getNumero1(), opDouble.getNumero2()));
    }
}