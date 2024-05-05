package modelo;

public abstract class Juego {
    private double posX;
    private double posY;

    public Juego(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Juego(){
        posX = 0;
        posY = 0;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }


    @Override
    public String toString() {
        return "\nPosicion en el Juego{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
