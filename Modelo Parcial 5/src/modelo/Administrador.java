package modelo;

public class Administrador extends Empleado{

    //atributos
    private String area;

    //Constructores

    public Administrador(){
        super("a", "b", "c", "d", "e");
        area="";
    }

    public Administrador(String nombre, String legajo, String apellido, String direccion, String fechaNacimiento, String area){
        super(nombre, legajo, apellido, direccion, fechaNacimiento);
        this.area=area;
        calculoSueldo();
    }

    //getters


    public String getArea() {
        return area;
    }

    //metodos

    @Override
    public void calculoSueldo() {
        setSueldo(15);


    }

    @Override
    public String toString() {
        return super.toString()+" Administrador{" +
                "area='" + area + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
        if(obj instanceof Administrador){
            Administrador aux= (Administrador) obj;
            if(!aux.area.equalsIgnoreCase(area)){
                sonIguales=false;
            }
        }


        return sonIguales;

    }





}
