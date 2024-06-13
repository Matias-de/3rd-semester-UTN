import Modelo.NoMasActivosEXN;
import Modelo.Persona;
import Modelo.Ssm;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        Ssm ssm = new Ssm(10);
        try {
            ssm.agregarPersona(new Persona("Roberto", "Mouras", "25675432", 45, "Alsina", "Jubilado"));
            ssm.agregarPersona(new Persona("Matias", "Antonelli", "46112874", 19, "nosequecentro", "Empleado"));
            ssm.agregarPersona(new Persona("Andrea", "Perez", "17986523", 60, "Puerto", "Ama de Casa"));
            ssm.agregarPersona(new Persona("Juanita", "Alcachofa", "48112874", 16, "Centenario", "Estudiante"));
        } catch (NoMasActivosEXN e) {
            System.out.println(e.getMessage());
            ssm.setCantReactivos(10);
        }
        ssm.testear();
        System.out.println(ssm.aislar());
        System.out.println(ssm);
        String resultadoAislamiento = ssm.aislar();
        System.out.println(resultadoAislamiento);
        ssm.javaAJson();
        ssm.jsonAJava("quilombo");
        System.out.println(ssm);
    }

}