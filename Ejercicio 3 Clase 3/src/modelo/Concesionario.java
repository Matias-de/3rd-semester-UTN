package modelo;

public class Concesionario {

    //atributos
    private String nombre; //almacena el nombre del concesionario.
    private Auto[] cochesDisponibles; //almacena una lista de coches disponibles en el concesionario.

    private int cantVehiculos;


    //constructores

    public Concesionario(){
        nombre="INDEFINIDO";
        cochesDisponibles = new Auto[4];
        cantVehiculos=0;

    }

    public Concesionario(String pNombre, Auto[] pArreglo){
        nombre=pNombre;
        cochesDisponibles=pArreglo;
        cantVehiculos=0;
    }

    //getters


    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public Auto[] getCochesDisponibles() {
        return cochesDisponibles;
    }


    //setters


    public void setCantVehiculos(int cantVehiculos) {
        this.cantVehiculos = cantVehiculos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCochesDisponibles(Auto[] cochesDisponibles) {
        this.cochesDisponibles = cochesDisponibles;
    }

    //metodos


    //agrega un coche a la lista de coches disponibles en el concesionario
   public void agregarAuto(Auto coche)
    {
        if(cantVehiculos < cochesDisponibles.length){
            cochesDisponibles[cantVehiculos]=coche;
            cantVehiculos++;

        }

    }

    // muestra por pantalla la información de todos los
    // coches disponibles en el concesionario.


    public String mostrarCochesDisponibles(){
        String rta="\nNOMBRE DE LA CONCESIONARIA: "+nombre+"\nCOCHES DISPONIBLES: ";

        for(int i=0; i<cantVehiculos; i++){
            rta+=""+cochesDisponibles[i].obtenerInformacion();
        }

        return rta;

    }
}


