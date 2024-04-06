package modelo;

import java.util.Date;

public class Boleto {

    //atributos
    private double precio;
    private int nroBoleto;
    private Date fecha;


    //constructores

    public Boleto()
    {
        precio=0;
        nroBoleto=0;
        fecha=new Date();

    }

    public Boleto(double precioAux, int nroAux, Date fechaAux){

        precio=precioAux;
        nroBoleto=nroAux;
        fecha=fechaAux;

    }

    public Boleto(double precioAux, int boletosAux){
        precio=precioAux;
        nroBoleto=boletosAux;
        setFecha(fecha);
    }

    //getters


    public int getNroBoleto() {
        return nroBoleto;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }

    //setters


    public void setFecha(Date fecha) {
        this.fecha = new Date();
    }

    public void setNroBoleto(int nroBoleto) {
        this.nroBoleto = nroBoleto;
    }


    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public String mostrarBoleto(){
        return("FECHA: "+fecha+"\nPRECIO: "+precio+"\nNUMERO DE BOLETO: "+nroBoleto);

    }




}