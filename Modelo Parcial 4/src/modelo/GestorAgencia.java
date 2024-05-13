package modelo;

import java.util.HashSet;
import java.util.Iterator;

public class GestorAgencia {
    //atributos
    private HashSet<Vehiculo>vehiculoHashSet;
    private HashSet<Cliente>clienteHashSet;
    private HashSet<SistemaViaje> viajeHashSet;
    private double recaudacionTotal;
    //constructores

    public GestorAgencia(){
        vehiculoHashSet= new HashSet<>();
        clienteHashSet= new HashSet<>();
        viajeHashSet= new HashSet<>();
        recaudacionTotal=0;
    }

    public GestorAgencia(HashSet<Vehiculo>vehiculoHashSet,HashSet<Cliente>clienteHashSet,HashSet<SistemaViaje> viajeHashSet, double recaudacionTotal){
        this.vehiculoHashSet= vehiculoHashSet;
        this.clienteHashSet= clienteHashSet;
        this.viajeHashSet= viajeHashSet;
        this.recaudacionTotal=recaudacionTotal;
    }

    //getters

    public HashSet<Cliente> getClienteHashSet() {
        return clienteHashSet;
    }

    public HashSet<SistemaViaje> getViajeHashSet() {
        return viajeHashSet;
    }

    public HashSet<Vehiculo> getVehiculoHashSet() {
        return vehiculoHashSet;
    }

    public double getRecaudacionTotal() {
        return recaudacionTotal;
    }

    //setters
    public void setClienteHashSet(HashSet<Cliente> clienteHashSet) {
        this.clienteHashSet = clienteHashSet;
    }

    public void setVehiculoHashSet(HashSet<Vehiculo> vehiculoHashSet) {
        this.vehiculoHashSet = vehiculoHashSet;
    }

    public void setViajeHashSet(HashSet<SistemaViaje> viajeHashSet) {
        this.viajeHashSet = viajeHashSet;
    }

    public void setRecaudacionTotal(double recaudacionTotal) {
        this.recaudacionTotal = recaudacionTotal;
    }
    //metodos

    @Override
    public String toString() {
        return "GestorAgencia{" +
                "vehiculoHashSet=" + vehiculoHashSet +
                ", clienteHashSet=" + clienteHashSet +
                ", viajeHashSet=" + viajeHashSet +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void agregarVehiculo(Vehiculo veh){
        vehiculoHashSet.add(veh);
    }

    public void agregarCliente(Cliente cliente){
        clienteHashSet.add(cliente);
    }

    public void realizarViaje(Cliente cliente){
        boolean flag=false;
        Iterator<Vehiculo> it = vehiculoHashSet.iterator();
        while(it.hasNext() && !flag){
            Vehiculo aux = it.next();
            if(aux.isDisponible()){
                if(aux instanceof Taxi){
                    aux.setDisponible(false);
                    viajeHashSet.add(new SistemaViaje(aux, cliente, cliente.distanciaArecorrer()));
                    flag=true;
                } else if(aux instanceof Remis) {
                    if (aux.isDisponible()) {
                        aux.setDisponible(false);
                        viajeHashSet.add(new SistemaViaje(aux, cliente, cliente.distanciaArecorrer()));
                        flag = true;
                    }
                }

            }
        }

    }

    public boolean finalizarViaje()
    {
        boolean rta= false;
        Iterator<SistemaViaje> itViajes = viajeHashSet.iterator();
        Iterator<Vehiculo> itVehiculo = vehiculoHashSet.iterator();
        while(itVehiculo.hasNext())
        {
            Vehiculo aux = itVehiculo.next();
            if(!aux.isDisponible())
            {
                while(itViajes.hasNext())
                {
                    SistemaViaje auxViaje = itViajes.next();
                    if(auxViaje.getVehiculo().equals(aux))
                    {
                        rta = auxViaje.calcularCostoViaje();
                        aux.setDisponible(true);
                    }
                }
            }
        }
        return rta;
    }

    public double calcularRecaudacionTotal(){
        Iterator<SistemaViaje> it = viajeHashSet.iterator();
        double recaudacion=0;
        while(it.hasNext()){
            SistemaViaje aux= it.next();
            recaudacion+=aux.getPrecioViaje();
        }
        setRecaudacionTotal(recaudacion);

        return recaudacion;
    }

}
