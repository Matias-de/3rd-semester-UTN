package Modelo;

import Interfaces.IJugarPartido;

public class Futbolista extends Integrante implements IJugarPartido {
    //atributos
    private int nroCamiseta;
    private Puesto puesto;

    //Constructores


    public Futbolista() {
        super();
        nroCamiseta=0;
        puesto=Puesto.DELANTERO;
    }

    public Futbolista(String nombre, String apellido, int edad, int nroCamiseta, Puesto puesto) {
        super(nombre, apellido, edad);
        this.nroCamiseta = nroCamiseta;
        this.puesto = puesto;
    }

    //Getters y setters


    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Futbolista{" +
                "nroCamiseta=" + nroCamiseta +
                ", puesto=" + puesto +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales= super.equals(obj);
        if(obj!=null && obj instanceof Futbolista){
            Futbolista aux=(Futbolista) obj;
            if((aux.nroCamiseta != nroCamiseta) && (aux.puesto != puesto)){
                sonIguales=false;
            }
        }

        return sonIguales;
    }


    @Override
    public String jugarPartido() {
        return getNombre()+" "+getApellido()+" Se encuentra jugando!";
    }

    @Override
    public String viajar() {
        return getNombre()+" "+getApellido()+" fue convocado al mundial";
    }

    @Override
    public String concentrar() {
        return getNombre()+" "+getApellido()+" se encuentra en miamee";
    }
}
