package modelo;

public class CajaBanco {
    //atributos

    private double saldo;

   // private String nombreDueño;

    private String contraseña;

    //constructores

    public CajaBanco(){
        saldo=0;
       // nombreDueño="INDEFINIDO";
        contraseña="INDEFINIDO";

    }

    public CajaBanco(String pContraseña, double pSaldo){
        saldo=pSaldo;
       // nombreDueño=pNombre;
        contraseña=pContraseña;
    }

    //getters


    public double getSaldo() {
        return saldo;
    }

    public String getContraseña() {
        return contraseña;
    }

    //setters


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos

    public String mostrarSaldo(){
        return "SALDO ACTUAL: "+saldo;
    }




}
