package modelo;

import java.util.Objects;

public class PaqueteAereo extends Paquete {
    //atributos
    private String aerolinea;
    private String claseEnvio;
    private double precioFinal;
    //constructores

    public PaqueteAereo() {
        super();
        aerolinea="";
        claseEnvio="";
        precioFinal=0;
    }

    public PaqueteAereo(double peso, String destino, boolean seguro, boolean entregaMismoDia, String aerolinea, String claseEnvio) {
        super(peso, destino, seguro, entregaMismoDia);
        this.aerolinea = aerolinea;
        this.claseEnvio = claseEnvio;
        precioFinal=calcularCostoAdicional();
    }

    //getters


    public String getAerolinea() {
        return aerolinea;
    }

    public String getClaseEnvio() {
        return claseEnvio;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+"PaqueteAereo{" +
                "aerolinea='" + aerolinea + '\'' +
                ", claseEnvio='" + claseEnvio + '\'' +
                ", precioFinal=" + precioFinal +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(sonIguales){
            if(obj instanceof PaqueteAereo){
                PaqueteAereo aux= (PaqueteAereo)obj;
                if(!Objects.equals(aux.aerolinea, aerolinea) || aux.claseEnvio!= claseEnvio){
                    sonIguales=false;
                }
            }
        }


        return sonIguales;
    }

    @Override
    public double calcularTarifaEnvio() {
        double aux=0;
        aux=getPeso()*30;
        if(aerolinea.equalsIgnoreCase("AA")){
            aux+=aux*0.50;
        }
        if(claseEnvio.equalsIgnoreCase("express")){
            aux+=1000;
        }

        return aux;
    }

    @Override
    public double calcularCostoAdicional() {
        double aux=calcularTarifaEnvio();
        if(isSeguro()){
            aux+=2500;
        }
        if(isEntregaMismoDia()){
            aux+=aux*0.50;
        }


        return aux;
    }

    @Override
    public String calcularTotalPaquete() {
       return "El valor total del paquetes es; $"+precioFinal;
    }


}
