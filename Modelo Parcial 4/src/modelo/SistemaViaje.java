package modelo;

public class SistemaViaje {
    //atributos
    private Vehiculo vehiculo;
    private Cliente cliente;
    private double precioViaje;

    //Constructores
    public SistemaViaje() {
        vehiculo = null;
        cliente = null;
        precioViaje = 0;

    }
    public SistemaViaje(Vehiculo vehiculo, Cliente cliente, double precioViaje){
        this.vehiculo=vehiculo;
        this.cliente=cliente;
        this.precioViaje=precioViaje;
    }


    //getters


    public Cliente getCliente() {
        return cliente;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    //metodos


    @Override
    public String toString() {
        return "SistemaViaje{" +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", precioViaje=" + precioViaje +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;

        if(obj!=null){
            if(obj instanceof SistemaViaje){
                SistemaViaje aux = (SistemaViaje) obj;
                if(aux.cliente.getNombre().equalsIgnoreCase(cliente.getNombre()) && aux.vehiculo.getPatente().equalsIgnoreCase(vehiculo.getPatente())){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }


    public boolean calcularCostoViaje(){
        boolean rta=false;
        if(vehiculo instanceof Taxi){
            Taxi aux = (Taxi) vehiculo;
            aux.setContadorKm(cliente.distanciaArecorrer());
            precioViaje=aux.calcularTarifa();
            rta=true;

        }else if(vehiculo instanceof Remis){
            Remis aux2 = (Remis) vehiculo;
            aux2.setDistancia(cliente.distanciaArecorrer());
            precioViaje= aux2.calcularTarifa();
            rta=true;
        }
        return rta;

    }



}
