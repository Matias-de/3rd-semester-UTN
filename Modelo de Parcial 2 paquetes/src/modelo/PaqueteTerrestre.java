package modelo;

public  class PaqueteTerrestre extends Paquete {
    //atributos
   private double distancia;
   private String tipoVehiculo;
   private double precioFinal;
    //constructores

    public PaqueteTerrestre(){
        super();
        distancia=0;
        tipoVehiculo="";
    }

    public PaqueteTerrestre(double peso, String destino, boolean seguro, boolean entregaMismoDia, double distancia, String tipoVehiculo){
        super(peso, destino, seguro, entregaMismoDia);
        this.distancia=distancia;
        this.tipoVehiculo=tipoVehiculo;
        precioFinal=calcularCostoAdicional();

    }

    //getters


    public double getDistancia() {
        return distancia;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }


    //metodos
    @Override
    public double calcularTarifaEnvio() {
        double aux=0;
       aux=getPeso()*25;
        if(distancia >100){
            aux+=(distancia-100)*0.05;
        }

        if(tipoVehiculo.equals("camion")){

                    aux+=aux*0.10;
        }

        return aux;
    }

    @Override
    public double calcularCostoAdicional() {
        double aux= calcularTarifaEnvio();
        if(isSeguro()){
            aux+=1500;

        }
        if(isEntregaMismoDia()){
            aux+=aux*0.25;
        }
        return aux;
    }

    @Override
    public String calcularTotalPaquete() {
        return "EL precio total del paquete es de: $"+precioFinal;
    }


    @Override
    public String toString() {
        return super.toString()+"PaqueteTerrestre{" +
                "distancia=" + distancia +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", precioFinal=" + precioFinal +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
      if(sonIguales){
          if(obj instanceof PaqueteTerrestre){
              PaqueteTerrestre aux = (PaqueteTerrestre) obj;
              if(aux.distancia!=distancia || aux.tipoVehiculo!=tipoVehiculo){
                  sonIguales=false;
              }
          }
      }



        return sonIguales;
    }


}
