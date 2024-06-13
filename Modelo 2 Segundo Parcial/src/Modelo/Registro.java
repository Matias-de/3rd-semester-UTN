package Modelo;

import java.io.Serializable;

public class Registro implements Serializable {
    //atributos
    private String dni;
    private double temperatura;

    //Constructores


    public Registro(String dni, double temperatura) {
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public Registro() {
        dni="";
        temperatura=0;

    }

    //getters y setters


    public String getDni() {
        return dni;
    }

    public double getTemperatura() {
        return temperatura;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    //metodos


    @Override
    public String toString() {
        return "Registro{" +
                "dni='" + dni + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){

            if(obj instanceof Registro){
                Registro aux=(Registro) obj;
                if(aux.dni.equalsIgnoreCase(dni)){
                    sonIguales=true;
                }
            }
        }


        return sonIguales;
    }
}
