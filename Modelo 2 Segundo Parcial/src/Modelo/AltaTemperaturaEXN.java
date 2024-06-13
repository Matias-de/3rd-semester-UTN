package Modelo;

public class AltaTemperaturaEXN extends Exception{

    private int nroTest;
    private String barrio;

    public AltaTemperaturaEXN(String message, int nroTest, String barrio) {
        super("Kit con alta temperatura: "+ nroTest +" en barrio: "+ barrio +" \n");
        this.nroTest = nroTest;
        this.barrio = barrio;
    }
}
