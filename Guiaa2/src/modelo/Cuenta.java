package modelo;

public class Cuenta {

    //atributos
    private float saldo=-1;
    private int claveBancaria;


    //constructores


    public Cuenta(){
        saldo=0;
        claveBancaria=0;
    }

    public Cuenta(float saldo, int claveBancaria){
        this.saldo=saldo;
        this.claveBancaria=claveBancaria;
    }

    //getters


    public float getSaldo() {
        return saldo;
    }


    public int getClaveBancaria() {
        return claveBancaria;
    }

    public void setClaveBancaria(int claveBancaria) {
        this.claveBancaria = claveBancaria;
    }

    //metodos


    @Override
    public String toString() {
        return "\nSALDO: "+saldo;
    }

    public void ingresar(float c){
        saldo+=c;

    }
    public void extraer(float c){
        if(c <=saldo){
            saldo=saldo-c;
        }

    }



}
