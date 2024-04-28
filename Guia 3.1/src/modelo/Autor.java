package modelo;

public  class Autor {
    //atributos
    private String nombre;
    private String apellido;
    private String email;
    private String genero;

    //constructores

    public Autor(){
        nombre="";
        apellido="";
        email="";
        genero="";

    }
    public Autor(String nombre, String apellido, String email, String genero){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }



    //metodos


    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

}
