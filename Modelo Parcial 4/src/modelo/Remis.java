package modelo;

public class Remis extends Vehiculo{

    //atributos

    private double tarifaXcuadra;
    private double distancia;

    //Constructores

    private Remis(){
        super("nn", "nn", "nn", "nn");
        tarifaXcuadra=0;
        distancia=0;
    }

    public Remis(String marca, String modelo, String tipoCombustible, String patente, double tarifaXcuadra, double distancia){
        super(marca, modelo, tipoCombustible, patente);
        this.tarifaXcuadra=tarifaXcuadra;
        this.distancia=distancia;

    }

    //getters


    public double getTarifaXcuadra() {
        return tarifaXcuadra;
    }

    public double getDistancia() {
        return distancia;
    }

    //setters


    public void setTarifaXcuadra(double tarifaXcuadra) {
        this.tarifaXcuadra = tarifaXcuadra;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"[Remis]{" +
                "tarifaXcuadra=" + tarifaXcuadra +
                ", distancia=" + distancia +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(sonIguales){
            if(obj instanceof Remis){
                Remis aux= (Remis) obj;
                if(aux.tarifaXcuadra!=tarifaXcuadra && aux.distancia!=distancia){
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
        return distancia*tarifaXcuadra;
    }



}
