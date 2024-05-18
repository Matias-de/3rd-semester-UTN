package modelo;

public class Decimal extends operacionMatematica<Double>{

    public Decimal(Double numero1, Double numero2) {
        super(numero1, numero2);
    }

    @Override
    public Double sumar(Double num1, Double num2) {
        return num1+num2;
    }

    @Override
    public Double restar(Double num1, Double num2) {
        return num1-num2;
    }

    @Override
    public Double multiplicar(Double num1, Double num2) {
        return num1*num2;
    }

    @Override
    public Double dividir(Double num1, Double num2) {
        Double aux= null;
        if(num1!=0 || num2!=0){
            aux=num1/num2;
        }

        return aux;
    }

}
