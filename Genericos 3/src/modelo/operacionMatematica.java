package modelo;

public abstract class operacionMatematica<E extends Number>{
    //atributos
    private E numero1;
    private E numero2;

    //constructores


    public operacionMatematica(E numero1, E numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

  //getters


    public E getNumero1() {
        return numero1;
    }

    public E getNumero2() {
        return numero2;
    }

    //setters

    public void setNumero1(E numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(E numero2) {
        this.numero2 = numero2;
    }

    //metodos


    @Override
    public String toString() {
        return "OperacionMatematica{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }

    public abstract E sumar(E num1, E num2);
    public abstract E restar(E num1, E num2);
    public abstract E multiplicar(E num1, E num2);
    public abstract E dividir(E num1, E num2);


}
