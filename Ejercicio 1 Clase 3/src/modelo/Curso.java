package modelo;

public class Curso {

    //atributos

    private String nombreCurso; // almacena el nombre del curso.

    private Estudiante[] arregloEstudiantes; //almacena un conjunto de estudiantes que pertenecen al curso.

    int cantEstudiantes;

    //constructores

    public Curso()
    {
        nombreCurso= "SIN ASIGNAR";
        arregloEstudiantes = new Estudiante[3];
        cantEstudiantes=0;

    }

    //getters


    public Estudiante[] getArregloEstudiantes() {
        return arregloEstudiantes;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }


    //setters


    public void setArregloEstudiantes(Estudiante[] arregloEstudiantes) {
        this.arregloEstudiantes = arregloEstudiantes;
    }


    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }


    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    //metodos

    public void agregarEstudiante(Estudiante estudiante){ //agrega un estudiante al curso.

        if(cantEstudiantes < arregloEstudiantes.length)
        {
            arregloEstudiantes[cantEstudiantes] = estudiante;
            cantEstudiantes++;

        }


    }

  public double obtenerPromedioGeneral(){   //calcula y devuelve el promedio general de
                                            // calificaciones de todos los estudiantes del curso.
      double promGeneral=0;

      for(int i=0; i<cantEstudiantes; i++){
          promGeneral+=arregloEstudiantes[i].obtenerPromedio();

      }

      promGeneral = promGeneral / cantEstudiantes;

      return promGeneral;

  }

  public String imprimirEstudiantes(){ //muestra por pantalla la información de todos los estudiantes del curso.

        String ret="";
        double promedioAux;
        for(int i=0; i<cantEstudiantes; i++){
            promedioAux = arregloEstudiantes[i].obtenerPromedio();
            ret+="\nNOMBRE: "+arregloEstudiantes[i].getNombre()+"\nEDAD: "+arregloEstudiantes[i].getEdad()+"\nPROMEDIO: "+promedioAux;
        }


        return ret;
  }





}
