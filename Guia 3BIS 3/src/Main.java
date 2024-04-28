import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //a. Inicialice el objeto con los atributos necesarios
        ItemDeVenta item = new ItemDeVenta(1, "Fideos La Campagnola", 125, 899.99 );
        System.out.println(item);

    }
}