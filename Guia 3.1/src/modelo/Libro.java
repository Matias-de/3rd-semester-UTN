package modelo;

public class Libro{
//Atributos
    private String titulo;
    private double precio;
    private int stock;
    private Autor autorcito;

//constructores

    public Libro(){
        titulo="";
        precio=0;
        stock=0;
        autorcito= new Autor();
    }

    public Libro(String titulo, double precio, int stock, Autor autorcito){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autorcito=autorcito;

    }

    //getters


    public Autor getAutorcito() {
        return autorcito;
    }

    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }

    public String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autorcito="+autorcito.toString()+
                '}';
    }

    public String mensajeEspecial() {
        return "El libro {"+titulo+"} de: {"+autorcito.getNombre()+" "+autorcito.getApellido()+"}, se vende a: "+precio+" pesos";
    }

    public void modificarPrecio(double precio){
        this.precio=precio;

    }

    public void aumentarCopias(int copias){
        stock+=copias;
    }

}
