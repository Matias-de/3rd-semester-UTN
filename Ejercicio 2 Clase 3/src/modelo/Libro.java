package modelo;

public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //constructores

    public Libro(){
        titulo= "Indefinido";
        autor = "Indefinido";
        anioPublicacion = 0;
    }


    public Libro(String titulo2,String autor2, int anioPublicacion2) {
        titulo = titulo2;
        autor = autor2;
        anioPublicacion = anioPublicacion2;
    }


    // getters y setters

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }



    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInfo() {
        return "\nEl titulo es: "+titulo + "\nEl autor es: "+autor + "\nEl año de publicacion: " +anioPublicacion;
    }

}