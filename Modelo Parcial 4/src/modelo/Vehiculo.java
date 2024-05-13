package modelo;

public abstract class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private String tipoCombustible;
    private String patente;
    private boolean disponible;

    //constructores

    public Vehiculo(){
        marca="";
        modelo="";
        tipoCombustible="";
        patente="";
        disponible=false;
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente){
        this.marca=marca;
        this.modelo=modelo;
        this.tipoCombustible=tipoCombustible;
        this.patente=patente;
        disponible=true;

    }

    //getters


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    //setters


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //metodos


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", patente='" + patente + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Vehiculo){
                Vehiculo aux= (Vehiculo) obj;
                if(aux.patente.equalsIgnoreCase(patente) && aux.modelo.equalsIgnoreCase(modelo)){
                    sonIguales=true;
                }
            }
        }


        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 123;
    }

    public abstract double calcularTarifa();




}
