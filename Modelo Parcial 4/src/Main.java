import modelo.Cliente;
import modelo.GestorAgencia;
import modelo.Taxi;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GestorAgencia agencia = new GestorAgencia();
        agencia.agregarVehiculo(new Taxi("Fiat", "Cronos", "GNC", "AG123IY", 0, 1000, 650));
        agencia.agregarCliente(new Cliente("Carlos", "Tevez", "Dorrego 3451", 223456432));
        Iterator<Cliente> it = agencia.getClienteHashSet().iterator();
        agencia.realizarViaje(it.next());
        System.out.println(agencia);
        agencia.finalizarViaje();
        System.out.println(agencia);
        System.out.println("RECAUDACION TOTAL: "+agencia.calcularRecaudacionTotal());
    }
}