package modelo;

public class Tienda {

    /// Atributos
    private String nombre;
    private String[] arregloProductos;

    private int cantProductos;

    // Constructores


    public Tienda() {
        nombre = "Indefinido";
        arregloProductos = new String[3];
        cantProductos=0;
    }

    public Tienda(String nombre2, String[] productos2) {
        nombre = nombre2;
        arregloProductos = productos2;
        cantProductos=0;
    }

    // getters y setters


    public int getCantProductos() {
        return cantProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getArregloProductos() {
        return arregloProductos;
    }

    public String getInfo() {
        return "El nombre de la tienda es: \n"+nombre + "Producto: \n" +arregloProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArregloProductos(String[] productos) {
        this.arregloProductos = productos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public void agregarProducto(String producto){
        if(cantProductos < arregloProductos.length)
        {
            arregloProductos[cantProductos] = producto;
            cantProductos++;

        }
    }

    public String mostrarInfo() {
       String rta="";
        for(int i=0; i<cantProductos; i++){

            rta= "Productos disponibles: "+arregloProductos[i];
        }
        return rta;
    }


}