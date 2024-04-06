package modelo;

import java.util.Date;

public class MaquinaExpendedora {

    //atributos

    private double precio;

    private double saldo;

    private int cantBoletos;

    private double recaudacion;

    private int boletosVendidos;

    private double vuelto;

    private boolean estado;

    //constructores

    public MaquinaExpendedora()
    {
        precio=10;
        saldo=0;
        cantBoletos=2000;
        recaudacion=0;
        boletosVendidos=0;
        vuelto=0;
        estado=true;
    }

    public MaquinaExpendedora(double precioAux, double saldoAux, int boletosAux, double recaudacionAux, int boletosVendidosAux,double vueltoAux)
    {
        precio=precioAux;
        saldo=saldoAux;
        cantBoletos=boletosAux;
        recaudacion=recaudacionAux;
        boletosVendidos=boletosVendidosAux;
        vuelto=vueltoAux;
        estado=true;
    }

    //getters

    public double getPrecio() {
        return precio;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantBoletos() {
        return cantBoletos;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public double getVuelto() {
        return vuelto;
    }



//setters

    public void setCantBoletos(int cantBoletos) {
        this.cantBoletos = cantBoletos;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

//metodos

    public Boleto imprimirBoletos()
    {
        Boleto boletoAux = null;
        if((cantBoletos>0) && (saldo>=precio)){
            boletoAux=new Boleto(precio, boletosVendidos);
            boletosVendidos++;
            recaudacion=recaudacion+precio;
            cantBoletos--;
            calcularVuelto();
            reiniciarSaldo();

        }

        return boletoAux;


    }

    public boolean ingresarDinero(int dinero){
        boolean flag=true;
        if(dinero>=0){

            saldo=saldo+dinero;

        }else {
            flag=false;
        }
        return flag;

    }

    private void reiniciarSaldo(){
        saldo=0;
    }

    private void calcularVuelto(){
        if(saldo >= precio+0.05)
        {
            vuelto = saldo-precio;
        }else
        {
            vuelto=0;
        }

    }

    public void ponerPrecio(double precioAux){
        setPrecio(precioAux);
    }

    public String mostrarSaldoYPrecio(){

        return ("SALDO ACTUAL: "+saldo+
                "\nPRECIO: "+precio);
    }

    public String mostrarVuelto(){
        return("SE LE DEVUELVE EN ESTA COMPRA: "+vuelto);

    }


    public String mostrarDatosMaquina(){
        String retornoAux;
        if(estado){
            retornoAux=("ESTADO: EN FUNCIONAMIENTO \nRECAUDACION: "+recaudacion+"\nBOLETOS RESTANTES: "+cantBoletos+"\nBOLETOS VENDIDOS: "+(boletosVendidos));

        }else
        {
            retornoAux=("ESTADO: DADA DE BAJA \nRECAUDACION: "+recaudacion+"\nBOLETOS RESTANTES: "+cantBoletos+"\nBOLETOS VENDIDOS: "+(boletosVendidos));
        }

        return retornoAux;
    }


}