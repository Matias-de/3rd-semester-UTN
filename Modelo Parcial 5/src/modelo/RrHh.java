package modelo;

import java.util.ArrayList;

public class RrHh {
    //atributos
    private ArrayList<Empleado> empleadoArrayList;
    private ArrayList<Repartidor> repartidorArrayList;
    private double totalApagar;
    //constructores
    public RrHh(){
        empleadoArrayList= new ArrayList<>();
        repartidorArrayList= new ArrayList<>();
        totalApagar=0;
    }
    public RrHh(ArrayList<Empleado> empleadoArrayList, ArrayList<Repartidor> repartidorArrayList, double totalApagar){
        this.empleadoArrayList=empleadoArrayList;
        this.repartidorArrayList= repartidorArrayList;
        this.totalApagar=totalApagar;
    }

    //Getters


    public ArrayList<Empleado> getEmpleadoArrayList() {
        return empleadoArrayList;
    }

    public ArrayList<Repartidor> getRepartidorArrayList() {
        return repartidorArrayList;
    }

    public double getTotalApagar() {
        return totalApagar;

    }

   //metodos

    @Override
    public String toString() {
        return "RrHh{" +
                "empleadoArrayList=" + empleadoArrayList +
                ", repartidorArrayList=" + repartidorArrayList +
                ", totalApagar=" + totalApagar +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj instanceof RrHh){
            RrHh aux= (RrHh) obj;
            if(aux.empleadoArrayList.equals(empleadoArrayList) && aux.repartidorArrayList.equals(repartidorArrayList)){
                sonIguales=true;
            }
        }

        return sonIguales;
    }

    public void calcularTotalApagar(){
        double aux=0;
        for(int i=0; i<empleadoArrayList.size(); i++){
            aux+=empleadoArrayList.get(i).getSueldo();
        }
        for(int i=0; i<repartidorArrayList.size();i++){
            aux+=repartidorArrayList.get(i).getSueldo();
        }
        totalApagar=aux;
    }

    public void agregarEmpleado(Empleado aux){
        empleadoArrayList.add(aux);
    }
    public int contarEmpleados(){
        return empleadoArrayList.size();
    }

    public String buscarEmpleadoXLegajo(String legajo){
        String texto="No encontrado";

        for(int i =0; i<empleadoArrayList.size(); i++){
            if(empleadoArrayList.get(i).getLegajo().equalsIgnoreCase(legajo)){
             texto="Empleado encontrado. Sus datos"+empleadoArrayList.get(i).toString();
            }
        }

        return texto;
    }

    public String eliminarEmpleadoXLegajo(String legajo){
        String texto="Empleado no encontrado/eliminado";
        for(int i=0; i<empleadoArrayList.size();i++){
            if(empleadoArrayList.get(i).getLegajo()== legajo){
                texto="empleado "+empleadoArrayList.get(i).toString()+"eliminado correctamente";
                empleadoArrayList.remove(empleadoArrayList.get(i));
            }

        }

        return texto;
    }

    public void agregarRepartidor(Repartidor aux){

        repartidorArrayList.add(aux);

    }

}
