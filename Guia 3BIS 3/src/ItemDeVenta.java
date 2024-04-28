public class ItemDeVenta {
    //atributos
    private int id;

    private String descripcion;

    private int cantidad;

    private double precioUnitario;

    //constructores

    public ItemDeVenta(){
        id=0;
        descripcion="";
        cantidad=0;
        precioUnitario=0;

    }

    public ItemDeVenta(int id, String descripcion, int cantidad, double precioUnitario){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;

    }

    //getters

    public int getId() {
        return id;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //setters


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    public double precioTotal(){
        return precioUnitario*cantidad;
    }


    @Override
    public String toString() {
        return "ItemDeVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal= "+ precioTotal()+
                '}';
    }
}
