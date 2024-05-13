package modelo;

public class Cliente {
    //atributos
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;

    //constructores
    public Cliente(){
        nombre="";
        apellido="";
        telefono=0;
        direccion="";
    }

    public Cliente(String nombre, String apellido, String direccion, int telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        this.apellido=apellido;
        this.direccion=direccion;
    }

//Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //metodos


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta=false;
        if(obj!=null){
            if(obj instanceof Cliente){
                Cliente aux = (Cliente)obj;
                if(aux.nombre.equalsIgnoreCase(nombre) && aux.apellido.equalsIgnoreCase(apellido)){
                    rta=true;
                }
            }
        }


        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

public int distanciaArecorrer(){
        return (int) (Math.random()*10);
}


}
