package modelo;

public class Vendedor extends Empleado{

    //atributos

    private int cantVendido;

    //constructores
    public Vendedor(){
        super("a", "b", "c", "d", "e");
        cantVendido=0;
    }

    public Vendedor(String nombre, String legajo, String apellido, String direccion, String fechaNacimiento, int cantVendido){
        super(nombre, legajo, apellido, direccion, fechaNacimiento);
        this.cantVendido=cantVendido;
        calculoSueldo();
    }

    //getters
    public int getCantVendido() {
        return cantVendido;
    }

    //metodos
    @Override
    public void calculoSueldo() {
        double aux=cantVendido*1.30;
        setSueldo(aux);

    }


    @Override
    public String toString() {
        return super.toString()+" [Vendedor]{" +
                "cantVendido=" + cantVendido +
                '}';
    }


    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(obj instanceof Vendedor){
            Vendedor aux= (Vendedor) obj;
            if(aux.cantVendido != cantVendido){
                sonIguales=false;
            }
        }


        return sonIguales;
    }
}
