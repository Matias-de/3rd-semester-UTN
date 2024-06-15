package Modelo;

public class MiExcepcion extends Exception{
    private int edad;

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(int edad) {
        super("La persona es menor de edad, su edad es: "+ edad);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

}
