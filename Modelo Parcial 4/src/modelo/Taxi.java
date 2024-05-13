package modelo;

public class Taxi extends Vehiculo{

  //atributos
    private int contadorKm;
    private double bajadaBandera;
    private double precioXkm;

    //constructores
    public Taxi(){
        super("nn","nn", "nn", "nn");
        contadorKm=0;
        bajadaBandera=0;
        precioXkm=0;
    }
    public Taxi(String marca, String modelo, String tipoCombustible, String patente, int contadorKm, double bajadaBandera, double precioXkm){
        super(marca, modelo, tipoCombustible, patente);
        this.contadorKm=contadorKm;
        this.bajadaBandera=bajadaBandera;
        this.precioXkm=precioXkm;

    }

    //Getters


    public double getBajadaBandera() {
        return bajadaBandera;
    }

    public int getContadorKm() {
        return contadorKm;
    }

    public double getPrecioXkm() {
        return precioXkm;
    }

    //setters


    public void setBajadaBandera(double bajadaBandera) {
        this.bajadaBandera = bajadaBandera;
    }

    public void setContadorKm(int contadorKm) {
        this.contadorKm = contadorKm;
    }

    @Override
    public String toString() {
        return super.toString()+"[Taxi]{" +
                "contadorKm=" + contadorKm +
                ", bajadaBandera=" + bajadaBandera +
                ", precioXkm=" + precioXkm +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(sonIguales){
            if(obj instanceof Taxi){
                Taxi aux= (Taxi)obj;
                if(aux.bajadaBandera!=bajadaBandera || aux.contadorKm!=contadorKm || aux.precioXkm != precioXkm){
                    sonIguales=false;
                }
            }
        }

        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public double calcularTarifa() {
        return bajadaBandera+(contadorKm*precioXkm);
    }


}
