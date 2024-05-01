package modelo;

import java.util.Calendar;
import java.util.Date;

public class EAsalariado extends Empleado{

    private double salarioFinal;

    public EAsalariado(){
       super();
        salarioFinal =0;
    }

    public EAsalariado(String dni, String nombre, String apellido, int anioIngreso, double salarioBase){
        super(dni, nombre, apellido, anioIngreso, salarioBase);
        obtenerSalario(salarioBase);
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }


    @Override
    public void obtenerSalario(double salarioBase){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
       int fechaActual = calendar.get(Calendar.YEAR);
        if(fechaActual-getAnioIngreso() >=2 && fechaActual-getAnioIngreso()<=3){
            salarioFinal = salarioBase + salarioBase *0.05;
        }else if(fechaActual-getAnioIngreso()>=4 && fechaActual-getAnioIngreso()<=7){
            salarioFinal = salarioBase + salarioBase *0.10;
        }else if(fechaActual-getAnioIngreso()>=8 && fechaActual-getAnioIngreso()<=15){
            salarioFinal = salarioBase + salarioBase *0.15;
        }else if(fechaActual-getAnioIngreso()>15){
            salarioFinal = salarioBase + salarioBase *0.20;
        }else{
            salarioFinal = salarioBase;
        }

    }


    @Override
    public String toString() {
        return super.toString()+"Empleado Asalariado{" +
                "salario=" + salarioFinal +
                '}';
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
