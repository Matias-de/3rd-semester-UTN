package Modelo;

public class CapacidadMenorException extends Exception{
   private int capacidad;
    public CapacidadMenorException(int capacidad, int capacidadMinima){
        super("no supera la capacidad, no se agrega. Capacidad del avion a ingresar: "+capacidad+", capacidad minima requerida: "+capacidadMinima);
        this.capacidad= capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
