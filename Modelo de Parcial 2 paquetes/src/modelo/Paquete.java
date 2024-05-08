package modelo;

import Interfaces.ICalculos;

public abstract class Paquete implements ICalculos {
    //atributos
    private double peso;
    private String destino;
    private boolean seguro;
    private boolean entregaMismoDia;
    private boolean enviado;

    //constructores

    public Paquete(){
        peso=0;
        destino="";
        seguro=false;
        entregaMismoDia=false;
        enviado=false;
    }

    public Paquete(double peso, String destino, boolean seguro, boolean entregaMismoDia){
        this.peso=peso;
        this.destino=destino;
        this.seguro=seguro;
        this.entregaMismoDia=entregaMismoDia;
        enviado=false;

    }

    //getters


    public double getPeso() {
        return peso;
    }



    public String getDestino() {
        return destino;
    }

    public boolean isEntregaMismoDia() {
        return entregaMismoDia;
    }

    public boolean isSeguro() {
        return seguro;
    }

    //metodos


    @Override
    public String toString() {
        return "Paquete{" +
                "peso=" + peso +
                ", destino='" + destino + '\'' +
                ", seguro=" + seguro +
                ", entregaMismoDia=" + entregaMismoDia +
                ", enviado=" + enviado +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Paquete){
                Paquete aux= (Paquete)obj;
                if(aux.peso == peso && aux.destino.equalsIgnoreCase(destino)){
                    sonIguales=true;
                }
            }
        }


        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
