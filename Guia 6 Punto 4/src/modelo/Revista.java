package modelo;

public class Revista extends Elemento{
   //atributos
    private int numero;

    //constructores
    public Revista(){
        super();
        numero=0;
    }

    public Revista(int codigo, String titulo, int anioPublicacion, int numero){
        super(codigo, titulo, anioPublicacion);
        this.numero=numero;

    }
//getters
    public int getNumero() {
        return numero;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Revista{" +
                "numero=" + numero +
                '}';
    }
}
