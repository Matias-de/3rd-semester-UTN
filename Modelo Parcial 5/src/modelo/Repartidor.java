package modelo;

import Interfaces.ICalculoSueldo;

public class Repartidor implements ICalculoSueldo {
    //atributos
    private String apodo;
    private double sueldo;
    private int kmRecorridos;
    //constructores
    public Repartidor(){
        apodo="";
        sueldo=0;
        kmRecorridos=0;
    }
    public Repartidor(String apodo, int kmRecorridos){
        this.apodo=apodo;
        this.kmRecorridos=kmRecorridos;
        calculoSueldo();
    }
    //getters


    public double getSueldo() {
        return sueldo;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public String getApodo() {
        return apodo;
    }
//setters
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    //metodos

    @Override
    public void calculoSueldo() {

        sueldo=3*kmRecorridos;

    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "apodo='" + apodo + '\'' +
                ", sueldo=" + sueldo +
                ", kmRecorridos=" + kmRecorridos +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){ //si lo que recibo es nulo (maldito front)
            if(obj instanceof Repartidor){//comprobacion de tipo
                Repartidor aux=(Repartidor) obj; //casteo en linea
               if(aux.apodo.equalsIgnoreCase(apodo) && aux.kmRecorridos == kmRecorridos){
                   sonIguales=true;
               }
            }
        }

        return sonIguales;
    }





}
