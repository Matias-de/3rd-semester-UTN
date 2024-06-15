package Modelo;

public class NoIDEnMapaException  extends Exception{

    public NoIDEnMapaException() {
        super();
    }

    public NoIDEnMapaException(String ID) {
        super("no se encontro la ID: "+ ID);
    }

}
