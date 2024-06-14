package Modelo;

import Interfaces.IJugarPartido;
import Interfaces.IPrepararEntrenamiento;

public class AyudanteDeCampo extends Integrante implements IJugarPartido, IPrepararEntrenamiento {

    //atributos
    private String metodologia;

    //constructores

    public AyudanteDeCampo(){
        super();
        metodologia="";

    }

    public AyudanteDeCampo(String nombre, String apellido, int edad, String metodologia) {
        super(nombre, apellido, edad);
        this.metodologia = metodologia;
    }

    //getters


    public String getMetodologia() {
        return metodologia;
    }


    //Setters


    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+"AyudanteDeCampo{" +
                "metodologia='" + metodologia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(obj!=null && obj instanceof AyudanteDeCampo){
            AyudanteDeCampo aux=(AyudanteDeCampo) obj;
            if(!aux.metodologia.equalsIgnoreCase(metodologia)){
                sonIguales=false;
            }
        }
        return sonIguales;
    }


    @Override
    public String jugarPartido() {
        return getNombre()+" "+getApellido()+" se encuentra como ayudante en el partido..";
    }

    @Override
    public String prepararEntreno() {
        return getNombre()+" "+getApellido()+" tiene las mejores tacticas para el proximo partido";

    }

    @Override
    public String viajar() {
        return getNombre()+" "+getApellido()+" sera el proximo ayudante de campo para el mundial";
    }

    @Override
    public String concentrar() {
        return getNombre()+" "+getApellido()+" se encuentra concentrando";
    }
}
