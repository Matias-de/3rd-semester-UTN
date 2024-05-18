package modelo;

public class Entero extends operacionMatematica<Integer>{


    public Entero(Integer numero1, Integer numero2) {
        super(numero1, numero2);
    }

    @Override
    public Integer sumar(Integer num1, Integer num2) {
        return num1+num2;
    }

    @Override
    public Integer restar(Integer num1, Integer num2) {
        return num1-num2;
    }

    @Override
    public Integer multiplicar(Integer num1, Integer num2) {
        return num1*num2;
    }

    @Override
    public Integer dividir(Integer num1, Integer num2) {
        Integer aux= null;
        if(num1!=0 || num2!=0){
            aux=num1/num2;
        }

        return aux;
    }
}
