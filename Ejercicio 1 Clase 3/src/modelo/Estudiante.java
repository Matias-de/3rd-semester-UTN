package modelo;

public class Estudiante {

    //atrubutos

    private String nombre; //almacena el nombre del estudiante.

    private int edad;  //almacena la edad del estudiante.

    double[] calificaciones;  //almacena las calificaciones del estudiante
                                            // en diferentes asignaturas. Solo 3

    //constructores

    public Estudiante(){

        nombre="A DEFINIR";
        edad= 0;
        calificaciones=new double[3];

    }

    public Estudiante (String pNombre, int pEdad, double[] arreglo){
        nombre=pNombre;
        edad=pEdad;
        calificaciones=arreglo;
    }


//getters


    public int getEdad() {
        return edad;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    //setters


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos

   public double obtenerPromedio(){ //calcula y devuelve el promedio de las calificaciones del estudiante.

       double promCalificaciones=0;

       for(int i=0; i<calificaciones.length; i++){
           promCalificaciones+= calificaciones[i];

       }

        promCalificaciones=promCalificaciones / calificaciones.length;

        return promCalificaciones;
   }

   public String obtenerInformacion(){  //muestra por pantalla el nombre,
                                        // la edad y el promedio del estudiante.
        return "\nNOMBRE: "+nombre+"\nEDAD: "+edad+"PROMEDIO: "+obtenerPromedio();



   }


}
