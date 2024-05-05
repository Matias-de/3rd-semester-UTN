package modelo;

public class Plataforma extends Objetos{

    //atributos
    private String material;
    private String soporte;

    //constructores

    public Plataforma(){
        super();
        material="";
        soporte="";
    }

    public Plataforma(int posX, int posY, double ancho, double alto, String material, String soporte){
        super(posX, posY, ancho, alto);
        this.material = material;
        this.soporte=soporte;
    }

    //getters


    public String getMaterial() {
        return material;
    }

    public String getSoporte() {
        return soporte;
    }


    //metodo


    @Override
    public String toString() {
        return super.toString()+"Plataforma{" +
                "material='" + material + '\'' +
                ", soporte='" + soporte + '\'' +
                '}';
    }


}
