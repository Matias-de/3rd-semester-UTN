import modelo.EAsalariado;
import modelo.EComision;
import modelo.Empleado;
import modelo.Gestora;
public class Main {
    public static void main(String[] args) {

        Gestora gestorita = new Gestora();
        gestorita.agregarEmpleado(new EAsalariado("569587A","Javier", "Gomez", 2020, 1225 ));
        gestorita.agregarEmpleado(new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.10));
        gestorita.agregarEmpleado(new EComision("741258C", "Jose", "Ruiz", 2023, 81, 7.90));
        gestorita.agregarEmpleado(new EAsalariado("896325D","Maria", "Nuñez", 2010, 1155));
        System.out.println(gestorita.mostrarEmpleados());
        System.out.println(gestorita.sueldoMayor());
    }

}