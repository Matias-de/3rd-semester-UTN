package modelo;

public class Elemento {
    //atributos

    private int codigo;
    private String titulo;
    private int anioPublicacion;

    //constructores

    public Elemento(){
        codigo=0;
        titulo="";
        anioPublicacion=0;
    }
    public Elemento(int codigo, String titulo, int anioPublicacion){
        this.codigo=codigo;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }

    //getters


    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    //metodos


    @Override
    public String toString() {
        return "Elemento{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = false;
        if(obj!=null){
            if(obj instanceof Elemento){
                Elemento elemento = (Elemento)obj;
                if(elemento.getCodigo() == this.codigo){
                    sonIguales = true;
                }
            }
        }

        return sonIguales;
    }


    @Override
    public int hashCode() {
        return 1;
    }


}
